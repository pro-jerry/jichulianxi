package com.hj.io.byteIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 
 * @author Administrator
 *
 */
public class CopyFile {

	public static void main(String[] args) throws Exception {
		
		
	}
	
	/**
	 * 文件的拷贝
	 */
	
	public static void copyFile(String srcPath,String destPath) throws Exception{
		
		File src = new File(srcPath);
		File dest = new File(destPath);
		//选择流
		InputStream is = new FileInputStream(src);
		OutputStream out = new FileOutputStream(dest);
		//文件的拷贝 	循环+读取+写出
		byte[] flush = new byte[1024];
		int len=0;
		//读取
		while((len=(is.read(flush)))!=-1){
			//写出
			out.write(flush, 0, len);
			
		}
		out.flush();
		//关闭输出流
		out.close();
		is.close();
		
	}
	
}
