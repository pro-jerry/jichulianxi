package com.hj.others.pro;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * 使用Properties读取配置文件
 * 资源配置文件
 * @author Administrator
 *
 */
public class Demo03 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Properties pro = new Properties();
		//读取绝对路径
		pro.load(new FileReader("d:/db.properties"));
		System.out.println(pro.getProperty("user","r"));
	}
}
