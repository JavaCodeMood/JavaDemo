package com.lhf.java5;

import java.time.LocalDate;

/**
 * 
 * @ClassName: DateTime2.java
 * @Description: Java 8�л�ȡ�ꡢ�¡�����Ϣ
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020��3��10�� ����11:41:32
 */
public class DateTime2 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		int year = today.getYear();
		int month = today.getMonthValue();
		int day = today.getDayOfMonth();
		
		System.out.println("��ǰ���ڣ�" + year + " �� " + month + " �� " + day + " ��");
	}

}
