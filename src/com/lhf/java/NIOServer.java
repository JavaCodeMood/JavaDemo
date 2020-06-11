package com.lhf.java;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;

/**
 * 
 * @ClassName: NIOServer.java
 * @Description: NIO���
 * 1. NIOģ����ͨ�����������̣߳�ÿ���̰߳�һ����ѯ��selector��
 * serverSelector������ѯ�Ƿ����µ����ӣ� 
 * clientSelector������ѯ�����Ƿ������ݿɶ�
 * 
 * 2.����˼�⵽�µ�����֮�󣬲��ٴ���һ���µ��̣߳�����ֱ�ӽ������Ӱ󶨵� clientSelector�ϣ������Ͳ���IOģ����1w��whileѭ�������ȣ��μ�(1)
 * 
 * 3.clientSelector��һ��while��ѭ�������ţ������ĳһʱ���ж������������ݿɶ�����ôͨ�� clientSelector.select(1)����������ѯ�������������������μ�(2)
 * 
 * 4.���ݵĶ�д���ڴ��Ϊ��λ���μ�(3)
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019��6��5�� ����12:33:48
 */
public class NIOServer {

	public static void main(String[] args) throws IOException {

		Selector serverSelector = Selector.open();

		Selector clientSelector = Selector.open();

		new Thread(() -> {
			try {
				// ��ӦIO����з��������
				ServerSocketChannel listenerChannel = ServerSocketChannel.open();

				listenerChannel.socket().bind(new

				InetSocketAddress(8000));

				listenerChannel.configureBlocking(false);

				listenerChannel.register(serverSelector, SelectionKey.OP_ACCEPT);

				while (true) {
					// ����Ƿ����µ����ӣ������1ָ����������ʱ��Ϊ1ms

					if (serverSelector.select(1) > 0) {

						Set<SelectionKey> set = serverSelector.selectedKeys();

						Iterator<SelectionKey> keyIterator = set.iterator();

						while (keyIterator.hasNext()) {

							SelectionKey key = keyIterator.next();

							if (key.isAcceptable()) {
								try {
									// (1) ÿ��һ�������ӣ�����Ҫ����һ���̣߳�����ֱ��ע�ᵽclientSelector
									SocketChannel clientChannel = ((ServerSocketChannel) key.channel()).accept();

									clientChannel.configureBlocking(false);

									clientChannel.register(clientSelector, SelectionKey.OP_READ);

								} finally {

									keyIterator.remove();

								}
							}
						}
					}
				}
			} catch (IOException ignored) {

			}
		}).start();

		new Thread(() -> {
			try {
				while (true) {
					// (2) ������ѯ�Ƿ�����Щ���������ݿɶ��������1ָ����������ʱ��Ϊ1ms
					if (clientSelector.select(1) > 0) {

						Set<SelectionKey> set = clientSelector.selectedKeys();
						Iterator<SelectionKey> keyIterator = set.iterator();
						while (keyIterator.hasNext()) {

							SelectionKey key = keyIterator.next();

							if (key.isReadable()) {

								try {

									SocketChannel clientChannel = (SocketChannel) key.channel();

									ByteBuffer byteBuffer = ByteBuffer.allocate(1024);

									// (3) ��ȡ�����Կ�Ϊ��λ������ȡ
									clientChannel.read(byteBuffer);

									byteBuffer.flip();

									System.out.println(
											Charset.defaultCharset().newDecoder().decode(byteBuffer).toString());

								} finally {

									keyIterator.remove();

									key.interestOps(SelectionKey.OP_READ);
								}
							}
						}
					}
				}
			} catch (IOException ignored) {

			}

		}).start();

	}
}
