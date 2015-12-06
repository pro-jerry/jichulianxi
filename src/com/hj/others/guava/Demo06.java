package com.hj.others.guava;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.commons.collections4.map.HashedMap;

import com.google.common.collect.ArrayListMultimap;

/**
 * 查看教师教授的每门课程
 * @author Administrator
 *
 */
public class Demo06 {

	public static void main(String[] args) {
		
		Map<String,String> cours = new HashedMap<String, String>();
		//加入测试数据
		cours.put("改革开放", "等");
		cours.put("123", "345");
		cours.put("ads", "aaaa");
		cours.put("a", "b");
		
		ArrayListMultimap<String, String> teachers = ArrayListMultimap.create();
		//迭代器
		Iterator<Map.Entry<String, String>> it = cours.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<String, String> entry = it.next();
			String key = entry.getKey();//课程
			String value = entry.getValue();//教师
			
			teachers.put(key, value);
		}
		
		Set<String> keyset =teachers.keySet();
		for(String key:keyset){
			Collection<String> col = teachers.get(key);
			System.out.println(key+"----"+col);
		}
		
	}
}
