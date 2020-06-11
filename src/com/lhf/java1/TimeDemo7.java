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
	 * 1.������ʱ�� LocalDate�� LocalTime�� LocalDateTime��
	 */
	public void test1() {
		/*
		 * public static LocalDateTime now(): ��Ĭ��ʱ����ϵͳʱ�ӻ�ȡ��ǰ������ʱ�䡣 �⽫��ѯĬ��ʱ���е�system
		 * clock�Ի�ȡ��ǰ������ʱ�䡣 ʹ�ô˷�������ֹʹ�ñ���ʱ�ӽ��в��ԣ���Ϊʱ����Ӳ����ġ� ��� ��ǰ����ʱ��ʹ��ϵͳʱ�Ӻ�Ĭ��ʱ������Ϊ��
		 */
		// ��.now����ȡ��ǰ���ڣ�ʱ�䣩
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);

		/*
		 * public static LocalDateTime of(int year, int month, int dayOfMonth, int hour,
		 * int minute): ���꣬�£��գ�Сʱ�ͷ��ӻ��LocalDateTime��ʵ�����������������Ϊ�㡣
		 * �⽫����һ��LocalDateTime��ָ�����꣬�£��գ��£�Сʱ�ͷ��ӡ� �����ڱ��������������Ч�� �����׳��쳣�� �ڶ��͵�ʮ�����ֶν�������Ϊ�㡣
		 * ���� year - ��MIN_YEAR��MAX_YEAR����� month - ��1��1����12�գ�12�£����·ݣ� dayOfMonth -
		 * �����1��31������ hour - �����0��23��Сʱ minute - ��0��59��ʾ��Сʱ ��� ��������ʱ�䣬��Ϊ��
		 * 
		 * �������صķ���
		 */
		// ��.of��ָ������ʱ��
		ldt = LocalDateTime.of(2017, 12, 12, 12, 30, 40);
		System.out.println(ldt);

		/*
		 * public LocalDateTime plusHours(long hours)�� ��ָ����ʱ��η��ش�LocalDateTime�ĸ�����Сʱ����
		 * ��ʵ���ǲ��ɱ�ģ����ܴ˷������õ�Ӱ�졣 ���� hours - Ҫ��ӵ�ʱ�����Ϊ���� ��� һ��
		 * LocalDateTime�����������ʱ����ӵ�Сʱ����Ϊnull
		 */
		// ��.plus���� ��/��/��/ʱv��v��v���� .......... ���мӲ���������һ���µ�ʵ��
		LocalDateTime newLdt = ldt.plusHours(2);
		System.out.println(newLdt);

		/*
		 * public LocalDateTime minusDays(long days):
		 * ���ش�LocalDateTime�ĸ���������ָ����ʱ��������Ϊ��λ�� �÷����������ֶμ�ȥָ��������������Ҫ�����·ݺ�����ֶΣ���ȷ�����������Ч��
		 * ����������/��С��ݣ� �������Ч�� ���磬2009-01-01��ȥһ��ᵼ��2008-12-31�� ��ʵ���ǲ��ɱ�ģ����ܴ˷������õ�Ӱ�졣 ����
		 * days - ��ȥ�����ӿ����Ǹ��� ��� һ�� LocalDateTime�����������ʱ���ȥ��������null
		 */
		// ��.minus���� ��/��/��/ʱv��v��v���� .......... ���м�����������һ���µ�ʵ��
		newLdt = ldt.minusDays(5);
		System.out.println(newLdt);
	}
	/*
	 * ����� 2018-01-20T13:45:49.142 2017-12-12T12:30:40 2017-12-12T14:30:40
	 * 2017-12-07T12:30:40
	 */

	/*
	 * 2.ʱ��� ��UnixԪ�꣨1970��1��1�� 00:00:00��֮�����ĺ���ֵ��
	 */
	public void test2() {
		// ��.��ȡ��ǰUTCʱ��ʱ��
		Instant ins1 = Instant.now(); // Ĭ�ϻ�ȡ UTC ʱ��ʱ�䣨�����ǵ���8��Сʱ��
		System.out.println(ins1);

		// ��.����ƫ����ʱ������(��UTC���8Сʱ)
		OffsetDateTime atOffset = ins1.atOffset(ZoneOffset.ofHours(8));
		System.out.println(atOffset);

		// ��.��ȡ����
		System.out.println(ins1.toEpochMilli());

		// ��.ָ�� ��/����/...... ��ȡʱ��(��UnixԪ������ʱ��)
		Instant newInstant = Instant.ofEpochSecond(1);
		System.out.println(newInstant);
	}
	/*
	 * ����� 2018-01-20T05:46:19.739Z 2018-01-20T13:46:19.739+08:00 1516427179739
	 * 1970-01-01T00:00:01Z
	 * 
	 */

	/*
	 * 3.����ʱ���/���ڲ� Duration:���ڼ���������ʱ�䡱��� Period:���ڼ������������ڡ����
	 */
	public void test3() {
		Instant ins1 = Instant.now();
		for (int i = 0; i < 1000 * 10000; i++) {

		}
		Instant ins2 = Instant.now();
		/*
		 * Duration.between����Instant/LocalDateTime���С�
		 */
		// 1.Duration.between:��������ʱ����������һ��Duration����
		Duration between = Duration.between(ins1, ins2);

		// 2.Duration��toXxx������ת���ɶ�Ӧ��ʱ�䵥λ
		System.out.println("ʱ������" + between.toMillis() + "s");

		/*
		 * Period.between:�����������ڵļ��������һ��Period����
		 */
		LocalDate ld1 = LocalDate.now();

		LocalDate ld2 = LocalDate.of(2018, 10, 20);

		Period period = Period.between(ld2, ld1);

		// ��� ������ ������ ������
		System.out.println(period.getYears());
		System.out.println(period.getMonths());
		System.out.println(period.getDays());
	}
	/*
	 * ����� ʱ������2s 0 -9 0
	 */

}
