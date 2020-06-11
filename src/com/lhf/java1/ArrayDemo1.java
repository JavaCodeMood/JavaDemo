package com.lhf.java1;

import java.util.List;

public class ArrayDemo1 {
	
	public static void main(String[] args) {
		String columnsName = "[\"Age\"]";
		String[] strArray = columnsName.split("");
		String str = "";
        for(int i =0 ;i<strArray.length;i++) {
        	str = strArray[i];
        	 System.out.printf(str);
        }
        
        String org = "DD000001.00000001.88778765.88778767.88778774.77777777";
        String[] orgArr = org.split("\\.");
        for(int i = 0; i <orgArr.length; i++) {
        	System.out.println(orgArr[i]);
        }
       
	}

}
