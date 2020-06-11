package com.lhf.java7;


/**
 * @ClassName: TypeCompare1
 * @Author: liuhefei
 * @Description: byte, short, int, long四种基本数据类型以及其包装类的比较
 *  1. 基本数据类型与其对应的包装类运算或比较时，会自动拆箱成基本数据类型；
                在自动装箱时，会先检查其值是否在-128到127之间，如果在这之间，就会直接指向常量池中其值的地址;
                如果不在-128到127之间，就会创建一个新的对象，存储在堆中，就是两个不同的对象，比较时为false.
    2.同时byte, short, long也具有该特性。
    3.不同类型之间的基本数据类型也可以使用==进行比较,比较的是它们的值
 *
 * @Date: 2020/5/11 17:53
 */
public class TypeCompare1 {
    
    public static void main(String[] args) {
    	int i = 127;
        int i1 = 127;
        Integer i2 = 127;
        Integer i3 = 127;
        Integer i4 = new Integer(127);
        Integer i5 = new Integer(127);
        Integer i6 = 128;
        Integer i7 = 128;
        int i8 = 300;
        int i9 = 300;
        long l1 = 300;
        float f1 = 300;
        double d1 = 300;
        
        System.out.println(i == i1); // true; 基本类型比较值
        System.out.println(i1 == i2);// true；i2自动拆箱变成基本类型,两基本类型比较值
        System.out.println(i1 == i4);// true； i4自动拆箱变成基本类型,两基本类型比较值
        System.out.println(i2 == i3);// true; i2和i3都指向常量池中同一个地址
        
        System.out.println(i2 == i4);// false; 两个不同的对象
        System.out.println(i4 == i5);// false； 两个不同的对象
        System.out.println(i6 == i7);// false; 自动装箱时，如果值不在-128到127，就会创建一个新的对象

        //不同类型之间的基本数据类型也可以使用==进行比较
        System.out.println(i8 == i9);   //true 基本类型之间的比较，比较的是值
        System.out.println(i8 == l1);   //true
        System.out.println(i8 == f1);   //true
        System.out.println(i8 == d1);   //true
        
	}

}
