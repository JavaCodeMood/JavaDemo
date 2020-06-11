package com.lhf.java7;

/**
 * 
 * @ClassName: TypeCompare4.java
 * @Description: float与Float的比较
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020年5月26日 上午11:56:19
 */
public class TypeCompare4 {

	public static void main(String[] args) {
		float f1 = 3.14f;
		float f2 = 3.14f;
		Float f3 = 3.14f;
		Float f4 = 3.14f;
		Float f5 = new Float(3.14);
		Float f6 = new Float(3.14);
		
		System.out.println(f1 == f2);  //true   基本数据类型比较
		System.out.println(f3 == f4);  //false  两个不同的对象
		System.out.println(f5 == f6);  //false  两个不同的对象
		
		System.out.println(f1 == f3);  //true  封装类型会拆箱
		System.out.println(f1 == f5);  //true  封装类型会拆箱
		System.out.println(f3 == f5);  //false  
		
		System.out.println("1: " + f3.equals(f4));  //true
		System.out.println("2: " + f3.equals(f5));  //true
		System.out.println("3: " + f5.equals(f6));  //true

	}

}
