package com.lhf.java1;

public class StringUtil {

	public static void main(String[] args) {
		String str = "    用 我 三生 烟火，换  你一世迷离。长街长，烟    花繁，你挑   灯回看，短   亭短，红   尘辗，我把萧再叹     ";

		// 方法一： str.trim() trim()是去掉首尾空格
		String str1 = str.trim();
		System.out.println("str1 = " + str1);

		// 方法二：str.replace(" ", ""); 去掉所有空格，包括首尾、中间
		String str2 = str.replace(" ", "");
		System.out.println("str2 = " + str2);

		// 方法三：replaceAll(" +",""); 去掉所有空格，包括首尾、中间
		String str3 = str.replaceAll(" +", "");
		System.out.println("str3 = " + str3);

		// 方法四：replaceAll("\\s*", "");  去掉所有空格，包括首尾、中间
		String str4 = str.replaceAll("\\s*", "");
		System.out.println("str4 = " + str4);

	}


}
