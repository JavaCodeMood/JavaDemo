package com.lhf.java5;

import java.time.LocalDate;

/**
 * 
 * @ClassName: DateTime12.java
 * @Description: �����Java 8�м������
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020��3��10�� ����2:58:51
 */
public class DateTime12 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		if(today.isLeapYear()) {
			System.out.println(today.getYear() + "������");
		}else {
			System.out.println(today.getYear() + "��ƽ��");
		}

	}

}
