package com.lhf.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 
 * @ClassName: ThreadMain1.java
 * @Description: �����߳��л�̫�죬����û�и�add10()����������ò���Ԥ�ڵĽ���������̰߳�ȫ����
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019��6��14�� ����10:15:09
 */
public class ThreadMain1 {
	
	public static void main(String[] args) {
		//�����̳߳�
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
