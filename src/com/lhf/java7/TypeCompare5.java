package com.lhf.java7;

/**
 * 
 * @ClassName: TypeCompare5.java
 * @Description: double��Double�ıȽ�
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020��5��26�� ����12:25:05
 */
public class TypeCompare5 {

	public static void main(String[] args) {
		double d1 = 3.1415926d;
		double d2 = 3.1415926d;
		Double d3 = 3.1415926d;
		Double d4 = 3.1415926d;
		Double d5 = new Double(3.1415926d);
		Double d6 = new Double(3.1415926d);
		
		System.out.println(d1 == d2);  //true   �����������ͱȽ�
		System.out.println(d3 == d4);  //false  ������ͬ�Ķ���
		System.out.println(d5 == d6);  //false  ������ͬ�Ķ���
		
		System.out.println(d1 == d3);  //true  ��װ���ͻ����
		System.out.println(d1 == d5);  //true  ��װ���ͻ����
		System.out.println(d3 == d5);  //false  ������ͬ�Ķ���
		
		System.out.println("1: " + d3.equals(d4));  //true
		System.out.println("2: " + d3.equals(d5));  //true
		System.out.println("3: " + d5.equals(d6));  //true

	}

}
