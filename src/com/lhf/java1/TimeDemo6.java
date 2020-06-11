package com.lhf.java1;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Date;

public class TimeDemo6 {

	/**
	 * ��ȡ��ȷ�����ʱ��� ͨ��String.substring()������������λȥ��
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
	 * ��ȡ��ȷ�����ʱ��� ͨ��������������λȥ��
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

		// ��ȡ����
		Long second = LocalDateTime.now().toEpochSecond(ZoneOffset.of("+8"));
		System.out.println("second = " + second);
		// ��ȡ������
		Long milliSecond = LocalDateTime.now().toInstant(ZoneOffset.of("+8")).toEpochMilli();
		System.out.println("milliSecond = " + milliSecond);

		System.out.println("timestamp = " + getSecondTimestamp(new Date()));

		System.out.println("timestamp = " + getSecondTimestampTwo(new Date()));
		
		String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1==str2);

	}

}
