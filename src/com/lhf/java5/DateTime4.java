package com.lhf.java5;

import java.time.LocalDate;

/**
 * 
 * @ClassName: DateTime4.java
 * @Description: Java 8���ж����������Ƿ����
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020��3��10�� ����11:47:09
 */
public class DateTime4 {
	
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();             //��ǰ����
		LocalDate date2 = LocalDate.of(2020,  3,  10); //ָ������
		
		if(date1.equals(date2)) {
			System.out.println("ʱ�����");
		}else {
			System.out.println("ʱ�䲻���");
		}
	}

}
