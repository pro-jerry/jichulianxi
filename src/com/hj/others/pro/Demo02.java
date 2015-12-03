package com.hj.others.pro;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 使用Properties输出到文件
 * 资源配置文件
 * @author Administrator
 *
 */
public class Demo02 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		// 创建对象
		Properties pro = new Properties();
		// 存储
		pro.setProperty("driver", "orcale.jdbc.driver.OracleDriver");
		pro.setProperty("url", "jdbc:orcale:thin:@localhost:1521:orcl");
		pro.setProperty("user", "root");
		pro.setProperty("pwd", "123456");
		
//		pro.store(new FileOutputStream(new File("d:/db.properties")), "db配置");
//		pro.storeToXML(new FileOutputStream(new File("d:/db1.properties")),"db配置");
		
		//使用相对路径
//		pro.store(new FileOutputStream(new File("db.properties")), "db配置");
		pro.store(new FileOutputStream(new File("src/db.properties")), "db配置");

	
	}
}
