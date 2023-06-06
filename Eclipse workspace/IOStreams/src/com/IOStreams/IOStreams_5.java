package com.IOStreams;

import java.io.FileInputStream;


public class IOStreams_5 {

	public static void main(String[] args) throws Exception{
		FileInputStream fis = new FileInputStream("D:/Java workplaces/FileOutputStream/java.txt");
		int size= fis.available();
		byte[] b = new byte[size];
		fis.read(b);
		String data = new String(b);
		String[] tokens = data.split(" ");
		System.out.println("Number of words "+tokens.length);
		int countWords  = 0;
		for(String s : tokens) {
			if(s.equals("Java")) {
				countWords++;
			}
		}
		fis.close();
		System.out.println("Number of Similar words : "+countWords);

	}

}
