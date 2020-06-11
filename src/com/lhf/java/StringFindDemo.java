package com.lhf.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringFindDemo {

	public static void main(String[] args) {
		String str = "��ö�ɢ���մ��";
		String index = "ɢ��";
		System.out.println("index������������������������������������");
		getIndex(str, index);
		System.out.println("contains������������������������������������");
		getContains(str, index);
		System.out.println("pattern������������������������������������");
		getPattern(str, index);
	}

	// ��һ������
	public static void getIndex(String str, String index) {
		if (str.indexOf(index) > -1) {
			System.out.println("�ҵ�����˵���������----" + index);
		} else {
			System.out.println("û���ҵ�����˵���������---" + index);
		}
	}

	// �ڶ�������
	public static void getContains(String str, String index) {
		if (str.contains(index) == true) {
			System.out.println("�ҵ�����˵���������---" + index);
		} else {
			System.out.println("û���ҵ�����˵���������" + index);
		}
	}

	// ����������
	public static void getPattern(String str, String index) {
		Pattern p = Pattern.compile(index);
		Matcher m = p.matcher(str);
		if (m.find()) {
			System.out.println("�ҵ�����˵���������---" + index);
		} else {
			System.out.println("û���ҵ�����˵���������---" + index);
		}
	}

}
