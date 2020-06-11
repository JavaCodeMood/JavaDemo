package com.lhf.java5;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;


/**
 * 
 * @ClassName: DateTime14.java
 * @Description: 在Java 8中获取当前的时间戳
 * Instant类有一个静态工厂方法now()会返回当前的时间戳
 * 时间戳信息里同时包含了日期和时间，这和java.util.Date很像。实际上Instant类确实等同于 Java 8之前的Date类，你可以使用Date类和Instant类各自的转换方法互相转换，
 * 例如：Date.from(Instant) 将Instant转换成java.util.Date，Date.toInstant()则是将Date类转换成Instant类。
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020年3月10日 下午3:15:21
 */
public class DateTime14 {
	
	 /**
	  * @Description: 将时间戳转化为String类型的时间格式
	  *
	  * @param time
	  * @return      
	  * @throws：异常描述
	  * @author:liuhefei
	  */
	 public static String convertTimeToString(Long time){
	      DateTimeFormatter ftf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	      return ftf.format(LocalDateTime.ofInstant(Instant.ofEpochMilli(time),ZoneId.systemDefault()));
	 }

	public static void main(String[] args) {
		Instant timestamp = Instant.now();
		System.out.println("timestamp = " + timestamp);
		System.out.println("当前时间戳：" + timestamp.toEpochMilli());
		
		Date date = Date.from(timestamp);  //将instant转换为java.util.date
		System.out.println("date = " + date);

		System.out.println(convertTimeToString(1585544571188L));
	}

}
