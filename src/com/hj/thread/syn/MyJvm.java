package com.hj.thread.syn;

/**
 * 单例创建的方式
 * 1.懒汉式
 * 1).构造器私有化
 * 2).声明私有的静态属性
 * 3).对外提供访问属性的静态方法，确保该对象存在
 * @author Administrator
 *
 */
public class MyJvm {

	private MyJvm(){
		
	}
	
	private static MyJvm instance;
	
	private static MyJvm getInstance(){
		
		if(instance==null){//提高效率
			synchronized (MyJvm.class) {
				if(instance==null){ //安全
					
					instance = new MyJvm();
				}
			}
		}
		
		return instance;
	}
}

/**
 * 饿汉式
 * 1.构造器私有化
 * 2.声明私有的静态属性，同时创建该对象
 * 3.对外提供访问属性的静态方法
 * @author Administrator
 *
 */
 class MyJvm2 {

	private MyJvm2(){
		
	}
	
	private static MyJvm2 instance = new MyJvm2();
	
	private static MyJvm2 getInstance(){
		
		return instance;
	}
}
 
 /**
  * 类在使用的时候加载，延缓加载时机
  * @author Administrator
  *
  */
 class MyJvm3 {

		private MyJvm3(){
			
		}
		
		private static  class JVMHolder{
			private static MyJvm3 instance = new MyJvm3();
		}
		private static MyJvm3 getInstance(){
			
			return JVMHolder.instance;
		}
	}

