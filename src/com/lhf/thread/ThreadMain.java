package com.lhf.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * @ClassName: ThreadMain.java
 * @Description: ���̻߳����£���������ཫ�ᱨ�������̰߳�ȫ����
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019��6��14�� ����10:07:18
 */
public class ThreadMain {

	public static void main(String[] args) {
		ExecutorService service = Executors.newFixedThreadPool(20);
		
		for(int i = 0;i < 20; i++) {
			service.execute(() -> {
				System.out.println(DateUtil1.parse("2019-06-14 10:06:34"));
			});
		}
        service.shutdown();
	}

}
