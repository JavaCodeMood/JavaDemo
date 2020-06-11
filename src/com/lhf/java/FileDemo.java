package com.lhf.java;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class FileDemo {
	
	public static void main(String[] args) {
	    
        method1("F:\\test.txt" , "测试测试将字符写入文件默默3"); 
    }
    
    
    /**  
     * 追加文件：使用FileOutputStream，在构造FileOutputStream时，把第二个参数设为true  
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
