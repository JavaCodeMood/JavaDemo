package com.lhf.hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * @ClassName: LambdaHashMapExample.java
 * @Description:  ʹ�� Lambda ���ʽ���� HashMap
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020��7��1�� ����3:12:27
 */
public class LambdaHashMapExample {

	public static void main(String[] args) {
		Map<Integer, String> poetry = new HashMap<Integer, String>();
		poetry.put(1, "         ���»��塤�滨��");
		poetry.put(2, "    \t������");
		poetry.put(3, "ѩѹͥ�����㸡���£����»��ӵ�����");
		poetry.put(4, "�����أ�����һ����ȵ��");
		poetry.put(5, "���Ṳ���������ɣ������롢���Ƽ�į��");
		poetry.put(6, "��ȴ���ǽ�÷����ʫ��������");
		poetry.put(7, "��������Ư������Īǲ�㼡���ݼ�������");
		poetry.put(8, "����ز�ң��˵�Ϊ˭���䡣");
		poetry.put(9, "��������ױ�����������������������֡�");
		poetry.put(10, "��������ʱȡ��һ�����á�");

		// ʹ�� Lambda ���ʽ���� HashMap
		poetry.forEach((key, value) ->{
			System.out.println(value);
		});
		
	}

}
