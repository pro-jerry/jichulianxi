package com.hj.io.file;

import java.io.File;
import java.io.IOException;

public class Demo03 {

	public static void main(String[] args) throws Exception {

		test3();
	}
	
	//3.创建和删除文件
	public static void test3() throws Exception{
		
		String path = "d:/1.jpg";
		File src= new File(path);
		if(!src.exists()){
			boolean flag = src.createNewFile();
			System.out.println(flag?"成功":"失败");
		}
		
		boolean src1 = src.delete();
		File temp = File.createTempFile("test", ".temp",new File("d:/"));
		Thread.sleep(5000);
		temp.deleteOnExit();
	}
	
	//2.判断信息
	public static void test2(){
		
//		String path ="2.txt";
		String path = "d:/2.txt";
		File src = new File(path);
		System.out.println("判断文件是否存在:"+src.exists());
		//是否可写canWrite()
		System.out.println("文件是否可写:"+src.canWrite());
		//isFile
		if(src.isFile()){
			System.out.println("文件");
		}else{
			System.out.println("文件夹");
		}
		//绝对路径
		System.out.println("是否为绝对路径:"+src.isAbsolute());
		//长度为字节数
		System.out.println(src.length());
	}
	
	
	public  static void test1(){
		
		File src = new File("d:/files");
		System.out.println(src.getName());//返回文件名称
		System.out.println(src.getPath());//如果是绝对路径，返回完整路径，否则相对路径
		System.out.println(src.getAbsolutePath());//返回绝对路径
	}

}
