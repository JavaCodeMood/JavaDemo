package com.lhf.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @ClassName: StreamAPIHashMapExample.java
 * @Description: ʹ�� Stream API ���� HashMap
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020��7��1�� ����3:39:32
 */
public class StreamAPIHashMapExample {

	public static void main(String[] args) {
		Map<Integer, String> poetry = new HashMap<Integer, String>();
		poetry.put(1, "              ���۶��ġ�");
		poetry.put(2, "\t������");
		poetry.put(3, "�ٳٴ���Ū���ᣬ������������");
		poetry.put(4, "�������ˣ��������ף�������¥��");
		poetry.put(5,  "�細˯��ݺ���ɣ��δ������");
		poetry.put(6,  "����Ӱ�����ͤ�ϣ�������ͷ��");
		
		//ʹ�� Stream API ���� HashMap
		poetry.entrySet().stream().forEach((entry) ->{
		   System.out.println(entry.getValue());	
		});

	}

}
