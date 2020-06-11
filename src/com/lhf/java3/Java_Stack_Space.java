package com.lhf.java3;

/**
 * 
 * @ClassName: Java_Stack_Space.java
 * @Description: Java栈内存溢出
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019年11月9日 下午3:53:45
 */
public class Java_Stack_Space {
	
	private void test() {
		System.out.println("test方法执行了....");
		test();   //递归调用自己，将会发生栈内存溢出
	}
	
	public static void main(String[] args) {
		new Java_Stack_Space().test();
	}

}
