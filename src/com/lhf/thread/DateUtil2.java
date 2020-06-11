package com.lhf.thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @ClassName: DateUtil2.java
 * @Description: �����������ʹ��synchronized�����Σ����ڵ����⣺�����Ȳ���
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019��6��14�� ����10:22:50
 */
public class DateUtil2 {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public static synchronized Date parse(String dateStr) {
		Date date = null;
		try {
		    date = sdf.parse(dateStr);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

}
