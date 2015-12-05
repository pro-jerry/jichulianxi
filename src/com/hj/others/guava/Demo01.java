package com.hj.others.guava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.google.common.collect.ImmutableList;

public class Demo01 {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		
		//对原有的List进行包装，相当于原有的List的一个视图，快照，不够安全
		List<String> readList = Collections.unmodifiableList(list);
//		readList.add("d");
		list.add("d");
		
		//对比查看,初始化List
		List<String> immutableList = ImmutableList.of("a","b","c");
		//java.lang.UnsupportedOperationException
		immutableList.add("d");
		
	}
}
