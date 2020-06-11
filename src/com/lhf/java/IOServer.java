package com.lhf.java;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 
 * @ClassName: IOServer.java
 * @Description:   server�����ȴ�����һ�� serverSocket������8000�˿ڣ�Ȼ�󴴽�һ���̣߳��߳����治�ϵ����������� serversocket.accept();��ȡ�µ����ӣ���(1)��
  * ����ȡ���µ�����֮�󣬸�ÿ�����Ӵ���һ���µ��̣߳�����̸߳���Ӹ������ж�ȡ���ݣ���(2)��
  * Ȼ���ȡ���������ֽ����ķ�ʽ����(3)��
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019��6��5�� ����12:38:27
 */
public class IOServer {
	public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(8000);
        // (1) �����������߳�
        new Thread(() -> { while (true) {
            try {
                // (1) ����������ȡ�µ�����
                Socket socket = serverSocket.accept();
                // (2) ÿһ���µ����Ӷ�����һ���̣߳������ȡ����
                new Thread(() -> {
                    try {
                        byte[] data = new byte[1024];
                        InputStream inputStream = socket.getInputStream();
                        while (true) {
                            int len;
                            // (3) ���ֽ�����ʽ��ȡ����
                            while ((len = inputStream.read(data)) != -1) {

                                System.out.println(new String(data, 0, len));
                            }
                        }

                    } catch (IOException e) {

                    }
                }).start();
            } catch (IOException e) {


            }
        }
        }).start();
    }
}
