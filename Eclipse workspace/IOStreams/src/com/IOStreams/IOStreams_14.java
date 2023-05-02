package com.IOStreams;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class User implements Serializable {
	String uid;
	String usname;
	transient String upwd;
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getUsname() {
		return usname;
	}
	public void setUsname(String usname) {
		this.usname = usname;
	}
	public String getUpwd() {
		return upwd;
	}
	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}
	

	void getUserDetails() {
		System.out.println("User Details");
		System.out.println("-------------------------");
		System.out.println("User ID       : "+getUid());
		System.out.println("User Name     : "+getUsname());
		System.out.println("User Password : "+getUpwd());
	}
}
public class IOStreams_14 {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("D:/Java workplaces/FileOutputStream/user.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		User ur = new User();
		ur.setUid("A-111");
		ur.setUsname("Adham");
		ur.setUpwd("123456");
		oos.writeObject(ur);
		System.out.println("Serialization Success!");
		fos.close();
		oos.close();
		
	}

}
