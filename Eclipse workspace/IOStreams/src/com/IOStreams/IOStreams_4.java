package com.IOStreams;

import java.io.FileReader;
import java.util.Scanner;

public class IOStreams_4 {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please Enter location and filename : ");
		String fileName = sc.nextLine();
		sc.close();
		FileReader fr = new FileReader(fileName);
		String data = "";
		int val = fr.read();
		while(val != -1) {
			data += (char)val;
			val = fr.read();
		}
		fr.close();
		String[] str = data.split(" ");
		System.out.println("Number of Words : "+str.length);
		int count = 0;
		for(int i = 0; i < str.length; i++) {
			if(str[i].equals("Java")) {
				count+=1;
			}
		}
		fr.close();
		System.out.println("Number of similar words : "+count);
	}

}
