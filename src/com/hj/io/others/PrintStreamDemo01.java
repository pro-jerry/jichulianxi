package com.hj.io.others;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

/**
 * PrintStream 打印流
 * @author Administrator
 *
 */
public class PrintStreamDemo01 {

	public static void main(String[] args) throws FileNotFoundException {
		
		PrintStream ps = System.out;
		ps.println(false);
		
		File src = new File("d:/1.txt");
		//输出到文件
		ps = new PrintStream(new BufferedOutputStream(new FileOutputStream(src)));
		ps.print("io ....");
		ps.close();
	}
}
