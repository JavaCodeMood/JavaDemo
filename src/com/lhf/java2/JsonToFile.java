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
 * @Description: 将json数据写入文件 
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019年10月18日 下午12:28:58
 */
public class JsonToFile {
	public static void main(String[] args) throws IOException {
        //Random random=new Random();//创建random实例对象，程序中会用，用于产生随机数
        Tool tool=new Tool();//创建格式化json字符串工具类
        JSONArray jsonArray=new JSONArray();//创建JSONArray对象
        File file=new File("F://Test.json");
        if(!file.exists())//判断文件是否存在，若不存在则新建
        {
            file.createNewFile();
        }
        FileOutputStream fileOutputStream=new FileOutputStream(file);//实例化FileOutputStream
        OutputStreamWriter outputStreamWriter=new OutputStreamWriter(fileOutputStream,"utf-8");//将字符流转换为字节流
        BufferedWriter bufferedWriter= new BufferedWriter(outputStreamWriter);//创建字符缓冲输出流对象

       
        String jsonString = "[{\"addrtypeid\":1,\"addrtypename\":\"会议室\",\"buildingid\":4,\"buildingname\":\"飞亚达大厦\",\"candidate\":\"吕文轶\",\"candidateid\":\"397672e0-f6ff-490e-9b30-b4236fb14b59\",\"cityid\":1,\"cityname\":\"深圳\",\"contractstaff\":\"helunhe(贺君);\",\"contractstaffid\":21241,\"creater\":\"kals\",\"createtime\":\"2017-03-14 15:12:46\",\"endtime\":\"10:00\",\"floorid\":9,\"floorname\":\"6楼\",\"formid\":301367,\"genderid\":138,\"hrinterviewid\":645,\"hrinterviewname\":\"kals\",\"id\":2,\"interviewdate\":\"2017-03-14 00:00:00\",\"interviewerstaffchnname\":\"李琪\",\"interviewerstaffid\":86888,\"interviewerstaffname\":\"v_qiili\",\"interviewerstaffsex\":\"女\",\"interviewid\":499,\"interviewplanid\":1045,\"interviewstyleid\":1,\"interviewstylename\":\"电话面试\",\"interviewtypeid\":1,\"interviewtypename\":\"单面\",\"ishidepost\":0,\"otheraddr\":\"\",\"outlookcc\":\"\",\"roomid\":1013,\"roomname\":\"612\",\"starttime\":\"9:00\"}, {\"addrtypeid\":1,\"addrtypename\":\"会议室\",\"buildingid\":4,\"buildingname\":\"飞亚达大厦\",\"candidate\":\"吕文轶\",\"candidateid\":\"397672e0-f6ff-490e-9b30-b4236fb14b59\",\"cityid\":1,\"cityname\":\"深圳\",\"contractstaff\":\"helunhe(贺君);\",\"contractstaffid\":21241,\"creater\":\"kals\",\"createtime\":\"2017-03-14 15:12:46\",\"endtime\":\"18:00\",\"floorid\":6,\"floorname\":\"3楼\",\"formid\":301367,\"genderid\":138,\"hrinterviewid\":645,\"hrinterviewname\":\"kals\",\"id\":3,\"interviewdate\":\"2017-03-14 00:00:00\",\"interviewerstaffchnname\":\"李琪\",\"interviewerstaffid\":86888,\"interviewerstaffname\":\"v_qiili\",\"interviewerstaffsex\":\"女\",\"interviewid\":504,\"interviewplanid\":1050,\"interviewstyleid\":3,\"interviewstylename\":\"QQ视频面试\",\"interviewtypeid\":1,\"interviewtypename\":\"单面\",\"ishidepost\":0,\"otheraddr\":\"\",\"outlookcc\":\"\",\"roomid\":346,\"roomname\":\"深圳-飞亚达314\",\"starttime\":\"17:00\"}, {\"addrtypeid\":1,\"addrtypename\":\"会议室\",\"buildingid\":56,\"buildingname\":\"腾讯大厦\",\"candidate\":\"吕文轶\",\"candidateid\":\"397672e0-f6ff-490e-9b30-b4236fb14b59\",\"cityid\":1,\"cityname\":\"深圳\",\"contractstaff\":\"helunhe(贺君);\",\"contractstaffid\":21241,\"creater\":\"kals\",\"createtime\":\"2017-03-14 15:12:46\",\"endtime\":\"12:30\",\"floorid\":57,\"floorname\":\"19楼\",\"formid\":301367,\"genderid\":138,\"hrinterviewid\":645,\"hrinterviewname\":\"kals\",\"id\":4,\"interviewdate\":\"2017-03-14 00:00:00\",\"interviewerstaffchnname\":\"李琪\",\"interviewerstaffid\":86888,\"interviewerstaffname\":\"v_qiili\",\"interviewerstaffsex\":\"女\",\"interviewid\":505,\"interviewplanid\":1051,\"interviewstyleid\":3,\"interviewstylename\":\"QQ视频面试\",\"interviewtypeid\":2,\"interviewtypename\":\"面试官多对1\",\"ishidepost\":0,\"otheraddr\":\"\",\"outlookcc\":\"\",\"roomid\":1224,\"roomname\":\"1902\",\"starttime\":\"12:00\"}, {\"addrtypeid\":1,\"addrtypename\":\"会议室\",\"buildingid\":56,\"buildingname\":\"腾讯大厦\",\"candidate\":\"吕文轶\",\"candidateid\":\"397672e0-f6ff-490e-9b30-b4236fb14b59\",\"cityid\":1,\"cityname\":\"深圳\",\"contractstaff\":\"helunhe(贺君);\",\"contractstaffid\":21241,\"creater\":\"kals\",\"createtime\":\"2017-03-14 15:12:46\",\"endtime\":\"12:30\",\"floorid\":57,\"floorname\":\"19楼\",\"formid\":301367,\"genderid\":138,\"hrinterviewid\":645,\"hrinterviewname\":\"kals\",\"id\":5,\"interviewdate\":\"2017-03-14 00:00:00\",\"interviewerstaffchnname\":\"丹丹\",\"interviewerstaffid\":77939,\"interviewerstaffname\":\"v_jifzhang\",\"interviewerstaffsex\":\"女\",\"interviewid\":505,\"interviewplanid\":1052,\"interviewstyleid\":3,\"interviewstylename\":\"QQ视频面试\",\"interviewtypeid\":2,\"interviewtypename\":\"面试官多对1\",\"ishidepost\":0,\"otheraddr\":\"\",\"outlookcc\":\"\",\"roomid\":1224,\"roomname\":\"1902\",\"starttime\":\"12:00\"}, {\"addrtypeid\":1,\"addrtypename\":\"会议室\",\"buildingid\":4,\"buildingname\":\"飞亚达大厦\",\"candidate\":\"吕文轶\",\"candidateid\":\"397672e0-f6ff-490e-9b30-b4236fb14b59\",\"cityid\":1,\"cityname\":\"深圳\",\"contractstaff\":\"helunhe(贺君);\",\"contractstaffid\":21241,\"creater\":\"kals\",\"createtime\":\"2017-03-14 15:12:46\",\"endtime\":\"15:30\",\"floorid\":6,\"floorname\":\"3楼\",\"formid\":301367,\"genderid\":138,\"hrinterviewid\":645,\"hrinterviewname\":\"kals\",\"id\":6,\"interviewdate\":\"2017-03-14 00:00:00\",\"interviewerstaffchnname\":\"李琪\",\"interviewerstaffid\":86888,\"interviewerstaffname\":\"v_qiili\",\"interviewerstaffsex\":\"女\",\"interviewid\":506,\"interviewplanid\":1053,\"interviewstyleid\":1,\"interviewstylename\":\"电话面试\",\"interviewtypeid\":1,\"interviewtypename\":\"单面\",\"ishidepost\":0,\"otheraddr\":\"\",\"outlookcc\":\"\",\"roomid\":346,\"roomname\":\"深圳-飞亚达314\",\"starttime\":\"15:00\"}, {\"addrtypeid\":1,\"addrtypename\":\"会议室\",\"buildingid\":4,\"buildingname\":\"飞亚达大厦\",\"candidate\":\"吕文轶\",\"candidateid\":\"397672e0-f6ff-490e-9b30-b4236fb14b59\",\"cityid\":1,\"cityname\":\"深圳\",\"contractstaff\":\"helunhe(贺君);\",\"contractstaffid\":21241,\"creater\":\"kals\",\"createtime\":\"2017-03-14 15:12:46\",\"endtime\":\"10:00\",\"floorid\":6,\"floorname\":\"3楼\",\"formid\":301367,\"genderid\":138,\"hrinterviewid\":645,\"hrinterviewname\":\"kals\",\"id\":7,\"interviewdate\":\"2017-03-14 00:00:00\",\"interviewerstaffchnname\":\"吴倚\",\"interviewerstaffid\":56251,\"interviewerstaffname\":\"rodickwu\",\"interviewerstaffsex\":\"男\",\"interviewid\":507,\"interviewplanid\":1054,\"interviewstyleid\":2,\"interviewstylename\":\"现场面试\",\"interviewtypeid\":1,\"interviewtypename\":\"单面\",\"ishidepost\":0,\"otheraddr\":\"\",\"outlookcc\":\"\",\"roomid\":996,\"roomname\":\"313\",\"starttime\":\"9:00\"}]";
        //String jsonString=jsonArray.toString();//将jsonarray数组转化为字符串
        String JsonString=tool.stringToJSON(jsonString);//将jsonarrray字符串格式化
        bufferedWriter.write(JsonString);//将格式化的jsonarray字符串写入文件
        bufferedWriter.flush();//清空缓冲区，强制输出数据
        bufferedWriter.close();//关闭输出流
        System.out.println("json数据写入完毕");
    }

}
