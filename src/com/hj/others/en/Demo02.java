package com.hj.others.en;

import java.util.StringTokenizer;

public class Demo02 {

	public static void main(String[] args) {
		
		String emailStr = "BJSXT;123;sada";
		StringTokenizer token = new  StringTokenizer(emailStr,";");
		while(token.hasMoreElements()){
			System.out.println(token.nextElement());
		}
		
	}
}
