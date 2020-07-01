package com.lhf.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @ClassName: LambdaHashMapExample.java
 * @Description:  使用 Lambda 表达式遍历 HashMap
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020年7月1日 下午3:12:27
 */
public class LambdaHashMapExample {

	public static void main(String[] args) {
		Map<Integer, String> poetry = new HashMap<Integer, String>();
		poetry.put(1, "         《月华清·梨花》");
		poetry.put(2, "    \t朱淑真");
		poetry.put(3, "雪压庭春，香浮花月，揽衣还怯单薄。");
		poetry.put(4, "欹枕裴回，又听一声干鹊。");
		poetry.put(5, "粉泪共、宿雨阑干，清梦与、寒云寂寞。");
		poetry.put(6, "除却，是江梅曾许，诗人吟作。");
		poetry.put(7, "长恨晓风漂泊，且莫遣香肌，瘦减如削。");
		poetry.put(8, "深杏夭桃，端的为谁零落。");
		poetry.put(9, "况天气、妆点清明，对美景、不妨行乐。");
		poetry.put(10, "拌著，向花时取，一杯独酌。");

		// 使用 Lambda 表达式遍历 HashMap
		poetry.forEach((key, value) ->{
			System.out.println(value);
		});
		
	}

}
