package com.lhf.java1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class TimeDemo3 {

	public static void main(String[] args) {
		TimeZone time = TimeZone.getTimeZone("GMT+8"); //����Ϊ������
		time = TimeZone.getDefault();// ����ǹ��ʻ����õ�
		System.out.println(time);
		TimeZone.setDefault(time);// ����ʱ��
		Calendar calendar = Calendar.getInstance();// ��ȡʵ��
		DateFormat format1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");//�����ʽ��ģ��
		Date date = calendar.getTime(); //��ȡDate����
		String str = new String();
		str = format1.format(date);//������и�ʽ������ȡ�ַ�����ʽ�����
		System.out.println(str);

	}

}
