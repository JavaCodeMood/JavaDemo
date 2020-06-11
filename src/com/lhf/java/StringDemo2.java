package com.lhf.java;

public class StringDemo2 {
	
	 public static void main(String[] args) {
	        String webValue = "bcdefrg=87631840=kskskkiuwuw;";
	        String xmlValue = "bcdefrg=87631840=ytwwqjjhhj;";
	        String resultValue = "";
	        //判断xmlValue字符串是否已经存在webValue中，存在就不追加，不存在就追加到webValue后面
	        if(webValue.indexOf(xmlValue) != -1){
	            System.out.println("存在");
	            resultValue = webValue;
	        }else {
	            System.out.println("不存在");
	            resultValue = webValue + xmlValue;
	        }
	        System.out.println("resultValue = " + resultValue);
	    }


}
