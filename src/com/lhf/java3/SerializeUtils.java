package com.lhf.java3;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.alibaba.fastjson.JSON;

public class SerializeUtils {
	
    /**
     * �������л�Ϊ�ַ���
     * @param object
     * @return
     */
    public static String serializeObject(Object object){
    	String objectStr = null;
        try {
        	ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream out = new ObjectOutputStream(byteArrayOutputStream);
            out.writeObject(object);
                                                                      
            objectStr = byteArrayOutputStream.toString("ISO-8859-1"); //������ISO-8859-1
            out.close();
            byteArrayOutputStream.close();
            
        }catch(Exception e) {
        	e.printStackTrace();
        }
        return objectStr;
    }

    /**
     * �ַ������л�Ϊ����
     * @param objectStr
     * @return
     * @throws Exception
     */
    public static Object stringSerializeObject(String objectStr)throws Exception{
    	Object object = null;
       try {
    	   ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(objectStr.getBytes("ISO-8859-1"));
           ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
           object =  objectInputStream.readObject();
           objectInputStream.close();
           byteArrayInputStream.close();
           
       }catch(Exception e) {
    	   e.printStackTrace();
       }
       return object;
    }
    
    public static void main(String[] args) {
    	String result = SerializeUtils.serializeObject("Hello");
    	System.out.printf("result = " + result);
	}

}
