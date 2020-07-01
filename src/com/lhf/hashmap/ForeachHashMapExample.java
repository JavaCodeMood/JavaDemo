package com.lhf.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @ClassName: ForeachHashMapExample.java
 * @Description: 使用 For-each 循环遍历 HashMap 
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020年7月1日 下午2:45:19
 */
public class ForeachHashMapExample {

	public static void main(String[] args) {
		Map<Integer, String> poetry = new HashMap<Integer, String>();
		poetry.put(1, "  《断肠集》");
		poetry.put(2, "    朱淑真");
		poetry.put(3, "秋雨沉沉滴夜长，");
		poetry.put(4, "梦难成处转凄凉。");
		poetry.put(5, "芭蕉叶上梧桐里，");
		poetry.put(6, "点点声声有断肠。");
		
		//使用 For-each 循环遍历 HashMap 
		for(Map.Entry<Integer, String> entry : poetry.entrySet()) {
			//System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

	}

}
