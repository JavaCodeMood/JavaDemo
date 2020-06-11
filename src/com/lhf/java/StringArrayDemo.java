package com.lhf.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;

public class StringArrayDemo {
	
	public static void getPattern(String str, String index) {
		Pattern p = Pattern.compile(index);
		Matcher m = p.matcher(str);
		if (m.find()) {
			System.out.println("找到了你说的这个货：---" + index);
		} else {
			System.out.println("没有找到了你说的这个货：---" + index);
		}
	}
	
	public static void replaceStr(String str, String key) {
		String[] arrString = str.split(";");
		String[] array = null;
		for(int i = 0;i<arrString.length; i++) {
			System.out.println(arrString[i]);
			array = arrString[i].split("=");
		}
		for(String a : array) {
			System.out.println(a);
	        
		}
	}
	
	/**
	 * @Description:截取字符串
	 *
	 * @param str
	 * @param strStart
	 * @param strEnd
	 * @return      
	 * @throws：异常描述
	 * @author:liuhefei
	 */
	public static String splitStr(String str, String strStart, String strEnd) {
		return str.substring(str.indexOf(strStart) + strStart.length(), str.indexOf(strEnd));
	}
	
	
	public static void main(String[] args) {
		String str1 = "wwadssdds=66031840=skjshsh;";
		String str2 = "fdrfdsa=31999811=fssdfgxd;rtyghgf=0111900=sjjshgs;dfytryg=88646864=aaswgdf;";
		
		
		String str3 = str1.substring(0, str1.length()-1);
		System.out.println("str3 = " + str3);
		
		String[] arrStr = str3.split("=");
		for(String arr: arrStr) {
			System.out.println(arr);
		}
		
		
		System.out.println(str2.indexOf(arrStr[0]));  //0:存在，-1：不存在
		System.out.println(arrStr[0]);
		
		String resultString = "";
		if(str2.indexOf(arrStr[0]) != -1) {
			//存在，替换
			String split = splitStr(str2, arrStr[0]+"=", ";");
			System.out.println("split = " + split);
			//替换
			resultString = str2.replace(split, arrStr[1]+"="+arrStr[2]);
			System.out.println("存在，替换，resultString = " + resultString);
			
		}else {
			//不存在，追加
			resultString = str2 + str1;
			System.out.println("不存在，追加，resultString = " + resultString);
		}
			
		
		
	}

}
