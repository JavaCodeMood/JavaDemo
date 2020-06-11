package com.lhf.java3;

public class StringArrayTest {

	public static void main(String[] args) {
		String[] strArr = {"一天晚上","一个人","三更半夜黑灯瞎火","不害怕","出门","遇见她","遂聊天","不知不觉又是一夜"};
		boolean bool = false;
		String str = null;
		
		int index = 0;
		for(int i = 0; i < strArr.length; i++) {
			if(strArr[i].length() > strArr[index].length()) {
				index = i;
			}
		}
		System.out.println("str = " + strArr[index]);

	}

}
