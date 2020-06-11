package com.lhf.java5;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

/**
 * 
 * @ClassName: DateTime10.java
 * @Description: Java 8中处理时区
 * Java 8不仅分离了日期和时间，也把时区分离出来了。
 * 现在有一系列单独的类如ZoneId来处理特定时区，ZoneDateTime类来表示某时区下的时间。
 * 这在Java 8以前都是 GregorianCalendar类来做的。
 * 下面这个例子展示了如何把本时区的时间转换成另一个时区的时间。
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020年3月10日 下午2:38:34
 */
public class DateTime10 {

	public static void main(String[] args) {
		ZoneId america = ZoneId.of("America/New_York");
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("localDateTime = " + localDateTime);
		ZonedDateTime dateAndTimeInNewYork = ZonedDateTime.of(localDateTime, america);
		
		System.out.println("Current date and time in a particular timezone : " + dateAndTimeInNewYork);

	}

}
