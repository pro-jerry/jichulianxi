package com.hj.others.three;

import java.util.IdentityHashMap;

/**
 * IdentityHashMap 键比较地址去重
 * @author Administrator
 *
 */
public class IdentityHashMapDemo {

	public static void main(String[] args) {
		
		IdentityHashMap<String,String> map = new IdentityHashMap<String, String>();
		map.put("a", "a1");
		map.put("a", "a2");
		System.out.println(map.size());
		
		map.put(new String("a"), "a3");
		map.put(new String("a"), "a4");
		System.out.println(map.size());
		
		
		
		
	}
}
