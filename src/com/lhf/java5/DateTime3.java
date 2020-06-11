package com.lhf.java5;

import java.time.LocalDate;

/**
 * 
 * @ClassName: DateTime3.java
 * @Description: Java 8中处理特定日期
 * 我们通过静态工厂方法now()非常容易地创建了当天日期，你还可以调用另一个有用的工厂方法LocalDate.of()创建任意日期， 该方法需要传入年、月、日做参数，返回对应的LocalDate实例。
 * 这个方法的好处是没再犯老API的设计错误，比如年度起始于1900，月份是从0开 始等等。
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020年3月10日 上午11:45:35
 */
public class DateTime3 {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2020, 3, 10);
		System.out.println("自定义日期：" + date);

	}

}
