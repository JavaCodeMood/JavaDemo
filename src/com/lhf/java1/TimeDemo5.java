package com.lhf.java1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @ClassName: TimeDemo5.java
 * @Description: Javaʱ�����ʱ��ת��
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019��10��24�� ����9:42:27
 */
public class TimeDemo5 {
	
	public static void main(String[] args) {
		String res = "2019-12-18 10:04:59";/** ʱ�� */
		int s = 1545098699;/** ʱ��� */		
		System.out.println("ʱ���ת��Ϊʱ��:"+stampToDate(s));/** ʱ���ת��Ϊʱ�� */
		System.out.println("ʱ��ת��Ϊʱ���:"+dateToStamp(res));/** ʱ��ת��Ϊʱ��� */
	}
	
	/* 
     * ��ʱ��ת��Ϊʱ���
     */    
    public static String dateToStamp(String s){
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	String res = "";    
        if (!"".equals(s)) {
        	try {
        		res = String.valueOf(sdf.parse(s).getTime()/1000);
			} catch (Exception e) {
				System.out.println("������nullֵ");
			}			
		}else {	
			long time = System.currentTimeMillis();  
			res = String.valueOf(time/1000);
		}
                 
        return res;         
    }
	
	
	/* 
     * ��ʱ���ת��Ϊʱ��
     */
    public static String stampToDate(int time){
    	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String times = format.format(new Date(time * 1000L));
        //	    System.out.println("���ڸ�ʽ---->" + times);
	    return times;
    }



}
