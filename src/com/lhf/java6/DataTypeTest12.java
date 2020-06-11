package com.lhf.java6;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * 
 * @ClassName: DataTypeTest12.java
 * @Description: LocalDateTime类与其他数据类型的相互转换
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020年4月26日 下午4:38:55
 */
public class DataTypeTest12 {

	public static void main(String[] args) {
		int year = 2020;  //年
		int month = 04;  //月
		int date = 26;  //日
		int hrs = 12;  //时
		int min = 14; //分
		int sec = 36;//秒
		
		//jdk1.8
		LocalDateTime dateTime =  LocalDateTime.of(year, month, date, hrs, min, sec);
		System.out.println("dateTime = " + dateTime);
		
		//LocalDateTime转化为long
		Long localDateTimeToLong = Timestamp.valueOf(LocalDateTime.now()).getTime();
		System.out.println("LocalDateTime -> Long:  " + localDateTimeToLong);
		
		//long转化为LocalDateTime
		LocalDateTime longToLocalDateTime =LocalDateTime.ofInstant(Instant.ofEpochMilli(1588928910530L), ZoneId.systemDefault());
		System.out.println("Long -> LocalDateTime:  " + longToLocalDateTime);
		
		//LocalDateTime转化为String
		String localDateTimeToString = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		System.out.println("LocalDateTime -> String:  " + localDateTimeToString);
		
		//String转化为LocalDateTime
		LocalDateTime stringToLocalDateTime =LocalDateTime.parse("2020-05-08 15:30:11", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		System.out.println("String -> LocalDateTime:  " + stringToLocalDateTime);

	}

}
