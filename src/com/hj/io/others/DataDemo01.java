package com.hj.io.others;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 数据类型处理流
 * @author Administrator
 *
 */
public class DataDemo01 {

	public static void main(String[] args) throws IOException {
		
//		write("d:/2.txt");
//		read("d:/2.txt");
		byte[] data =  write();
		System.out.println(data.length);
	}
	
	/**
	 * 从文件读取数据+类型
	 * @throws IOException 
	 */
	public static void read(String destPath) throws IOException{
		
		File src = new File(destPath);
		DataInputStream dis = new DataInputStream(new BufferedInputStream(new FileInputStream(src)));
		
		//操作 读取的顺序与写出一致 必须存在才能读取
		double num1 = dis.readDouble();
		long num2 = dis.readLong();
		String str = dis.readUTF();
		
		System.out.println(num1);
		
	}
	
	/**
	 * 数据+类型输出到文件
	 * @throws IOException 
	 * 
	 */
	public static byte[] write() throws IOException{
		
		//目标数组
		byte[] dest = null;
		
		double point=2.5;
		long num = 100L;
		String str = "数据类型";
		
		//创建源
		//选择流 DataOutputStream
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		DataOutputStream dos = new DataOutputStream(
				new BufferedOutputStream(bos)
				);
		//操作写出的顺序为读取准备
		dos.writeDouble(point);
		dos.writeLong(num);
		dos.writeUTF(str);
		dos.flush();
		dest = bos.toByteArray();
		
		dos.close();
		return dest;
		
		
		
	}
}
