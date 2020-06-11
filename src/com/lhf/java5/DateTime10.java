package com.lhf.java5;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * 
 * @ClassName: DateTime10.java
 * @Description: Java 8�д���ʱ��
 * Java 8�������������ں�ʱ�䣬Ҳ��ʱ����������ˡ�
 * ������һϵ�е���������ZoneId�������ض�ʱ����ZoneDateTime������ʾĳʱ���µ�ʱ�䡣
 * ����Java 8��ǰ���� GregorianCalendar�������ġ�
 * �����������չʾ����ΰѱ�ʱ����ʱ��ת������һ��ʱ����ʱ�䡣
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020��3��10�� ����2:38:34
 */
public class DateTime10 {

	public static void main(String[] args) {
		ZoneId america = ZoneId.of("America/New_York");
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("localDateTime = " + localDateTime);
		ZonedDateTime dateAndTimeInNewYork = ZonedDateTime.of(localDateTime, america);
		
		System.out.println("Current date and time in a particular timezone : " + dateAndTimeInNewYork);

	}

}
