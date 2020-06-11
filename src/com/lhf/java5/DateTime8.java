package com.lhf.java5;

import java.time.Clock;

/**
 * 
 * @ClassName: DateTime8.java
 * @Description: Java 8��Clockʱ����
 * Java 8������һ��Clockʱ�������ڻ�ȡ��ʱ��ʱ�������ǰʱ���µ�����ʱ����Ϣ��
 * ��ǰ�õ�System.currentTimeInMillis()��TimeZone.getDefault()�ĵط�������Clock�滻��
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020��3��10�� ����2:15:49
 */
public class DateTime8 {

	public static void main(String[] args) {
		Clock clock = Clock.systemUTC();
		System.out.println("Clock: " + clock.millis());
		
		Clock defaultClock = Clock.systemDefaultZone();
		System.out.println("Clock: " + defaultClock.millis());

	}

}
