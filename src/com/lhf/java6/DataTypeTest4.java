package com.lhf.java6;

/**
 * 
 * @ClassName: DataTypeTest4.java
 * @Description: 在进行方法调动时：实际参数的精度较小，而被调用的方法的形式参数的精度较大时(若有匹配的方法，则会直接调用匹配的方法)，系统也会将精度小的数据类型自动转换为精度较大的数据类型，然后进行方法调用。
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020年4月22日 上午10:45:12
 */
public class DataTypeTest4 {
	
	private static double add(double d1, double d2) {
		double sum = d1 + d2;
		return sum;
	}
	
	private static double add1(double d1, float f1) {
		double sum1 = d1 + f1;
		return sum1;
	}
	
	public static void main(String[] args) {
		byte b = 120;
		int i = 180;
		System.out.println("sum = " + add(b, i));   //300.0
		System.out.println("sum1 = " + add1(b, i));  //300.0
	}

}
