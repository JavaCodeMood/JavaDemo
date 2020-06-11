package com.lhf.java5;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * 
 * @ClassName: DateTime1.java
 * @Description: Java 8�л�ȡ����������Լ�ʱ��
 * Java 8 �е� LocalDate ���ڱ�ʾ�������ڡ���java.util.Date��ͬ����ֻ�����ڣ�������ʱ�䡣�������Ҫ��ʾ����ʱ��������ࡣ
 * 
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020��3��10�� ����11:38:29
 */
public class DateTime1 {

	public static void main(String[] args) {
		//Java 8�л�ȡ���������
		LocalDate today = LocalDate.now();
		System.out.println("��������ڣ�" + today);
		
		//Java 8�л�ȡ��ǰʱ��
		LocalTime time = LocalTime.now();
		System.out.println("��ǰʱ�䣺" + time);

	}

}
