package com.IOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOStreams_7 {

	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("D:\\core java\\Core Java Lectures\\IO+Streams.pdf");
		int size = fis.available();
		byte[] b = new byte[size];
		fis.read(b);
		fis.close();
		
		FileOutputStream fos = new FileOutputStream("D:/Java workplaces/FileOutputStream/IOStream.pdf",false);
		fos.write(b);
		System.out.println("Data copy is Succes!");
		fos.close();
	}

}
