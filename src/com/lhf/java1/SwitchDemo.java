package com.lhf.java1;

/**
 * 
 * @ClassName: SwitchDemo.java
 * @Description: Switch���֧��String����
 * ԭ���ַ�����switch��ͨ��equals()��hashCode()������ʵ�ֵģ�
 * ����switch��ʵ���ǹ�ϣֵ��Ȼ��ͨ��ʹ��equals�����ȽϽ��а�ȫ��飬�������Ǳ�Ҫ�ģ���Ϊ��ϣ���ܻᷢ����ײ��
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019��6��28�� ����4:16:57
 */
public class SwitchDemo {

	public static void main(String[] args) {
		String str = "world";
		switch(str) {
		case "hello":
			System.out.println("hello");
			break;
		case "world":
			System.out.println("world");
			break;
		default:
			System.out.println("Hello World!");
			break;
		}

	}

}
