package com.lhf.java1;

/**
 * https://mp.weixin.qq.com/s/P_8PkUNl9XqDU3wLwDho7g
 * @ClassName: IntegerDemo.java
 * @Description: Java自动装箱和拆箱
 * 装箱：基本类型转换为封装类型
 * 拆箱：封装类型转换为基本类型
 * 原理：装箱过程是通过调用包装器的valueOf方法实现的，而拆箱过程是通过调用包装器的 xxxValue方法实现的。
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019年6月28日 下午4:25:27
 */
public class IntegerDemo {

	public static void main(String[] args) {
		//装箱
		 int i = 10;
		 Integer n = i;
		 System.out.println("n = " + n);
		 
		 //拆箱
		 Integer a = 10;
		 int b = a;
         System.out.println("b = " + b);
	}

}
