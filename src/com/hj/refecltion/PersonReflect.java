package com.hj.refecltion;

import java.lang.reflect.Method;

public class PersonReflect {

	public static void main(String[] args) throws Exception {
		
		Person p = new Person("aaaaaaaaaa");
		p.setName("bbbbbbbbb");
		Class<?> clazz = p.getClass();
		
		Method method1 = clazz.getDeclaredMethod("setName", new Class[]{String.class});
		method1.invoke(p, "my name is hejun");
		Method method = clazz.getDeclaredMethod("getName");
		
		String str = (String) method.invoke(p);
		System.out.println(str);
	}
}
