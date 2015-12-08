package com.hj.io.others;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 字节数组节点流
 * @author Administrator
 *
 */
public class ByteArrayDemo01 {

	
	public static void main(String[] args) throws Exception {
		
//		read();
	}
	
	/**
	 * 输出流
	 * @throws IOException
	 */
	public static byte[] write() throws IOException{
		
		//目的地
		byte[] dest;
		//选择流 不同点
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		String msg = "1234567";
		byte[] info = msg.getBytes();
		
		bos.write(info, 0, info.length);
		//获取数据
		dest = bos.toByteArray();
		//释放资源
		bos.close();
		
		return dest;
	}
	
	
	
	public static void read(byte[] src1) throws IOException{
		
		String msg = "1234567";
		byte[] src = msg.getBytes();
		
		//选择流
		InputStream is = new BufferedInputStream(new ByteArrayInputStream(src));
		
		//操作
		byte[] flush = new byte[1024];
		int len=0;
		while((len=is.read(flush))!=-1){
			System.out.println(new String(flush,0,len));
		}
		//释放资源
		is.close();
		
		
	}
}
