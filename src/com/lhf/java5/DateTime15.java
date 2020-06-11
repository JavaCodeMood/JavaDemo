package com.lhf.java5;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 
 * @ClassName: DateTime15.java
 * @Description: Java 8中如何使用预定义的格式化工具去解析或格式化日期
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020年3月10日 下午3:20:02
 */
public class DateTime15 {

	public static void main(String[] args) {
		String dayAfterTommorrow = "20200310";
		LocalDate formatted = LocalDate.parse(dayAfterTommorrow, DateTimeFormatter.BASIC_ISO_DATE);
		System.out.println(dayAfterTommorrow + " 格式化后的日期为：" + formatted);

	}

}
