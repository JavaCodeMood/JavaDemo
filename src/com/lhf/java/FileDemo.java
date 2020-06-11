package com.lhf.java;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileDemo {
	
	public static void main(String[] args) {
	    
        method1("F:\\test.txt" , "���Բ��Խ��ַ�д���ļ�ĬĬ3"); 
    }
    
    
    /**  
     * ׷���ļ���ʹ��FileOutputStream���ڹ���FileOutputStreamʱ���ѵڶ���������Ϊtrue  
     *   
     * @param fileName  
     * @param content  
     */   
    public   static   void  method1(String file, String conent) {  
        BufferedWriter out = null ;  
        try  {  
            out = new  BufferedWriter( new  OutputStreamWriter(  
                    new  FileOutputStream(file,  true )));  
            out.write(conent);  
        } catch  (Exception e) {  
            e.printStackTrace();
        } finally  {  
            try  {  
                out.close();  
            } catch  (IOException e) {  
                e.printStackTrace();  
            }  
        }  
    }      

}
