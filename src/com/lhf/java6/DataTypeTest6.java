package com.lhf.java6;

/**
 * 
 * @ClassName: DataTypeTest6.java
 * @Description: ǿ������ת��
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020��4��22�� ����4:03:38
 */
public class DataTypeTest6 {
	
	public static void main(String[] args) {
		double d = 314.15926762562627d;
		
		//doubleǿתΪfloat,��ʧ����С��
		float f = (float)d;
		System.out.println("f = " + f);
		
		//doubleǿתΪlong��ֻ������������
		long l = (long)d;
		System.out.println("l = " + l);
		
		//doubleǿתΪint��ֻ������������
		int i = (int)d;
		System.out.println("i = " + i);
		
		//doubleǿתΪshort��ֻ������������
		short s = (short)d;
		System.out.println("s = " + s);
		
		//doubleǿתΪbyte���������(314��Ӧ�Ķ�����Ϊ��0001 0011 1010����Ϊbyteռ8λ��ȡ���8λΪ58)
		byte b = (byte)d;
		System.out.println("b = " + b);
		
	}

}
