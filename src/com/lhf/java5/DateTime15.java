package com.lhf.java5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 
 * @ClassName: DateTime15.java
 * @Description: Java 8�����ʹ��Ԥ����ĸ�ʽ������ȥ�������ʽ������
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020��3��10�� ����3:20:02
 */
public class DateTime15 {

	public static void main(String[] args) {
		String dayAfterTommorrow = "20200310";
		LocalDate formatted = LocalDate.parse(dayAfterTommorrow, DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(dayAfterTommorrow + " ��ʽ���������Ϊ��" + formatted);

	}

}
