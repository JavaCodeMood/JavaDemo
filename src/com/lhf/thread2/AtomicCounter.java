package com.lhf.thread2;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *  java.util.concurrent 中的AtomicInteger 来保证原子操作，实现线程安全
 * @ClassName: AtomicCounter.java
 * @Description: 
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019年9月29日 上午10:43:52
 */
public class AtomicCounter {
	
	private AtomicInteger integer = new AtomicInteger();

    public AtomicInteger getInteger() {
        return integer;
    }

    public void setInteger(AtomicInteger integer) {
        this.integer = integer;
    }

    //原子加操作
    public void increment(){
        integer.incrementAndGet();
    }

    //原子减操作
    public void decrement(){
        integer.decrementAndGet();
    }

}
