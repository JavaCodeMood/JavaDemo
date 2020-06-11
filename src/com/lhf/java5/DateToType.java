package com.lhf.java5;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

/**
 * 
 * @ClassName: DateToType.java
 * @Description: Date类型与String,Long,Timestamp,Instant,LocalDateTime之间的转化
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020年5月8日 下午5:31:57
 */
public class DateToType {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		// String -> Date
		Date stringToDate = sdf.parse("2020-05-08 15:30:11");
		System.out.println("String -> Date:  " + stringToDate);

		// Timestamp -> Date
		Date timestampToDate = Date.from(new Timestamp(1588992665414L).toInstant());
		System.out.println("Timestamp -> Date:  " + timestampToDate);

		// Long -> Date
		Date longToDate = new Date(1520754566856L);
		System.out.println("Long -> Date: " + longToDate);

		// Instant -> Date
		Date instantToDate = Date.from(Instant.now());
		System.out.println("Instant -> Date:  " + instantToDate);

		// Date -> String
		String dateToString = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
		System.out.println("Date -> String:  " + dateToString);
		
		// Date -> LocalDateTime
		LocalDateTime dateToLocalDateTime = LocalDateTime.ofInstant(new Date().toInstant(), ZoneId.systemDefault());
		System.out.println("Date -> LocalDateTime:  " + dateToLocalDateTime);
		
		//LocalDateTime -> Date
		Date LocalDateTimeToDate = Date.from(LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant());
		System.out.println("LocalDateTime -> Date:  " + LocalDateTimeToDate);
		
		// Date -> Timestamp
		Timestamp dateToTimestamp = new Timestamp(new Date().getTime());
		System.out.println("Date -> Timestamp:  " + dateToTimestamp);
		
		// Date -> Long
		Long dateToLong = new Date().getTime();
		System.out.println("Date -> Long: " + dateToLong);
		
		// Date -> Instant
		Instant dateToInstant = new Date().toInstant();
		System.out.println("Date -> Instant:  " + dateToInstant);

	}

}
