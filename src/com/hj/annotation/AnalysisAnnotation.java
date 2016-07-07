package com.hj.annotation;

import java.lang.reflect.Method;

import javax.swing.text.rtf.RTFEditorKit;

public class AnalysisAnnotation {

	public static void main(String[] args) throws ClassNotFoundException {
		
		Class rt_class = Class.forName("com.hj.annotation.Utility");
		Method[] methods = rt_class.getMethods();
		boolean flag = rt_class.isAnnotationPresent(Description.class);
		if(flag){
			
			Description description = (Description) rt_class.getAnnotation(Description.class);
			System.out.println(description.value());
			for(Method method:methods){
				if(method.isAnnotationPresent(Author.class)){
					Author author = method.getAnnotation(Author.class);
					System.out.println(author.name()+"---"+author.group());
				}
			}
		}
	}
}
