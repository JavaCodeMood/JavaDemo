package com.lhf.java6;

/**
 * 
 * @ClassName: DataTypeTest9.java
 * @Description: 其他类型转换为字符串：
(1)调用类的串转换方法:X.toString();  针对封装类型转换为字符串
(2)自动转换:X+"";  基本类型与封装类型都可以使用此方法转化为字符串
(3)使用String的方法:String.volueOf(X); 基本类型与封装类型都可以使用此方法转化为字符串
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020年4月24日 下午4:20:20
 */
public class DataTypeTest9 {

	public static void main(String[] args) {
		
		//Byte -> String
		Byte by = 120;
		String bStr = by.toString();
		String bStr1 = by + "";
		String bStr2 = String.valueOf(by);
		
		//Short -> String
		Short sh = 150;
		String sStr = sh.toString();
		String sStr1 = sh + "";
		String sStr2 = String.valueOf(sh);
		
		//Character -> String
		Character ch = 100; 
		String cStr = ch.toString();
		String cStr1 = ch + "";
		String cStr2 = String.valueOf(ch);
		String cStr3 = new String(new char[]{ch});  //使用匿名数组
		
		//Integer -> String
		Integer in = 100;
		String iStr = in.toString();
		String iStr1 = in + "";
		String iStr2 = String.valueOf(in);
		
		//Float -> String
		Float fl = 314.15F;
		String fStr = fl.toString();
		String fStr1 = fl + "";
		String fStr2 = String.valueOf(fl);
		
		//Double -> String
		Double dou = 618.618;
		String dStr = dou.toString();
		String dStr1 = dou + "";
		String dStr2 = String.valueOf(dou);
		
		//Boolean -> String
        Boolean bool = true;
        String boolStr = bool.toString();
        String boolStr1 = bool + "";
        String boolStr2 = String.valueOf(bool);
        
        System.out.println("cStr3 = " + cStr3);
	}

}
