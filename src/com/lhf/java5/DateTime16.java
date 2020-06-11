package com.lhf.java5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 
 * @ClassName: DateTime16.java
 * @Description: �ַ�����ת��������
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020��3��10�� ����3:26:38
 */
public class DateTime16 {

	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.now();
		System.out.println("date = " + date);
		
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		//����ת��Ϊ�ַ���
		String str = date.format(format1);
		System.out.println("����ת��Ϊ�ַ�����" + str);
		
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		//�ַ���ת����
		LocalDate date2 = LocalDate.parse(str, format2);
		System.out.println("�������ͣ�" + date2);

	}

}
