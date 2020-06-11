package com.lhf.java6;

/**
 * 
 * @ClassName: DataTypeTest10.java
 * @Description: �ַ���ת��Ϊ��������(��װ���ͺͻ�������)��
(1)����ת��Ϊ��Ӧ�ķ�װ��ʵ�����ٵ��ö�Ӧ�ķ���xxxValue()����ת���ɶ�Ӧ������
(2)ʹ�÷�װ���Դ���parseXXX����������
parseByte(String s)��parseShort(String s)��parseInt(String s)��parseLong(String s)��parseFloat(String s)��parseDouble(String s)��parseBoolean(String s)

(3)Character��getNumbericValue(char ch)����
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2020��4��24�� ����5:36:39
 */
public class DataTypeTest10 {

	public static void main(String[] args) {
		String str = "114";
		String str1 = "314.15926";
		String str2 = "true";
		String str3 = "ABCDEF";
		
		//String --> byte/Byte
		byte b1 = new Byte(str).byteValue();  //����1
		byte b2 = Byte.valueOf(str).byteValue();  //����2
		byte b3 = Byte.parseByte(str);   //����3   ��ͬ
		Byte b4 = Byte.parseByte(str);  
		
		//String --> short/Short
		short s1 = new Short(str).shortValue();
		short s2 = Short.valueOf(str).shortValue();
		short s3 = Short.parseShort(str);
		Short s4 = Short.parseShort(str);
		
		//String --> int/Integer
		int i1 = new Integer(str).intValue();
		int i2 = Integer.valueOf(str).intValue();
		int i3 = Integer.parseInt(str);
		Integer i4 = Integer.parseInt(str);
		
		//String --> long/Long
		long l1 = new Long(str).longValue();
		long l2 = Long.valueOf(str).longValue();
		long l3 = Long.parseLong(str);
		Long l4 = Long.parseLong(str);
		
		//String --> float/Float
		float f1 = new Float(str1).floatValue();
		float f2 = Float.valueOf(str1).floatValue();
		float f3 = Float.parseFloat(str1);
		Float f4 = Float.parseFloat(str1);
		
		//String --> double/Double
		double d1 = new Double(str1).doubleValue();
		double d2 = Double.valueOf(str1).doubleValue();
		double d3 = new Float(str1).doubleValue();
		double d4 = new Long(str).doubleValue();
		double d5 = new Integer(str).doubleValue();
		double d6 = new Short(str).doubleValue();
		Double d7 = new Byte(str).doubleValue();
	
		double d8 = Double.parseDouble(str1);
		Double d9 = Double.parseDouble(str1);
		
		//String --> boolean/Boolean
		boolean bool = new Boolean(str2).booleanValue();
		boolean bool1 = Boolean.valueOf(str2).booleanValue();
		boolean bool2 = Boolean.parseBoolean(str2);
		Boolean bool3 = Boolean.parseBoolean(str2);
		
		//String --> char
		char[] ch = str3.toCharArray();  //ת��Ϊchar����
		char ch1 = str3.charAt(2);  //ת��Ϊchar�ַ�
		
		System.out.println("b1 = " + b1);
		System.out.println("b2 = " + b2);
		System.out.println("f1 = " + f1);
		System.out.println("f2 = " + f2);
        System.out.println("bool = " + bool);
        System.out.println("ch = " + ch[0]);
        System.out.println("ch1 = " + ch1);
       
	}

}
