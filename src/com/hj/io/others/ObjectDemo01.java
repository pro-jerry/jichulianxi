package com.hj.io.others;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectDemo01 {

	public static void main(String[] args) throws Exception {
		
//		seri("d:/3.txt");
		read("d:/3.txt");
	}
	
	//反序列化
	public static void read(String destPath) throws Exception{
		
		File src = new File(destPath);
		ObjectInputStream ois = 
				new ObjectInputStream(new BufferedInputStream(new FileInputStream(src)));
		
		Object obj = ois.readObject();
		if(obj instanceof Employee){
			
			Employee emp= (Employee) obj;
			System.out.println(emp.getName());
		}
		
		
		
	}
	
	
	//序列化
	public static void seri(String destPath) throws Exception{
		
		Employee emp = new Employee("be",12000);
		File dest = new File(destPath);
		
		ObjectOutputStream dos = 
				new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(dest)));
		
		dos.writeObject(emp);
		dos.close();
	}
	
}
