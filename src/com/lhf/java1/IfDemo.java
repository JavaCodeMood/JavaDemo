package com.lhf.java1;

/**
 * https://mp.weixin.qq.com/s/P_8PkUNl9XqDU3wLwDho7g
 * @ClassName: IfDemo.java
 * @Description: Java��������
 * �ڷ������Ĵ�����û��System.out.println("Hello, ONLINE!");������ʵ�����������롣
 *
 * ��if(ONLINE)Ϊfalse��ʱ�򣬱�������û�ж����ڵĴ�����б��롣
 * ���ԣ�Java�﷨���������룬��ͨ���ж�����Ϊ������if���ʵ�ֵġ�
 * ����if�ж���������٣�������ֱ�Ӱѷ�֧Ϊfalse�Ĵ����������
 * ͨ���÷�ʽʵ�ֵ��������룬�����ڷ�������ʵ�֣����޷�������Java��Ľṹ������������Ͻ����������롣
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019��6��28�� ����4:37:53
 */
public class IfDemo {

	public static void main(String[] args) {
		final boolean DEBUG = true;
        if(DEBUG) {
            System.out.println("Hello, DEBUG!");
        }

        final boolean ONLINE = false;

        if(ONLINE){
            System.out.println("Hello, ONLINE!");
        }
	}

}
