package com.hj.others.guava;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;

/**
 * HashMap 键唯一，值可以重复
 * @author Administrator
 *
 */
public class Demo07 {

	public static void main(String[] args) {
		
		BiMap<String, String> bimap = HashBiMap.create();
		bimap.put("xj", "xj@qq.com");
		bimap.put("hj", "hj@163.com");
		
		String user = bimap.inverse().get("hj@163.com");
		System.out.println(user);
		System.out.println(bimap.inverse().inverse()==bimap);
	}
}
