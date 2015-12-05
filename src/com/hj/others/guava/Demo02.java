package com.hj.others.guava;

import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

/**
 * 函数式编程
 * 1.Predicate
 * 2.Function
 * 
 * 工具: Collections2.filter() 过滤器
 * 
 * @author Administrator
 *
 */
public class Demo02 {

	public static void main(String[] args) {
		
		//组合式函数编程
		//确保字符串中的长度不超过5，超过进行拦截，后全部大写
		List<String> list = Lists.newArrayList("bjx","a","sorry22222");
		//确保字符串中的长度不超过5，超过进行拦截
		Function<String,String> f1 =  new Function<String, String>() {

			@Override
			public String apply(String input) {

				return input.length()>5?input.substring(0,5):input;
			}
			
		};
		//全部大写
		Function<String,String> f2 =  new Function<String, String>() {

			@Override
			public String apply(String input) {

				return input.toUpperCase();
			}
			
		};
		//String=f2(f1(String))
		Function<String, String> f = Functions.compose(f1, f2);
		Collection<String> resultCol = Collections2.transform(list, f);
		for(String temp:resultCol){
			
			System.out.println(temp);
		}
		
		
	}
	
	/**
	 * 转换
	 */
	public static void test2(){
		
		// 类型转换
		Set<Long> timeSet = Sets.newHashSet();
		timeSet.add(10000000L);
		timeSet.add(999999999999999L);
		timeSet.add(200000000000000L);

		Collection<String> timeStrCol = Collections2.transform(timeSet,
				new Function<Long, String>() {

					@Override
					public String apply(Long input) {
						// TODO Auto-generated method stub
						return new SimpleDateFormat("yyyy-MM-dd ")
								.format(input);
					}
				});
		for (String temp : timeStrCol) {

			System.out.println(temp);
		}
	}
	
	/**
	 * 过滤器
	 */
	public static void test1(){
		
		// 创建Lits 静态初始化
		List<String> list = Lists.newArrayList("mo", "ap", "as", "ad");
		// 找出回文
		// 匿名内部类对象:匿名内部类，同时创建类对象
		Collection<String> palindromeList = Collections2.filter(list,
				new Predicate<String>() {

					@Override
					public boolean apply(String input) {

						return new StringBuilder(input).reverse().toString()
								.equals(input);
					}

				});
		for (String temp : palindromeList) {

			System.out.println(temp.toString());
		}
	}
	
}
