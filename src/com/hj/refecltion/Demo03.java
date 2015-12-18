package com.hj.refecltion;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import com.hj.refecltion.bean.User;

/**
 * 通过反射的API动态的操作:构造器，方法，属性
 * @author Administrator
 *
 */
public class Demo03 {

	public static void main(String[] args) {
		
		String  path ="com.hj.refecltion.bean.User";
		try {
			Class<User> clazz = (Class<User>) Class.forName(path);
			
			//通过反射调用构造方法，构造对象
			User u =  clazz.newInstance();//其实调用了User的无参构造方法
			System.out.println(u);
			
			Constructor<User> c = clazz.getDeclaredConstructor(int.class,int.class,String.class);
			User u2 = c.newInstance(1001,18,"小王");
			System.out.println(u2.getUname());
			
			//通过反射API调用普通方法
			User u3 = clazz.newInstance();
			u3.setUname("小唐");
			Method method = clazz.getDeclaredMethod("setUname", String.class);
			method.invoke(u3, "小高");//动态调用
			System.out.println(u3.getUname());
			
			//通过反射API调用属性
			User u4 = clazz.newInstance();
			Field f = clazz.getDeclaredField("uname");
			f.setAccessible(true);//这个属性不同做安全监测，直接访问
			f.set(u4, "效果");//通过反射直接写属性的值
			System.out.println(u4.getUname());
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
