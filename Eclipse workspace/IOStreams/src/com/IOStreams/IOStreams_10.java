package com.IOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IOStreams_10 {

	public static void main(String[] args) {
		try (
				FileInputStream fis = new 
				FileInputStream("D:\\core java\\Core Java Lectures\\2.+Steps+To+Prepare+First+Java+Application.pdf");	
				FileOutputStream fos = new 
				FileOutputStream("D:\\Java workplaces\\FileOutputStream/Step.pdf");
			){
			int size = fis.available();
			byte[] b = new byte[size];
			fis.read(b);
			fos.write(b);
			System.out.println("Data transfer finished Succes!");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
                                          