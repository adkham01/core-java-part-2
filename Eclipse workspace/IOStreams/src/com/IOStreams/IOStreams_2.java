package com.IOStreams;

import java.io.FileReader;


public class IOStreams_2 {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("D:\\Java workplaces\\FileOutputStream/welcome.txt");
		String data = "";
		int val = fr.read();
		while(val != -1) {
			data += (char)val;
			val = fr.read();
		}
		System.out.println(data);
		fr.close();
	}

}
