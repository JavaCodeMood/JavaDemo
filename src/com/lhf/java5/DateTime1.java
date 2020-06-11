package com.lhf.java5;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * 
 * @ClassName: DateTime1.java
 * @Description: Java 8中获取今天的日期以及时间
 * Java 8 中的 LocalDate 用于表示当天日期。和java.util.Date不同，它只有日期，不包含时间。当你仅需要表示日期时就用这个类。
 * 
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020年3月10日 上午11:38:29
 */
public class DateTime1 {

	public static void main(String[] args) {
		//Java 8中获取今天的日期
		LocalDate today = LocalDate.now();
		System.out.println("今天的日期：" + today);
		
		//Java 8中获取当前时间
		LocalTime time = LocalTime.now();
		System.out.println("当前时间：" + time);

	}

}
