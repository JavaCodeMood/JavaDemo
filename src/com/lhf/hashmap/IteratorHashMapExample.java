package com.lhf.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * @ClassName: IteratorHashMapExample.java
 * @Description: ʹ��Iterator����HashMap EntrySet
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020��7��1�� ����11:52:41
 */
public class IteratorHashMapExample {

	public static void main(String[] args) {
		Map<Integer, String> cityMap = new HashMap<Integer, String>();
		cityMap.put(1, "����");
		cityMap.put(2, "����");
		cityMap.put(3, "�人");
		cityMap.put(4, "����");
		cityMap.put(5, "����");
		cityMap.put(6, "����");
		cityMap.put(7, "�Ϻ�");
		cityMap.put(8, "�ɶ�");
		
		//��Iterator����HashMap EntrySet����HashMap
		Iterator<Entry<Integer, String>> iterator = cityMap.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<Integer, String> entry = iterator.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

	}

}
