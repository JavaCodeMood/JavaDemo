package com.lhf.java1;

public class StringUtil {

	public static void main(String[] args) {
		String str = "    �� �� ���� �̻𣬻�  ��һ�����롣���ֳ�����    ����������   �ƻؿ�����   ͤ�̣���   ��շ���Ұ�����̾     ";

		// ����һ�� str.trim() trim()��ȥ����β�ո�
		String str1 = str.trim();
		System.out.println("str1 = " + str1);

		// ��������str.replace(" ", ""); ȥ�����пո񣬰�����β���м�
		String str2 = str.replace(" ", "");
		System.out.println("str2 = " + str2);

		// ��������replaceAll(" +",""); ȥ�����пո񣬰�����β���м�
		String str3 = str.replaceAll(" +", "");
		System.out.println("str3 = " + str3);

		// �����ģ�replaceAll("\\s*", "");  ȥ�����пո񣬰�����β���м�
		String str4 = str.replaceAll("\\s*", "");
		System.out.println("str4 = " + str4);

	}


}
