package com.lhf.java7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang3.time.DateUtils;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;

/**
 * 
 * @ClassName: TypeCompare7.java
 * @Description: Date֮��ıȽ�
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020��5��26�� ����6:00:04
 */
public class TypeCompare7 {

	// ����һ  ֻ�Ƚ������գ�����ʱ����
	public static boolean sameDate(Date d1, Date d2) {
		if (null == d1 || null == d2) {
			return false;
		}

		Calendar cal1 = Calendar.getInstance();
		cal1.setTime(d1);
		cal1.set(Calendar.HOUR_OF_DAY, 0);
		cal1.set(Calendar.MINUTE, 0);
		cal1.set(Calendar.SECOND, 0);
		cal1.set(Calendar.MILLISECOND, 0);

		Calendar cal2 = Calendar.getInstance();
		cal2.setTime(d2);
		cal2.set(Calendar.HOUR_OF_DAY, 0);
		cal2.set(Calendar.MINUTE, 0);
		cal2.set(Calendar.SECOND, 0);
		cal2.set(Calendar.MILLISECOND, 0);

		return cal1.getTime().equals(cal2.getTime());
	}

	// ������
	public static boolean sameDate1(Date date1, Date date2) throws ParseException {
		// 1.����Date��equals�Ƚϴ�С
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		// sdf.setTimeZone(new TimeZone()); // �����Ҫ����ʱ�����򣬿�������������
		
		if (date1.equals(date2)) {
			// ���
			return true;
		} else {
			return false;
		}
	}

	// ������   ֻ�Ƚ������գ�����ʱ����
	public static boolean sameDate2(Date date1, Date date2) {
		return DateUtils.isSameDay(date1, date2);
	}

	// ������ ֻ�Ƚ������գ�����ʱ����  �� ��Ҫ����joda-time-2.10.6.jar ��
	public static Boolean sameDate3(Date dt1, Date dt2) {
		LocalDate ld1 = new LocalDate(new DateTime(dt1));
		LocalDate ld2 = new LocalDate(new DateTime(dt2));
		return ld1.equals(ld2);
	}

	// ������  ֻ�Ƚ������գ�����ʱ����
	public static boolean sameDate4(Date d1, Date d2) {
		java.time.LocalDate localDate1 = ZonedDateTime.ofInstant(d1.toInstant(), ZoneId.systemDefault()).toLocalDate();
		java.time.LocalDate localDate2 = ZonedDateTime.ofInstant(d2.toInstant(), ZoneId.systemDefault()).toLocalDate();
		return localDate1.isEqual(localDate2);
	}

	// ������
	public static boolean sameDate5(Date date1, Date date2) {
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		time1.setTime(date1);
		time2.setTime(date2);
		if(time1.equals(time2)) {
			return true;
		}else {
			return false;
		}

	}

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		
		 String timeStr1 = "2020-07-01 12:45:45";
		 String timeStr2 = "2020-07-01 12:45:40"; 
		 Date date1 = sdf.parse(timeStr1); 
		 Date date2 = sdf.parse(timeStr2);
		 
		 //Date date1 = new Date();
		 //Date date2 = new Date();
		 System.out.println("1 = " + sameDate(date1, date2));   //true
		 System.out.println("2 = " + sameDate1(date1, date2));  //false
		 System.out.println("3 = " + sameDate2(date1, date2));  //true
		 System.out.println("4 = " + sameDate3(date1, date2));  //true
		 System.out.println("5 = " + sameDate4(date1, date2));  //true
		 System.out.println("6 = " + sameDate5(date1, date2));  //false

	}

}
