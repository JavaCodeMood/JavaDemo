package com.lhf.thread1;

/**
 * 
 * @ClassName: Producer.java
 * @Description: 加操作
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019年9月29日 上午10:38:33
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