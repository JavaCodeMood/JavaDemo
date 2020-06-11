package com.lhf.thread;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 
 * @ClassName: DateUtil3.java
 * @Description: 解决方案三：用jdk1.8中的日期格式类DateFormatter
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019年6月14日 上午10:29:36
 */
public class DateUtil3 {
	
	private static final DateTimeFormatter dtf = DateTimeFormatter .ofPattern("yyyy-MM-dd HH:mm:ss");
	
	public static LocalDate parse(String dateStr) {
		LocalDate date = null;
		date = LocalDate.parse(dateStr, dtf);
		return date;
	}
	

}
