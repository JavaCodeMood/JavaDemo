package com.lhf.java6;

/**
 * 
 * @ClassName: DataTypeTest5.java
 * @Description: ͬһ�����У����ڶ�����ط�������ת������ӽ����ľ������ݽ��е��á�
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020��4��22�� ����10:45:58
 */
public class DataTypeTest5 {
	
	//���������ط���(��������ͬ�������Ĳ������ͣ�����������ֵ��ͬ�ķ���)
	private static double add(double d1, double d2) {
		System.out.println("add��������");
		double sum = d1 + d2;
		return sum;
	}
	
	private static double add(double d1, float f1) {
		System.out.println("add1��������");
		double sum1 = d1 + f1;
		return sum1;
	}
	
	private static float add(float f1, float f2) {
		System.out.println("add2��������");
		float sum2 = f1 + f2;
		return sum2;
	}
	
	private static float add(int i1, float f2) {
		System.out.println("add3��������");
		float sum3 = i1 + f2;
		return sum3;
	}
	

	public static void main(String[] args) {
		byte b = 100;
		short s = 300;
		int i = 500;
		float f = 3.14f;
		double d = 314.15926d;
		System.out.println("sum = " + add(b, s));   
		System.out.println("sum1 = " + add(b, i));  
		System.out.println("sum2 = " + add(s, i));   
		System.out.println("sum3 = " + add(i, f));  
		System.out.println("sum4 = " + add(b, d));   
		System.out.println("sum5 = " + add(f, d));  
		System.out.println("sum6 = " + add(d, f));  
		System.out.println("sum7 = " + add(b, b));   
		System.out.println("sum8 = " + add(i, i));  
		System.out.println("sum9 = " + add(f, f));   
		System.out.println("sum10 = " + add(d, d));  
	}

}
