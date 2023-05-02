package com.IOStreams;

import java.io.FileOutputStream;
public class IOStreams_1 {

	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("D:/Java workplaces/FileOutputStream/java.txt");
		String data = "Java is a high-level, class-based, object-oriented programming language "
				+ "\nthat is designed to have as few implementation dependencies as possible. "
				+ "\n It is a general-purpose programming language intended to let programmers "
				+ "\n write once, run anywhere (WORA),[17] meaning that compiled "
				+ "\n Java code can run on all platforms that support Java without the need to recompile.[18] "
				+ "\nJava applications are typically compiled to bytecode that can run on any Java virtual machine"
				+ "\n (JVM) regardless of the underlying computer architecture. The syntax of Java is similar to C and C++,"
				+ "\n but has fewer low-level facilities than either of them. The Java runtime provides dynamic capabilities"
				+ "\n (such as reflection and runtime code modification) that are typically not available in traditional "
				+ "\n compiled languages. As of 2019, Java was one of the most popular programming languages in use according "
				+ "\nto GitHub,[citation not found][19][20] particularly for client–server web applications, with a reported "
				+ "\n9 million developers.[21] ";
		byte[] b = data.getBytes();
		fos.write(b);
		System.out.println("Data transfered Java application to the target file D:/Java workplaces/FileOutputStream/java.txt");
		fos.close();
		
	}

}
