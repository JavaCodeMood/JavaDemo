package com.lhf.java5;

import java.time.Month;
import java.time.YearMonth;

/**
 * 
 * @ClassName: DateTime11.java
 * @Description: ��α�ʾ���ÿ���������̶����ڣ��𰸾���YearMonth
 * �� MonthDay����ظ��¼����������ƣ�YearMonth����һ������࣬���ڱ�ʾ���ÿ������ա�FD�����ա��ڻ���Ȩ�����յȡ�
 * �������������õ� ���¹��ж����죬YearMonthʵ����lengthOfMonth()�������Է��ص��µ����������ж�2����28�컹��29��ʱ�ǳ����á�
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020��3��10�� ����2:50:08
 */
public class DateTime11 {

	public static void main(String[] args) {
		YearMonth currentYearMonth = YearMonth.now();
		System.out.printf("Days in month year %s: %d%n", currentYearMonth, currentYearMonth.lengthOfMonth());
        
		YearMonth creditCardExpiry = YearMonth.of(2020, Month.FEBRUARY);
		System.out.printf("Your credit card expires on %s %n", creditCardExpiry);
	}

}
