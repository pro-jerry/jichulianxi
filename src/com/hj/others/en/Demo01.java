package com.hj.others.en;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Enumeration的使用
 * @author Administrator
 *
 */
public class Demo01 {

	
	public static void main(String[] args) {
		
		Vector<String> vector = new Vector<String>();
		vector.add("javase");
		vector.add("html");
		vector.add("oracle");
		
		//遍历该Vector
		Enumeration<String> en = vector.elements();
		while(en.hasMoreElements()){
			System.out.println(en.nextElement());
		}
		
	}
}
