package com.lhf.java4;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class JavaReadExcelDemo {
	
	/**
     * 获取数据
     * @param file
     * @return
     * @throws Exception
     */
    private static List<List<String>> readExcel(File file) throws Exception {

        // 创建输入流，读取Excel
        InputStream is = new FileInputStream(file.getAbsolutePath());
        // jxl提供的Workbook类
        Workbook wb = Workbook.getWorkbook(is);
        // 只有一个sheet,直接处理
        //创建一个Sheet对象
        Sheet sheet = wb.getSheet(0);
        // 得到所有的行数
        int rows = sheet.getRows();
        // 所有的数据
        List<List<String>> allData = new ArrayList<List<String>>();
        // 越过第一行 它是列名称
        for (int j = 1; j < rows; j++) {

            List<String> oneData = new ArrayList<String>();
            // 得到每一行的单元格的数据
            Cell[] cells = sheet.getRow(j);
            for (int k = 0; k < cells.length; k++) {

                oneData.add(cells[k].getContents().trim());
            }
            // 存储每一条数据
            allData.add(oneData);
            // 打印出每一条数据
            //System.out.println(oneData);

        }
        return allData;

    }

	
   public static void main(String[] args) {
	   /*try {
           File file = new File("D://主动流失率.xlsx"); // 创建文件对象
           Workbook wb = Workbook.getWorkbook(file); // 从文件流中获取Excel工作区对象（WorkBook）
           Sheet sheet = wb.getSheet(0); // 从工作区中取得页（Sheet） 
           for (int i = 0; i < sheet.getRows(); i++) { // 循环打印Excel表中的内容 
               for (int j = 0; j < sheet.getColumns(); j++) { 
                   Cell cell = sheet.getCell(j, i); 
                   System.out.printf(cell.getContents()+" ");
               } 
               System.out.println(); 
           } 
       } catch (Exception e) {
           e.printStackTrace();
       }*/
	   
	   // 读取Excel文件
       File file = new File("D:/财务报表.xls");
       try {
           //得到所有数据
           List<List<String>> allData=readExcel(file);
           System.out.println("allData = " + allData);

           
       } catch (Exception e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
       }

    }

}
