package com.IOStreams;

import java.io.FileReader;
import java.io.FileWriter;

public class IOStreams_8 {

	public static void main(String[] args) throws Exception{
		FileReader fr = new FileReader("D:\\core java\\Core Java Lectures\\10.+Exception+Handling.pdf0");
		String data = "";
		int val = fr.read();
		while(val != -1) {
			data += (char)val;
			val = fr.read();
		}
		FileWriter fw = new FileWriter("D:\\Java workplaces\\FileOutputStream/Exception.pdf");
		char[] c = data.toCharArray();
		fw.write(c);
		System.out.println("Data copy is finished Succes! ");
		fr.close();
		fw.close();
		
	}

}
