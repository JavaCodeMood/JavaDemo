package com.lhf.java1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TimeDemo4 {
	 public static final String DATE_FORMAT = "MM/dd/yyyy HH:mm:ss";  
     
	    public static String dateTransformBetweenTimeZone(Date sourceDate, DateFormat formatter,  
	        TimeZone sourceTimeZone, TimeZone targetTimeZone) {  
	        Long targetTime = sourceDate.getTime() - sourceTimeZone.getRawOffset() + targetTimeZone.getRawOffset();  
	        return getTime(new Date(targetTime), formatter);  
	    }  
	         
	    public static String getTime(Date date, DateFormat formatter){  
	       return formatter.format(date);  
	    }  
	         
	    public static void main(String[] args){  
	        DateFormat formatter = new SimpleDateFormat(DATE_FORMAT);  
	        Date date = Calendar.getInstance().getTime();  
	        System.out.println("date = " + date);
	        TimeZone srcTimeZone = TimeZone.getTimeZone("EST"); 
	        System.out.println("\n" + srcTimeZone);
	        TimeZone destTimeZone = TimeZone.getTimeZone("GMT+8");  
	        System.out.println("\n" + destTimeZone);
	        System.out.println("\n"+dateTransformBetweenTimeZone(date, formatter, srcTimeZone, destTimeZone));  
	    }  
}
