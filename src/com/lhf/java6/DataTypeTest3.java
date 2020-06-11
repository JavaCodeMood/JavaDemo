package com.lhf.java6;

/**
 * 
 * @ClassName: DataTypeTest3.java
 * @Description: Java基本数据类型的自动转换
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020年4月22日 上午9:57:19
 */
public class DataTypeTest3 {

	public static void main(String[] args) {
		//低精度向高精度转换
		byte b = 100;  
		short s = 200; 
		char c = 'B';
		
		int i = b;
		System.out.println("i = " + i);
		int i1 = s;
		System.out.println("i1 = " + i1);
		int i2 = c;
		System.out.println("i2 = " + i2);
		
		long l = i;
		System.out.println("l = " + l);
		
		float f = l;
		System.out.println("f = " + f);
		
		double d = f;
		System.out.println("d = " + d);
	}

}
