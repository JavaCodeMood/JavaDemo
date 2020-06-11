package com.lhf.java4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class JavaReadExcelDemo1 {

	public static void main(String[] args) throws Exception{
		
		ArrayList<String> columnList = new ArrayList<String>();
		File file = new File("D://图书名著581570525905657.xlsx");
		FileWriter filewriter=new FileWriter("D://测试.txt");
		try {
			FileInputStream in = new FileInputStream(file);
			XSSFWorkbook wb = new XSSFWorkbook(in);
			
			Sheet sheet = wb.getSheetAt(0); //取得“测试.xlsx”中的第一个表单
			int firstRowNum = sheet.getFirstRowNum();
			int lastRowNum = sheet.getLastRowNum();
			
			Row row = null;
			Cell cell_a = null;
			for (int i = firstRowNum+1; i <= lastRowNum; i++) {
				row = sheet.getRow(i);   //取得第i行 （从第二行开始取，因为第一行是表头）
				cell_a = row.getCell(0);   //取得i行的第一列 
				 String cellValue = cell_a.getStringCellValue().trim();
				//System.out.println(cellValue);
				filewriter.write(cellValue+"\r\n"); //将取出的.xlsx表中的数据写入到txt文件中
				columnList.add(cellValue);
			}
			filewriter.flush();
			filewriter.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
