package com.lhf.java;

public class UserMain {
	
	public static void main(String[] args) {
		User u1 = new User();
		User u2 = new User();
		
		System.out.println(u1==u2);   //false
		System.out.println(u1.equals(u2));  //false
		
		String str1 = "abc";
		String str2 = "abc";
		System.out.println(str1==str2);  //true
		System.out.println(str1.equals(str2));  //true
		
		String str3 = "abc";
		String str4 = new String("abc");
		System.out.println(str3==str4);  //false
		System.out.println(str3.equals(str4));  //true
		
		u1.setId(1);
		u1.setName("¶Ï³¾");
		u1.setEmail("xxxx@qq.com");
		u1.setPhone("18296666669");
		System.out.println(u1.toString());
	}

}
