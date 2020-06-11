package com.lhf.java6;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

/**
 * 
 * @ClassName: DataTypeTest12.java
 * @Description: LocalDateTime���������������͵��໥ת��
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020��4��26�� ����4:38:55
 */
public class DataTypeTest12 {

	public static void main(String[] args) {
		int year = 2020;  //��
		int month = 04;  //��
		int date = 26;  //��
		int hrs = 12;  //ʱ
		int min = 14; //��
		int sec = 36;//��
		
		//jdk1.8
		LocalDateTime dateTime =  LocalDateTime.of(year, month, date, hrs, min, sec);
		System.out.println("dateTime = " + dateTime);
		
		//LocalDateTimeת��Ϊlong
		Long localDateTimeToLong = Timestamp.valueOf(LocalDateTime.now()).getTime();
		System.out.println("LocalDateTime -> Long:  " + localDateTimeToLong);
		
		//longת��ΪLocalDateTime
		LocalDateTime longToLocalDateTime =LocalDateTime.ofInstant(Instant.ofEpochMilli(1588928910530L), ZoneId.systemDefault());
		System.out.println("Long -> LocalDateTime:  " + longToLocalDateTime);
		
		//LocalDateTimeת��ΪString
		String localDateTimeToString = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		System.out.println("LocalDateTime -> String:  " + localDateTimeToString);
		
		//Stringת��ΪLocalDateTime
		LocalDateTime stringToLocalDateTime =LocalDateTime.parse("2020-05-08 15:30:11", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		System.out.println("String -> LocalDateTime:  " + stringToLocalDateTime);

	}

}
