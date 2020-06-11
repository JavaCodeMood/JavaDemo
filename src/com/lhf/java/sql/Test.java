package com.lhf.java.sql;

//https://www.cnblogs.com/zcftech/archive/2013/06/10/3131286.html
public class Test {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
       //String test="select  a from  b " +
           //    "\n"+"where      a=b";
       //test=test.replaceAll("\\s{1,}", " ");
       //System.out.println(test);
       //程序的入口
        String testSql="CREATE TABLE `a1` (\r\n" + 
        		"  `var_name` varchar(64) COLLATE utf8mb4_unicode_ci DEFAULT NULL,\r\n" + 
        		"  `value` varchar(128) COLLATE utf8mb4_unicode_ci DEFAULT NULL\r\n" + 
        		") ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;";
        SqlParserUtil test=new SqlParserUtil();
        String result=test.getParsedSql(testSql);
        System.out.println(result);
       //List<SqlSegment> result=test.getParsedSqlList(testSql);//保存解析结果
    }
}
