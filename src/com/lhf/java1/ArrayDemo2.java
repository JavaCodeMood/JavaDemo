package com.lhf.java1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @ClassName: ArrayDemo2.java
 * @Description: �����������Ԫ��
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019��9��29�� ����9:34:59
 */
public class ArrayDemo2 {
	
	public static void main(String[] args) {
		
		//1. һ�������ǲ������Ԫ�صģ���Ϊ�����ڳ�ʼ��ʱ���Ѷ��ó����ˣ����ܸı䳤�ȡ�
		//���и����Ըı��С������ΪArrayList�������Զ���һ��ArrayList���飬Ȼ����add(element)�����������Ԫ�ؼ��ɣ�����add(index,element)��ָ���±괦���Ԫ��
		List<Integer> list1 = new ArrayList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(4);
		list1.add(5);
		list1.add(6);
		list1.add(7);
		list1.add(2, 3);
		System.out.println("list1 = " + list1);
		
		//2. �Ȱ�arrayת��Ϊlist����list��add()�������Ԫ�أ��ٰ�listת��Ϊarray��
		//���������һ������ä�����ڰ�arrayת��Ϊlist�Ĺ����У�ʹ�õ�asList()�����᷵��һ��final��,�̶����ȵ�ArrayList�࣬������java.util.ArrayList��ֱ����������������add()��remove()����Ч��,���ᱨ��
		Integer[] arr = {1,2,3,4,5,6};
		System.out.println(Arrays.toString(arr));  //��ӡ����
		
		List<Integer> list2 = new ArrayList<Integer>();
		list2 = Arrays.asList(arr);  //����תΪlist
		//list2.add(7);  //���ᱨ��
		//list2.add(8);
		System.out.println("list2 = " + list2);
		
		//����취���ڶ���list��ʱ���ֱ�Ӷ�array����ת��
		List<Integer> list3 = new ArrayList<Integer>(Arrays.asList(arr));
		list3.add(7);
		list3.add(8);
		list3.add(9);
		System.out.println("list3 = " + list3);
		Integer[] newArr = new Integer[list3.size()];
		list3.toArray(newArr);   //listת����
		System.out.println(Arrays.toString(newArr));
		
		
	}

}
