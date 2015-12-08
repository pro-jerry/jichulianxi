package com.hj.io.charIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/**
 * 
 * @author Administrator
 *
 */
public class Demo02 {

	public static void main(String[] args) {
		
		//创建源
		File desc = new File("d:/1.txt");
		//选择流
		Writer wr = null;
		try {
			wr = new FileWriter(desc);
			//写出
			String msg="123\r\n456\r\n789\r\n";
			wr.write(msg);
			wr.append("asdfg");
			wr.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			
			if(wr!=null){
				try {
					wr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
