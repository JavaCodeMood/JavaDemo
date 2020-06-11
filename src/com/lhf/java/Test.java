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
        
        //ʱ��ת�ַ���
        String dateStr = sdf.format(date);
        System.out.println("dateStr = " + dateStr);
        
        //�ַ���תʱ��
        Date dataTime = sdf.parse(dateStr);
        System.out.println("dataTime = " + dataTime);
        
	}

}
