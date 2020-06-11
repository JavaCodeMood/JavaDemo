package com.lhf.thread2;

import java.util.concurrent.atomic.AtomicInteger;

/**
 *  java.util.concurrent �е�AtomicInteger ����֤ԭ�Ӳ�����ʵ���̰߳�ȫ
 * @ClassName: AtomicCounter.java
 * @Description: 
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019��9��29�� ����10:43:52
 */
public class AtomicCounter {
	
	private AtomicInteger integer = new AtomicInteger();

    public AtomicInteger getInteger() {
        return integer;
    }

    public void setInteger(AtomicInteger integer) {
        this.integer = integer;
    }

    //ԭ�ӼӲ���
    public void increment(){
        integer.incrementAndGet();
    }

    //ԭ�Ӽ�����
    public void decrement(){
        integer.decrementAndGet();
    }

}
