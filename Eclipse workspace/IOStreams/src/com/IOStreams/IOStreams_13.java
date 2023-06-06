package com.IOStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {
	int eno;
	String ename;
	float esal;
	String eaddr;
	public Employee(int eno, String ename, float esal, String eaddr) {
		this.eno = eno;
		this.ename = ename;
		this.esal = esal;
		this.eaddr = eaddr;
	}
	public void getEmpDetails() {
		System.out.println("Employee Details");
		System.out.println("--------------------------");
		System.out.println("Employee Number  : "+eno);
		System.out.println("Employee Name    : "+ename);
		System.out.println("Employee Salary  : "+esal);
		System.out.println("Employee Addres  : "+eaddr);
		
	}
}

public class IOStreams_13 {

	public static void main(String[] args) throws Exception{
		FileOutputStream fos = new FileOutputStream("D:/Java workplaces/FileOutputStream/emp.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Employee emp1 = new Employee(111, "Diyor", 5000, "Samarkand");
		Employee emp2 = new Employee(222, "Jamshid", 5500, "Mitan");
		Employee emp3 = new Employee(333, "Yunus", 6000, "Ishtixon");
		System.out.println("Employee Details before Serialization");
		emp1.getEmpDetails();
		emp2.getEmpDetails();
		emp3.getEmpDetails();
		oos.writeObject(emp1);
		fos.close();
		oos.close();
		System.out.println();
		
		FileInputStream fis = new FileInputStream("D:/Java workplaces/FileOutputStream/emp.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee emp4 = (Employee) ois.readObject();
		System.out.println("\nEmployee Details After Deserialization");
		emp4.getEmpDetails();
		fis.close();
		ois.close();
		
	}

}
