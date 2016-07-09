package com.hj.annotation;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class AnnoInjection {

	public static Object getBean(Object obj){
		
		try{
			Field[] ff = obj.getClass().getDeclaredFields();
			for(Field f:ff){
				Seven s = f.getAnnotation(Seven.class);
				if(null!=s){
					System.out.println("注入:"+f.getName()+"属性:"+s. value());
					obj.getClass().getMethod("set"+f.getName().substring(0, 1)
							.toUpperCase()+f.getName().substring(1), 
							new Class[]{String.class}).invoke(obj, s.value());
				}
			}
			
			Method[] m = obj.getClass().getDeclaredMethods();
			for(Method mm:m){
				Seven s = mm.getAnnotation(Seven.class);
				if(s!=null){
					System.out.println("注入"+mm.getName()+"方法:"+s.Property());
					mm.invoke(obj, s.Property());
				}
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return obj;
		
	}
}
