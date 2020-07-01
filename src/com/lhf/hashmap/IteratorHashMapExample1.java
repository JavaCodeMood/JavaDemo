package com.lhf.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * @ClassName: IteratorHashMapExample1.java
 * @Description: 使用Iterator遍历HashMap KeySet 
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020年7月1日 下午12:01:53
 */
public class IteratorHashMapExample1 {

	public static void main(String[] args) {
		Map<Integer, String> logMap = new HashMap<Integer, String>();
		logMap.put(1, "斜风细雨作春寒。");
		logMap.put(2, "对尊前。忆前欢。");
		logMap.put(3, "曾把梨花，寂寞泪阑干。");
		logMap.put(4, "芳草断烟南浦路，和别泪，看青山。");
		logMap.put(5, "昨宵结得梦夤缘。");
		logMap.put(6, "水云间。悄无言。");
		logMap.put(7, "争奈醒来，愁恨又依然。");
		logMap.put(8, "展转衾裯空懊恼，天易见，见伊难。");
		
		//使用Iterator遍历HashMap KeySet
		Iterator<Integer> iterator = logMap.keySet().iterator();
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			System.out.println(logMap.get(key));
		}
		

	}

}
