package com.lhf.java6;

/**
 * 
 * @ClassName: DataTypeTest4.java
 * @Description: �ڽ��з�������ʱ��ʵ�ʲ����ľ��Ƚ�С���������õķ�������ʽ�����ľ��Ƚϴ�ʱ(����ƥ��ķ��������ֱ�ӵ���ƥ��ķ���)��ϵͳҲ�Ὣ����С�����������Զ�ת��Ϊ���Ƚϴ���������ͣ�Ȼ����з������á�
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020��4��22�� ����10:45:12
 */
public class DataTypeTest4 {
	
	private static double add(double d1, double d2) {
		double sum = d1 + d2;
		return sum;
	}
	
	private static double add1(double d1, float f1) {
		double sum1 = d1 + f1;
		return sum1;
	}
	
	public static void main(String[] args) {
		byte b = 120;
		int i = 180;
		System.out.println("sum = " + add(b, i));   //300.0
		System.out.println("sum1 = " + add1(b, i));  //300.0
	}

}
