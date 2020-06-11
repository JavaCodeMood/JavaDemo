package com.lhf.java6;

/**
 * 
 * @ClassName: DataTypeTest2.java
 * @Description: Java基本数据的装箱与拆箱
 * 装箱就是自动将基本数据类型转换为包装类型；拆箱就是自动将包装类型转换为基本数据类型。
 * 
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020年4月22日 上午9:56:21
 */
public class DataTypeTest2 {

	public static void main(String[] args) {
		
		Byte b = 1;  //自动装箱
		byte b1 = b;  //自动拆箱(下同)
		
		Short s = 2;
		short s1 = s;
		
		Character c = 'F';
		char c1 = c;
		
		Integer i = 100;
		int i1 = i;
		
		Long l = 100L;   // l和L均可
		long l1 = l;
		
		Float f = 3.14F; // f和F均可
		float f1 = f;
		
		Double d = 3.14;
		double d1 = d;
	
		Boolean bool = true;
		boolean bool1 = bool;
        
	}

}
