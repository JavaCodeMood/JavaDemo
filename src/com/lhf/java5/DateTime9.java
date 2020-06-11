package com.lhf.java5;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * 
 * @ClassName: DateTime9.java
 * @Description: �����Java�ж����������ڻ���������һ������
 * ����жϸ�����һ�������Ǵ���ĳ�컹��С��ĳ�죿��Java 8�У�LocalDate�������෽��isBefore()��isAfter()���ڱȽ����ڡ�
 * ����isBefore()����ʱ�������������С�ڵ�ǰ�����򷵻�true��
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020��3��10�� ����2:29:01
 */
public class DateTime9 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		
		LocalDate tomorrow = LocalDate.of(2020, 3, 11);
		
		if(tomorrow.isAfter(today)) {
			System.out.println("֮������ڣ�" + tomorrow);
		}
		
		LocalDate yesterday = today.minus(1, ChronoUnit.DAYS);
		if(yesterday.isBefore(today)) {
			System.out.println("֮ǰ�����ڣ�" + yesterday);
		}

	}

}
