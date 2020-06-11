package com.lhf.java5;

import java.time.LocalDate;

/**
 * 
 * @ClassName: DateTime2.java
 * @Description: Java 8中获取年、月、日信息
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020年3月10日 上午11:41:32
 */
public class DateTime2 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		int year = today.getYear();
		int month = today.getMonthValue();
		int day = today.getDayOfMonth();
		
		System.out.println("当前日期：" + year + " 年 " + month + " 月 " + day + " 日");
	}

}
