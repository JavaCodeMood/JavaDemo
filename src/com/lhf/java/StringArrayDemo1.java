package com.lhf.java;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @ClassName: StringArrayDemo1.java
 * @Description: 如果str1的key与str2相同，就用str1的key对应的值替换str2的key对应的值；如果str1与str2的key不同，就直接追加到str2后面
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019年6月20日 下午3:42:00
 */
public class StringArrayDemo1 {
	
	public static void main(String[] args) {
		Long startTime = System.currentTimeMillis();
		String str1 = "wwadssdds=66031840=skjshsh;";
		String str2 = "fdrfdsa=00031811=fssdfgxd;rtyghgf=0111900=sjsjslkk;dfytryg=88646864=aaswgdf;";
		
		
		String str3 = str1.substring(0, str1.length()-1);
		System.out.println("str3 = " + str3);
		
		String[] arrStr = str3.split("=");
		for(String arr: arrStr) {
			System.out.println(arr);
		}
		
		System.out.println("arrStr[0] = " + arrStr[0]);
		
		String regex = arrStr[0] + "(=[0-9]+=[a-zA-Z_]+)";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(str2);
		String resultStr = null;
		String replaceValue = null;
		while(matcher.find()) {
			replaceValue = matcher.group();
			System.out.println(matcher.group());
		}
		
		resultStr = str2.replace(replaceValue + ";", str1);
		System.out.println("resultStr = " + resultStr);
		Long endTime = System.currentTimeMillis();
		Long time = endTime - startTime;
		System.out.println("time = " + time + "ms");
	}

}
