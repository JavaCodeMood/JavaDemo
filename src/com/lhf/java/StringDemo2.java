package com.lhf.java;

public class StringDemo2 {
	
	 public static void main(String[] args) {
	        String webValue = "bcdefrg=87631840=kskskkiuwuw;";
	        String xmlValue = "bcdefrg=87631840=ytwwqjjhhj;";
	        String resultValue = "";
	        //�ж�xmlValue�ַ����Ƿ��Ѿ�����webValue�У����ھͲ�׷�ӣ������ھ�׷�ӵ�webValue����
	        if(webValue.indexOf(xmlValue) != -1){
	            System.out.println("����");
	            resultValue = webValue;
	        }else {
	            System.out.println("������");
	            resultValue = webValue + xmlValue;
	        }
	        System.out.println("resultValue = " + resultValue);
	    }


}
