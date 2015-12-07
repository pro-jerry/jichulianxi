package com.hj.io.byteIO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Demo01 {

	public static void main(String[] args) throws Exception {
		
		//1.建立联系 File对象
		File src = new File("d:/2.txt");
		//2.选择文件输出流
		InputStream is = new FileInputStream(src);
		//3.不断的读取缓冲数组
		byte[] car = new byte[10];
		int len=0;//接收 实际读取大小
		//循环读取
		while((len=is.read(car))!=-1){
			//输出 字节数组转成字符串
			String info = new String(car,0,len);
			System.out.println(info);
		}
		
	}
}
