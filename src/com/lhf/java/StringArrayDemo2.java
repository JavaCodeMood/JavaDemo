package com.lhf.java;

import java.util.HashMap;
import java.util.Map;

public class StringArrayDemo2 {
	
	public static void main(String[] args) {
		String str1 = "iuiujhm=77731840=SGSjjhjhsh;wia=1233=55555;asdasdasdasdasd=2222=555";
		String str2 = "xxlu=66031811=addsan;sghsytsyt=88631990=rrfuvfds;addffAQE=00046864=WYTWHTA;wia=333=4444";
		
		String strl1[]= str1.split(";");
		String strl2[]= str2.split(";");
		
		Map<String,String> new_Str = new HashMap<String, String>();
		
		
		for (int i = 0; i < strl2.length; i++) {

			 int aa_key_num=strl2[i].indexOf("=");
			 String aa_key_val=strl2[i].substring(0, aa_key_num);
			 String aa_val=strl2[i].substring(aa_key_num, strl2[i].length());
			 new_Str.put(aa_key_val, aa_val);
			 System.out.println("2--"+"aa_key_val: " + aa_key_val + ", aa_val: " + aa_val);
		}
		
		
		for (int i = 0; i < strl1.length; i++) {
			 int aa_key_num=strl1[i].indexOf("=");
			 String aa_key_val=strl1[i].substring(0, aa_key_num);
			 String aa_val=strl1[i].substring(aa_key_num, strl1[i].length());
			 new_Str.put(aa_key_val, aa_val);
		     System.out.println("1--"+"aa_key_val: " + aa_key_val + ", aa_val: " + aa_val);
		}
		
		
		System.out.println(new_Str.toString());
		
	}
	

}
