package com.lhf.java5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * 
 * @ClassName: DateTime7.java
 * @Description: Java 8计算一年前或一年后的日期,利用minus()方法计算一年前的日期
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020年3月10日 下午12:55:20
 */
public class DateTime7 {

	public static void main(String[] args) {
		//减一年
		LocalDate previousYear = LocalDate.now().minus(1, ChronoUnit.YEARS);
		System.out.println("一年前的日期：" + previousYear);
		
		//加一年
		LocalDate nextYear = LocalDate.now().plus(1, ChronoUnit.YEARS);
		System.out.println("一年后的日期：" + nextYear);

	}

}
