package com.lhf.java1;

/**
 * https://mp.weixin.qq.com/s/P_8PkUNl9XqDU3wLwDho7g
 * @ClassName: AssertDemo.java
 * @Description: Java断言
 * 原理：断言的底层实现就是if语言，如果断言结果为true，则什么都不做，程序继续执行；
 * 如果断言结果为false，则程序抛出AssertError来打断程序的执行。
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019年6月28日 下午4:42:00
 */
public class AssertDemo {

	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		assert a == b;
		System.out.println("a与b相等");
		assert a != b : "Hollis";
		System.out.println("a与b不相等");
		assert a != b;
		System.out.println("我执行了....");

	}

}
