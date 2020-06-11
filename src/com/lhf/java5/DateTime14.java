package com.lhf.java5;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;


/**
 * 
 * @ClassName: DateTime14.java
 * @Description: ��Java 8�л�ȡ��ǰ��ʱ���
 * Instant����һ����̬��������now()�᷵�ص�ǰ��ʱ���
 * ʱ�����Ϣ��ͬʱ���������ں�ʱ�䣬���java.util.Date����ʵ����Instant��ȷʵ��ͬ�� Java 8֮ǰ��Date�࣬�����ʹ��Date���Instant����Ե�ת����������ת����
 * ���磺Date.from(Instant) ��Instantת����java.util.Date��Date.toInstant()���ǽ�Date��ת����Instant�ࡣ
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020��3��10�� ����3:15:21
 */
public class DateTime14 {
	
	 /**
	  * @Description: ��ʱ���ת��ΪString���͵�ʱ���ʽ
	  *
	  * @param time
	  * @return      
	  * @throws���쳣����
	  * @author:liuhefei
	  */
	 public static String convertTimeToString(Long time){
	      DateTimeFormatter ftf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	      return ftf.format(LocalDateTime.ofInstant(Instant.ofEpochMilli(time),ZoneId.systemDefault()));
	 }

	public static void main(String[] args) {
		Instant timestamp = Instant.now();
		System.out.println("timestamp = " + timestamp);
		System.out.println("��ǰʱ�����" + timestamp.toEpochMilli());
		
		Date date = Date.from(timestamp);  //��instantת��Ϊjava.util.date
		System.out.println("date = " + date);

		System.out.println(convertTimeToString(1585544571188L));
	}

}
