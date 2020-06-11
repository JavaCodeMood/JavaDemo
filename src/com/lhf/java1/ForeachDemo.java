package com.lhf.java1;

import java.util.ArrayList;
import java.util.List;

/**
 * https://mp.weixin.qq.com/s/P_8PkUNl9XqDU3wLwDho7g
 * @ClassName: ForeachDemo.java
 * @Description: Java for-each语句
 * 原理：for-each的实现原理其实就是使用了普通的for循环和迭代器。
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019年6月28日 下午4:48:39
 */
public class ForeachDemo {

	public static void main(String[] args) {
		String[] strs = {"天国", "虽美", "没有了你", "万杯觥筹","只不过是", "提醒寂寞", "罢了"};
		for(String str : strs) {
			System.out.println(str);
		}
		
		List<String> strList = new ArrayList<String>();
		strList.add("不思量");
		strList.add("自难忘");
		strList.add("千里孤坟");
		strList.add("无处话凄凉");
		
		for(String list : strList) {
			System.out.println(list);
		}
		

	}

}
