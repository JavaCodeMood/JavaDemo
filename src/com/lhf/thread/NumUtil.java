package com.lhf.thread;

import java.util.concurrent.TimeUnit;

/**
 * 
 * @ClassName: NumUtil.java
 * @Description: 将一个数字加10的工具
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019年6月14日 上午10:09:35
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
