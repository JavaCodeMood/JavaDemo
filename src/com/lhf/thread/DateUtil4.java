package com.lhf.thread;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @ClassName: DateUtil4.java
 * @Description: ��������ģ�ʹ��ThreadLocal��һ���߳�һ��SimpleDateFormat����
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019��6��14�� ����10:40:25
 */
public class DateUtil4 {
	
	private static ThreadLocal<DateFormat> threadLocal = ThreadLocal.withInitial(() -> new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
	
	public static Date parse(String dateStr) {
		Date date = null;
		try {
			date = threadLocal.get().parse(dateStr);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

}
