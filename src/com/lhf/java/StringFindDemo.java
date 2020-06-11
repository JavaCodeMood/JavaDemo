package com.lhf.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringFindDemo {

	public static void main(String[] args) {
		String str = "你好多散发苏大夫";
		String index = "散发";
		System.out.println("index方法＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝");
		getIndex(str, index);
		System.out.println("contains方法＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝");
		getContains(str, index);
		System.out.println("pattern方法＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝");
		getPattern(str, index);
	}

	// 第一个方法
	public static void getIndex(String str, String index) {
		if (str.indexOf(index) > -1) {
			System.out.println("找到了你说的这个货：----" + index);
		} else {
			System.out.println("没有找到了你说的这个货：---" + index);
		}
	}

	// 第二个方法
	public static void getContains(String str, String index) {
		if (str.contains(index) == true) {
			System.out.println("找到了你说的这个货：---" + index);
		} else {
			System.out.println("没有找到了你说的这个货：" + index);
		}
	}

	// 第三个方法
	public static void getPattern(String str, String index) {
		Pattern p = Pattern.compile(index);
		Matcher m = p.matcher(str);
		if (m.find()) {
			System.out.println("找到了你说的这个货：---" + index);
		} else {
			System.out.println("没有找到了你说的这个货：---" + index);
		}
	}

}
