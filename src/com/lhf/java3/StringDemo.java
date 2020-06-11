package com.lhf.java3;

import org.apache.commons.lang3.StringUtils;

public class StringDemo {

	public static void main(String[] args) {
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");
		System.out.println(s1 == s2);   //true
		System.out.println(s1 == s3);   //false
		System.out.println(s1 == s3.intern());  //true   //运行时常量
		
		String str = "  ";
		System.out.println("str的长度： " + str.length());

		if(str == null) {
			System.out.println("1 - 字符串为空");
		}
		if("".equals(str)) {
			System.out.println("2 -字符串为空");
		}
		if(StringUtils.isBlank(str)) {
			System.out.println("3 -字符串为空");
		}
	}

}
