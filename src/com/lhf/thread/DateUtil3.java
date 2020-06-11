package com.lhf.thread;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 
 * @ClassName: DateUtil3.java
 * @Description: �������������jdk1.8�е����ڸ�ʽ��DateFormatter
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019��6��14�� ����10:29:36
 */
public class DateUtil3 {
	
	private static final DateTimeFormatter dtf = DateTimeFormatter .ofPattern("yyyy-MM-dd HH:mm:ss");
	
	public static LocalDate parse(String dateStr) {
		LocalDate date = null;
		date = LocalDate.parse(dateStr, dtf);
		return date;
	}
	

}
