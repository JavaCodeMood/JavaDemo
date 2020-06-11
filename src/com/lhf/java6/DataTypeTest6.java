package com.lhf.java6;

/**
 * 
 * @ClassName: DataTypeTest6.java
 * @Description: 强制类型转换
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020年4月22日 下午4:03:38
 */
public class DataTypeTest6 {
	
	public static void main(String[] args) {
		double d = 314.15926762562627d;
		
		//double强转为float,丢失部分小数
		float f = (float)d;
		System.out.println("f = " + f);
		
		//double强转为long，只保留整数部分
		long l = (long)d;
		System.out.println("l = " + l);
		
		//double强转为int，只保留整数部分
		int i = (int)d;
		System.out.println("i = " + i);
		
		//double强转为short，只保留整数部分
		short s = (short)d;
		System.out.println("s = " + s);
		
		//double强转为byte，存在溢出(314对应的二进制为：0001 0011 1010，因为byte占8位，取其后8位为58)
		byte b = (byte)d;
		System.out.println("b = " + b);
		
	}

}
