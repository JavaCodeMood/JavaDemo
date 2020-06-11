package com.lhf.java7;

/**
 * 
 * @ClassName: TypeCompare5.java
 * @Description: double与Double的比较
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020年5月26日 下午12:25:05
 */
public class TypeCompare5 {

	public static void main(String[] args) {
		double d1 = 3.1415926d;
		double d2 = 3.1415926d;
		Double d3 = 3.1415926d;
		Double d4 = 3.1415926d;
		Double d5 = new Double(3.1415926d);
		Double d6 = new Double(3.1415926d);
		
		System.out.println(d1 == d2);  //true   基本数据类型比较
		System.out.println(d3 == d4);  //false  两个不同的对象
		System.out.println(d5 == d6);  //false  两个不同的对象
		
		System.out.println(d1 == d3);  //true  封装类型会拆箱
		System.out.println(d1 == d5);  //true  封装类型会拆箱
		System.out.println(d3 == d5);  //false  两个不同的对象
		
		System.out.println("1: " + d3.equals(d4));  //true
		System.out.println("2: " + d3.equals(d5));  //true
		System.out.println("3: " + d5.equals(d6));  //true

	}

}
