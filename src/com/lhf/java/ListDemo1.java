package com.lhf.java;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ListDemo1 {
	
	public static void filter(List<String> list, Predicate predicate) {
		for(String li : list) {
			if(predicate.test(li)) {
				System.out.println(li + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		List list = Arrays.asList("Java", "Html", "CSS", "Jquery", "JavaScript", "C", "python", "go");
		list.forEach(li -> System.out.println(li));
		
		System.out.println();
	    filter(list, (str) -> true);
		
	    filter(list, (Str) -> false);
	    
	    System.out.println("------------");
	    
	    List costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
	    costBeforeTax.stream().map((cost) -> cost)
	                          .forEach(System.out::println);

	}

}
