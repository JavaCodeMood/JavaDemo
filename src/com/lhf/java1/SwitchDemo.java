package com.lhf.java1;

/**
 * 
 * @ClassName: SwitchDemo.java
 * @Description: Switch语句支持String类型
 * 原理：字符串的switch是通过equals()和hashCode()方法来实现的；
 * 进行switch的实际是哈希值，然后通过使用equals方法比较进行安全检查，这个检查是必要的，因为哈希可能会发生碰撞。
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019年6月28日 下午4:16:57
 */
public class SwitchDemo {

	public static void main(String[] args) {
		String str = "world";
		switch(str) {
		case "hello":
			System.out.println("hello");
			break;
		case "world":
			System.out.println("world");
			break;
		default:
			System.out.println("Hello World!");
			break;
		}

	}

}
