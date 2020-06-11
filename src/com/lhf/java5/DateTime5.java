package com.lhf.java5;

import java.time.LocalDate;
import java.time.MonthDay;

/**
 * 
 * @ClassName: DateTime5.java
 * @Description: Java 8�м�������������������¼�
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020��3��10�� ����11:50:07
 */
public class DateTime5 {

	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();
		
		LocalDate date2 = LocalDate.of(2020, 3, 10);
		MonthDay birthday = MonthDay.of(date2.getMonth(), date2.getDayOfMonth());
		System.out.println("birthday = " + birthday);
		
		MonthDay currentMonthDay = MonthDay.from(date1);
		System.out.println("currentMonthDay = " + currentMonthDay);
		
		if(currentMonthDay.equals(birthday)) {
			System.out.println("�������������");
		}else {
			System.out.println("���컹�����������");
		}

	}

}
