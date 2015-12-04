package com.hj.others.three;

import java.util.WeakHashMap;

/**
 * weakHashMap 键为弱类型，gc立即回收
 * @author Administrator
 *
 */
public class WeakHashMapDemo {

	public static void main(String[] args) {
		
		WeakHashMap<String, String> map = new WeakHashMap<String, String>();
		//测试数据
		//常量池对象不会回收
		map.put("abc", "a");
		map.put("d", "tets");
		//gc运行已被回收
		map.put(new String(""), "d");
		
		//通知回收
		System.gc();
		System.runFinalization();
		System.out.println(map.size());
	}
}
