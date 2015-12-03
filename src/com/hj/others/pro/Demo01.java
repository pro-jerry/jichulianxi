package com.hj.others.pro;

import java.util.Properties;

/**
 * Properties资源配置文件的读写
 * 1.key余value只能为字符串
 * 2.存储与读取
 * @author Administrator
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		
		//创建对象
		Properties pro = new Properties();
		//存储
		pro.setProperty("driver", "orcale.jdbc.driver.OracleDriver");
		pro.setProperty("url", "jdbc:orcale:thin:@localhost:1521:orcl");
		pro.setProperty("user", "root");
		pro.setProperty("pwd", "123456");
		
		//获取
		String url =  pro.getProperty("url","test");
		System.out.println(url);
		
		
		
	}
	
}
