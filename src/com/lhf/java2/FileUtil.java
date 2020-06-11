package com.lhf.java2;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;

/**
 *
 * @ClassName: FileUtil.java
 * @Description: ��ȡָ��Ŀ¼�µ��ļ���
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019��10��21�� ����12:15:21
 */
public class FileUtil {
	
	/*** 
     * ��ȡָ��Ŀ¼�µ����е��ļ����������ļ��У��������˵ݹ� 
     *  
     * @param obj 
     * @return 
     */  
    public static ArrayList<File> getListFiles(Object obj) {  
        File directory = null;  
        if (obj instanceof File) {  
            directory = (File) obj;  
        } else {  
            directory = new File(obj.toString());  
        }  
        ArrayList<File> files = new ArrayList<File>();  
        if (directory.isFile()) {  
            files.add(directory);  
            return files;  
        } else if (directory.isDirectory()) {  
            File[] fileArr = directory.listFiles();  
            for (int i = 0; i < fileArr.length; i++) {  
                File fileOne = fileArr[i];  
                files.addAll(getListFiles(fileOne));  
            }  
        }  
        return files;  
    }  
	
	/*** 
     *  
     * @param path 
     * @param prefixStr :ǰ׺�� 
     * @return 
     */  
    public static File[] getFilesByPathPrefix(File path, final String prefixStr) {  
        File[] fileArr = path.listFiles(new FilenameFilter() {  
            @Override  
            public boolean accept(File dir, String name) {  
                // System.out.println("prefixStr:"+prefixStr);  
                if (prefixStr == null || " ".equals(prefixStr)  || (dir.isDirectory() && name.startsWith(prefixStr))) {  
                    return true;  
                } else {  
                    return false;  
                }  
            }  
        });  
        return fileArr;  
  
    }  
    
     /*** 
     * ����ǰ׺�� 
     *  
     * @param pathStr 
     * @param prefixStr 
     * @return 
     */  
    public static File[] getFilesByPathAndPrefix(String pathStr,  final String prefixStr) {  
        File path = new File(pathStr);  
        return getFilesByPathPrefix(path, prefixStr);  
    } 
    
    
    /*** 
     *  
     * @param path 
     * @param prefixStr :��׺�� 
     * @return 
     */  
    public static File[] getFilesByPathAndSuffix(File path,  
            final String sufixStr) {  
        File[] fileArr = path.listFiles(new FilenameFilter() {  
            @Override  
            public boolean accept(File dir, String name) {  
                // System.out.println("prefixStr:"+prefixStr);  
                if ((sufixStr == null || " ".equals(sufixStr) || (dir.isDirectory() && name.endsWith(sufixStr)))) {  
                    return true;  
                } else {  
                    return false;  
                }  
            }  
        });  
        return fileArr;  
  
    }  
  
    /*** 
     * ���˺�׺�� 
     *  
     * @param pathStr 
     * @param sufixStr 
     * @return 
     */  
    public static File[] getFilesByPathAndSuffix(String pathStr,  
            final String sufixStr) {  
        File path = new File(pathStr);  
        return getFilesByPathAndSuffix(path, sufixStr);  
    }  
    
    public static void main(String[] args) {
    	File[] fileArr = getFilesByPathAndPrefix("E:\\data\\interview", " ");
		for(File file : fileArr) {
			System.out.println(file);
		}
		String fileName = "20191021.json";
		String[] fileStr = fileName.split("\\.");
		System.out.println(fileStr[0]);
		
		String ipAddress = "127.0.0.1,129.177.110.136";
		String[] ipStr = ipAddress.split(",");
        for(String addr : ipStr){
            System.out.println(addr);
        }
	}

}
