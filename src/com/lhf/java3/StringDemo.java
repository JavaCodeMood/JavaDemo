package com.lhf.java3;

import org.apache.commons.lang3.StringUtils;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		System.out.println(s1 == s2);   //true
		System.out.println(s1 == s3);   //false
		System.out.println(s1 == s3.intern());  //true   //����ʱ����
		
		String str = "  ";
		System.out.println("str�ĳ��ȣ� " + str.length());

		if(str == null) {
			System.out.println("1 - �ַ���Ϊ��");
		}
		if("".equals(str)) {
			System.out.println("2 -�ַ���Ϊ��");
		}
		if(StringUtils.isBlank(str)) {
			System.out.println("3 -�ַ���Ϊ��");
		}
	}

}
