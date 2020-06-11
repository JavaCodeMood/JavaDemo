package com.lhf.java8;

/**
 * List������������ڲ���ķ�ʽ��������
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListSortDemo2 {

	public static void main(String[] args) {
		List<Girl> list = new ArrayList<>();
		list.add(new Girl("����", 24, "D�ֱ�", 172));
		list.add(new Girl("ɺɺ", 18, "A�ֱ�", 168));
		list.add(new Girl("����", 22, "C�ֱ�", 171));
		list.add(new Girl("�ۻ�", 23, "B�ֱ�", 170));
		list.add(new Girl("����", 25, "E�ֱ�", 173));
		list.add(new Girl("ͮͮ", 22, "B�ֱ�", 169));
		Collections.sort(list, new Comparator<Girl>() {
            //����������� ��������
			@Override
			public int compare(Girl girl1, Girl girl2) {
				int diff = girl1.getHeight() - girl2.getHeight();
				if(diff > 0) {
					return -1;
				}else if(diff < 0) {
					return 1;
				}
				return 0;  //���
			}
		}); 
		
		System.out.println(list.toString());

	}

}
