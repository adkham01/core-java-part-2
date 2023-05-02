package com.IOStreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOStreams_11 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter data : ");
		String data = br.readLine();
		System.out.print("Enter  data again : ");
		int val = br.read();
		System.out.println("readlinr() : "+data);
		System.out.println("read()     : "+val+" [ "+(char)val+" ] ");
	}

}
