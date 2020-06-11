package com.lhf.java1;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;

/**
 * 
 * @ClassName: MapDemo.java
 * @Description: Java����
 * �������û�з��ͣ�ֻ����ͨ�����ͨ���������з���������Ͳ����ڱ���ʱ���ᱻ�����������ಢû���Լ����е�Class�����
 * ���粢������List<String>.class����List<Integer>.class����ֻ��List.class��
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019��6��28�� ����4:22:18
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
