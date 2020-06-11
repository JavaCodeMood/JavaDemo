package com.lhf.java2;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.zip.ZipOutputStream;

import org.apache.commons.lang3.StringUtils;

import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;
import net.lingala.zip4j.model.ZipParameters;
import net.lingala.zip4j.util.Zip4jConstants;

/**
 * 
 * @ClassName: ZipFileUtil.java
 * @Description: 对文件进行压缩并加密工具类
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019年10月18日 下午2:56:15
 */
public class ZipFileUtil {

	/**
	 * 方法一 加密1，winrar，好压2345可直接输入密码解压 根据filepath读取文件并加密返回
	 */
	public static void zipFileAndEncrypt(String filePath, String zipFileName, String password) {
		try {
			ZipParameters parameters = setParam(password);
			// 压缩文件,并生成压缩文件
			ArrayList<File> filesToAdd = new ArrayList<File>();
			File file = new File(filePath);
			filesToAdd.add(file);

			ZipFile zipFile = new ZipFile(zipFileName);
			zipFile.addFiles(filesToAdd, parameters);// this line does works
			System.err.println("end");
		} catch (ZipException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 方法二 加密1，winrar，好压2345可直接输入密码解压
	 */
	public static void zipFileStream(InputStream is, String zipFileName, String password) {
		try {
			ZipParameters parameters = setParam(password);
			// addStream,多设置两个参数，缺一不可
			parameters.setFileNameInZip("XxlJobController.java");
			parameters.setSourceExternalStream(true);

			ZipFile zipFile = new ZipFile(zipFileName);
			zipFile.addStream(is, parameters);
		} catch (ZipException e) {
			e.printStackTrace();
		}
	}

	public static ZipParameters setParam(String password) {
		// 设置压缩文件参数
		ZipParameters parameters = new ZipParameters();
		// 设置压缩方法
		parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
		// 设置压缩级别
		parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
		// 设置压缩文件是否加密
		parameters.setEncryptFiles(true);
		// 设置aes加密强度
		parameters.setAesKeyStrength(Zip4jConstants.AES_STRENGTH_256);
		// 设置加密方法
		parameters.setEncryptionMethod(Zip4jConstants.ENC_METHOD_AES);
		// 设置密码
		parameters.setPassword(password.toCharArray());
		return parameters;
	}

	/**
	 * 
	 * @Title: zipFilesAndEncrypt  压缩指定路径下的文件
	 * @Description: 将指定路径下的文件压缩至指定zip文件，并以指定密码加密,若密码为空，则不进行加密保护
	 * @param srcFileName 待压缩文件路径
	 * @param zipFileName zip文件名
	 * @param password    加密密码
	 * @return
	 * @throws Exception
	 */
	public static void zipFilesAndEncrypt(String srcFileName, String zipFileName, String password) throws Exception {

		ZipOutputStream outputStream = null;
		System.out.println("进入测试类");
		if (StringUtils.isEmpty(srcFileName) || StringUtils.isEmpty(zipFileName)) {
			//log.error("请求的压缩路径或者文件名有误");
			return;
		}
		try {
			ZipParameters parameters = new ZipParameters();
			parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
			parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
			if (!StringUtils.isEmpty(password)) {
				parameters.setEncryptFiles(true);
				parameters.setEncryptionMethod(Zip4jConstants.ENC_METHOD_AES);
				parameters.setAesKeyStrength(Zip4jConstants.AES_STRENGTH_256);
				parameters.setPassword(password);
			}
			ArrayList<File> filesToAdd = new ArrayList<File>();
			File file = new File(srcFileName);
			File[] files = new File[0];
			if (file.isDirectory()) {
				files = file.listFiles();
				for (int i = 0; i < files.length; i++) {
					filesToAdd.add(new File(srcFileName + files[i].getName()));
					System.out.println("文件名称：" + files[i].getName());
				}
			} else {
				filesToAdd.add(new File(srcFileName + file.getName()));
			}
			ZipFile zipFile = new ZipFile(srcFileName + zipFileName + ".zip");
			zipFile.addFiles(filesToAdd, parameters);
		} catch (Exception e) {
			System.out.println("文件压缩出错");
			//log.error("文件压缩出错", e);
			throw e;
		}
	}

	public static void main(String[] args) throws Exception {
		try {
			long l1 = System.currentTimeMillis();

			// 加密,addFile
			// ZipFileUtil.zipFileAndEncrypt("F:\\XxlJobController.java","F:\\XxlJobController.zip","123456");

			// 加密，addStream
			//InputStream in = new FileInputStream("F:\\XxlJobController.java");
			//ZipFileUtil.zipFileStream(in, "F:\\XxlJobController.zip", "123456");
			
			ZipFileUtil.zipFilesAndEncrypt("F:\\", "XxlJobController", "123456");

			long l2 = System.currentTimeMillis();
			System.out.println((l2 - l1) + "毫秒.");
			System.out.println(((l2 - l1) / 1000) + "秒.");
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
