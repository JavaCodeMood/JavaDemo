package com.lhf.thread;

import java.util.concurrent.TimeUnit;

/**
 * 
 * @ClassName: NumUtil.java
 * @Description: ��һ�����ּ�10�Ĺ���
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019��6��14�� ����10:09:35
 */
public class NumUtil {
	
	public static int addNum = 0;
	
	public static int add10(int num) {
		addNum = num;
		try {
			TimeUnit.SECONDS.sleep(1);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		return addNum + 10;
	}

}
