package com.hj.others.guava;


import java.util.Set;

import com.google.common.collect.HashMultiset;

/**
 * 统计单词出现的次数
 * Multiset :无序+可重复
 * @author Administrator
 *
 */
public class Demo05 {

	public static void main(String[] args) {
		
		String str="This is cat of a math where is a food a";
		//分隔字符串
		String[] strArray = str.split(" ");
		//存储到multiset
		HashMultiset<String> set = HashMultiset.create();
		for(String strTemp:strArray){
			
			set.add(strTemp);
		}
		//获取所有的单词
		Set<String> letters = set.elementSet();
		for(String temp:letters){
			System.out.println(temp+"-->"+set.count(temp));
		}
		
	}
}
