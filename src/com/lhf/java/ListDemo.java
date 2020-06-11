package com.lhf.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {
	
	public static void main(String[] args) {
		//ListÓĞĞò¿ÉÖØ¸´
		List<String> list = new ArrayList();
		list.add("123");
		list.add("123");
		list.add("910");
		list.add("546");
		list.add("234");
		for(String list1 : list) {
			System.out.println(list1);
		}
		
		List<String> listArr = Arrays.asList("abc", "def", "ghr", "wtr", "sgyt");
		for(String li : listArr) {
			System.out.println(li);
		}
		System.out.println("-------------------");
		listArr.forEach(arr -> System.out.println(arr));
	}

}
