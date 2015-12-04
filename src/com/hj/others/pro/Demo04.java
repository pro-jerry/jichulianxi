package com.hj.others.pro;

import java.io.IOException;
import java.util.Properties;

/**
 * 使用类相对路径读取文件
 * @author Administrator
 *
 */
public class Demo04 {

	public static void main(String[] args) throws IOException {
		
		Properties p = new Properties();
		//类相对路径的直接使用
//		p.load(Demo04.class.getResourceAsStream("/com/hj/others/pro/db.properties"));
		//""表示bin
		p.load(Thread.currentThread().getContextClassLoader().getResourceAsStream(""));
		System.out.println(p.getProperty("driver"));
		
		
	}
}
