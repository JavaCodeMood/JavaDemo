package com.lhf.java;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

/**
 * 
 * @ClassName: StringDemo1.java
 * @Description: 字符串
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019年4月18日 上午10:03:43
 */
public class StringDemo1 {
	
	/**
	 * @Description:
	 *
	 * @param str1
	 * @param str2
	 * @return      
	 * @throws：异常描述
	 * @author:liuhefei
	 */
	public static String addStr(String str1, String str2) {
		return str1+str2;
	}
	
	public static void main(String[] args) {
		System.out.println(addStr("123","abc"));
		
		
		String str = "  123";
		System.out.println("str的长度：" + str.length());
		
		if(StringUtils.isNotBlank(str)) {
			System.out.println("Str不为空");
		}else {
			System.out.println("str为空");
		}
		
		List<Map> listMap = null;
		System.out.println("listMap = " + listMap);
		System.out.println("listMap长度： " + listMap.size());
	}

}
