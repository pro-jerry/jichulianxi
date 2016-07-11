package com.hj.annotation1;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class AnnotationTest {

	public static void main(String[] args) throws Exception {
		
		Person p = new Person();
		
		Field[] fields = p.getClass().getDeclaredFields();
		for(Field field:fields){
			
			Test1 test = field.getAnnotation(Test1.class);
			if(null!=test){
					p.getClass().getDeclaredMethod("set"+field.getName()
							.substring(0, 1).toUpperCase()
							+field.getName().substring(1), new Class[]{String.class})
							.invoke(p, test.description());
			}
		}
	}
}
