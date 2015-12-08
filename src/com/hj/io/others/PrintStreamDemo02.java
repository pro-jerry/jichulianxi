package com.hj.io.others;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class PrintStreamDemo02 {

	public static void main(String[] args) throws FileNotFoundException {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println(sc.nextLine());
		System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream("d:/4.txt")),true));
		System.out.println("123");
		System.out.println("abc");
	}
}
