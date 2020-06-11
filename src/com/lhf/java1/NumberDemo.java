package com.lhf.java1;

/**
 * https://mp.weixin.qq.com/s/P_8PkUNl9XqDU3wLwDho7g
 * @ClassName: NumberDemo.java
 * @Description: Java数字字面量
 * 下划线不会对字面量的数值产生影响，目的就是方便阅读。
 * 反编译后就会把_删除了。也就是说编译器并不认识在数字字面量中的_，需要在编译阶段把他去掉。
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019年6月28日 下午4:45:55
 */
public class NumberDemo {

	public static void main(String[] args) {
		int a = 1____9___8__3;
		int b = 3_8__________10;
		
		System.out.println("a = " + a + ", b = " + b);
		System.out.println(a + b);

	}

}
