package com.lhf.java1;

/**
 * https://mp.weixin.qq.com/s/P_8PkUNl9XqDU3wLwDho7g
 * @ClassName: AssertDemo.java
 * @Description: Java����
 * ԭ�����Եĵײ�ʵ�־���if���ԣ�������Խ��Ϊtrue����ʲô���������������ִ�У�
 * ������Խ��Ϊfalse��������׳�AssertError����ϳ����ִ�С�
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019��6��28�� ����4:42:00
 */
public class AssertDemo {

	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		assert a == b;
		System.out.println("a��b���");
		assert a != b : "Hollis";
		System.out.println("a��b�����");
		assert a != b;
		System.out.println("��ִ����....");

	}

}
