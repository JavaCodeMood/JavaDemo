package com.lhf.java5;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

public class DateTime17 {

	public static void main(String[] args) {
		
		//获取秒数
		Long second = LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8"));
		System.out.println("second = " + second);
		
		//获取毫秒数
		Long milliSecond = LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli();
		System.out.println("milliSecond = " + milliSecond);
		
		Date date = new Date();
		System.out.println("date = " + date.getTime());
	}

}
