package com.hj.others.synread;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 只读设置
 * @author Administrator
 *
 */
public class Demo02 {

	public static void main(String[] args) {
		
		Map<String,String> map = new HashMap<String, String>();
		map.put("test", "test");
		map.put("bjsxt", "bjsxt");
		
		//只读控制
		Map<String,String> map2=Collections.unmodifiableMap(map);
//		map2.put("a", "a");
		System.out.println(map2.size());
		
		//一个元素的容器测试
		List<String> list=Collections.singletonList(new String());
		list.add("1");
//		list.add("2"); //只能包含一个元素的容器
	}
	
	public static Set<String> oper(Set<String> set){
		
		if(set==null){
			
			return Collections.EMPTY_SET;//外部获取bimian
		}
		return set;
	}
	
}
