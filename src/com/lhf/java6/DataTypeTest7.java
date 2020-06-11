package com.lhf.java6;

/**
 * 
 * @ClassName: DataTypeTest7.java
 * @Description: 表达式运算的数据类型自动提升规则：
(1)所有的byte,short,char型的值将被提升为int型；

(2)如果有一个操作数是long型，计算结果是long型；

(3)如果有一个操作数是float型，计算结果是float型；

(4)如果有一个操作数是double型，计算结果是double型；
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020年4月22日 下午4:29:57
 */
public class DataTypeTest7 {

	//获取变量的类型
	public static String getType(Object o){    
		return o.getClass().toString();    
	} 
	
	public static void main(String[] args) {
		byte b = 12;
		short s = 350;
		char c = 90;
		int i = 100;
		long l = 2000;
		float f = 3.14f;
		double d = 3.14159265758;
		
		
		System.out.println("1 --- " + getType(b));
		System.out.println("2 --- " + getType(s));
		System.out.println("3 --- " + getType(c));
		System.out.println("4 --- " + getType(i));
		System.out.println("5 --- " + getType(l));
		System.out.println("6 --- " + getType(f));
		System.out.println("7 --- " + getType(d));
		
		System.out.println("\n");
		System.out.println("1 --- " + getType(b + s));
		System.out.println("2 --- " + getType(b + i));
		System.out.println("3 --- " + getType(s + i));
		System.out.println("4 --- " + getType(c + i));
		System.out.println("5 --- " + getType(c + s));
		System.out.println("6 --- " + getType(c + b));
		System.out.println("\n");
		
		System.out.println("1 --- " + getType(i+ l));
		System.out.println("2 --- " + getType(l + f));
		System.out.println("3 --- " + getType(f + d));
		System.out.println("4 --- " + getType(l + d));
		System.out.println("5 --- " + getType(f + f));
		System.out.println("6 --- " + getType(d + d));
	}

}
