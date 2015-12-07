package com.hj.io.file;

import java.io.File;
import java.io.FilenameFilter;

/**
 * 操作目录
 * @author Administrator
 *
 */
public class Demo04 {

	public static void main(String[] args) {
		
		String path = "d:/tet/";
		File  src = new File(path);
		if(src.isDirectory()){
			
			System.out.println("====子文件|目录名========");
			String[] subNames = src.list();
			for(String temp:subNames){
				
				System.out.println(temp);
			}
			
			System.out.println("====子目录|文件File对象====");
			//命令设计模式
			File[] subFiles = src.listFiles(new FilenameFilter() {
				
				@Override
				/**
				 * dir 代表src
				 */
				public boolean accept(File dir, String name) {
					
					System.out.println(dir.getName());
					return new File(dir,name).isFile()&& name.endsWith(".java");
				}
			});
			for(File temp:subFiles){
				System.out.println(temp.getAbsolutePath());
			}
		}
		
	}
	
	public static void test1(){
		
		String path = "d:/tet/1/23";
		File  src = new File(path);
		//创建目录必须确保父目录存在，如果不存在则创建爱失败
//		src.mkdir();
		//创建目录。如果父目录不存在则一同创建
		src.mkdirs();
	}
}
