package com.lhf.java1;

/**
 * https://mp.weixin.qq.com/s/P_8PkUNl9XqDU3wLwDho7g
 * @ClassName: ParamsDemo.java
 * @Description: Java�ɱ����
 * ԭ���ɱ�����ڱ�ʹ�õ�ʱ�������Ȼᴴ��һ�����飬����ĳ��Ⱦ��ǵ��ø÷���ʱ���ݵ�ʵ�εĸ�����
 * Ȼ���ٰѲ���ֵȫ���ŵ�������鵱�У�Ȼ���ٰ����������Ϊ�������ݵ������õķ����С�
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019��6��28�� ����4:28:59
 */
public class ParamsDemo {

	public static void main(String[] args) {
		print("���", "����", "û������", "������","ֻ������", "���Ѽ�į", "����");
	}
	
	public static void print(String...strs) {
		for(int i = 0;i<strs.length;i++) {
			System.out.println(strs[i]);
		}
	}

}
