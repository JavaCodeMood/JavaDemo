package com.lhf.java;

import java.io.File;
import java.io.IOException;

public class FilePath {

	public static void main(String[] args) throws IOException {
		File directory = new File("");// ²ÎÊýÎª¿Õ
		String courseFile = directory.getCanonicalPath();
		System.out.println(courseFile+"\\demoAccount.txt");
	}

}
