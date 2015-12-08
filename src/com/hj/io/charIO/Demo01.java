package com.hj.io.charIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

/**
 * 纯文本读取
 * @author Administrator
 *
 */
public class Demo01 {

	public static void main(String[] args) throws IOException {
		
		//创建源
		File src = new File("d:/2.txt");
		//选择流
		Reader reader = null;
		try {
			reader = new FileReader(src);
			char[] flush = new char[10];
			int len = 0;
			while((len=reader.read(flush))!=-1){
				
				String str = new String(flush, 0, len);
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			
			if(reader!=null){
				reader.close();
			}
		}
		
		
	}
}
