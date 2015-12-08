package com.hj.io.util;

import java.io.Closeable;
import java.io.IOException;

public class FileUitl {

	/**
	 * 工具类关闭流
	 * @param args
	 */
	public static void close(String info,Closeable ... io) {
		
		for(Closeable temp:io){
			
			if(temp!=null){
				try {
					temp.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
