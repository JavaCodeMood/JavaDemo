package com.lhf.java6;

/**
 * 
 * @ClassName: DataTypeTest8.java
 * @Description: ������������ת��Ϊ��װ��  ��  ��װ����ת��Ϊ��������
 * 
 * ������������ת��Ϊ��װ�ࣺ
������������ת��Ϊ��װ�࣬�������ð�װ��Ĺ��캯��ʵ�֣�����
Byte(byte value)��Short(short value)��Character(char value)��Integer(int value)��Long(long value)��Float(float value)��Double(double value)��Boolean(boolean value)

��װ��ת��Ϊ�����������ͣ�
��װ��ת��Ϊ�����������ͣ�����ʹ�ð�װ����е�xxxValue()������ת��������
byteValue()��shortValue()��charValue()��intValue()��longValue()��floatValue()��doubleValue()��booleanValue()

 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020��4��22�� ����4:30:40
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
		double db = b1.doubleValue();  //Byte -> double  ����ͬ��
		
		short s = 200;
		Short s1 = new Short(s);   //short -> Short
		short s2 = s1.shortValue();  //Short -> short
		byte bs = s1.byteValue();  //Short -> byte  ����ͬ��
		
		char c = 96;
		Character c1 = new Character(c);  //shar -> Character
		char c2 = c1.charValue();   //Character -> char  ����ͬ��
		
		int i = 120;
		Integer i1 = new Integer(i);  //int -> Integer
		int i2 = i1.intValue();       //Integer -> int
		byte b3 = i1.byteValue();   //Integer -> byte
		short s3 = i1.shortValue();  //Integer -> short  ����ͬ��
		
		long l = 1000;
		Long l1 = new Long(l);  //long -> Long
		long l2 = l1.longValue();  //Long -> long  ����ͬ��
		
		float f = 3.14f;
		Float f1 = new Float(f);  //float -> Float
		float f2 = f1.floatValue();  //Float -> float  ����ͬ��
		
		
		double d = 314.151617;
		Double d1 = new Double(d);  //double -> Double
		double d2 = d1.doubleValue();  //Double -> double
		float fd = d1.floatValue();  //Double -> float
		long ld = d1.longValue();  //Double -> long
		int id = d1.intValue();  //Double -> int  ����ͬ��
		
		boolean bool = false;
		Boolean bool1 = new Boolean(bool);  //boolean -> Boolean
		boolean bool2 = bool1.booleanValue();  //Boolean -> boolean ����ͬ��
		
		
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
