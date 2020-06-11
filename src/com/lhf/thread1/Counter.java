package com.lhf.thread1;

/**
 * 
 * @ClassName: Counter.java
 * @Description: 加1减1操作
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019年9月29日 上午10:37:48
 */
public class Counter {
	int count = 0;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void add() {
		count += 1;
	}

	public void dec() {
		count -= 1;
	}
}
