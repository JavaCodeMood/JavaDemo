package com.lhf.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/**
 * 
 * @ClassName: IteratorHashMapExample1.java
 * @Description: ʹ��Iterator����HashMap KeySet 
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020��7��1�� ����12:01:53
 */
public class IteratorHashMapExample1 {

	public static void main(String[] args) {
		Map<Integer, String> logMap = new HashMap<Integer, String>();
		logMap.put(1, "б��ϸ����������");
		logMap.put(2, "����ǰ����ǰ����");
		logMap.put(3, "�����滨����į�����ɡ�");
		logMap.put(4, "���ݶ�������·���ͱ��ᣬ����ɽ��");
		logMap.put(5, "����������Ե��");
		logMap.put(6, "ˮ�Ƽ䡣�����ԡ�");
		logMap.put(7, "�����������������Ȼ��");
		logMap.put(8, "չת���n�հ��գ����׼��������ѡ�");
		
		//ʹ��Iterator����HashMap KeySet
		Iterator<Integer> iterator = logMap.keySet().iterator();
		while(iterator.hasNext()) {
			Integer key = iterator.next();
			System.out.println(logMap.get(key));
		}
		

	}

}
