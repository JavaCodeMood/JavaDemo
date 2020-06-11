package com.lhf.java5;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 
 * @ClassName: DateTime16.java
 * @Description: 字符串互转日期类型
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020年3月10日 下午3:26:38
 */
public class DateTime16 {

	public static void main(String[] args) {
		LocalDateTime date = LocalDateTime.now();
		System.out.println("date = " + date);
		
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		//日期转换为字符串
		String str = date.format(format1);
		System.out.println("日期转换为字符串：" + str);
		
		DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		//字符串转日期
		LocalDate date2 = LocalDate.parse(str, format2);
		System.out.println("日期类型：" + date2);

	}

}
