package com.lhf.java5;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * 
 * @ClassName: DateTime6.java
 * @Description: Java 8中获取当前时间
 * 通过增加小时、分、秒来计算将来的时间很常见。Java 8除了不变类型和线程安全的好处之外，还提供了更好的plusHours()方法替换add()，并且是兼容的。
 * 注意，这些方法返回一个全新的LocalTime实例，由于其不可变性，返回后一定要用变量赋值。
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020年3月10日 上午11:58:53
 */
public class DateTime6 {

	public static void main(String[] args) {
		//Java 8中获取当前时间
		LocalTime time = LocalTime.now();
		LocalTime time1 = time.plusHours(3);
		LocalTime time2 = time1.plusMinutes(10);
		
		System.out.println("time = " + time);
		System.out.println("time1 = " + time1);
		System.out.println("三小时后的时间为：" + time2);
		
		//Java 8如何计算一周后的日期
		//LocalDate日期不包含时间信息，它的plus()方法用来增加天、周、月，ChronoUnit类声明了这些时间单位。
		//由于LocalDate也是不变类型，返回后一定要用变量赋值。
		LocalDate today = LocalDate.now();
		System.out.println("今天的日期为：" + today);
		
		//可以看到新日期离当天日期是7天，也就是一周。你可以用同样的方法增加1个月、1年、1小时、1分钟甚至一个世纪，更多选项可以查看Java 8 API中的ChronoUnit类
		LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
		System.out.println("一周后的日期为：" + nextWeek);

	}

}
