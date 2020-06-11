package com.lhf.java1;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;

public class Java8TimeDemo {

	public static void main(String[] args) {
		
		//��ȡ��ǰ������
		LocalDate date = LocalDate.now();
		System.out.println("date = " + date);
		
		//����ָ����������
		LocalDate date1 = LocalDate.of(2019, 11, 27);
		System.out.println("date1 = " + date1);
		
		//��ȡ�꣬�£��գ����ڼ�
		LocalDate localDate = LocalDate.now();
		int year = localDate.getYear();  //��
		int month = localDate.getMonthValue();  //��
		int day = localDate.getDayOfMonth();  //��
		System.out.println(year + "-" + month + "-" + day);
		
		//��ȡ�꣬�£��գ����ڼ�
		int year1 = localDate.get(ChronoField.YEAR);
		int month1 = localDate.get(ChronoField.MONTH_OF_YEAR);
		int dayOfWeek1 = localDate.get(ChronoField.DAY_OF_WEEK);
		int day1 = localDate.get(ChronoField.DAY_OF_MONTH);
		System.out.println(year1 + "-" + month1 +  "-" + day1 + " ,����" + dayOfWeek1);
		
		Month month2 = localDate.getMonth();
		DayOfWeek dayOfWeek = localDate.getDayOfWeek();
		System.out.println("month2 = " + month2 + " , dayOfWeek = " + dayOfWeek);
		
		//LocalTime ��ȡ���㼸�ּ���
		//��ȡ��ǰʱ�� ʱ����
		LocalTime localTime = LocalTime.now();
		System.out.println("��ǰʱ�䣺" + localTime);
		
		//ָ��ʱ����
		LocalTime localTime1 = LocalTime.of(13, 39, 10);
		System.out.println("��ǰʱ��1��" + localTime1);
		
		//��ȡʱ����
		//��ȡСʱ
		int hour = localTime.getHour();
		int hour1 = localTime.get(ChronoField.HOUR_OF_DAY);
		
		//��ȡ��
		int minute = localTime.getMinute();
		int minute1 = localTime.get(ChronoField.MINUTE_OF_HOUR);
		
		//��ȡ��
		int second = localTime.getSecond();
		int second1 = localTime.get(ChronoField.SECOND_OF_MINUTE);
		System.out.println("ʱ���룺"+hour+":"+minute+":"+second);
		System.out.println("ʱ����1��"+hour1+":"+minute1+":"+second1);
		
		//LocalDateTime ��ȡ������ʱ����    ����LocalDate + LocalTime
		//����LocalDateTime
		LocalDateTime localDateTime = LocalDateTime.now();
		LocalDateTime localDateTime1 = LocalDateTime.of(2019, Month.SEPTEMBER, 30, 13, 47, 45);
		LocalDateTime localDateTime2 = LocalDateTime.of(localDate,  localTime);
		LocalDateTime localDateTime3 = localDate.atTime(localTime);
		LocalDateTime localDateTime4 = localTime.atDate(localDate);
		
		System.out.println("������ʱ���룺" + localDateTime);
		System.out.println("������ʱ����1��" + localDateTime1);
		System.out.println("������ʱ����2��" + localDateTime2);
		System.out.println("������ʱ����3��" + localDateTime3);
		System.out.println("������ʱ����4��" + localDateTime4);
		
		//��ȡLocalDate
		LocalDate  localDate2 = localDateTime.toLocalDate();
		System.out.println("localDate2 = " + localDate2);
		
		//��ȡLocalTime
		LocalTime localTime2 = localDateTime.toLocalTime();
		System.out.println("localTime2 = " + localTime2);
		System.out.println(localDate2 + " " + localTime2);
		
		//Instant  ��ȡ����
		//����Instant����
		Instant instant = Instant.now();
		//��ȡ����
		long currentSecond = instant.getEpochSecond();
		System.out.println("currentSecond = " + currentSecond);
		
		//��ȡ������
		long currentMilli = instant.toEpochMilli();
		System.out.println("currentMilli = " + currentMilli);
		
		System.out.println("ʱ�����"+System.currentTimeMillis());
		
		
		
		
		/**********************************�����������յ��޸��Լ���ʽ������*********************************************/
		//ָ��һ��ʱ�� ������ʱ����
		LocalDateTime local = LocalDateTime.of(2019, Month.SEPTEMBER, 30, 14, 02, 45);
		System.out.println("local = " + local);
		//����2��
		local = local.plusYears(2);
		System.out.println("local = " + local);
		//������2��
		local = local.plus(1, ChronoUnit.YEARS);
		System.out.println("local = " + local);
		//����2����
		local = local.minusMonths(2);
		System.out.println("local = " + local);
		//�ټ���3����
		local = local.minus(3, ChronoUnit.MONTHS);
		System.out.println("local = " + local);
		//�ټ���3��
		local = local.minusYears(3);  //�ȼ���local.minus(3, ChronoUnit.YEARS);
		System.out.println("local = " + local);
		//�ټ�4����
		local = local.plusMonths(4); //�ȼ��� local.plus(4, ChronoUnit.MONTHS);
		System.out.println("local = " + local);
		//ʱ���������(plus)�����(minus)Ҳ��һ���������ʡ���ˡ�
		
		
		//�޸�ĳ��������ʱ����
		LocalDateTime local1 = LocalDateTime.of(2019, Month.SEPTEMBER, 30, 14, 20, 45);
		//�޸���Ϊ2023
		local1 = local1.withYear(2023);
		System.out.println("local1 = " + local1);
		//���޸���Ϊ2025
		local1 = local1.with(ChronoField.YEAR, 2025);
		System.out.println("local1 = " + local1);
		
		//�޸���Ϊ8
		local1 = local1.withMonth(8); 
		System.out.println("local1 = " + local1);
		//���޸���Ϊ12
		local1 = local1.with(ChronoField.MONTH_OF_YEAR, 12);
		System.out.println("local1 = " + local1);
		
		//�޸���Ϊ25
		local1 = local1.withDayOfMonth(25);
		System.out.println("local1 = " + local1);
		//���޸���Ϊ15
		local1 = local1.with(ChronoField.DAY_OF_MONTH, 15);
		System.out.println("local1 = " + local1);
		//ʱ������޸�(with)Ҳ�����Ƶģ������ʡ���ˡ�������
		
		
		//��ʽ��ʱ��  DateTimeFormatterĬ���ṩ�˶��ָ�ʽ����ʽ��Ҳ����ʹ������ofPattern()�Զ����ʽ����ʽ
		//DateTimeFormatter ���̰߳�ȫ�ģ� SimpleDateFormat ���̲߳���ȫ��
	    LocalDate localDate3 = LocalDate.of(2019, 11, 30);
	    String dateStr = localDate.format(DateTimeFormatter.BASIC_ISO_DATE);
	    System.out.println("��ʽ��ʱ��dateStr = " + dateStr);
	    
	    String dateStr1 = localDate.format(DateTimeFormatter.ISO_LOCAL_DATE);
	    System.out.println("��ʽ��ʱ��dateStr1 = " + dateStr1);
	    
	    //�Զ����ʽ��ʱ��
	    DateTimeFormatter dataTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	    String dateStr2 = localDate.format(dataTimeFormatter);
	    System.out.println("��ʽ��ʱ��dateStr2 = " + dateStr2);
	    
	    LocalTime localTime3 = LocalTime.of(14,  44, 23);
	    LocalDateTime localDateTime5 = LocalDateTime.of(localDate3, localTime3);
	    System.out.println("localDateTime5 = " + localDateTime5);
	    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd|HH|mm:ss");
	    String dateStr3 = dtf.format(localDateTime5);
	    System.out.println("dateStr3 = " + dateStr3);
		
		//����ʱ��
	    LocalDate localDate4 = LocalDate.parse("20191130", DateTimeFormatter.BASIC_ISO_DATE);
	    System.out.println("localDate4 = " + localDate4);
		
	    LocalDate localDate5 = LocalDate.parse("2019-11-30", DateTimeFormatter.ISO_LOCAL_DATE);
	    System.out.println("localDate5 = " + localDate5);
		
	    System.out.println("��ʽ��ʱ�䣺" + getCurrTime());
	
	}
	
	
	 public static String getCurrTime(){
	        DateTimeFormatter dataTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMddHHssmm");
	        LocalDateTime localDateTime = LocalDateTime.now();
	        String dataStr = dataTimeFormatter.format(localDateTime);
	        
	        return dataStr;

	    }

}
