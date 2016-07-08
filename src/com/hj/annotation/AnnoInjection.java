package com.hj.annotation;

import java.lang.reflect.Field;

public class AnnoInjection {

	public static void getBean(Object obj){
		
		try{
			Field[] ff = obj.getClass().getDeclaredFields();
			for(Field f:ff){
				Seven s = f.getAnnotation(Seven.class);
				if(null!=s){
					System.out.println("注入:"+f.getName()+"属性:"+s. value());
				}
			}
		}catch(Exception e){
			
		}
		
	}
}
