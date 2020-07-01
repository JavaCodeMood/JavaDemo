package com.lhf.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @ClassName: StreamAPIHashMapExample.java
 * @Description: 使用 Stream API 遍历 HashMap
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020年7月1日 下午3:39:32
 */
public class StreamAPIHashMapExample {

	public static void main(String[] args) {
		Map<Integer, String> poetry = new HashMap<Integer, String>();
		poetry.put(1, "              《眼儿媚》");
		poetry.put(2, "\t朱淑真");
		poetry.put(3, "迟迟春日弄轻柔，花径暗香流。");
		poetry.put(4, "清明过了，不堪回首，云锁朱楼。");
		poetry.put(5,  "午窗睡起莺声巧，何处唤春愁。");
		poetry.put(6,  "绿杨影里，海棠亭畔，红杏梢头。");
		
		//使用 Stream API 遍历 HashMap
		poetry.entrySet().stream().forEach((entry) ->{
		   System.out.println(entry.getValue());	
		});

	}

}
