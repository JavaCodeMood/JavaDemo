package com.lhf.java1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * 格式化当前时间
 * @ClassName: TimeDemo.java
 * @Description: 
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019年9月25日 下午12:06:58
 */
public class TimeDemo {

	public static void main(String[] args) {
		//获得当前时间
	    LocalDateTime ldt = LocalDateTime.now();
	    System.out.println(ldt);
	    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
	    String format = ldt.format(dtf);
	    System.out.println(format);
	    
	    DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyyMMdd");
	    String format1 = ldt.format(dtf1);
	    System.out.println(format1);

	}

}
