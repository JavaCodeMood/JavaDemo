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
		 String option = "{\"title\": {\"text\": \"��ɫ����һ��\",\"textStyle\": {\"color\": \"red\",\"fontSize\": 15,\"fontWeight\": \"bolder\"}},\"tooltip\": {\"formatter\": \"{a}<br/>{b} : {c}\",\"show\": true},\"legend\": {\"textStyle\": {\"color\": \"red\",\"fontSize\": 15,\"fontWeight\": \"bolder\"},\"data\": [\"������ - ��������\"]},\"xAxis\": [{\"type\": \"category\",\"axisLine\": {\"lineStyle\": {\"color\": \"#315070\",\"width\": 4}},\"axisLabel\": {\"show\": true,\"textStyle\": {\"fontSize\": 15,\"fontWeight\": \"bolder\"}},\"data\": [\"20������\",\"20��25\",\"25��30\",\"30��40\",\"40��50\",\"50����\"]}],\"yAxis\": [{\"type\": \"value\",\"axisLine\": {\"lineStyle\": {\"color\": \"#315070\",\"width\": 4}},\"axisLabel\": {\"show\": true,\"textStyle\": {\"fontSize\": 15,\"fontWeight\": \"bolder\"}}}],\"series\": [{\"name\": \"������Դƽ̨�� - ���仭��\",\"type\": \"bar\",\"label\": {\"normal\": {\"color\": \"red\",\"show\": true,\"position\": \"top\",\"textStyle\": {\"color\": \"red\",\"fontSize\": 15,\"fontWeight\": \"bolder\"}}},\"data\": [{\"value\": 3364,\"itemStyle\": {\"normal\": {\"color\": \"new echarts.graphic.LinearGradient(0,0,0,1,[{offset:0,color:'#83bff6'},{offset:0.5,color:'#188df0'},{offset:1,color:'#188df0'}])\"}}},{\"value\": 13899,\"itemStyle\": {\"normal\": {\"color\": \"new echarts.graphic.LinearGradient(0,0,0,1,[{offset:0,color:'#83bff6'},{offset:0.5,color:'#188df0'},{offset:1,color:'#188df0'}])\"}}},{\"value\": 2181,\"itemStyle\": {\"normal\": {\"color\": \"new echarts.graphic.LinearGradient(0,0,0,1,[{offset:0,color:'#83bff6'},{offset:0.5,color:'#188df0'},{offset:1,color:'#188df0'}])\"}}},{\"value\": 21798,\"itemStyle\": {\"normal\": {\"color\": \"new echarts.graphic.LinearGradient(0,0,0,1,[{offset:0,color:'#83bff6'},{offset:0.5,color:'#188df0'},{offset:1,color:'#188df0'}])\"}}},{\"value\": 1796,\"itemStyle\": {\"normal\": {\"color\": \"new echarts.graphic.LinearGradient(0,0,0,1,[{offset:0,color:'#83bff6'},{offset:0.5,color:'#188df0'},{offset:1,color:'#188df0'}])\"}}},{\"value\": 95,\"itemStyle\": {\"normal\": {\"color\": \"new echarts.graphic.LinearGradient(0,0,0,1,[{offset:0,color:'#83bff6'},{offset:0.5,color:'#188df0'},{offset:1,color:'#188df0'}])\"}}}]}]}";
		 Map<String, Object> maps = new HashMap<>();
         maps.put("opt", option);
         maps.put("reqMethod", "echarts");
         maps.put("file", "F:/echarts/bar15711059982254mtB.png");
         System.out.println(convertToString(maps));
	}

}
