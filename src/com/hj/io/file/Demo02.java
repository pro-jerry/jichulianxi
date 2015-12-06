package com.hj.io.file;

import java.io.File;

/**
 * 相对路径与绝对路径
 * @author Administrator
 *
 */
public class Demo02 {

	public static void main(String[] args) {
		
		String parentPath="D:/";
		String name="files";
		//相对路径
		File src = new File(parentPath,name);
		src = new File(new File(parentPath),name);
		//输出
		System.out.println(src.getName());
		System.out.println(src.getPath());
		//绝对路径
		src = new File("d:/files");
		System.out.println(src.getName());
		System.out.println(src.getPath());
		//没有盘符以user.dir构建
		src = new File("test.txt");
		System.out.println(src.getName());
		System.out.println(src.getPath());
		System.out.println(src.getAbsolutePath());
	}
}
