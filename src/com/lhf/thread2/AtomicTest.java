package com.lhf.thread2;

/**
 * 并发执行 1000次递增和递减后的问题:使用CAS保证并发安全性
 * @ClassName: AtomicTest.java
 * @Description: CAS 即 compare and swap（比较与交换），是一种有名的无锁算法。即不使用锁的情况下实现多线程之间的变量同步，也就是在没有线程被阻塞的情况下实现变量的同步，所以也叫非阻塞同步（Non-blocking Synchronization
	
	CAS 中涉及三个要素：
	1. 需要读写的内存值 V
	2. 进行比较的值 A
	3. 拟写入的新值 B
	当且仅当预期值A和内存值V相同时，将内存值V修改为B，否则什么都不做。
	
	JAVA对CAS的支持：在JDK1.5 中新添加 java.util.concurrent (J.U.C) 就是建立在 CAS 之上的。对于 synchronized 这种阻塞算法，CAS是非阻塞算法的一种实现。所以J.U.C在性能上有了很大的提升。
	
	测试：不管循环多少次最后的结果都是0，也就是多线程并行的情况下，使用 AtomicInteger 可以保证线程安全性。incrementAndGet 和 decrementAndGet 都是原子性操作。
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019年9月29日 上午10:46:45
 */
public class AtomicTest {

    final static int LOOP = 10000;

    public static void main(String[] args) throws InterruptedException {

        AtomicCounter counter = new AtomicCounter();
        AtomicProducer producer = new AtomicProducer(counter);
        AtomicConsumer consumer = new AtomicConsumer(counter);

        producer.start();
        consumer.start();

        producer.join();
        consumer.join();

        System.out.println(counter.getInteger());

    }
}