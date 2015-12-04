package com.hj.others.three;

import java.util.EnumMap;

/**
 * EnumMap要求键为枚举
 * @author Administrator
 *
 */
public class EnumMapDemo {

	public static void main(String[] args) {
		
		EnumMap<Season, String> map = new EnumMap<Season, String>(Season.class);
		//存放值
		map.put(Season.SPRING, "春天");
		map.put(Season.AUTUMN, "秋衣");
		map.put(Season.SUMMMER, "夏天");
		map.put(Season.WINNER, "冬天");
		
		System.out.println(map.size());
	}
	
}

//季节
enum Season{
	
	SPRING,SUMMMER,AUTUMN,WINNER
}
