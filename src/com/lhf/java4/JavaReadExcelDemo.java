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
     * ��ȡ����
     * @param file
     * @return
     * @throws Exception
     */
    private static List<List<String>> readExcel(File file) throws Exception {

        // ��������������ȡExcel
        InputStream is = new FileInputStream(file.getAbsolutePath());
        // jxl�ṩ��Workbook��
        Workbook wb = Workbook.getWorkbook(is);
        // ֻ��һ��sheet,ֱ�Ӵ���
        //����һ��Sheet����
        Sheet sheet = wb.getSheet(0);
        // �õ����е�����
        int rows = sheet.getRows();
        // ���е�����
        List<List<String>> allData = new ArrayList<List<String>>();
        // Խ����һ�� ����������
        for (int j = 1; j < rows; j++) {

            List<String> oneData = new ArrayList<String>();
            // �õ�ÿһ�еĵ�Ԫ�������
            Cell[] cells = sheet.getRow(j);
            for (int k = 0; k < cells.length; k++) {

                oneData.add(cells[k].getContents().trim());
            }
            // �洢ÿһ������
            allData.add(oneData);
            // ��ӡ��ÿһ������
            //System.out.println(oneData);

        }
        return allData;

    }

	
   public static void main(String[] args) {
	   /*try {
           File file = new File("D://������ʧ��.xlsx"); // �����ļ�����
           Workbook wb = Workbook.getWorkbook(file); // ���ļ����л�ȡExcel����������WorkBook��
           Sheet sheet = wb.getSheet(0); // �ӹ�������ȡ��ҳ��Sheet�� 
           for (int i = 0; i < sheet.getRows(); i++) { // ѭ����ӡExcel���е����� 
               for (int j = 0; j < sheet.getColumns(); j++) { 
                   Cell cell = sheet.getCell(j, i); 
                   System.out.printf(cell.getContents()+" ");
               } 
               System.out.println(); 
           } 
       } catch (Exception e) {
           e.printStackTrace();
       }*/
	   
	   // ��ȡExcel�ļ�
       File file = new File("D:/���񱨱�.xls");
       try {
           //�õ���������
           List<List<String>> allData=readExcel(file);
           System.out.println("allData = " + allData);

           
       } catch (Exception e) {
           // TODO Auto-generated catch block
           e.printStackTrace();
       }

    }

}
