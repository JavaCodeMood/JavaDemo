package com.lhf.java1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * https://mp.weixin.qq.com/s/P_8PkUNl9XqDU3wLwDho7g
 * @ClassName: TryCatchDemo.java
 * @Description: Java try-with-resource 它会自动帮助你关闭文件资源
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019年6月28日 下午4:57:47
 */
public class TryCatchDemo {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("d:\\test.txt"))) {
	        String line;
	        while ((line = br.readLine()) != null) {
	            System.out.println(line);
	        }
	    } catch (IOException e) {
	       e.printStackTrace();
	    }

	}
	
	/*
	public static void main(String[] args) {
	    BufferedReader br = null;
	    try {
	        String line;
	        br = new BufferedReader(new FileReader("d:\\test.txt"));
	        while ((line = br.readLine()) != null) {
	            System.out.println(line);
	        }
	    } catch (IOException e) {
	        // handle exception
	    } finally {
	        try {
	            if (br != null) {
	                br.close();
	            }
	        } catch (IOException ex) {
	            // handle exception
	        }
	    }
	}*/

}
