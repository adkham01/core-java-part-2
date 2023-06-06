package com.IOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOStreams_6 {

	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("D:/Pictures/forJava.jpg");
		int size = fis.available();
		byte[] b = new byte[size];
		fis.read(b);
		fis.close();
		
		FileOutputStream fos = new FileOutputStream("D:/Java workplaces/FileOutputStream/copy.jpg");
		fos.write(b);
		System.out.println("Data copy is finished Succes!");
		fos.close();
		
	}

}
