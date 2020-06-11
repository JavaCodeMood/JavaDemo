package com.lhf.java1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * ��ʽ����ǰʱ��
 * @ClassName: TimeDemo.java
 * @Description: 
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019��9��25�� ����12:06:58
 */
public class TimeDemo {

	public static void main(String[] args) {
		//��õ�ǰʱ��
	    LocalDateTime ldt = LocalDateTime.now();
	    System.out.println(ldt);
	    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy��MM��dd�� HH:mm:ss");
	    String format = ldt.format(dtf);
	    System.out.println(format);
	    
	    DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyyMMdd");
	    String format1 = ldt.format(dtf1);
	    System.out.println(format1);

	}

}
