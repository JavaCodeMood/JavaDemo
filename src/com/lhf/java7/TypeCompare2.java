package com.lhf.java7;

/**
 * @ClassName: TypeCompare2
 * @Author: liuhefei
 * @Description: float,double�ıȽ�
 * 1. float,double���͵İ�װ�࣬�����ڶ��д���һ���¶�����˱Ƚϵ��Ƕ���ĵ�ַ
 * 
 * @Date: 2020/5/11 17:53
 */
public class TypeCompare2 {
	
	public static void main(String[] args) {
		float f1 = 314.15926f;
		float f2 = 314.15926f;
		Float f3 = 314.15926f;
		Float f4 = 314.15926f;
		System.out.println(f1 == f2);   //true�������������͵ıȽϣ��Ƚϵ���ֵ
		System.out.println(f3 == f4);   //false,��װ���͵ıȽϣ����ᴴ���¶��󣬱Ƚϵ��Ƕ���ĵ�ַ
		System.out.println(f1 == f3);   //true, ��װ���Ͳ���Ϊ�����������ͣ��Ƚϵ���ֵ
		
		
		double d1 = 314.15926575958;
		double d2 = 314.15926575958;
		Double d3 = 314.15926575958;
		Double d4 = 314.15926575958;
		System.out.println(d1 == d2);  //true,�������͵ıȽϣ��Ƚϵ���ֵ
		System.out.println(d3 == d4);  //false,��װ���͵ıȽϣ����ᴴ���¶��󣬱Ƚϵ��Ƕ���ĵ�ַ
		System.out.println(d1 == d3);  //true,��װ���Ͳ���Ϊ�����������ͣ��Ƚϵ���ֵ
	}
}
