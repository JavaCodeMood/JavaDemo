package com.lhf.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * @ClassName: ListDemo2.java
 * @Description: List有序可重复
 * list中添加，获取，删除元素: 添加方法是：.add(e)；　　获取方法是：.get(index)；　　删除方法是：.remove(index)； 按照索引删除；　　.remove(Object o)； 按照元素内容删除；
 * list中是否包含某个元素；
 * list中根据索引将元素数值改变(替换)；
 * list中查看（判断）元素的索引；
 * 根据元素索引位置进行的判断；
 * 利用list中索引位置重新生成一个新的list（截取集合）；
 * 对比两个list中的所有元素；
 * 判断list是否为空；
 * 返回Iterator集合对象；
 * 将集合转换为字符串；
 * 将集合转换为数组；
 * 集合类型转换；
 * 去重复；
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020年3月9日 上午9:47:11
 */
public class ListDemo2 {
	
	public static void main(String[] args) {
		//LIst中添加、获取、删除元素
		List<String> city = new ArrayList<String>();
		//添加元素
		city.add("北京");  //索引为0
		city.add("上海");  //索引为1
		city.add("深圳");
		city.add("广州");
		city.add("杭州");
		city.add("武汉"); 
		
		//获取元素
		System.out.println("获取列表元素：" + city.get(1));
		
		//删除列表元素
		city.remove(3);  //根据索引值删除
		city.remove("武汉");
		
		System.out.println("列表长度：" + city.size());
		
		//遍历列表
		for(int i = 0;i < city.size();i++) {
			System.out.println(city.get(i));
		}
		System.out.println("---------------------");
		
		//List中是否包含某个元素
		List<String> color = new ArrayList<String>();
		color.add("红色");
		color.add("蓝色");
		color.add("白色");
		color.add("黄色");
		color.add("绿色");
		color.add("紫色");
		//for循环遍历List
		for(int i = 0; i < color.size(); i++) {
			System.out.println(color.get(i));
		}
		String ys = "黄色";
		//List中是否包含某个元素：true / false
		System.out.println("color列表中是否包含黄色：" + color.contains(ys));
		
		if(color.contains(ys)) {
			System.out.println("color列表中有黄色");
		}else {
			System.out.println("color列表中不包含黄色");
		}
		System.out.println("-------------------");
		
		//list中根据索引将元素数值改变(替换)
		String a = "宋江", b = "林冲", c = "武松", d = "晁盖", e = "杨志";
		List<String> hero = new ArrayList<String>();
		hero.add(a);
		hero.add(b);
		hero.add(c);
		hero.set(0, d);  //.set(index, element)  将 d晁盖 放到list中索引为0的位置
		hero.add(1, e);  //.add(index, element)  将 e杨志  放到List中索引为1的位置
		
		//增强for循环遍历list
		for(String h : hero) {
			System.out.println(h);
		}
		System.out.println("---------------");
		
		//list中查看（判断）元素的索引；
		 List<String> names=new ArrayList<>();
         names.add("刘备");    //索引为0
         names.add("关羽");    //索引为1
         names.add("张飞");    //索引为2
         names.add("刘备");    //索引为3
         names.add("张飞");    //索引为4
         System.out.println(names.indexOf("刘备"));  //第一次出现的索引位置
         System.out.println(names.lastIndexOf("刘备"));  //最后一次出现的索引位置
         System.out.println(names.indexOf("张飞"));
         System.out.println(names.lastIndexOf("张飞"));
         System.out.println("------------------------");
         
         //根据元素索引位置进行的判断；
         if(names.contains("刘备")){
        	 System.out.println("快说，刘备在哪里？");
         }else if(names.indexOf("刘备") == 0) {
        	 System.out.println("刘备在这里");
         }else if(names.indexOf("刘备") == 3) {
        	 System.out.println("刘备在那里");
         }else {
        	 System.out.println("你就是打死我，我也不知道刘备在哪里");
         }
         System.out.println("----------------------");
         
         //利用list中索引位置重新生成一个新的list（截取集合）；
         List<String> cellPhone = new ArrayList<String>();
         cellPhone.add("华为");
         cellPhone.add("苹果");
         cellPhone.add("三星");
         cellPhone.add("魅族");
         cellPhone.add("小米");
         //原list进行遍历
         for(String cell : cellPhone) {
        	 System.out.println(cell);
         }
         //生成新的LIst
         cellPhone = cellPhone.subList(1, 4);  //.subList(fromIndex, toIndex)  //利用索引1-4的对象重新生成一个新的list，但是不包含索引为4的元素，[1,4)
         for(int i = 0; i < cellPhone.size(); i++) {
        	 System.out.println("新的list包含的元素是：" + cellPhone.get(i));
         }
         System.out.println("-------------------------");
         
         //对比两个list中的所有元素；
         //两个相等对象的equals方法一定为true，但两个hashcode相等的对象不一定是相等的对象
         if(names.equals(cellPhone)) {
        	 System.out.println("names列表与cellPhone列表的所有元素相同");
         }else {
        	 System.out.println("names列表与cellPhone列表的所有元素不相同");
         }
         if(names.hashCode() == cellPhone.hashCode()) {
        	 System.out.println("names列表与cellPhone列表的hashcode值相同");
         }else {
        	 System.out.println("names列表与cellPhone列表的hashcode值不相同");
         }
         System.out.println("---------------");
         
         //判断list是否为空
         //返回true为空，返回false为非空
         if(color.isEmpty()) {
        	 System.out.println("color列表为空");
         }else {
        	 System.out.println("color列表不为空");
         }
         
         //返回Iterator集合对象
         System.out.println("返回color列表的Iterator集合对象：" + color.iterator());
         System.out.println("返回cellPhone列表的Iterator集合对象：" + cellPhone.iterator());
         
         //将list集合转化为字符串
         String colors = color.toString();
         System.out.println("将color列表集合转化为字符串：" + colors);
         
         String phone = cellPhone.toString();
         System.out.println("将cellPhone列表集合转化为字符串：" + phone);
         
         
         //将Lise列表集合转化为数组，默认类型
         System.out.println("将color列表集合转化为数组：" + color.toArray());
         System.out.println("将names列表集合转化为数组：" + names.toArray());
		
         System.out.println("---------------");
         
         //将列表集合转化为指定类型
         //1.默认类型
         List<Object> listObj = new ArrayList<>();
         for(int i = 0; i < cellPhone.size(); i++) {
        	 listObj.add(cellPhone.get(i));
         }
         System.out.println("listObj = " + listObj);
         
         //2.指定类型
         List<StringBuffer> lst = new ArrayList<>();
         for(String str : cellPhone) {
        	 lst.add(sb(str));
         }
         System.out.println("lst = " + lst);
         System.out.println("----------------");
         
         //列表集合元素去重复
         List<String> zm = new ArrayList<>();
         zm.add("aa");
         zm.add("bb");
         zm.add("cc");
         zm.add("dd");
         zm.add("aa");
         zm.add("ee");
         zm.add("bb");
         //方法1
         for(int i = 0; i < zm.size()-1; i++) {
        	 for(int j = zm.size() - 1; j > i; j--) {
        		 if(zm.get(j).equals(zm.get(i))) {
        			 zm.remove(j);
        		 }
        	 }
         }
         System.out.println(zm);
         
         //方法2
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
