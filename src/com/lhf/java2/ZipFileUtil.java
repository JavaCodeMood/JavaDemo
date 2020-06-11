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
 * @Description: ���ļ�����ѹ�������ܹ�����
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019��10��18�� ����2:56:15
 */
public class ZipFileUtil {

	/**
	 * ����һ ����1��winrar����ѹ2345��ֱ�����������ѹ ����filepath��ȡ�ļ������ܷ���
	 */
	public static void zipFileAndEncrypt(String filePath, String zipFileName, String password) {
		try {
			ZipParameters parameters = setParam(password);
			// ѹ���ļ�,������ѹ���ļ�
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
	 * ������ ����1��winrar����ѹ2345��ֱ�����������ѹ
	 */
	public static void zipFileStream(InputStream is, String zipFileName, String password) {
		try {
			ZipParameters parameters = setParam(password);
			// addStream,����������������ȱһ����
			parameters.setFileNameInZip("XxlJobController.java");
			parameters.setSourceExternalStream(true);

			ZipFile zipFile = new ZipFile(zipFileName);
			zipFile.addStream(is, parameters);
		} catch (ZipException e) {
			e.printStackTrace();
		}
	}

	public static ZipParameters setParam(String password) {
		// ����ѹ���ļ�����
		ZipParameters parameters = new ZipParameters();
		// ����ѹ������
		parameters.setCompressionMethod(Zip4jConstants.COMP_DEFLATE);
		// ����ѹ������
		parameters.setCompressionLevel(Zip4jConstants.DEFLATE_LEVEL_NORMAL);
		// ����ѹ���ļ��Ƿ����
		parameters.setEncryptFiles(true);
		// ����aes����ǿ��
		parameters.setAesKeyStrength(Zip4jConstants.AES_STRENGTH_256);
		// ���ü��ܷ���
		parameters.setEncryptionMethod(Zip4jConstants.ENC_METHOD_AES);
		// ��������
		parameters.setPassword(password.toCharArray());
		return parameters;
	}

	/**
	 * 
	 * @Title: zipFilesAndEncrypt  ѹ��ָ��·���µ��ļ�
	 * @Description: ��ָ��·���µ��ļ�ѹ����ָ��zip�ļ�������ָ���������,������Ϊ�գ��򲻽��м��ܱ���
	 * @param srcFileName ��ѹ���ļ�·��
	 * @param zipFileName zip�ļ���
	 * @param password    ��������
	 * @return
	 * @throws Exception
	 */
	public static void zipFilesAndEncrypt(String srcFileName, String zipFileName, String password) throws Exception {

		ZipOutputStream outputStream = null;
		System.out.println("���������");
		if (StringUtils.isEmpty(srcFileName) || StringUtils.isEmpty(zipFileName)) {
			//log.error("�����ѹ��·�������ļ�������");
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
					System.out.println("�ļ����ƣ�" + files[i].getName());
				}
			} else {
				filesToAdd.add(new File(srcFileName + file.getName()));
			}
			ZipFile zipFile = new ZipFile(srcFileName + zipFileName + ".zip");
			zipFile.addFiles(filesToAdd, parameters);
		} catch (Exception e) {
			System.out.println("�ļ�ѹ������");
			//log.error("�ļ�ѹ������", e);
			throw e;
		}
	}

	public static void main(String[] args) throws Exception {
		try {
			long l1 = System.currentTimeMillis();

			// ����,addFile
			// ZipFileUtil.zipFileAndEncrypt("F:\\XxlJobController.java","F:\\XxlJobController.zip","123456");

			// ���ܣ�addStream
			//InputStream in = new FileInputStream("F:\\XxlJobController.java");
			//ZipFileUtil.zipFileStream(in, "F:\\XxlJobController.zip", "123456");
			
			ZipFileUtil.zipFilesAndEncrypt("F:\\", "XxlJobController", "123456");

			long l2 = System.currentTimeMillis();
			System.out.println((l2 - l1) + "����.");
			System.out.println(((l2 - l1) / 1000) + "��.");
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
