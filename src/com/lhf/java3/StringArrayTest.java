package com.lhf.java3;

public class StringArrayTest {

	public static void main(String[] args) {
		String[] strArr = {"һ������","һ����","������ҹ�ڵ�Ϲ��","������","����","������","������","��֪��������һҹ"};
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
