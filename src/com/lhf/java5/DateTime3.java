package com.lhf.java5;

import java.time.LocalDate;

/**
 * 
 * @ClassName: DateTime3.java
 * @Description: Java 8�д����ض�����
 * ����ͨ����̬��������now()�ǳ����׵ش����˵������ڣ��㻹���Ե�����һ�����õĹ�������LocalDate.of()�����������ڣ� �÷�����Ҫ�����ꡢ�¡��������������ض�Ӧ��LocalDateʵ����
 * ��������ĺô���û�ٷ���API����ƴ��󣬱��������ʼ��1900���·��Ǵ�0�� ʼ�ȵȡ�
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020��3��10�� ����11:45:35
 */
public class DateTime3 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2020, 3, 10);
		System.out.println("�Զ������ڣ�" + date);

	}

}
