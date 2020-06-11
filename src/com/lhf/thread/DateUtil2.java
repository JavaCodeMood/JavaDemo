package com.lhf.thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @ClassName: DateUtil2.java
 * @Description: 解决方案二：使用synchronized来修饰，存在的问题：并发度不高
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019年6月14日 上午10:22:50
 */
public class DateUtil2 {
	
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
	public static synchronized Date parse(String dateStr) {
		Date date = null;
		try {
		    date = sdf.parse(dateStr);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

}
