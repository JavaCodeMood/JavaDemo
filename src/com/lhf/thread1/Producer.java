package com.lhf.thread1;

/**
 * 
 * @ClassName: Producer.java
 * @Description: �Ӳ���
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019��9��29�� ����10:38:33
 */
public class Producer extends Thread{

    Counter counter;

    public Producer(Counter counter){
        this.counter = counter;
    }

    @Override
    public void run() {
        for(int i = 0;i < Test.LOOP;++i){
            counter.add();
        }
    }
}