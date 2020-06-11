package com.lhf.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * @ClassName: ThreadMain1.java
 * @Description: 由于线程切换太快，并且没有给add10()加锁，将会得不到预期的结果，存在线程安全问题
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019年6月14日 上午10:15:09
 */
public class ThreadMain1 {
	
	public static void main(String[] args) {
		//定义线程池
		ExecutorService service = Executors.newFixedThreadPool(20);
		
		for(int i = 0;i < 20;i++) {
			int num = i;
			service.execute(() -> {
				System.out.println(num + " " + NumUtil1.add10(num));
			});
		}
		service.shutdown();
	}

}
