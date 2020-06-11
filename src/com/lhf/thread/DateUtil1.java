package com.lhf.thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @ClassName: DateUtil1.java
 * @Description: 解决方案一： 为了解决之前异常的问题，我们每次都new 一个新的SimpleDateFormat，
   *    但是存在的问题是：空间浪费比较大
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019年6月14日 上午10:17:22
 */
public class DateUtil1 {
	
	public static Date parse(String dateStr) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = null;
		try {
			date = sdf.parse(dateStr);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

}
