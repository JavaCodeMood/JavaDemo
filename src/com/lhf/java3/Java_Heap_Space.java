package com.lhf.java3;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @ClassName: Java_Heap_Space.java
 * @Description: Java���ڴ����
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019��11��9�� ����1:15:40
 */
public class Java_Heap_Space {

	public static void main(String[] args) {
		List<Demo> strList = new ArrayList<>();
        while(true) {   //��ѭ����ͣ�Ĵ�������ֱ�����ڴ������׳��쳣
        	strList.add(new Demo());
        }
	}

}
