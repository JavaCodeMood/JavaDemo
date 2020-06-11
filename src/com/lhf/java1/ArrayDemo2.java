package com.lhf.java1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @ClassName: ArrayDemo2.java
 * @Description: 向数组中添加元素
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019年9月29日 上午9:34:59
 */
public class ArrayDemo2 {
	
	public static void main(String[] args) {
		
		//1. 一般数组是不能添加元素的，因为他们在初始化时就已定好长度了，不能改变长度。
		//但有个可以改变大小的数组为ArrayList，即可以定义一个ArrayList数组，然后用add(element)方法往里添加元素即可，还可add(index,element)往指定下标处添加元素
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		list1.add(2, 3);
		System.out.println("list1 = " + list1);
		
		//2. 先把array转化为list，用list的add()方法添加元素，再把list转化为array。
		//但这儿会有一个陷阱盲区，在把array转化为list的过程中，使用的asList()方法会返回一个final的,固定长度的ArrayList类，并不是java.util.ArrayList，直接这样利用它进行add()或remove()是无效的,将会报错。
		Integer[] arr = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));  //打印数组
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2 = Arrays.asList(arr);  //数组转为list
		//list2.add(7);  //将会报错
		//list2.add(8);
		System.out.println("list2 = " + list2);
		
		//解决办法：在定义list的时候就直接对array进行转化
		List<Integer> list3 = new ArrayList<Integer>(Arrays.asList(arr));
		list3.add(7);
		list3.add(8);
		list3.add(9);
		System.out.println("list3 = " + list3);
		Integer[] newArr = new Integer[list3.size()];
		list3.toArray(newArr);   //list转数组
		System.out.println(Arrays.toString(newArr));
		
		
	}

}
