package com.lhf.java1;

import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.gson.reflect.TypeToken;

public class StringDemo {

	public static void main(String[] args) {
		String optionStr = "{\"color\":[\"#3398DB\"],\"tooltip\":{\"trigger\":\"axis\",\"axisPointer\":{\"type\":\"shadow\"}},\"grid\":{\"left\":\"3%\",\"right\":\"4%\",\"bottom\":\"3%\",\"containLabel\":true},\"xAxis\":[{\"type\":\"category\",\"data\":[\"Mon\",\"Tue\",\"Wed\",\"Thu\",\"Fri\",\"Sat\",\"Sun\"],\"axisTick\":{\"alignWithLabel\":true}}],\"yAxis\":[{\"type\":\"value\"}],\"series\":[{\"name\":\"直接访问\",\"type\":\"bar\",\"barWidth\":\"60%\",\"data\":[10,52,200,334,390,330,220]}]};";
		String result = optionStr.replaceAll("\"", "'");
		System.out.println("result = " + result);
		
		String str = "{\r\n" + 
				"    color: ['#3398DB'],\r\n" + 
				"    tooltip: {\r\n" + 
				"        trigger: 'axis',\r\n" + 
				"        axisPointer: {   " + 
				"            type: 'shadow' " + 
				"        }\r\n" + 
				"    },\r\n" + 
				"    grid: {\r\n" + 
				"        left: '3%',\r\n" + 
				"        right: '4%',\r\n" + 
				"        bottom: '3%',\r\n" + 
				"        containLabel: true\r\n" + 
				"    },\r\n" + 
				"    xAxis: [\r\n" + 
				"        {\r\n" + 
				"            type: 'category',\r\n" + 
				"            data: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun'],\r\n" + 
				"            axisTick: {\r\n" + 
				"                alignWithLabel: true\r\n" + 
				"            }\r\n" + 
				"        }\r\n" + 
				"    ],\r\n" + 
				"    yAxis: [\r\n" + 
				"        {\r\n" + 
				"            type: 'value'\r\n" + 
				"        }\r\n" + 
				"    ],\r\n" + 
				"    series: [\r\n" + 
				"        {\r\n" + 
				"            name: '直接访问',\r\n" + 
				"            type: 'bar',\r\n" + 
				"            barWidth: '60%',\r\n" + 
				"            data: [10, 52, 200, 334, 390, 330, 220]\r\n" + 
				"        }\r\n" + 
				"    ]\r\n" + 
				"};\r\n" + 
				"";
		System.out.println(json2map(str));
	}
	
	public static Map<String, Object> json2map(String str_json) {
        Map<String, Object> res = null;
        try {
            Gson gson = new Gson();
            res = gson.fromJson(str_json, new TypeToken<Map<String, Object>>() {}.getType());
        } catch (JsonSyntaxException e) {
        }
        return res;
    }

}
