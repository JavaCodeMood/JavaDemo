package com.lhf.java1;

import org.apache.commons.lang3.StringUtils;

public class ArrayDemo {

	public static void main(String[] args) {
		String[] str = {"��ˮ��", "������"};
		String str4 = StringUtils.join(str, ","); // ����ת�ַ���(���ŷָ�)(�Ƽ�)
		System.out.println(str4); // 0,1,2,3,4,5

	}

}
