package com.IOStreams;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;
class FilesInJava {
	void method_1() throws IOException {
		File f = new File("D:/Java workplaces/FileOutputStream/file1.txt");
		System.out.println("Is File Created? : "+f.isFile());
		f.createNewFile();
		System.out.println("Is File Created? : "+f.isFile());
		System.out.println("File name is : "+f.getName());
		System.out.println("File Parent : "+f.getParent());
		System.out.println("Absalut Path : "+f.getAbsolutePath());
	}
	void method_2() throws IOException {
		File file = new File("D:/Java workplaces/FileOutputStream/file2.txt");
		file.createNewFile();
		FileOutputStream fos = new FileOutputStream(file);
		String data = "Welcome to Core Java part I";
		byte[] b = data.getBytes(); 
		System.out.println("Data Writing Success!");
		fos.write(b);
		fos.close();
	}
	void method_3() throws IOException {
		File file = new File("D:/Java workplaces/FileOutputStream/file2.txt");
		FileInputStream fis = new FileInputStream(file);
		int size = fis.available();
		byte[] b = new byte[size];
		fis.read(b);
		String data = new String(b);
		System.out.println("Data Reading Success!");
		System.out.println(data);
		fis.close();
		
	}
	void method_4() throws IOException {
		File file = new File("D:/Java workplaces/FileOutputStream/file3.txt");
		file.createNewFile();
		FileWriter fw = new FileWriter(file);
		String data = "Welcome Java Programming Language Features";
		char[] c = data.toCharArray();
		fw.write(c);
		System.out.println("Data Writing Success!");
		fw.close();
		
		FileReader fr = new FileReader(file);
		String dataNew = "";
		int val = fr.read();
		while (val != -1) {
			dataNew += (char)val;
			val =fr.read();
		}
		System.out.println("\nData Reading Success!");
		System.out.println(dataNew);
		fr.close();
		
	}
	void method_5() throws IOException {
		File file = new File("D:/Java workplaces/FileOutputStream/Folder");
		file.mkdir();
		System.out.println("Folder is Created Success! : "+file.isDirectory());
		System.out.println("Folder Name : "+file.getName());
		System.out.println("Folder Parent Name : "+file.getParent());
		System.out.println("Folder Absalut Path : "+file.getAbsolutePath());
	}
	void method_6() throws IOException {
		RandomAccessFile f = new RandomAccessFile("D:/Java workplaces/FileOutputStream/file3.txt", "rw");
		f.writeInt(12345);
		f.writeUTF("Adham");
		f.writeFloat(865.23f);
		f.writeUTF("Hyd");
		f.seek(0);
		System.out.println("Employee Details");
		System.out.println("--------------------------");
		System.out.println("Employee ID     : "+f.readInt());
		System.out.println("Employee Name   : "+f.readUTF());
		System.out.println("Employee Salary : "+f.readFloat());
		System.out.println("Employee Addres : "+f.readUTF());
	}
}
public class IOStreams_18 {

	public static void main(String[] args) throws Exception{
		FilesInJava f = new FilesInJava();
		f.method_6();
	}

}
