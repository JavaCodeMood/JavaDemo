package com.lhf.java1;

import java.util.HashMap;
import java.util.Map;

public class MapToString {
	
	public static String convertToString(java.util.Map<String, Object> properties) {
	    java.util.List<String> parts = new java.util.ArrayList<String>();
	    for (String key : properties.keySet()) {
	        Object value = properties.get(key);
	        if (value instanceof String) {
	            parts.add(encode('=', new String[] { key, (String) value }));
	        } else {
	            throw new RuntimeException("Can't encode " + value);
	        }
	    }
	    return encode(';', parts);
	}
	public static String encode(char delimiter, String[] parts) {
	    java.util.List<String> partList = new java.util.ArrayList<String>();
	    for (String part : parts) {
	        partList.add(part);
	    }
	    return encode(delimiter, partList);
	}
	public static String encode(char delimiter, Iterable<String> parts) {
	    StringBuilder result = new StringBuilder();
	    for (String part : parts) {
	        String encodedPart = part.replace("\\", "\\\\");
	        encodedPart = encodedPart.replace("" + delimiter, "\\"
	                + delimiter);
	        result.append(encodedPart);
	        result.append(delimiter);
	    }
	    return result.toString();
	}
	
	public static void main(String[] args) {
		 String option = "{\"title\": {\"text\": \"角色：男一号\",\"textStyle\": {\"color\": \"red\",\"fontSize\": 15,\"fontWeight\": \"bolder\"}},\"tooltip\": {\"formatter\": \"{a}<br/>{b} : {c}\",\"show\": true},\"legend\": {\"textStyle\": {\"color\": \"red\",\"fontSize\": 15,\"fontWeight\": \"bolder\"},\"data\": [\"技术部 - 技术大佬\"]},\"xAxis\": [{\"type\": \"category\",\"axisLine\": {\"lineStyle\": {\"color\": \"#315070\",\"width\": 4}},\"axisLabel\": {\"show\": true,\"textStyle\": {\"fontSize\": 15,\"fontWeight\": \"bolder\"}},\"data\": [\"20岁以下\",\"20到25\",\"25到30\",\"30到40\",\"40到50\",\"50以上\"]}],\"yAxis\": [{\"type\": \"value\",\"axisLine\": {\"lineStyle\": {\"color\": \"#315070\",\"width\": 4}},\"axisLabel\": {\"show\": true,\"textStyle\": {\"fontSize\": 15,\"fontWeight\": \"bolder\"}}}],\"series\": [{\"name\": \"人力资源平台部 - 年龄画像\",\"type\": \"bar\",\"label\": {\"normal\": {\"color\": \"red\",\"show\": true,\"position\": \"top\",\"textStyle\": {\"color\": \"red\",\"fontSize\": 15,\"fontWeight\": \"bolder\"}}},\"data\": [{\"value\": 3364,\"itemStyle\": {\"normal\": {\"color\": \"new echarts.graphic.LinearGradient(0,0,0,1,[{offset:0,color:'#83bff6'},{offset:0.5,color:'#188df0'},{offset:1,color:'#188df0'}])\"}}},{\"value\": 13899,\"itemStyle\": {\"normal\": {\"color\": \"new echarts.graphic.LinearGradient(0,0,0,1,[{offset:0,color:'#83bff6'},{offset:0.5,color:'#188df0'},{offset:1,color:'#188df0'}])\"}}},{\"value\": 2181,\"itemStyle\": {\"normal\": {\"color\": \"new echarts.graphic.LinearGradient(0,0,0,1,[{offset:0,color:'#83bff6'},{offset:0.5,color:'#188df0'},{offset:1,color:'#188df0'}])\"}}},{\"value\": 21798,\"itemStyle\": {\"normal\": {\"color\": \"new echarts.graphic.LinearGradient(0,0,0,1,[{offset:0,color:'#83bff6'},{offset:0.5,color:'#188df0'},{offset:1,color:'#188df0'}])\"}}},{\"value\": 1796,\"itemStyle\": {\"normal\": {\"color\": \"new echarts.graphic.LinearGradient(0,0,0,1,[{offset:0,color:'#83bff6'},{offset:0.5,color:'#188df0'},{offset:1,color:'#188df0'}])\"}}},{\"value\": 95,\"itemStyle\": {\"normal\": {\"color\": \"new echarts.graphic.LinearGradient(0,0,0,1,[{offset:0,color:'#83bff6'},{offset:0.5,color:'#188df0'},{offset:1,color:'#188df0'}])\"}}}]}]}";
		 Map<String, Object> maps = new HashMap<>();
         maps.put("opt", option);
         maps.put("reqMethod", "echarts");
         maps.put("file", "F:/echarts/bar15711059982254mtB.png");
         System.out.println(convertToString(maps));
	}

}
