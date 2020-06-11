package com.lhf.java1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeDemo2 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println("\n"+time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("\n"+dateTime);

        // ��Ĭ��ʱ����ϵͳʱ�ӻ�ȡ��ǰ������ʱ��
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        // ���ʱ��
        ZoneId zone = zonedDateTime.getZone();
        System.out.println("\n"+zone);

        // ���ָ��ʱ��ʱ��
        ZonedDateTime zonedDateTime2 = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
        System.out.println("\n"+zonedDateTime2);

        // ��ȡָ��ʱ���ı���ʱ��
        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Asia/Colombo"));
        System.out.println("\n"+localDateTime);

	}

}
