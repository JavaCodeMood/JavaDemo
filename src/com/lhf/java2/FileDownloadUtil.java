package com.lhf.java2;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @ClassName: FileDownloadUtil.java
 * @Description: �ļ����ع�����
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019��10��18�� ����5:00:50
 */
public class FileDownloadUtil {

	/**
	 * @Description:�ļ�����
	 *
	 * @param filePath  Ҫ���ص��ļ�·��
	 * @param response
	 * @param isOnLine  �Ƿ���������
	 * @throws Exception      
	 * @throws���쳣����
	 * @author:liuhefei
	 */
	public static void downLoad(String filePath, HttpServletResponse response, boolean isOnLine) throws Exception {
		File f = new File(filePath);
		if (!f.exists()) {
			response.sendError(404, "File not found!");
			return;
		}
		BufferedInputStream br = new BufferedInputStream(new FileInputStream(f));
		byte[] buf = new byte[1024];
		int len = 0;

		response.reset(); // �ǳ���Ҫ
		if (isOnLine) { // ���ߴ򿪷�ʽ
			URL u = new URL("file:///" + filePath);
			response.setContentType(u.openConnection().getContentType());
			response.setHeader("Content-Disposition", "inline; filename=" + f.getName());
			// �ļ���Ӧ�ñ����UTF-8
		} else { // �����ط�ʽ
			response.setContentType("application/x-msdownload");
			response.setHeader("Content-Disposition", "attachment; filename=" + f.getName());
		}
		OutputStream out = response.getOutputStream();
		while ((len = br.read(buf)) > 0)
			out.write(buf, 0, len);
		br.close();
		out.close();
	}

	/*----------------------------------------------------------------------------*/
	
	/**
	 * @Description:�ļ�����
	 *
	 * @param path  �����ص��ļ���·����
	 * @param response
	 * @return      
	 * @throws���쳣����
	 * @author:liuhefei
	 */
	public HttpServletResponse download(String path, HttpServletResponse response) {
		try {
			// path��ָ�����ص��ļ���·����
			File file = new File(path);
			// ȡ���ļ�����
			String filename = file.getName();
			// ȡ���ļ��ĺ�׺����
			String ext = filename.substring(filename.lastIndexOf(".") + 1).toUpperCase();

			// ��������ʽ�����ļ���
			InputStream fis = new BufferedInputStream(new FileInputStream(path));
			byte[] buffer = new byte[fis.available()];
			fis.read(buffer);
			fis.close();
			// ���response
			response.reset();
			// ����response��Header
			response.addHeader("Content-Disposition", "attachment;filename=" + new String(filename.getBytes()));
			response.addHeader("Content-Length", "" + file.length());
			OutputStream toClient = new BufferedOutputStream(response.getOutputStream());
			response.setContentType("application/octet-stream");
			toClient.write(buffer);
			toClient.flush();
			toClient.close();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return response;
	}

	/**
	 * @Description: �ļ�����
	 *
	 * @param filePath  �ļ��Ĵ��·��
	 * @param fileName  �ļ����غ���ļ���
	 * @param response
	 * @throws FileNotFoundException      
	 * @throws���쳣����
	 * @author:liuhefei
	 */
	public void downloadLocal(String filePath,String fileName, HttpServletResponse response) throws FileNotFoundException {
		// ���ر����ļ�
		//String fileName = "Operator.doc".toString(); // �ļ���Ĭ�ϱ�����
		// ��������
		InputStream inStream = new FileInputStream(filePath);// �ļ��Ĵ��·��
		// ��������ĸ�ʽ
		response.reset();
		response.setContentType("bin");
		response.addHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");
		// ѭ��ȡ�����е�����
		byte[] b = new byte[100];
		int len;
		try {
			while ((len = inStream.read(b)) > 0)
				response.getOutputStream().write(b, 0, len);
			inStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @Description:  ���������ļ�
	 *
	 * @param filePath   �ļ���ַ
	 * @param fileName  ���غ󱣴���ļ���
	 * @param response
	 * @throws MalformedURLException      
	 * @throws���쳣����
	 * @author:liuhefei
	 */
	public void downloadNet(String filePath,String fileName, HttpServletResponse response) throws MalformedURLException {
		// ���������ļ�
		int bytesum = 0;
		int byteread = 0;

		URL url = new URL(filePath);

		try {
			URLConnection conn = url.openConnection();
			InputStream inStream = conn.getInputStream();
			FileOutputStream fs = new FileOutputStream(fileName);

			byte[] buffer = new byte[1204];
			int length;
			while ((byteread = inStream.read(buffer)) != -1) {
				bytesum += byteread;
				System.out.println(bytesum);
				fs.write(buffer, 0, byteread);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
    public static void main(String[] args) {
    	 try {
    		 HttpServletResponse response = null;
        	 String filePath = "http://i0.hdslb.com/bfs/article/f59c8d1e59148b2a4a1e0eb5237e34e4dd7d6449.jpg";
        	FileDownloadUtil.downLoad(filePath, response, true);
    	 }catch(Exception e) {
    		 System.out.println(e.getMessage());
    	 }
	}

}
