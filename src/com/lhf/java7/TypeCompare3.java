package com.lhf.java7;

/**
 * @ClassName: TypeCompare3
 * @Author: liuhefei
 * @Description: TODD
 * @Date: 2020/5/11 17:54
 */
public class TypeCompare3 {
	
	public static void main(String[] args) {
		int i = 127;
		int ii = 128;
		Integer i1 = new Integer(127);
		Integer i2 = new Integer(127);
		Integer i3 = 127;
		Integer i4 = 127;
		Integer i5 = 128;
		Integer i6 = 128;
		Integer i7 = new Integer(128);
	    Integer i8 = new Integer(128);
	    Integer i9 = 200;
	    Integer i10 = 100;
		
	    System.out.println(i == i1);    //true int和integer(无论new否)比，都为true，因为会把Integer自动拆箱为int再去比
	    System.out.println(i == i3);    //true
	    System.out.println(ii == i7);   //true
		System.out.println(i1 == i2);   //false  两个不同的对象
		System.out.println(i1 == i3);   //false  无论如何，Integer与new Integer不会相等
		System.out.println(i3 == i4);   //true  在-128-127之间，用==比较返回true
		System.out.println(i5 == i6);   //false 不在-128-127之间，用==比较返回false
		System.out.println(i7 == i8);   //false  两个不同的对象
		System.out.println(i1 == i3);   //false  两个不同的对象
		System.out.println(i5 == i7);   //false  两个不同的对象
		
		//x.compareTo(y) 如果x与y相等，返回0；x大于y返回1；x小于y返回-1
		int result1 = i1.compareTo(i2);
		int result2 = i5.compareTo(i6);
		int result3 = i7.compareTo(i8);
		int result4 = i1.compareTo(i9);
		int result5 = i1.compareTo(i10);
		System.out.println("result1 = " + result1);  //0
		System.out.println("result2 = " + result2);  //0
		System.out.println("result3 = " + result3);  //0
		System.out.println("result4 = " + result4);  //-1
		System.out.println("result5 = " + result5);  //1
		
		System.out.println("1: " + i1.equals(i2));   //true
		System.out.println("2: " + i3.equals(i4));   //true
		System.out.println("3: " + i5.equals(i6));   //true
		System.out.println("4: " + i7.equals(i8));   //true
		System.out.println("5: " + i1.equals(i3));   //true
		
		System.out.println(i1.intValue() == i2.intValue());  //true
		System.out.println(i3.intValue() == i4.intValue());  //true
		System.out.println(i5.intValue() == i6.intValue());  //true
		System.out.println(i7.intValue() == i8.intValue());  //true
	}
}
