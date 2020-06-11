package com.lhf.thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 
 * @ClassName: DateUtil1.java
 * @Description: �������һ�� Ϊ�˽��֮ǰ�쳣�����⣬����ÿ�ζ�new һ���µ�SimpleDateFormat��
   *    ���Ǵ��ڵ������ǣ��ռ��˷ѱȽϴ�
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019��6��14�� ����10:17:22
 */
public class DateUtil1 {
	
	public static Date parse(String dateStr) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date = null;
		try {
			date = sdf.parse(dateStr);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

}
