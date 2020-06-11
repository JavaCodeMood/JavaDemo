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
    	File directory = new File("");// 参数为空
        String courseFile = directory.getCanonicalPath();
        File fileName = new File(courseFile + "\\doc\\\\test.txt");

        //读取文件
        BufferedReader br = null;
        StringBuffer sb = null;
        try {
            br = new BufferedReader(new InputStreamReader(new FileInputStream(fileName), "GBK")); //这里可以控制编码
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
        System.out.println("test.txt内容为==> " + s);
        System.out.println(    );
        //1、匹配子串
        String regex = "1[378][0-9]{9}";

        //2、获取匹配器
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(s);

        //3、使用匹配器的group()方法来获取:（find方法是判断是否具有匹配子串）、
        System.out.println("”" + s + "符合要求的电话号码有：");
        while (m.find()) {
            System.out.println(m.group());
        }

    }



}
