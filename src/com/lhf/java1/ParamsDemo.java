package com.lhf.java1;

/**
 * https://mp.weixin.qq.com/s/P_8PkUNl9XqDU3wLwDho7g
 * @ClassName: ParamsDemo.java
 * @Description: Java可变参数
 * 原理：可变参数在被使用的时候，它首先会创建一个数组，数组的长度就是调用该方法时传递的实参的个数，
 * 然后再把参数值全部放到这个数组当中，然后再把这个数组作为参数传递到被调用的方法中。
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019年6月28日 下午4:28:59
 */
public class ParamsDemo {

	public static void main(String[] args) {
		print("天国", "虽美", "没有了你", "万杯觥筹","只不过是", "提醒寂寞", "罢了");
	}
	
	public static void print(String...strs) {
		for(int i = 0;i<strs.length;i++) {
			System.out.println(strs[i]);
		}
	}

}
