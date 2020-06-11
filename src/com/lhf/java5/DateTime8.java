package com.lhf.java5;

import java.time.Clock;

/**
 * 
 * @ClassName: DateTime8.java
 * @Description: Java 8的Clock时钟类
 * Java 8增加了一个Clock时钟类用于获取当时的时间戳，或当前时区下的日期时间信息。
 * 以前用到System.currentTimeInMillis()和TimeZone.getDefault()的地方都可用Clock替换。
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020年3月10日 下午2:15:49
 */
public class DateTime8 {

	public static void main(String[] args) {
		Clock clock = Clock.systemUTC();
		System.out.println("Clock: " + clock.millis());
		
		Clock defaultClock = Clock.systemDefaultZone();
		System.out.println("Clock: " + defaultClock.millis());

	}

}
