package com.lhf.java3;

/**
 * 
 * @ClassName: Java_Stack_Space.java
 * @Description: Javaջ�ڴ����
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019��11��9�� ����3:53:45
 */
public class Java_Stack_Space {
	
	private void test() {
		System.out.println("test����ִ����....");
		test();   //�ݹ�����Լ������ᷢ��ջ�ڴ����
	}
	
	public static void main(String[] args) {
		new Java_Stack_Space().test();
	}

}
