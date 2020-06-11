package com.lhf.java1;

import java.text.NumberFormat;

public class Number1Demo {

	/**
	 * description: ��ʽ�����֣�ʵ����ಹ 0.
	 * 
	 * @param num ��ʽ��������
	 * @param min ��Сλ��
	 * @param max ���λ��
	 * @return String
	 * @version v1.0
	 * @author w
	 * @date 2019��7��19�� ����2:08:31
	 */
	public static String fill(int num, int min, int max) {
		NumberFormat numberFormat = NumberFormat.getInstance();
		// �������ָ�ʽ�����顣 �磺 000,001
		numberFormat.setGroupingUsed(false);
		// ������Сλ��
		numberFormat.setMinimumIntegerDigits(min);
		// �������λ��
		numberFormat.setMaximumIntegerDigits(max);
		return numberFormat.format(num);
	}

	/**
	 * description: ʹ�� String.format ��ʽ�����֣�ʵ����ಹ 0
	 * 
	 * @param num   ��Ҫ��ʽ��������
	 * @param digit �����ַ������ȣ���������λ����
	 * @return String
	 * @version v1.0
	 * @author w
	 * @date 2019��7��19�� ����2:14:31
	 */
	public static String fillString(int num, int digit) {
		/**
		 * 0����ʾǰ�油0 digit����ʾ��������λ�� d����ʾ����Ϊ��������
		 */
		return String.format("%0" + digit + "d", num);
	}

	public static void main(String[] args) {
		/**
		 * ���� �������Ϊ 5 λ�������㲿����ಹ 0 ���� max = min =5
		 */
		String fill = fill(1287, 8, 8);
		System.out.println(fill);
		fill = fill(233, 15, 15);
		System.out.println(fill);
		
		String fillStr = fillString(6543, 8);
		System.out.println("\n"+fillStr);
		fillStr = fillString(233, 8);
		System.out.println(fillStr);

	}

}
