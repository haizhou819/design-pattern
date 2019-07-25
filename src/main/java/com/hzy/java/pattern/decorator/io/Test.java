package com.hzy.java.pattern.decorator.io;

import java.io.FileInputStream;
import java.io.IOException;

public class Test {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("E:\\text\\music.txt");
		byte[] b = new byte[6];
		int len;
		StringBuffer sBuffer=new StringBuffer();
		while((len = fis.read(b)) != -1){
			System.out.println(len);
			sBuffer.append(new String(b, 0, len));
		}
		System.out.println(sBuffer.toString());
		fis.close();
	}
}
