package com.lhf.java8;

/**
 * List�����Ӷ��󣬶�����Ҫʵ��Comparable�ӿڣ�����дcompareTo����
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortDemo1 {

	public static void main(String[] args) {
		List<User> list = new ArrayList<>();
		list.add(new User("����", 24, "18296566688"));
		list.add(new User("����", 18, "13568755678"));
		list.add(new User("ɺɺ", 18, "13788679811"));
		list.add(new User("����", 22, "13898766543"));
		Collections.sort(list);  //����������
		System.out.println(list.toString());
		

	}

}
