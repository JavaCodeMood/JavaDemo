package com.lhf.java2;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

public class SHAEncrypt {
     
	 /** 
     * ����SALT������(86) 
     */  
    private final String[] SALT_ARR = { "a", "b", "c", "d", "e", "f", "g", "h",  
            "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u",  
            "v", "w", "x", "y", "z", "A", "B", "C", "D", "E", "F", "G", "H",  
            "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U",  
            "V", "W", "X", "Y", "Z", "1", "2", "3", "4", "5", "6", "7", "8",  
            "9", "0", ".", "-", "*", "/", "'", ":", ";", ">", "<", "~", "!",  
            "@", "#", "$", "%", "^", "&", "(", ")", "{", "}", "[", "]", "|" };  
    /** 
     * ѭ�����ܴ��� 
     */  
    private final int ENCODE_COUNT = 1000;  
    /** 
     * �����㷨���� 
     */  
    private final String ENCODE_TYPE = "SHA-256";  
    /** 
     * SALT���� 
     */  
    private final int SALT_LENGTH = 16;  
    /** 
     * getBytesʱָ��ʹ�õ��ַ��� 
     */  
    private final String CHAR_SET = "UTF-8";  
  
    /** 
     * �������������SSHA-256���ܣ����ܲ������£� <br> 
     * 1. �������saltֵ <br> 
     * 2. ����������Σ�ǰ�����4λ0 <br> 
     * 3. ����saltֵ: ��salt�ֳ�ǰ8λtemp1��ʣ�ಿ��temp2,��temp2+transformedPwd+temp1����ʽ���� <br> 
     * 4. �����Ӻ���ִ����ж��SHA-256����<br> 
     * 5. �Լ��ܺ����������6λ<br> 
     * 6. ��saltֵת�����ֽ�����(utf-8)��ת����16�����ַ���<br> 
     * 7. ��ת�����saltֵ������4λ����<br> 
     * 8. ������λ������ĺ���λ��ı���saltֵ�ִ�<br> 
     * 9. �������ִ�����8λ��Ϊ���ռ��ܽ��<br> 
     *  
     * @param pwd 
     *            �������� 
     * @return ���ܺ������ 
     */  
    public String encryptPwd(String pwd) {  
        String ret = "";  
        String salt = this.genSalt();  
        ret = this.encryptPwdWithSalt(pwd, salt);  
        return ret;  
    }  
  
    /** 
     * �������������SSHA-256���ܣ����ܲ������£� <br> 
     * 1. ����������Σ�ǰ�����4λ0 <br> 
     * 2. ����saltֵ: ��salt�ֳ�ǰ8λtemp1��ʣ�ಿ��temp2,��temp2+transformedPwd+temp1����ʽ���� <br> 
     * 3. �����Ӻ���ִ����ж��SHA-256����<br> 
     * 4. �Լ��ܺ����������6λ<br> 
     * 5. ��saltֵת�����ֽ�����(utf-8)��ת����16�����ַ���<br> 
     * 6. ��ת�����saltֵ������4λ����<br> 
     * 7. ������λ������ĺ���λ��ı���saltֵ�ִ�<br> 
     * 8. �������ִ�����8λ��Ϊ���ռ��ܽ��<br> 
     *  
     * @param pwd 
     *            �������� 
     * @param salt 
     *            ���ڼ��ܵ�saltֵ 
     * @return 
     */  
    private String encryptPwdWithSalt(String pwd, String salt) {  
        String ret = "";  
        try {  
            String transformedPwd = this.transform(pwd, 4);  
            // ��salt�ֳ�ǰ8λtemp1��ʣ�ಿ��temp2  
            // ��temp2+transformedPwd+temp1����ʽ����  
            String joinStr = this.joinSaltAndPwd(salt, transformedPwd);  
            String encodePwd = this.encodeJoinStr(joinStr);  
            String rightMovedPwd = this.rightMove(encodePwd, 6);  
            String hexStrSalt = this.bytes2Hex(salt.getBytes(CHAR_SET));  
            String leftMovedHexStrSalt = this.rightMove(hexStrSalt, -4);  
            ret = this.rightMove(rightMovedPwd + leftMovedHexStrSalt, 8);  
        } catch (Exception e) {  
            ret = "";  
            e.printStackTrace();  
        }  
        return ret;  
    }  
  
    /** 
     * ������/���Ľ�����֤������Ƿ�һ�� ��֤�������£� <br> 
     * 1. ��ԭ�����л�ȡͨ���������ȡsalt�ִ� <br> 
     * 2. ����������ʹ��salt�ִ��ٴν��м��� <br> 
     * 3. ���������Ƿ�һ�� <br> 
     *  
     * @param pwd 
     *            �������� 
     * @param encPwd 
     *            �������� 
     * @return У���� 
     */  
    public boolean validatePwd(String pwd, String encPwd) {  
        if (null == encPwd) {  
            return false;  
        }  
        boolean ret = false;  
        String salt = this.getSaltFromEncryptedPwd(encPwd);  
        ret = encPwd.equals(encryptPwdWithSalt(pwd, salt));  
        return ret;  
    }  
  
    /** 
     * ������������ͨ���������ȡ����ʱʹ�õ���salt�ִ� <br> 
     * ��ȡ�������£� <br> 
     * 1. ����������8λ <br> 
     * 2. ��β����ȡ���κ��salt�ִ� <br> 
     * ����Ϊ2��ԭsalt�ִ����ȣ���ΪתΪ16�����ֽ������ִ�ʱ���Ȼ�ӱ��� <br> 
     * 3. ��saltֵ��16�����ֽ������ַ�������4λ <br> 
     * 4. �����κ��saltֵ��16�����ֽ������ַ�����ԭ��ԭ�����ַ�����ʽ <br> 
     *  
     * @param encPwd 
     *            �������� 
     * @return ����ʱʹ�õ�salt�ִ�����ȡ�����򷵻�"" 
     */  
    private String getSaltFromEncryptedPwd(String encPwd) {  
        String ret = "";  
        try {  
            String leftMoved = this.rightMove(encPwd, -8);  
            int hexSaltLength = SALT_LENGTH * 2;  
            if(encPwd.length()<hexSaltLength){  
                // �������볤�ȱ�16�����ֽ������ִ���saltֵ�̣������ܻ�ȡ�õ���ȷ��saltֵ  
                return "";  
            }  
            String hexSalt = this.rightMove(leftMoved.substring(encPwd.length()  
                    - hexSaltLength, encPwd.length()), 4);  
            ret = new String(this.hex2Bytes(hexSalt), CHAR_SET);  
        } catch (Exception e) {  
            ret = "";  
            e.printStackTrace();  
        }  
        return ret;  
    }  
  
    /** 
     *  
     * ������SALTֵ 
     *  
     * @return ����һ��������ĸ�����֡������ַ���16λ����� 
     */  
    private String genSalt() {  
  
        StringBuffer result = new StringBuffer();  
        Random r = new Random();  
        int temp = 0;  
        for (int i = 0; i < this.SALT_LENGTH; i++) {  
            temp = r.nextInt(this.SALT_ARR.length);  
            result.append(this.SALT_ARR[temp]);  
        }  
        return result.toString();  
    }  
  
    /** 
     * ������Σ�ǰ��Nλ0�� 
     *  
     * @param pwd 
     *            ����ԭ�� 
     * @param n 
     *            ��0�ĸ��� 
     * @return ����һ������ǰ��Nλ0���ַ��� 
     */  
    private String transform(String pwd, int n) {  
        String toTransform = null == pwd ? "" : pwd;  
        StringBuffer temp = new StringBuffer();  
        for (int i = 0; i < n; i++)  
            temp.append("0");  
        return temp.toString() + toTransform + temp.toString();  
    }  
  
    /** 
     *  
     * ��ָ���ַ�������Nλ,��N<0��Ϊ���� 
     *  
     * @param src 
     *            Դ�ַ��� 
     * @param n 
     *            ���Ƶ�λ�� 
     * @return ����һ������Nλ���ַ��� 
     */  
    private String rightMove(String src, int n) {  
        if (src == null || src.length() == 0) {  
            return src;  
        }  
        boolean isRight = true;  
        int absN = n;  
        if (n < 0) {  
            isRight = false;  
            absN = -n;  
        }  
        int cnt = absN > src.length() ? absN % src.length() : absN;  
        if (0 == cnt) {  
            return src;  
        }  
        if (isRight) {  
            // ����cntλ  
            String temp1 = src.substring(src.length() - cnt, src.length());  
            String temp2 = src.substring(0, src.length() - cnt);  
            return temp1 + temp2;  
        } else {  
            // ����cntλ  
            String temp1 = src.substring(0, cnt);  
            String temp2 = src.substring(cnt, src.length());  
            return temp2 + temp1;  
        }  
    }  
  
    /** 
     *  
     * �Ѷ�Ӧ��������ֳ�2���֣�ǰ�벿��8���ַ�������˳���ѱ�������ӵ��м� 
     *  
     * @param pwd 
     *            �������� 
     * @param salt 
     *            ��Ӧ������� 
     * @return ����һ�������������������ӵ��ַ��� 
     */  
    private String joinSaltAndPwd(String salt, String pwd) {  
        if(salt.length()!=SALT_LENGTH){  
            // saltֵ�ĳ���������Ĳ�����У���ʱ����ܻ���֣�  
            // ����pwd+salt  
            return pwd+salt;  
        }  
        String temp1 = salt.substring(0, 8);  
        String temp2 = salt.substring(8, salt.length());  
        return temp2 + pwd + temp1;  
    }  
  
    /** 
     *  
     * ʹ�ü����㷨���ж�μ��� 
     *  
     * @param joinStr 
     *            �����ַ��� 
     * @return ����һ����μ��ܺ���ַ��� 
     */  
    private String encodeJoinStr(String joinStr) {  
  
        if (joinStr == null)  
            return null;  
  
        String temp = joinStr;  
  
        for (int i = 0; i < this.ENCODE_COUNT; i++) {  
  
            temp = this.encrypt(temp);  
        }  
        return temp;  
    }  
  
    /** 
     * ���ֽ����������16�����ַ��� 
     *  
     * @param bts 
     * @return 
     */  
    private String bytes2Hex(byte[] bts) {  
        StringBuffer des = new StringBuffer();  
        String tmp = null;  
        for (int i = 0; i < bts.length; i++) {  
            tmp = (Integer.toHexString(bts[i] & 0xFF));  
            if (tmp.length() == 1) {  
                des.append("0");  
            }  
            des.append(tmp);  
        }  
        return des.toString();  
    }  
  
    /** 
     * ��16�����ַ���������ֽ����� 
     *  
     * @param hexStr 
     * @return 
     */  
    private byte[] hex2Bytes(String hexStr) {  
        if ((hexStr.length() % 2) != 0) {  
            return new byte[] {};  
        }  
        byte[] ret = new byte[hexStr.length() / 2];  
        for (int i = 0; i < hexStr.length() / 2; i++) {  
  
            ret[i] = (byte) (Long.decode("0x"  
                    + hexStr.substring(i * 2, i * 2 + 2)) & 0xFF);  
        }  
        return ret;  
    }  
  
    /** 
     *  
     * ����SHA-256��Դ�ַ������м��� 
     *  
     * @param src 
     * @return ���ؼ��ܴ���ע�������У��մ���ʾ����ʧ�� 
     */  
    private String encrypt(String src) {  
  
        // Դ�ַ���ת����byte����  
        try {  
            byte[] btSource = src.getBytes(CHAR_SET);  
            // �˴�ѡ����SHA-256�����㷨,ʵ�ʿ�ѡ���㷨��"MD2��MD5��SHA-1��SHA-256��SHA-384��SHA-512"  
            MessageDigest md = MessageDigest.getInstance(this.ENCODE_TYPE);  
            md.reset();  
            md.update(btSource);  
            String result = bytes2Hex(md.digest()); // to HexString  
            return result;  
        } catch (NoSuchAlgorithmException e) {  
            return "";  
        } catch (UnsupportedEncodingException e) {  
            return "";  
        }  
    }  
  
    public static void main(String args[]) throws Exception {  
        SHAEncrypt demo = new SHAEncrypt();  
        String str = "123456";  
        long startTime = System.currentTimeMillis();  
        String encPwd = demo.encryptPwd(str);  
        System.out.println("encrypt time costs:"  
                + (System.currentTimeMillis() - startTime));  
        System.out.println("encrypted pwd:" + encPwd + ",length:"  
                + encPwd.length());  
        System.out.println(demo.validatePwd(str, encPwd));  
        System.out.println(new String(demo.hex2Bytes(encPwd), "UTF-8"));  
    }  
}
