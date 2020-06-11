package com.lhf.java8;

/**
 * List排序复杂对象，对象需要实现Comparable接口，并重写compareTo方法
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortDemo1 {

	public static void main(String[] args) {
		List<User> list = new ArrayList<>();
		list.add(new User("豆豆", 24, "18296566688"));
		list.add(new User("梦梦", 18, "13568755678"));
		list.add(new User("珊珊", 18, "13788679811"));
		list.add(new User("依依", 22, "13898766543"));
		Collections.sort(list);  //按年龄排序
		System.out.println(list.toString());
		

	}

}
