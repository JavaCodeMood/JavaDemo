package com.lhf.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReadTxt {
	
	//private static final String fileName = ".\\JavaDemo\\doc\\test.txt";

    public static void main(String[] args) throws IOException {
    	File directory = new File("");// ����Ϊ��
        String courseFile = directory.getCanonicalPath();
        File fileName = new File(courseFile + "\\doc\\\\test.txt");

        //��ȡ�ļ�
        BufferedReader br = null;
        StringBuffer sb = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "GBK")); //������Կ��Ʊ���
            sb = new StringBuffer();
            String line = null;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String s = new String(sb); //StringBuffer ==> String
        System.out.println("test.txt����Ϊ==> " + s);
        System.out.println(    );
        //1��ƥ���Ӵ�
        String regex = "1[378][0-9]{9}";

        //2����ȡƥ����
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);

        //3��ʹ��ƥ������group()��������ȡ:��find�������ж��Ƿ����ƥ���Ӵ�����
        System.out.println("��" + s + "����Ҫ��ĵ绰�����У�");
        while (m.find()) {
            System.out.println(m.group());
        }

    }



}
