package com.lhf.java5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * 
 * @ClassName: DateTime7.java
 * @Description: Java 8����һ��ǰ��һ��������,����minus()��������һ��ǰ������
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020��3��10�� ����12:55:20
 */
public class DateTime7 {

	public static void main(String[] args) {
		//��һ��
		LocalDate previousYear = LocalDate.now().minus(1, ChronoUnit.YEARS);
		System.out.println("һ��ǰ�����ڣ�" + previousYear);
		
		//��һ��
		LocalDate nextYear = LocalDate.now().plus(1, ChronoUnit.YEARS);
		System.out.println("һ�������ڣ�" + nextYear);

	}

}
