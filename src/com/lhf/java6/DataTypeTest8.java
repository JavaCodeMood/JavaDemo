package com.lhf.java6;

/**
 * 
 * @ClassName: DataTypeTest8.java
 * @Description: 基本数据类型转换为包装类  与  包装类型转换为基本类型
 * 
 * 基本数据类型转换为包装类：
基本数据类型转换为包装类，可以利用包装类的构造函数实现，即：
Byte(byte value)、Short(short value)、Character(char value)、Integer(int value)、Long(long value)、Float(float value)、Double(double value)、Boolean(boolean value)

包装类转换为基本数据类型：
包装类转换为基本数据类型，可以使用包装类带有的xxxValue()来进行转化，即：
byteValue()、shortValue()、charValue()、intValue()、longValue()、floatValue()、doubleValue()、booleanValue()

 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020年4月22日 下午4:30:40
 */
public class DataTypeTest8 {

	public static void main(String[] args) {
		byte b = 100;
		Byte b1 = new Byte(b);  //byte -> Byte
		byte b2 = b1.byteValue();   //Byte -> byte
		short sb = b1.shortValue();  //Byte -> short
		int ib = b1.intValue();   //Byte -> int
		long lb = b1.longValue();  //Byte -> long
		float fb = b1.floatValue();  //Byte -> float
		double db = b1.doubleValue();  //Byte -> double  其他同理
		
		short s = 200;
		Short s1 = new Short(s);   //short -> Short
		short s2 = s1.shortValue();  //Short -> short
		byte bs = s1.byteValue();  //Short -> byte  其他同理
		
		char c = 96;
		Character c1 = new Character(c);  //shar -> Character
		char c2 = c1.charValue();   //Character -> char  其他同理
		
		int i = 120;
		Integer i1 = new Integer(i);  //int -> Integer
		int i2 = i1.intValue();       //Integer -> int
		byte b3 = i1.byteValue();   //Integer -> byte
		short s3 = i1.shortValue();  //Integer -> short  其他同理
		
		long l = 1000;
		Long l1 = new Long(l);  //long -> Long
		long l2 = l1.longValue();  //Long -> long  其他同理
		
		float f = 3.14f;
		Float f1 = new Float(f);  //float -> Float
		float f2 = f1.floatValue();  //Float -> float  其他同理
		
		
		double d = 314.151617;
		Double d1 = new Double(d);  //double -> Double
		double d2 = d1.doubleValue();  //Double -> double
		float fd = d1.floatValue();  //Double -> float
		long ld = d1.longValue();  //Double -> long
		int id = d1.intValue();  //Double -> int  其他同理
		
		boolean bool = false;
		Boolean bool1 = new Boolean(bool);  //boolean -> Boolean
		boolean bool2 = bool1.booleanValue();  //Boolean -> boolean 其他同理
		
		
		System.out.println("b1 = " + b1);
		System.out.println("s1 = " + s1);
		System.out.println("c1 = " + c1);
		System.out.println("i1 = " + i1);
		System.out.println("l1 = " + l1);
		System.out.println("f1 = " + f1);
		System.out.println("d1 = " + d1);
        System.out.println("bool1 = " + bool1);
	}

}
