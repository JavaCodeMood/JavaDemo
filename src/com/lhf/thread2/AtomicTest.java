package com.lhf.thread2;

/**
 * ����ִ�� 1000�ε����͵ݼ��������:ʹ��CAS��֤������ȫ��
 * @ClassName: AtomicTest.java
 * @Description: CAS �� compare and swap���Ƚ��뽻��������һ�������������㷨������ʹ�����������ʵ�ֶ��߳�֮��ı���ͬ����Ҳ������û���̱߳������������ʵ�ֱ�����ͬ��������Ҳ�з�����ͬ����Non-blocking Synchronization
	
	CAS ���漰����Ҫ�أ�
	1. ��Ҫ��д���ڴ�ֵ V
	2. ���бȽϵ�ֵ A
	3. ��д�����ֵ B
	���ҽ���Ԥ��ֵA���ڴ�ֵV��ͬʱ�����ڴ�ֵV�޸�ΪB������ʲô��������
	
	JAVA��CAS��֧�֣���JDK1.5 ������� java.util.concurrent (J.U.C) ���ǽ����� CAS ֮�ϵġ����� synchronized ���������㷨��CAS�Ƿ������㷨��һ��ʵ�֡�����J.U.C�����������˺ܴ��������
	
	���ԣ�����ѭ�����ٴ����Ľ������0��Ҳ���Ƕ��̲߳��е�����£�ʹ�� AtomicInteger ���Ա�֤�̰߳�ȫ�ԡ�incrementAndGet �� decrementAndGet ����ԭ���Բ�����
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019��9��29�� ����10:46:45
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