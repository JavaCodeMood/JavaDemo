package com.lhf.java5;

import java.time.LocalDate;
import java.time.Period;

/**
 * 
 * @ClassName: DateTime13.java
 * @Description: ������������֮�������������
 * ��һ���������ڲ����Ǽ�����������֮�����������������������Java 8�п�����java.time.Period���������㡣
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020��3��10�� ����3:06:51
 */
public class DateTime13 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		
		System.out.println("today = " + today);
		LocalDate java8Release = LocalDate.of(2020, 12, 12);
		
		Period periodToNextJavaRelease = Period.between(today, java8Release);
		System.out.println("���ھ���2020��12��12�ջ��У�" + periodToNextJavaRelease.getMonths() + "���£���" + periodToNextJavaRelease.getDays() + "��");

	}

}
