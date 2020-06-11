package com.lhf.java1;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * 字符串格式化为日期
 * @ClassName: TimeDemo1.java
 * @Description: 
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019年9月25日 下午12:08:07
 */
public class TimeDemo1 {

	/**
	* 日期转换成字符串
	* @param date
	* @return str
	*/
	public static String DateToStr(Date date) {
	      
	    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    String str = format.format(date);
	    return str;
	}
	
	public static void main(String[] args) {
		//String str1="2019-09-25 12:24:12";
		Date date = new Date();
		String str1 = DateToStr(date);
		System.out.println("str1 = " + str1);
	    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	    LocalDateTime parse = LocalDateTime.parse(str1, dtf);
	    System.out.println(parse);
	    
	    
	    String armisticeDate ="2019-09-25";
	    LocalDate aLD = LocalDate.parse(armisticeDate);
	    System.out.println("Date: "+ aLD);

	    String armisticeDateTime ="2019-09-25T12:24:12";
	    LocalDateTime aLDT = LocalDateTime.parse(armisticeDateTime);

	    System.out.println("Date/Time: " + aLDT);
	    
	    
	    //获得当前时间
	    LocalDateTime ldt = LocalDateTime.now();
	    System.out.println("ldt = " + ldt);
	    DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
	    String format = ldt.format(dtf1);
	    System.out.println(format);
	    
	    //2019-10-10T02:34:32.627Z

	}

}
