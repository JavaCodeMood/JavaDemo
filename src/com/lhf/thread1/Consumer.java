package com.lhf.thread1;

/**
 * 
 * @ClassName: Consumer.java
 * @Description: ������
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019��9��29�� ����10:38:20
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
