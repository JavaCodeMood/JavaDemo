package com.lhf.java3;

public class StringDemo1 {
	
	/**
	 * @Description:����ָ�����ַ����ָ��ַ���
	 *
	 * @param str
	 * @param splitLen
	 * @return      
	 * @throws���쳣����
	 * @author:liuhefei
	 */
	public static String[] splitStr(String str, int splitLen) {
        int count = str.length() / splitLen + (str.length() % splitLen == 0 ? 0 : 1);
        String[] strs = new String[count];
        for (int i = 0; i < count; i++) {
            if (str.length() <= splitLen) {
                strs[i] = str;
            } else {
                strs[i] = str.substring(0, splitLen);
                str = str.substring(splitLen);
            }
        }
        return strs;
    }
	
	/**
	 * @Description:����ָ�����ַ����ָ��ַ���,Ȼ�����¼���\n������װ
	 *
	 * @param str
	 * @param splitLen
	 * @return      
	 * @throws���쳣����
	 * @author:liuhefei
	 */
	public static String createStr(String str, int splitLen) {
        int count = str.length() / splitLen + (str.length() % splitLen == 0 ? 0 : 1);
        String[] strs = new String[count];
        for (int i = 0; i < count; i++) {
            if (str.length() <= splitLen) {
                strs[i] = str;
            } else {
                strs[i] = str.substring(0, splitLen);
                str = str.substring(splitLen);
            }
        }
        String result = "";
        for(int i = 0; i < strs.length;i++) {
        	if(strs[i].length() <= 8) {
				result += strs[i];
			}else {
				result += strs[i] + "\\n"; 
			}
        }
        return result;
    }


	public static void main(String[] args) {
		String str = "����������ӵ���������������̫������������������Ǹ���������ȱǮ��ȱǮ����������ȱŮ�˸���ȱһ���㶮�������";
		String[] strArr = splitStr(str, 10);
		for(String str1 : strArr) {
			System.out.println(str1);
		}
		System.out.println(str.length());
		System.out.println("\n\n");
		String result = "";
		for(int i = 0; i< strArr.length;i++) {
			if(strArr[i].length() <= 8) {
				result += strArr[i];
			}else {
				result += strArr[i] + "\\n"; 
			}
		}
		System.out.println("result = " + result);	
		System.out.println("\n\n");
		
		System.out.println(createStr(str, 10));

	}

}
