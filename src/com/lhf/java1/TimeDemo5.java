package com.lhf.java1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @ClassName: TimeDemo5.java
 * @Description: Java时间戳与时间转化
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019年10月24日 上午9:42:27
 */
public class TimeDemo5 {
	
	public static void main(String[] args) {
		String res = "2019-12-18 10:04:59";/** 时间 */
		int s = 1545098699;/** 时间戳 */		
		System.out.println("时间戳转换为时间:"+stampToDate(s));/** 时间戳转换为时间 */
		System.out.println("时间转换为时间戳:"+dateToStamp(res));/** 时间转换为时间戳 */
	}
	
	/* 
     * 将时间转换为时间戳
     */    
    public static String dateToStamp(String s){
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	String res = "";    
        if (!"".equals(s)) {
        	try {
        		res = String.valueOf(sdf.parse(s).getTime()/1000);
			} catch (Exception e) {
				System.out.println("传入了null值");
			}			
		}else {	
			long time = System.currentTimeMillis();  
			res = String.valueOf(time/1000);
		}
                 
        return res;         
    }
	
	
	/* 
     * 将时间戳转换为时间
     */
    public static String stampToDate(int time){
    	SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String times = format.format(new Date(time * 1000L));
        //	    System.out.println("日期格式---->" + times);
	    return times;
    }



}
