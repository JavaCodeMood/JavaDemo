package com.lhf.java6;

/**
 * 
 * @ClassName: DataTypeTest1.java
 * @Description: Java中判断两个基本类型是否相等
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020年4月21日 下午3:11:46
 */
public class DataTypeTest1 {

	public static void main(String[] args) {
		/*int a = 10;
		int a1 = 10;
		int b = 500;
		int b1 = 500;
		System.out.println(a==a1);
		System.out.println(b==b1);*/
		
		Long aa = 100L;
        Long bb = 100L;
        System.out.println(aa==bb);
        System.out.println(aa.equals(bb));
	}

}
