package com.lhf.java5;

import java.time.LocalDate;

/**
 * 
 * @ClassName: DateTime12.java
 * @Description: 如何在Java 8中检查闰年
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020年3月10日 下午2:58:51
 */
public class DateTime12 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		if(today.isLeapYear()) {
			System.out.println(today.getYear() + "是闰年");
		}else {
			System.out.println(today.getYear() + "是平年");
		}

	}

}
