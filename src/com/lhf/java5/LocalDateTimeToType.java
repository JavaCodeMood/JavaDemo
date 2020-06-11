package com.lhf.java5;

import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * 
 * @ClassName: LocalDateTimeToType.java
 * @Description: LocalDateTime类型转换
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020年5月8日 下午5:32:28
 */
public class LocalDateTimeToType {

	public static void main(String[] args) {
		// LocalDateTime -> String
		String localDateTimeToString = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		System.out.println("LocalDateTime -> String:  " + localDateTimeToString);
		
		// LocalDateTime -> TimeStamp
		Timestamp localDateTimeToTimeStamp = Timestamp.valueOf(LocalDateTime.now());
		System.out.println("LocalDateTime -> TimeStamp:  " + localDateTimeToTimeStamp);
		
		// LocalDateTime -> Long
		Long localDateTimeToLong = Timestamp.valueOf(LocalDateTime.now()).getTime();
		System.out.println("LocalDateTime -> Long:  " + localDateTimeToLong);
		
		// LocalDateTime -> Instant
		Instant localDateTimeToInstant = LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant();
		System.out.println("LocalDateTime -> Instant:  " + localDateTimeToInstant);
		
		// LocalDateTime -> Date
		Date LocalDateTimeToDate = Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
		System.out.println("LocalDateTime -> Date:  " + LocalDateTimeToDate);

		// String -> LocalDateTime
		LocalDateTime stringToLocalDateTime = LocalDateTime.parse("2020-05-09 15:30:11",
				DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
		System.out.println("String -> LocalDateTime:  " + stringToLocalDateTime);

		// Timestamp -> LocalDateTime
		LocalDateTime timeStampToLocalDateTime = LocalDateTime.ofInstant(new Timestamp(1588992665414L).toInstant(), ZoneId.systemDefault());
		System.out.println("Timestamp -> LocalDateTime:  " + timeStampToLocalDateTime);
		
		// Timestamp -> Date
		Date timestampToDate = Date.from(new Timestamp(1588992665414L).toInstant());
		System.out.println("Timestamp -> Date:  " + timestampToDate);

		// Long -> LocalDateTime
		LocalDateTime longToLocalDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(1588992665414L), ZoneId.systemDefault());
		System.out.println("Long -> LocalDateTime:  " + longToLocalDateTime);

		// Instant -> LocalDateTime
		LocalDateTime instantToLocalDateTime = LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault());
		System.out.println("Instant -> LocalDateTime:  " + instantToLocalDateTime);

	}

}
