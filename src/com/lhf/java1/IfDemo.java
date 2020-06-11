package com.lhf.java1;

/**
 * https://mp.weixin.qq.com/s/P_8PkUNl9XqDU3wLwDho7g
 * @ClassName: IfDemo.java
 * @Description: Java条件编译
 * 在反编译后的代码中没有System.out.println("Hello, ONLINE!");，这其实就是条件编译。
 *
 * 当if(ONLINE)为false的时候，编译器就没有对其内的代码进行编译。
 * 所以，Java语法的条件编译，是通过判断条件为常量的if语句实现的。
 * 根据if判断条件的真假，编译器直接把分支为false的代码块消除。
 * 通过该方式实现的条件编译，必须在方法体内实现，而无法在整个Java类的结构或者类的属性上进行条件编译。
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019年6月28日 下午4:37:53
 */
public class IfDemo {

	public static void main(String[] args) {
		final boolean DEBUG = true;
        if(DEBUG) {
            System.out.println("Hello, DEBUG!");
        }

        final boolean ONLINE = false;

        if(ONLINE){
            System.out.println("Hello, ONLINE!");
        }
	}

}
