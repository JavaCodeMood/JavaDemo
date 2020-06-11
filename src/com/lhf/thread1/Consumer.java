package com.lhf.thread1;

/**
 * 
 * @ClassName: Consumer.java
 * @Description: 减操作
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019年9月29日 上午10:38:20
 */
public class Consumer extends Thread{

    Counter counter;

    public Consumer(Counter counter){
        this.counter = counter;
    }


    @Override
    public void run() {
        for(int j = 0;j < Test.LOOP;j++){
            counter.dec();
        }
    }
}
