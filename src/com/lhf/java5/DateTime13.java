package com.lhf.java5;

import java.time.LocalDate;
import java.time.Period;

/**
 * 
 * @ClassName: DateTime13.java
 * @Description: 计算两个日期之间的天数和月数
 * 有一个常见日期操作是计算两个日期之间的天数、周数或月数。在Java 8中可以用java.time.Period类来做计算。
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020年3月10日 下午3:06:51
 */
public class DateTime13 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		
		System.out.println("today = " + today);
		LocalDate java8Release = LocalDate.of(2020, 12, 12);
		
		Period periodToNextJavaRelease = Period.between(today, java8Release);
		System.out.println("现在距离2020年12月12日还有：" + periodToNextJavaRelease.getMonths() + "个月，零" + periodToNextJavaRelease.getDays() + "天");

	}

}
