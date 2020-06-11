package com.lhf.java3;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @ClassName: Java_Heap_Space.java
 * @Description: Java堆内存溢出
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019年11月9日 下午1:15:40
 */
public class Java_Heap_Space {

	public static void main(String[] args) {
		List<Demo> strList = new ArrayList<>();
        while(true) {   //死循环不停的创建对象，直到堆内存满了抛出异常
        	strList.add(new Demo());
        }
	}

}
