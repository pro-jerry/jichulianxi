package com.hj.refecltion;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 应用反射的API,获取类的反射信息（类的名字，类的属性，类的构造器）
 * @author Administrator
 *
 */
public class Demo02 {

	public static void main(String[] args) throws Exception {
		
		String  path ="com.hj.refecltion.bean.User";
		try {
			Class clazz = Class.forName(path);
			//获取包名+类名
			System.out.println(clazz.getName()); 
			//获取类名
			System.out.println(clazz.getSimpleName());
			
			//获取属性信息
//			Field[] fields = clazz.getFields();//只能获取的public Field
			Field[] fields = clazz.getDeclaredFields(); //获取所有的Field
			Field f = clazz.getDeclaredField("uname");
			System.out.println(f);
			System.out.println(fields.length);
			for(Field temp:fields){
				
				System.out.println("属性:"+temp);
			}
			//获取方法信息
			Method[] methods = clazz.getDeclaredMethods();//获取所有的方法
			for(Method m:methods){
				System.out.println("方法:"+m);
			}
			
			Method method01 = clazz.getDeclaredMethod("getUname", null);
			System.out.println(method01);
			Method method02 = clazz.getDeclaredMethod("setUname", String.class);
			System.out.println(method02);
			
			//获取构造器信息
			Constructor[] constructors = clazz.getConstructors();
			for(Constructor c:constructors){
				System.out.println("构造器:"+c);
			}
			
			Constructor constructor = clazz.getDeclaredConstructor(int.class,int.class,String.class);
			System.out.println(constructor);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
