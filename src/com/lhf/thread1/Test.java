package com.lhf.thread1;

/**
 * 并发执行 1000次递增和递减后的问题
 * @ClassName: Test.java
 * @Description: 
 * 多次测试的结果都不为 0，也就是说出现了并发后数据不一致的问题，原因是 count -= 1 和 count += 1 都是非原子性操作，它们的执行步骤分为三步：
	1. 从内存中读取 count 的值，把它放入寄存器中
	2. 执行 + 1 或者 - 1 操作
	3. 执行完成的结果再复制到内存中
       如果要把证它们的原子性，必须进行加锁，使用 Synchronzied 或者 ReentrantLock，他们都是悲观锁
    也可以使用CAS 即 compare and swap（比较与交换），是一种有名的无锁算法。即不使用锁的情况下实现多线程之间的变量同步，也就是在没有线程被阻塞的情况下实现变量的同步，所以也叫非阻塞同步（Non-blocking Synchronization
    
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019年9月29日 上午10:39:17
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
