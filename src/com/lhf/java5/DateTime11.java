package com.lhf.java5;

import java.time.Month;
import java.time.YearMonth;

/**
 * 
 * @ClassName: DateTime11.java
 * @Description: 如何表示信用卡到期这类固定日期，答案就在YearMonth
 * 与 MonthDay检查重复事件的例子相似，YearMonth是另一个组合类，用于表示信用卡到期日、FD到期日、期货期权到期日等。
 * 还可以用这个类得到 当月共有多少天，YearMonth实例的lengthOfMonth()方法可以返回当月的天数，在判断2月有28天还是29天时非常有用。
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020年3月10日 下午2:50:08
 */
public class DateTime11 {

	public static void main(String[] args) {
		YearMonth currentYearMonth = YearMonth.now();
		System.out.printf("Days in month year %s: %d%n", currentYearMonth, currentYearMonth.lengthOfMonth());
        
		YearMonth creditCardExpiry = YearMonth.of(2020, Month.FEBRUARY);
		System.out.printf("Your credit card expires on %s %n", creditCardExpiry);
	}

}
