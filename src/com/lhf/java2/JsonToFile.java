package com.lhf.java2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Random;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

/**
 *
 * @ClassName: JsonToFile.java
 * @Description: ��json����д���ļ� 
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019��10��18�� ����12:28:58
 */
public class JsonToFile {
	public static void main(String[] args) throws IOException {
        //Random random=new Random();//����randomʵ�����󣬳����л��ã����ڲ��������
        Tool tool=new Tool();//������ʽ��json�ַ���������
        JSONArray jsonArray=new JSONArray();//����JSONArray����
        File file=new File("F://Test.json");
        if(!file.exists())//�ж��ļ��Ƿ���ڣ������������½�
        {
            file.createNewFile();
        }
        FileOutputStream fileOutputStream=new FileOutputStream(file);//ʵ����FileOutputStream
        OutputStreamWriter outputStreamWriter=new OutputStreamWriter(fileOutputStream,"utf-8");//���ַ���ת��Ϊ�ֽ���
        BufferedWriter bufferedWriter= new BufferedWriter(outputStreamWriter);//�����ַ��������������

       
        String jsonString = "[{\"addrtypeid\":1,\"addrtypename\":\"������\",\"buildingid\":4,\"buildingname\":\"���Ǵ����\",\"candidate\":\"������\",\"candidateid\":\"397672e0-f6ff-490e-9b30-b4236fb14b59\",\"cityid\":1,\"cityname\":\"����\",\"contractstaff\":\"helunhe(�ؾ�);\",\"contractstaffid\":21241,\"creater\":\"kals\",\"createtime\":\"2017-03-14 15:12:46\",\"endtime\":\"10:00\",\"floorid\":9,\"floorname\":\"6¥\",\"formid\":301367,\"genderid\":138,\"hrinterviewid\":645,\"hrinterviewname\":\"kals\",\"id\":2,\"interviewdate\":\"2017-03-14 00:00:00\",\"interviewerstaffchnname\":\"����\",\"interviewerstaffid\":86888,\"interviewerstaffname\":\"v_qiili\",\"interviewerstaffsex\":\"Ů\",\"interviewid\":499,\"interviewplanid\":1045,\"interviewstyleid\":1,\"interviewstylename\":\"�绰����\",\"interviewtypeid\":1,\"interviewtypename\":\"����\",\"ishidepost\":0,\"otheraddr\":\"\",\"outlookcc\":\"\",\"roomid\":1013,\"roomname\":\"612\",\"starttime\":\"9:00\"}, {\"addrtypeid\":1,\"addrtypename\":\"������\",\"buildingid\":4,\"buildingname\":\"���Ǵ����\",\"candidate\":\"������\",\"candidateid\":\"397672e0-f6ff-490e-9b30-b4236fb14b59\",\"cityid\":1,\"cityname\":\"����\",\"contractstaff\":\"helunhe(�ؾ�);\",\"contractstaffid\":21241,\"creater\":\"kals\",\"createtime\":\"2017-03-14 15:12:46\",\"endtime\":\"18:00\",\"floorid\":6,\"floorname\":\"3¥\",\"formid\":301367,\"genderid\":138,\"hrinterviewid\":645,\"hrinterviewname\":\"kals\",\"id\":3,\"interviewdate\":\"2017-03-14 00:00:00\",\"interviewerstaffchnname\":\"����\",\"interviewerstaffid\":86888,\"interviewerstaffname\":\"v_qiili\",\"interviewerstaffsex\":\"Ů\",\"interviewid\":504,\"interviewplanid\":1050,\"interviewstyleid\":3,\"interviewstylename\":\"QQ��Ƶ����\",\"interviewtypeid\":1,\"interviewtypename\":\"����\",\"ishidepost\":0,\"otheraddr\":\"\",\"outlookcc\":\"\",\"roomid\":346,\"roomname\":\"����-���Ǵ�314\",\"starttime\":\"17:00\"}, {\"addrtypeid\":1,\"addrtypename\":\"������\",\"buildingid\":56,\"buildingname\":\"��Ѷ����\",\"candidate\":\"������\",\"candidateid\":\"397672e0-f6ff-490e-9b30-b4236fb14b59\",\"cityid\":1,\"cityname\":\"����\",\"contractstaff\":\"helunhe(�ؾ�);\",\"contractstaffid\":21241,\"creater\":\"kals\",\"createtime\":\"2017-03-14 15:12:46\",\"endtime\":\"12:30\",\"floorid\":57,\"floorname\":\"19¥\",\"formid\":301367,\"genderid\":138,\"hrinterviewid\":645,\"hrinterviewname\":\"kals\",\"id\":4,\"interviewdate\":\"2017-03-14 00:00:00\",\"interviewerstaffchnname\":\"����\",\"interviewerstaffid\":86888,\"interviewerstaffname\":\"v_qiili\",\"interviewerstaffsex\":\"Ů\",\"interviewid\":505,\"interviewplanid\":1051,\"interviewstyleid\":3,\"interviewstylename\":\"QQ��Ƶ����\",\"interviewtypeid\":2,\"interviewtypename\":\"���Թٶ��1\",\"ishidepost\":0,\"otheraddr\":\"\",\"outlookcc\":\"\",\"roomid\":1224,\"roomname\":\"1902\",\"starttime\":\"12:00\"}, {\"addrtypeid\":1,\"addrtypename\":\"������\",\"buildingid\":56,\"buildingname\":\"��Ѷ����\",\"candidate\":\"������\",\"candidateid\":\"397672e0-f6ff-490e-9b30-b4236fb14b59\",\"cityid\":1,\"cityname\":\"����\",\"contractstaff\":\"helunhe(�ؾ�);\",\"contractstaffid\":21241,\"creater\":\"kals\",\"createtime\":\"2017-03-14 15:12:46\",\"endtime\":\"12:30\",\"floorid\":57,\"floorname\":\"19¥\",\"formid\":301367,\"genderid\":138,\"hrinterviewid\":645,\"hrinterviewname\":\"kals\",\"id\":5,\"interviewdate\":\"2017-03-14 00:00:00\",\"interviewerstaffchnname\":\"����\",\"interviewerstaffid\":77939,\"interviewerstaffname\":\"v_jifzhang\",\"interviewerstaffsex\":\"Ů\",\"interviewid\":505,\"interviewplanid\":1052,\"interviewstyleid\":3,\"interviewstylename\":\"QQ��Ƶ����\",\"interviewtypeid\":2,\"interviewtypename\":\"���Թٶ��1\",\"ishidepost\":0,\"otheraddr\":\"\",\"outlookcc\":\"\",\"roomid\":1224,\"roomname\":\"1902\",\"starttime\":\"12:00\"}, {\"addrtypeid\":1,\"addrtypename\":\"������\",\"buildingid\":4,\"buildingname\":\"���Ǵ����\",\"candidate\":\"������\",\"candidateid\":\"397672e0-f6ff-490e-9b30-b4236fb14b59\",\"cityid\":1,\"cityname\":\"����\",\"contractstaff\":\"helunhe(�ؾ�);\",\"contractstaffid\":21241,\"creater\":\"kals\",\"createtime\":\"2017-03-14 15:12:46\",\"endtime\":\"15:30\",\"floorid\":6,\"floorname\":\"3¥\",\"formid\":301367,\"genderid\":138,\"hrinterviewid\":645,\"hrinterviewname\":\"kals\",\"id\":6,\"interviewdate\":\"2017-03-14 00:00:00\",\"interviewerstaffchnname\":\"����\",\"interviewerstaffid\":86888,\"interviewerstaffname\":\"v_qiili\",\"interviewerstaffsex\":\"Ů\",\"interviewid\":506,\"interviewplanid\":1053,\"interviewstyleid\":1,\"interviewstylename\":\"�绰����\",\"interviewtypeid\":1,\"interviewtypename\":\"����\",\"ishidepost\":0,\"otheraddr\":\"\",\"outlookcc\":\"\",\"roomid\":346,\"roomname\":\"����-���Ǵ�314\",\"starttime\":\"15:00\"}, {\"addrtypeid\":1,\"addrtypename\":\"������\",\"buildingid\":4,\"buildingname\":\"���Ǵ����\",\"candidate\":\"������\",\"candidateid\":\"397672e0-f6ff-490e-9b30-b4236fb14b59\",\"cityid\":1,\"cityname\":\"����\",\"contractstaff\":\"helunhe(�ؾ�);\",\"contractstaffid\":21241,\"creater\":\"kals\",\"createtime\":\"2017-03-14 15:12:46\",\"endtime\":\"10:00\",\"floorid\":6,\"floorname\":\"3¥\",\"formid\":301367,\"genderid\":138,\"hrinterviewid\":645,\"hrinterviewname\":\"kals\",\"id\":7,\"interviewdate\":\"2017-03-14 00:00:00\",\"interviewerstaffchnname\":\"����\",\"interviewerstaffid\":56251,\"interviewerstaffname\":\"rodickwu\",\"interviewerstaffsex\":\"��\",\"interviewid\":507,\"interviewplanid\":1054,\"interviewstyleid\":2,\"interviewstylename\":\"�ֳ�����\",\"interviewtypeid\":1,\"interviewtypename\":\"����\",\"ishidepost\":0,\"otheraddr\":\"\",\"outlookcc\":\"\",\"roomid\":996,\"roomname\":\"313\",\"starttime\":\"9:00\"}]";
        //String jsonString=jsonArray.toString();//��jsonarray����ת��Ϊ�ַ���
        String JsonString=tool.stringToJSON(jsonString);//��jsonarrray�ַ�����ʽ��
        bufferedWriter.write(JsonString);//����ʽ����jsonarray�ַ���д���ļ�
        bufferedWriter.flush();//��ջ�������ǿ���������
        bufferedWriter.close();//�ر������
        System.out.println("json����д�����");
    }

}
