package com.lhf.java;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();
        System.out.println("date = " + date);
        
        String sarcoma = "yyyy-MM-dd HH:mm:ss";
        SimpleDateFormat sdf = new SimpleDateFormat(sarcoma);
        
        //时间转字符串
        String dateStr = sdf.format(date);
        System.out.println("dateStr = " + dateStr);
        
        //字符串转时间
        Date dataTime = sdf.parse(dateStr);
        System.out.println("dataTime = " + dataTime);
        
	}

}
