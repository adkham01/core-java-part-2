package com.IOStreams;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class A1{
	void method1() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter first value : ");
		String fval = br.readLine();
		System.out.print("Enter the second value : ");
		String sval = br.readLine();
		System.out.println("Addition : "+(sval+fval));
		int val1 = Integer.parseInt(sval);
		int val2 = Integer.parseInt(sval);
		System.out.println("Addition : "+(val1+val2));
		
	}
	void method2() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Employee Number : ");
		int eno = Integer.parseInt(br.readLine());
		System.out.print("Employee Name   : ");
		String ename = br.readLine();
		System.out.print("Employee Salary : ");
		float esal = Float.parseFloat(br.readLine());
		System.out.print("Employee Addres : ");
		String eaddr = br.readLine();
		
		System.out.println("\nEmployee Details");
		System.out.println("-------------------------");
		System.out.println("Employee Number : "+eno);
		System.out.println("Employee Name   : "+ename);
		System.out.println("Employee Salary : "+esal);
		System.out.println("Employee Addres : "+eaddr);
	}
	void method3() {
		try (
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in))
				
		){
			System.out.print("Enter Student ID    : ");
			String sid = br.readLine();
			System.out.print("Enter Student Name  : ");
			String sname = br.readLine();
			System.out.print("Enter Student Addres " );
			String saddr = br.readLine();
			System.out.print("Enter Student Mark  : ");
			float smark = Float.parseFloat(br.readLine());
			
			System.out.println("\n Student Details");
			System.out.println("------------------------");
			System.out.println("Student ID     : "+sid);
			System.out.println("Stdent Name    : "+sname);
			System.out.println("Student Addres : "+saddr);
			System.out.println("Student Mark   : "+smark);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
public class IOStreams_12 {

	public static void main(String[] args) throws Exception {
		A1 a = new A1();
		a.method3();
		
	}

}
