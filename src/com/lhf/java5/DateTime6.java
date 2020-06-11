package com.lhf.java5;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * 
 * @ClassName: DateTime6.java
 * @Description: Java 8�л�ȡ��ǰʱ��
 * ͨ������Сʱ���֡��������㽫����ʱ��ܳ�����Java 8���˲������ͺ��̰߳�ȫ�ĺô�֮�⣬���ṩ�˸��õ�plusHours()�����滻add()�������Ǽ��ݵġ�
 * ע�⣬��Щ��������һ��ȫ�µ�LocalTimeʵ���������䲻�ɱ��ԣ����غ�һ��Ҫ�ñ�����ֵ��
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020��3��10�� ����11:58:53
 */
public class DateTime6 {

	public static void main(String[] args) {
		//Java 8�л�ȡ��ǰʱ��
		LocalTime time = LocalTime.now();
		LocalTime time1 = time.plusHours(3);
		LocalTime time2 = time1.plusMinutes(10);
		
		System.out.println("time = " + time);
		System.out.println("time1 = " + time1);
		System.out.println("��Сʱ���ʱ��Ϊ��" + time2);
		
		//Java 8��μ���һ�ܺ������
		//LocalDate���ڲ�����ʱ����Ϣ������plus()�������������졢�ܡ��£�ChronoUnit����������Щʱ�䵥λ��
		//����LocalDateҲ�ǲ������ͣ����غ�һ��Ҫ�ñ�����ֵ��
		LocalDate today = LocalDate.now();
		System.out.println("���������Ϊ��" + today);
		
		//���Կ����������뵱��������7�죬Ҳ����һ�ܡ��������ͬ���ķ�������1���¡�1�ꡢ1Сʱ��1��������һ�����ͣ�����ѡ����Բ鿴Java 8 API�е�ChronoUnit��
		LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
		System.out.println("һ�ܺ������Ϊ��" + nextWeek);

	}

}
