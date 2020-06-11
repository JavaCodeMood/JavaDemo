package com.lhf.thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @ClassName: DateUtil.java
 * @Description: ʱ�乤����
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019��6��14�� ����9:43:17
 */
public class DateUtil {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public static Date parse(String dateStr) {
		Date date = null;
		try {
			date = sdf.parse(dateStr);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		return date;
	}
	

}
