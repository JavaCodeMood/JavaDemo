package com.lhf.java1;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

public class TimeDemo6 {

	/**
	 * 获取精确到秒的时间戳 通过String.substring()方法将最后的三位去掉
	 * 
	 * @return
	 */
	public static int getSecondTimestamp(Date date) {
		if (null == date) {
			return 0;
		}
		String timestamp = String.valueOf(date.getTime());
		int length = timestamp.length();
		if (length > 3) {
			return Integer.valueOf(timestamp.substring(0, length - 3));
		} else {
			return 0;
		}
	}

	/**
	 * 获取精确到秒的时间戳 通过整除将最后的三位去掉
	 * 
	 * @param date
	 * @return
	 */
	public static int getSecondTimestampTwo(Date date) {
		if (null == date) {
			return 0;
		}
		String timestamp = String.valueOf(date.getTime() / 1000);
		return Integer.valueOf(timestamp);
	}

	public static void main(String[] args) {
		long timestamp = System.currentTimeMillis();
		System.out.println("timestamp = " + timestamp);

		// 获取秒数
		Long second = LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8"));
		System.out.println("second = " + second);
		// 获取毫秒数
		Long milliSecond = LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli();
		System.out.println("milliSecond = " + milliSecond);

		System.out.println("timestamp = " + getSecondTimestamp(new Date()));

		System.out.println("timestamp = " + getSecondTimestampTwo(new Date()));
		
		String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1==str2);

	}

}
