package com.lhf.java8;

/**
 * List排序方式一： Collections.sort(list)
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("郑州");
		list.add("北京");
		list.add("武汉");
		list.add("昆明");
		list.add("成都");
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
