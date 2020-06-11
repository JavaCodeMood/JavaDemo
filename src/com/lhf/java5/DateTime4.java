package com.lhf.java5;

import java.time.LocalDate;

/**
 * 
 * @ClassName: DateTime4.java
 * @Description: Java 8中判断两个日期是否相等
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020年3月10日 上午11:47:09
 */
public class DateTime4 {
	
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.now();             //当前日期
		LocalDate date2 = LocalDate.of(2020,  3,  10); //指定日期
		
		if(date1.equals(date2)) {
			System.out.println("时间相等");
		}else {
			System.out.println("时间不相等");
		}
	}

}
