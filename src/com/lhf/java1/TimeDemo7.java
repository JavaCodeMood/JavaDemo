package com.lhf.java1;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.Period;
import java.time.ZoneOffset;

public class TimeDemo7 {

	/*
	 * 1.日期与时间 LocalDate： LocalTime： LocalDateTime：
	 */
	public void test1() {
		/*
		 * public static LocalDateTime now(): 从默认时区的系统时钟获取当前的日期时间。 这将查询默认时区中的system
		 * clock以获取当前的日期时间。 使用此方法将阻止使用备用时钟进行测试，因为时钟是硬编码的。 结果 当前日期时间使用系统时钟和默认时区，不为空
		 */
		// ①.now：获取当前日期（时间）
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);

		/*
		 * public static LocalDateTime of(int year, int month, int dayOfMonth, int hour,
		 * int minute): 从年，月，日，小时和分钟获得LocalDateTime的实例，将秒和纳秒设置为零。
		 * 这将返回一个LocalDateTime与指定的年，月，日，月，小时和分钟。 该日期必须在年和月中有效， 否则将抛出异常。 第二和第十二个字段将被设置为零。
		 * 参数 year - 从MIN_YEAR到MAX_YEAR的年份 month - 从1月1日至12日（12月）的月份， dayOfMonth -
		 * 代表从1到31的日期 hour - 代表从0到23的小时 minute - 从0到59表示的小时 结果 本地日期时间，不为空
		 * 
		 * 还有重载的方法
		 */
		// ②.of：指定日期时间
		ldt = LocalDateTime.of(2017, 12, 12, 12, 30, 40);
		System.out.println(ldt);

		/*
		 * public LocalDateTime plusHours(long hours)： 以指定的时间段返回此LocalDateTime的副本，小时数。
		 * 此实例是不可变的，不受此方法调用的影响。 参数 hours - 要添加的时间可能为负数 结果 一个
		 * LocalDateTime基于这个日期时间添加的小时，不为null
		 */
		// ③.plus：对 年/月/日/时v分v秒v纳秒 .......... 进行加操作，返回一个新的实例
		LocalDateTime newLdt = ldt.plusHours(2);
		System.out.println(newLdt);

		/*
		 * public LocalDateTime minusDays(long days):
		 * 返回此LocalDateTime的副本，其中指定的时间间隔以天为单位。 该方法从天数字段减去指定数量，根据需要增加月份和年份字段，以确保结果保持有效。
		 * 如果超过最大/最小年份， 结果将无效。 例如，2009-01-01减去一天会导致2008-12-31。 此实例是不可变的，不受此方法调用的影响。 参数
		 * days - 减去的日子可能是负数 结果 一个 LocalDateTime基于这个日期时间减去，而不是null
		 */
		// ④.minus：对 年/月/日/时v分v秒v纳秒 .......... 进行减操作，返回一个新的实例
		newLdt = ldt.minusDays(5);
		System.out.println(newLdt);
	}
	/*
	 * 结果： 2018-01-20T13:45:49.142 2017-12-12T12:30:40 2017-12-12T14:30:40
	 * 2017-12-07T12:30:40
	 */

	/*
	 * 2.时间戳 与Unix元年（1970年1月1日 00:00:00）之间相差的毫秒值。
	 */
	public void test2() {
		// ①.获取当前UTC时区时间
		Instant ins1 = Instant.now(); // 默认获取 UTC 时区时间（比我们的晚8个小时）
		System.out.println(ins1);

		// ②.进行偏移量时间运算(与UTC相差8小时)
		OffsetDateTime atOffset = ins1.atOffset(ZoneOffset.ofHours(8));
		System.out.println(atOffset);

		// ③.获取毫秒
		System.out.println(ins1.toEpochMilli());

		// ④.指定 秒/毫秒/...... 获取时间(与Unix元年相差的时间)
		Instant newInstant = Instant.ofEpochSecond(1);
		System.out.println(newInstant);
	}
	/*
	 * 结果： 2018-01-20T05:46:19.739Z 2018-01-20T13:46:19.739+08:00 1516427179739
	 * 1970-01-01T00:00:01Z
	 * 
	 */

	/*
	 * 3.计算时间差/日期差 Duration:用于计算两个“时间”间隔 Period:用于计算两个“日期”间隔
	 */
	public void test3() {
		Instant ins1 = Instant.now();
		for (int i = 0; i < 1000 * 10000; i++) {

		}
		Instant ins2 = Instant.now();
		/*
		 * Duration.between：传Instant/LocalDateTime都行。
		 */
		// 1.Duration.between:计算两个时间间隔，返回一个Duration对象
		Duration between = Duration.between(ins1, ins2);

		// 2.Duration的toXxx方法：转换成对应的时间单位
		System.out.println("时间间隔：" + between.toMillis() + "s");

		/*
		 * Period.between:计算两个日期的间隔，返回一个Period对象
		 */
		LocalDate ld1 = LocalDate.now();

		LocalDate ld2 = LocalDate.of(2018, 10, 20);

		Period period = Period.between(ld2, ld1);

		// 相差 多少年 多少月 多少天
		System.out.println(period.getYears());
		System.out.println(period.getMonths());
		System.out.println(period.getDays());
	}
	/*
	 * 结果： 时间间隔：2s 0 -9 0
	 */

}
