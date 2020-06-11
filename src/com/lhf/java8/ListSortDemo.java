package com.lhf.java8;

/**
 * List����ʽһ�� Collections.sort(list)
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("֣��");
		list.add("����");
		list.add("�人");
		list.add("����");
		list.add("�ɶ�");
		Collections.sort(list);
		System.out.println(list.toString());
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(new Integer(100));
		list1.add(new Integer(40));
		list1.add(new Integer(30));
		list1.add(new Integer(60));
		list1.add(new Integer(10));
		list1.add(new Integer(20));
		Collections.sort(list1);
		System.out.println(list1.toString());

	}

}
