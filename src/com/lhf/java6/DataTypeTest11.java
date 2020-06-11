package com.lhf.java6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @ClassName: DataTypeTest11.java
 * @Description: Date类与其它数据类型的相互转换
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020年4月26日 下午12:15:04
 */
public class DataTypeTest11 {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		int year = 2020;  //年
		int month = 04;  //月
		int day = 26;  //日
		int hrs = 12;  //时
		int min = 14; //分
		int sec = 36;//秒
		
		//jdk1.7
		Date time = new Date(year, month, day, hrs, min, sec);
		System.out.println("time = " + time);
		
		int dateStr = time.getDate();
		System.out.println("dateStr = " + dateStr);
		
		int day1 = time.getDay();
		System.out.println("day1 = " + day1);
		
		//Date 转化为 long
		Date date = new Date();
		long longTime = date.getTime();
		System.out.println("longTime = " + longTime);
		
		//long转换为Date
		long longTimeNew = 1588923444897L;
		Date dateNew = new Date(longTimeNew);
		System.out.println("dateNew = " + dateNew);
		
		//Date转化为String
		String timeStr = date.toString();
		System.out.println("timeStr = " + timeStr);
		
		
		String timeStr1 = sdf.format(date);
		System.out.println("timeStr1 = " + timeStr1);
		
		
		//String转化为Date
		String timeStr2 = "2020-05-05 15:51:25";
		Date dateNew2 = sdf.parse(timeStr2);
        System.out.println("dateNew2 = " + dateNew2);
	}

	
}
