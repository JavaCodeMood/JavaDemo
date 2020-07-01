package com.lhf.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @ClassName: ForeachHashMapExample.java
 * @Description: ʹ�� For-each ѭ������ HashMap 
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020��7��1�� ����2:45:19
 */
public class ForeachHashMapExample {

	public static void main(String[] args) {
		Map<Integer, String> poetry = new HashMap<Integer, String>();
		poetry.put(1, "  ���ϳ�����");
		poetry.put(2, "    ������");
		poetry.put(3, "���������ҹ����");
		poetry.put(4, "���ѳɴ�ת������");
		poetry.put(5, "�Ž�Ҷ����ͩ�");
		poetry.put(6, "��������жϳ���");
		
		//ʹ�� For-each ѭ������ HashMap 
		for(Map.Entry<Integer, String> entry : poetry.entrySet()) {
			//System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

	}

}
