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

        // 从默认时区的系统时钟获取当前的日期时间
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        // 获得时区
        ZoneId zone = zonedDateTime.getZone();
        System.out.println("\n"+zone);

        // 获得指定时区时间
        ZonedDateTime zonedDateTime2 = ZonedDateTime.now(ZoneId.of("Asia/Shanghai"));
        System.out.println("\n"+zonedDateTime2);

        // 获取指定时区的本地时间
        LocalDateTime localDateTime = LocalDateTime.now(ZoneId.of("Asia/Colombo"));
        System.out.println("\n"+localDateTime);

	}

}
