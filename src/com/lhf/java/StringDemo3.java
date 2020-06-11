package com.lhf.java;

public class StringDemo3 {

	public static void main(String[] args) {
		String str = "system-key-0001|topic20190716|TagA|TagB";
		String str1 = "" + "|topic20190716|TagA|TagB";
		String[] name = str1.split("\\|");
		for(String s : name) {
			System.out.println(s);
		}
		String result = name[0]+"|"+name[1];
        System.out.println("Result = " + result);
	}

}
