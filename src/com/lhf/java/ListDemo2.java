package com.lhf.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @ClassName: ListDemo2.java
 * @Description: List������ظ�
 * list����ӣ���ȡ��ɾ��Ԫ��: ��ӷ����ǣ�.add(e)��������ȡ�����ǣ�.get(index)������ɾ�������ǣ�.remove(index)�� ��������ɾ��������.remove(Object o)�� ����Ԫ������ɾ����
 * list���Ƿ����ĳ��Ԫ�أ�
 * list�и���������Ԫ����ֵ�ı�(�滻)��
 * list�в鿴���жϣ�Ԫ�ص�������
 * ����Ԫ������λ�ý��е��жϣ�
 * ����list������λ����������һ���µ�list����ȡ���ϣ���
 * �Ա�����list�е�����Ԫ�أ�
 * �ж�list�Ƿ�Ϊ�գ�
 * ����Iterator���϶���
 * ������ת��Ϊ�ַ�����
 * ������ת��Ϊ���飻
 * ��������ת����
 * ȥ�ظ���
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020��3��9�� ����9:47:11
 */
public class ListDemo2 {
	
	public static void main(String[] args) {
		//LIst����ӡ���ȡ��ɾ��Ԫ��
		List<String> city = new ArrayList<String>();
		//���Ԫ��
		city.add("����");  //����Ϊ0
		city.add("�Ϻ�");  //����Ϊ1
		city.add("����");
		city.add("����");
		city.add("����");
		city.add("�人"); 
		
		//��ȡԪ��
		System.out.println("��ȡ�б�Ԫ�أ�" + city.get(1));
		
		//ɾ���б�Ԫ��
		city.remove(3);  //��������ֵɾ��
		city.remove("�人");
		
		System.out.println("�б��ȣ�" + city.size());
		
		//�����б�
		for(int i = 0;i < city.size();i++) {
			System.out.println(city.get(i));
		}
		System.out.println("---------------------");
		
		//List���Ƿ����ĳ��Ԫ��
		List<String> color = new ArrayList<String>();
		color.add("��ɫ");
		color.add("��ɫ");
		color.add("��ɫ");
		color.add("��ɫ");
		color.add("��ɫ");
		color.add("��ɫ");
		//forѭ������List
		for(int i = 0; i < color.size(); i++) {
			System.out.println(color.get(i));
		}
		String ys = "��ɫ";
		//List���Ƿ����ĳ��Ԫ�أ�true / false
		System.out.println("color�б����Ƿ������ɫ��" + color.contains(ys));
		
		if(color.contains(ys)) {
			System.out.println("color�б����л�ɫ");
		}else {
			System.out.println("color�б��в�������ɫ");
		}
		System.out.println("-------------------");
		
		//list�и���������Ԫ����ֵ�ı�(�滻)
		String a = "�ν�", b = "�ֳ�", c = "����", d = "�˸�", e = "��־";
		List<String> hero = new ArrayList<String>();
		hero.add(a);
		hero.add(b);
		hero.add(c);
		hero.set(0, d);  //.set(index, element)  �� d�˸� �ŵ�list������Ϊ0��λ��
		hero.add(1, e);  //.add(index, element)  �� e��־  �ŵ�List������Ϊ1��λ��
		
		//��ǿforѭ������list
		for(String h : hero) {
			System.out.println(h);
		}
		System.out.println("---------------");
		
		//list�в鿴���жϣ�Ԫ�ص�������
		 List<String> names=new ArrayList<>();
         names.add("����");    //����Ϊ0
         names.add("����");    //����Ϊ1
         names.add("�ŷ�");    //����Ϊ2
         names.add("����");    //����Ϊ3
         names.add("�ŷ�");    //����Ϊ4
         System.out.println(names.indexOf("����"));  //��һ�γ��ֵ�����λ��
         System.out.println(names.lastIndexOf("����"));  //���һ�γ��ֵ�����λ��
         System.out.println(names.indexOf("�ŷ�"));
         System.out.println(names.lastIndexOf("�ŷ�"));
         System.out.println("------------------------");
         
         //����Ԫ������λ�ý��е��жϣ�
         if(names.contains("����")){
        	 System.out.println("��˵�����������");
         }else if(names.indexOf("����") == 0) {
        	 System.out.println("����������");
         }else if(names.indexOf("����") == 3) {
        	 System.out.println("����������");
         }else {
        	 System.out.println("����Ǵ����ң���Ҳ��֪������������");
         }
         System.out.println("----------------------");
         
         //����list������λ����������һ���µ�list����ȡ���ϣ���
         List<String> cellPhone = new ArrayList<String>();
         cellPhone.add("��Ϊ");
         cellPhone.add("ƻ��");
         cellPhone.add("����");
         cellPhone.add("����");
         cellPhone.add("С��");
         //ԭlist���б���
         for(String cell : cellPhone) {
        	 System.out.println(cell);
         }
         //�����µ�LIst
         cellPhone = cellPhone.subList(1, 4);  //.subList(fromIndex, toIndex)  //��������1-4�Ķ�����������һ���µ�list�����ǲ���������Ϊ4��Ԫ�أ�[1,4)
         for(int i = 0; i < cellPhone.size(); i++) {
        	 System.out.println("�µ�list������Ԫ���ǣ�" + cellPhone.get(i));
         }
         System.out.println("-------------------------");
         
         //�Ա�����list�е�����Ԫ�أ�
         //������ȶ����equals����һ��Ϊtrue��������hashcode��ȵĶ���һ������ȵĶ���
         if(names.equals(cellPhone)) {
        	 System.out.println("names�б���cellPhone�б������Ԫ����ͬ");
         }else {
        	 System.out.println("names�б���cellPhone�б������Ԫ�ز���ͬ");
         }
         if(names.hashCode() == cellPhone.hashCode()) {
        	 System.out.println("names�б���cellPhone�б��hashcodeֵ��ͬ");
         }else {
        	 System.out.println("names�б���cellPhone�б��hashcodeֵ����ͬ");
         }
         System.out.println("---------------");
         
         //�ж�list�Ƿ�Ϊ��
         //����trueΪ�գ�����falseΪ�ǿ�
         if(color.isEmpty()) {
        	 System.out.println("color�б�Ϊ��");
         }else {
        	 System.out.println("color�б�Ϊ��");
         }
         
         //����Iterator���϶���
         System.out.println("����color�б��Iterator���϶���" + color.iterator());
         System.out.println("����cellPhone�б��Iterator���϶���" + cellPhone.iterator());
         
         //��list����ת��Ϊ�ַ���
         String colors = color.toString();
         System.out.println("��color�б���ת��Ϊ�ַ�����" + colors);
         
         String phone = cellPhone.toString();
         System.out.println("��cellPhone�б���ת��Ϊ�ַ�����" + phone);
         
         
         //��Lise�б���ת��Ϊ���飬Ĭ������
         System.out.println("��color�б���ת��Ϊ���飺" + color.toArray());
         System.out.println("��names�б���ת��Ϊ���飺" + names.toArray());
		
         System.out.println("---------------");
         
         //���б���ת��Ϊָ������
         //1.Ĭ������
         List<Object> listObj = new ArrayList<>();
         for(int i = 0; i < cellPhone.size(); i++) {
        	 listObj.add(cellPhone.get(i));
         }
         System.out.println("listObj = " + listObj);
         
         //2.ָ������
         List<StringBuffer> lst = new ArrayList<>();
         for(String str : cellPhone) {
        	 lst.add(sb(str));
         }
         System.out.println("lst = " + lst);
         System.out.println("----------------");
         
         //�б���Ԫ��ȥ�ظ�
         List<String> zm = new ArrayList<>();
         zm.add("aa");
         zm.add("bb");
         zm.add("cc");
         zm.add("dd");
         zm.add("aa");
         zm.add("ee");
         zm.add("bb");
         //����1
         for(int i = 0; i < zm.size()-1; i++) {
        	 for(int j = zm.size() - 1; j > i; j--) {
        		 if(zm.get(j).equals(zm.get(i))) {
        			 zm.remove(j);
        		 }
        	 }
         }
         System.out.println(zm);
         
         //����2
         List<String> zm1 = new ArrayList<>();
         for(String s : zm) {
        	 if(Collections.frequency(zm1, s) < 1) {
        		 zm1.add(s);
        	 }
         }
         System.out.println(zm1);
         
	}

	private static StringBuffer sb(String str) {
		return null;
	}

}
