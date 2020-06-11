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
 * @Description: 文件下载工具类
 *
 * @version: v1.0.0
 * @author: liuhefei
 * @date: 2019年10月18日 下午5:00:50
 */
public class FileDownloadUtil {

	/**
	 * @Description:文件下载
	 *
	 * @param filePath  要下载的文件路径
	 * @param response
	 * @param isOnLine  是否在线下载
	 * @throws Exception      
	 * @throws：异常描述
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

		response.reset(); // 非常重要
		if (isOnLine) { // 在线打开方式
			URL u = new URL("file:///" + filePath);
			response.setContentType(u.openConnection().getContentType());
			response.setHeader("Content-Disposition", "inline; filename=" + f.getName());
			// 文件名应该编码成UTF-8
		} else { // 纯下载方式
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
	 * @Description:文件下载
	 *
	 * @param path  欲下载的文件的路径。
	 * @param response
	 * @return      
	 * @throws：异常描述
	 * @author:liuhefei
	 */
	public HttpServletResponse download(String path, HttpServletResponse response) {
		try {
			// path是指欲下载的文件的路径。
			File file = new File(path);
			// 取得文件名。
			String filename = file.getName();
			// 取得文件的后缀名。
			String ext = filename.substring(filename.lastIndexOf(".") + 1).toUpperCase();

			// 以流的形式下载文件。
			InputStream fis = new BufferedInputStream(new FileInputStream(path));
			byte[] buffer = new byte[fis.available()];
			fis.read(buffer);
			fis.close();
			// 清空response
			response.reset();
			// 设置response的Header
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
	 * @Description: 文件下载
	 *
	 * @param filePath  文件的存放路径
	 * @param fileName  文件下载后的文件名
	 * @param response
	 * @throws FileNotFoundException      
	 * @throws：异常描述
	 * @author:liuhefei
	 */
	public void downloadLocal(String filePath,String fileName, HttpServletResponse response) throws FileNotFoundException {
		// 下载本地文件
		//String fileName = "Operator.doc".toString(); // 文件的默认保存名
		// 读到流中
		InputStream inStream = new FileInputStream(filePath);// 文件的存放路径
		// 设置输出的格式
		response.reset();
		response.setContentType("bin");
		response.addHeader("Content-Disposition", "attachment; filename=\"" + fileName + "\"");
		// 循环取出流中的数据
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
	 * @Description:  下载网络文件
	 *
	 * @param filePath   文件网址
	 * @param fileName  下载后保存的文件名
	 * @param response
	 * @throws MalformedURLException      
	 * @throws：异常描述
	 * @author:liuhefei
	 */
	public void downloadNet(String filePath,String fileName, HttpServletResponse response) throws MalformedURLException {
		// 下载网络文件
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
