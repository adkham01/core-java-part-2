package com.IOStreams;


import java.io.FileReader;

public class IOStreams_3 {

	public static void main(String[] args) throws Exception {
		try (FileReader fr = new FileReader("‪D:\\Core Java Lectures\\4.+PATTERNS.pdf")) {
			String data = "";
			int val = fr.read();
			while(val != -1) {
				data += (char)val;
				val = fr.read();
			}
			System.out.println(data);
		}
		
	}

}
