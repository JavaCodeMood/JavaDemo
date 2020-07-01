package com.lhf.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * @ClassName: IteratorHashMapExample.java
 * @Description: 使用Iterator遍历HashMap EntrySet
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020年7月1日 上午11:52:41
 */
public class IteratorHashMapExample {

	public static void main(String[] args) {
		Map<Integer, String> cityMap = new HashMap<Integer, String>();
		cityMap.put(1, "北京");
		cityMap.put(2, "昆明");
		cityMap.put(3, "武汉");
		cityMap.put(4, "深圳");
		cityMap.put(5, "银川");
		cityMap.put(6, "杭州");
		cityMap.put(7, "上海");
		cityMap.put(8, "成都");
		
		//用Iterator遍历HashMap EntrySet遍历HashMap
		Iterator<Entry<Integer, String>> iterator = cityMap.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<Integer, String> entry = iterator.next();
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}

	}

}
