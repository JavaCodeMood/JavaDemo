package com.lhf.java7;

/**
 * 
 * @ClassName: TypeCompare6.java
 * @Description: String(�ַ���)֮��ıȽ� 
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020��5��26�� ����3:57:02
 */
public class TypeCompare6 {

	public static void main(String[] args) {
		String s1 = "abcdef";
		String s2 = "abcdef";
		String s3 = "abc";
		String s4 = "def";
		String s5 = new String("abcdef");
		String s6 = new String("abcdef");
		String s7 = s3 + s4;
		final String s8 = "abc";
		final String s9 = "def";
		String s10 = s8 + s9;
		
		
		System.out.println(s1 == s2);  //true
		System.out.println(s1 == s5);  //false
		System.out.println(s3 == s4);  //false
		System.out.println(s5 == s6);  //false
		System.out.println(s1 == s7);  //false  s3+s4ʵ������ʹ��StringBuilder.append����ɣ������ɲ�ͬ�Ķ���
		System.out.println(s1 == s10); //true ���εı���Ϊ�������ǲ����޸ĵġ�final�����ڱ�����ֱ���滻�ɶ�Ӧ��ֵ������ʵ���ϵ���s10="abc"+"def"������������£���������ֱ�Ӻϲ�Ϊs10="abcdef"����������s1==s10��
		
		System.out.println("1: " + s1.equals(s2));  //true
		System.out.println("2: " + s3.equals(s4));  //false
		System.out.println("3: " + s5.equals(s6));  //true
		System.out.println("4: " + s1.equals(s5));  //true
	
	}

}
