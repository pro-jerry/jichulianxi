package com.hj.io.byteIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 文件的操作
 * @author Administrator
 *
 */
public class FileUtil {

	/**
	 * 文件的拷贝
	 * @param srcPath 源文件的路径
	 * @param destPath 目标文件路径
	 * @throws Exception
	 */
	
	public static void copyFile(String srcPath,String destPath) throws Exception{
		
		copyFile(new File(srcPath),new File(destPath));
		
	}
	
	/**
	 * 文件的拷贝
	 * @param src 源文件的File对象
	 * @param dest	目标文件的File对象
	 * @throws IOException
	 */
	public static void copyFile(File src,File dest) throws IOException{
		
		if(!src.isFile()){
			System.out.println("只能拷贝文件！！");
			throw new IOException("只能拷贝文件！！");
		}
		
		//dest为已经存在的文件夹，不能建立于文件夹同名的文件
		if(dest.isDirectory()){
			System.out.println("不能建立于文件夹同名的文件");
			throw new IOException("不能建立于文件夹同名的文件");
		}
		
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
