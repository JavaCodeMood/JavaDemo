package com.lhf.java1;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;

/**
 * 
 * @ClassName: MapDemo.java
 * @Description: Java泛型
 * 虚拟机中没有泛型，只有普通类和普通方法，所有泛型类的类型参数在编译时都会被擦除，泛型类并没有自己独有的Class类对象。
 * 比如并不存在List<String>.class或是List<Integer>.class，而只有List.class。
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019年6月28日 下午4:22:18
 */
public class MapDemo {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();  
		map.put("name", "hollis");  
		map.put("wechat", "Hollis");  
		map.put("blog", "www.hollischuang.com");  
		
		System.out.println(map.values());
		System.out.println(map.toString());
		System.out.println(JSON.toJSONString(map));

	}

}
