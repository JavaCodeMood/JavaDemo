package com.lhf.java.sql;

import java.io.BufferedReader;  
import java.io.FileNotFoundException;  
import java.io.FileReader;  
import java.io.IOException;  
import java.util.HashSet;  
import java.util.Iterator;  

/**
 * 
 * @ClassName: TableQuerier.java
 * @Description: 分析SQL语句，提取出所涉及的数据表名
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019年4月18日 上午11:32:44
 */
public class TableQuerier {  
    public static String startKey = "SELECT ";  
    public static String fromKey = " FROM ";  
    public static String joinKey = " JOIN ";  
    public static String onKey = " ON ";  
    public static String endKey = " WHERE ";  
    public static String unionKey = " UNION ";  
    public static String minusKey = " MINUS ";  
    public String subTable = "subTable";  
    private HashSet tableSet;  
    private String fileName;  
  
    /** 
     * @param args 
     */  
    public static void main(String[] args) {  
        // TODO Auto-generated method stub  
        TableQuerier tq = new TableQuerier("e://data.txt");  
        HashSet s = tq.getTableSet();  
        tq.parseTableFromFile();  
        Iterator i = s.iterator();  
        System.out.println("The following tables are included in this sql statement.");  
        int num = 1;  
        System.out.println("Number#     tableName");  
        while(i.hasNext()){  
            System.out.println(num+" "+i.next());  
            num++;  
        }  
          
    }  
    public void parseTableFromFile(){  
        BufferedReader buf = null;  
        try {  
            buf = new BufferedReader(new FileReader(fileName));  
              
            String line = buf.readLine();  
              
            StringBuilder sb = new StringBuilder();  
              
            while(line != null){  
                sb.append(line.toUpperCase()+" ");  
                line = buf.readLine();  
            }  
            //System.out.println(sb.toString());  
              
            getLevelOneTables(sb.toString(), tableSet);  
              
        } catch (FileNotFoundException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        } catch (IOException e) {  
            // TODO Auto-generated catch block  
            e.printStackTrace();  
        }finally{  
            try {  
                buf.close();  
            } catch (IOException e) {  
                // TODO Auto-generated catch block  
                e.printStackTrace();  
            }  
              
        }  
    }  
      
    public TableQuerier(String fileName){  
        tableSet = new HashSet();  
        this.fileName = fileName;  
    }  
      
    public void getLevelOneTables(String str, HashSet s){  
        if("".equals(str)){  
            return;  
        }  
        //remove sub query  
        int firstLeftBlockPos = str.indexOf("(");  
        int lastRightBlockPos = -1;  
          
        while(firstLeftBlockPos != -1){  
            //get matched ')', remove the substring between them  
            int leftBlockNum = 1;  
            for(int start = firstLeftBlockPos +1; start < str.length(); start++){  
                if(str.charAt(start) == ')'){  
                    if(leftBlockNum == 1){  
                        lastRightBlockPos = start;  
                        break;  
                    }else{  
                        leftBlockNum --;  
                    }  
                }else if(str.charAt(start) == '('){  
                    leftBlockNum ++;  
                }  
            }  
            if(lastRightBlockPos < 0){  
                try {  
                    throw new Exception("block mismatch");  
                } catch (Exception e) {  
                    // TODO Auto-generated catch block  
                    e.printStackTrace();  
                }  
            }  
            String blockContent = str.substring(firstLeftBlockPos+1, lastRightBlockPos);  
              
              
            //parse the content in block  
              
            if(blockContent.contains(startKey)){  
                getLevelOneTables(blockContent, s);  
                str = str.substring(0,firstLeftBlockPos)+" "+subTable+" "+str.substring(lastRightBlockPos+1);  
            }else{//remove '(' and ')' at level one  
                str = str.substring(0,firstLeftBlockPos)  
                        +str.substring(firstLeftBlockPos+1,lastRightBlockPos)  
                        +str.substring(lastRightBlockPos +1);  
            }  
            firstLeftBlockPos = str.indexOf("(");  
        }  
        //if the statement is joined with 'UNION' or 'MINUS',   
        //parse the first segement left of the key word('UNION' or 'MINUS')  
        int unionPos = -1;  
        int minusPos = -1;  
        int breakPos = -1;  
        unionPos = str.indexOf(unionKey);  
        minusPos = str.indexOf(minusKey);  
        if(unionPos != -1 ||minusPos != -1){  
            if(unionPos != -1 && minusPos != -1){  
                breakPos = minusPos < unionPos ? minusPos:unionPos;  
            }else{  
                breakPos = minusPos < unionPos ? unionPos:minusPos;  
            }  
        }  
          
        if(breakPos != -1){  
            String rightContent = str.substring(breakPos+unionKey.length()).trim();  
            rightContent = rightContent.startsWith("ALL")?rightContent.substring(3):rightContent;  
            getLevelOneTables(rightContent, s);  
            str = str.substring(0, breakPos).trim();  
        }  
        //change join to ','  
        //      if join table  
        int joinKeyPos = str.indexOf(joinKey);  
        if(joinKeyPos != -1){  
            str = str.replace(joinKey, ",");  
        }  
          
        //now, we can look for tables in a simple statement  
        int fromPos = str.indexOf(fromKey);  
        int endPos = str.indexOf(endKey);  
        if(endPos == -1){  
            endPos = str.length();  
        }  
        if(fromPos > 0){  
            str = str.substring(fromPos+fromKey.length(), endPos).trim();  
        }else{  
            return;  
        }  
        //System.out.println("modified str  = "+str);  
        String tableName = str.indexOf(" ") > 0?str.substring(0,str.indexOf(" ")).trim():str.trim();//the first word after 'from' is a table  
        if(!subTable.equals(tableName)){  
            s.add(tableName);  
        }  
          
        str = str.substring(str.indexOf(tableName)+tableName.length()).trim();  
        //if multiple table after 'from'  
        int dotIndex = str.indexOf(",");  
        while(dotIndex != -1){  
            str = str.substring(dotIndex+1).trim();  
            tableName = str.indexOf(" ")>0?str.substring(0,str.indexOf(" ")).trim():str.trim();//the first word after ',' must be a table name  
            if(!subTable.equals(tableName)){  
                s.add(tableName);  
            }  
            str = str.substring(str.indexOf(tableName)+tableName.length()).trim();  
            dotIndex = str.indexOf(",");  
        }  
    }  
      
      
    /** 
     * @return the fileName 
     */  
    public String getFileName() {  
        return fileName;  
    }  
    /** 
     * @param fileName the fileName to set 
     */  
    public void setFileName(String fileName) {  
        this.fileName = fileName;  
    }  
    /** 
     * @return the tableSet 
     */  
    public HashSet getTableSet() {  
        return tableSet;  
    }  
    /** 
     * @param tableSet the tableSet to set 
     */  
    public void setTableSet(HashSet tableSet) {  
        this.tableSet = tableSet;  
    }  
}  