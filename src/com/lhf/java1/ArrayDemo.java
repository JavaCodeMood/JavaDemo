package com.lhf.java1;

import org.apache.commons.lang3.StringUtils;

public class ArrayDemo {

	public static void main(String[] args) {
		String[] str = {"降水量", "蒸发量"};
		String str4 = StringUtils.join(str, ","); // 数组转字符串(逗号分隔)(推荐)
		System.out.println(str4); // 0,1,2,3,4,5

	}

}
