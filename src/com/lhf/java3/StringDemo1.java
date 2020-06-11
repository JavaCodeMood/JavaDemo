package com.lhf.java3;

public class StringDemo1 {
	
	/**
	 * @Description:根据指定的字符数分割字符串
	 *
	 * @param str
	 * @param splitLen
	 * @return      
	 * @throws：异常描述
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
	 * @Description:根据指定的字符数分割字符串,然后重新加上\n进行组装
	 *
	 * @param str
	 * @param splitLen
	 * @return      
	 * @throws：异常描述
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
		String str = "能陪你过日子的男人他给不了你太多的浪漫给你浪漫的那个男人他不缺钱不缺钱的男人他不缺女人更不缺一个你懂了吗姑娘";
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
