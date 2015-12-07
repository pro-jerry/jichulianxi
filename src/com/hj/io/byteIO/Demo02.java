package com.hj.io.byteIO;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 
 * @author Administrator
 *
 */
public class Demo02 {

	public static void main(String[] args)  {
		
		//1.建立联系
		File dest = new File("d:/test1.txt");
		
		//2.选择流
		OutputStream os = null;
		try {
			//以追加的形式写出文件
			os = new FileOutputStream(dest,true);
			//3.操作
			String str="jerry is a good man where form \r\n";
			//字符串转字节数组
			byte[] data = str.getBytes();
			try {
				os.write(data);
				os.flush();//强制刷新出去
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally{
				
				if(os!=null){
					try {
						os.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
			
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
	}
}
