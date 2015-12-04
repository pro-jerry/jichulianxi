package com.hj.others.synread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 使用Collections同步管理容器
 * @author Administrator
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		//list可以同步
		List<String> synList=Collections.synchronizedList(list);
		System.out.println("线程安全的List制作完毕:");
		
		
		
	}
	
}
