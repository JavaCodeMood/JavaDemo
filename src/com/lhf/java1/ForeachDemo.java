package com.lhf.java1;

import java.util.ArrayList;
import java.util.List;

/**
 * https://mp.weixin.qq.com/s/P_8PkUNl9XqDU3wLwDho7g
 * @ClassName: ForeachDemo.java
 * @Description: Java for-each���
 * ԭ��for-each��ʵ��ԭ����ʵ����ʹ������ͨ��forѭ���͵�������
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019��6��28�� ����4:48:39
 */
public class ForeachDemo {

	public static void main(String[] args) {
		String[] strs = {"���", "����", "û������", "������","ֻ������", "���Ѽ�į", "����"};
		for(String str : strs) {
			System.out.println(str);
		}
		
		List<String> strList = new ArrayList<String>();
		strList.add("��˼��");
		strList.add("������");
		strList.add("ǧ��·�");
		strList.add("�޴�������");
		
		for(String list : strList) {
			System.out.println(list);
		}
		

	}

}
