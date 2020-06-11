package com.lhf.java7;

/**
 * @ClassName: TypeCompare2
 * @Author: liuhefei
 * @Description: float,double的比较
 * 1. float,double类型的包装类，都会在堆中创建一个新对象，因此比较的是对象的地址
 * 
 * @Date: 2020/5/11 17:53
 */
public class TypeCompare2 {
	
	public static void main(String[] args) {
		float f1 = 314.15926f;
		float f2 = 314.15926f;
		Float f3 = 314.15926f;
		Float f4 = 314.15926f;
		System.out.println(f1 == f2);   //true，基本数据类型的比较，比较的是值
		System.out.println(f3 == f4);   //false,包装类型的比较，都会创建新对象，比较的是对象的地址
		System.out.println(f1 == f3);   //true, 包装类型拆箱为基本数据类型，比较的是值
		
		
		double d1 = 314.15926575958;
		double d2 = 314.15926575958;
		Double d3 = 314.15926575958;
		Double d4 = 314.15926575958;
		System.out.println(d1 == d2);  //true,基本类型的比较，比较的是值
		System.out.println(d3 == d4);  //false,包装类型的比较，都会创建新对象，比较的是对象的地址
		System.out.println(d1 == d3);  //true,包装类型拆箱为基本数据类型，比较的是值
	}
}
