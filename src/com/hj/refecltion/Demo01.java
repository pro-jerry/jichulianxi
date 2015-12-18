package com.hj.refecltion;

/**
 * 测试java.lang.Class对象的获取方式
 * @author Administrator
 *
 */
public class Demo01 {

	public static void main(String[] args) {
		
		String  path ="com.hj.refecltion.bean.User";
		try {
			Class clazz = Class.forName(path);
			System.out.println(clazz);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
				
	}
}
