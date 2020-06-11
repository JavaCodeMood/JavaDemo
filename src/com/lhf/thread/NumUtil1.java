package com.lhf.thread;

import java.util.concurrent.TimeUnit;

/**
 * 
 * @ClassName: NumUtil1.java
 * @Description: 使用ThreadLocal解决线程安全问题
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019年6月14日 上午10:47:41
 */
public class NumUtil1 {
	
	private static ThreadLocal<Integer> addNumThreadLocal = new ThreadLocal<>();
	
	public static int add10(int num) {
		addNumThreadLocal.set(num);
		try {
			TimeUnit.SECONDS.sleep(2);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		return addNumThreadLocal.get() + 10;
	}

}
