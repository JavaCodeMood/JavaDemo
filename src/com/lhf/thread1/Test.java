package com.lhf.thread1;

/**
 * ����ִ�� 1000�ε����͵ݼ��������
 * @ClassName: Test.java
 * @Description: 
 * ��β��ԵĽ������Ϊ 0��Ҳ����˵�����˲��������ݲ�һ�µ����⣬ԭ���� count -= 1 �� count += 1 ���Ƿ�ԭ���Բ��������ǵ�ִ�в����Ϊ������
	1. ���ڴ��ж�ȡ count ��ֵ����������Ĵ�����
	2. ִ�� + 1 ���� - 1 ����
	3. ִ����ɵĽ���ٸ��Ƶ��ڴ���
       ���Ҫ��֤���ǵ�ԭ���ԣ�������м�����ʹ�� Synchronzied ���� ReentrantLock�����Ƕ��Ǳ�����
    Ҳ����ʹ��CAS �� compare and swap���Ƚ��뽻��������һ�������������㷨������ʹ�����������ʵ�ֶ��߳�֮��ı���ͬ����Ҳ������û���̱߳������������ʵ�ֱ�����ͬ��������Ҳ�з�����ͬ����Non-blocking Synchronization
    
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019��9��29�� ����10:39:17
 */
public class Test {
	
	final static int LOOP = 1000;

    public static void main(String[] args) throws InterruptedException {

        Counter counter = new Counter();
        Producer producer = new Producer(counter);
        Consumer consumer = new Consumer(counter);

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();

        System.out.println(counter.getCount());

    }

}
