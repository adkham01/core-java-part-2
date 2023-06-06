package com.IOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOStreams_9 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("D:\\core java\\Core Java Lectures\\1.+Introduction.pdf");
			int size = fis.available();
			byte[] b = new byte[size];
			fis.read(b);
			fis.close();
			
			fos = new FileOutputStream("D:\\Java workplaces\\FileOutputStream/intro.pdf");
			fos.write(b);
			System.out.println("Data transfer finished Succes!");
			fos.close();
					
		} 
		catch (Exception e) {
			e.printStackTrace();
			System.out.println(e);
			System.out.println(e.getMessage());
		}
		finally {
			try {
				fis.close();
				fos.close();
			} 
			catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
