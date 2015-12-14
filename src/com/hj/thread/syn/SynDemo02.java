package com.hj.thread.syn;

/**
 * 单例设计模式:确保一个类只有一个对象
 * @author Administrator
 *
 */
public class SynDemo02 {

	public static void main(String[] args) {
		
		JvmThread thread1 = new JvmThread(100);
		JvmThread thread2 = new JvmThread(500);
		
		thread1.start();
		thread2.start();
		
		
	}
}

class JvmThread extends Thread{
	
	private long time;
	
	public JvmThread(){
		
	}
	
	public JvmThread(long time){
		this.time = time;
	}
	
	@Override
	public void run() {
		
		System.out.println(Thread.currentThread().getName()+"创建对象===>"+Jvm.getInstance2(time));
	}
}


/**
 * 单例模式懒汉模式
 * @author Administrator
 *
 */
class Jvm{
	
	//声明一个私有的静态变量
	private static Jvm  instance = null;
	//构造器私有化，避免外部直接创建对象
	private Jvm(){
		
	}
	//创建一个对外的公共的静态方法访问该变量，如果变量没有对象，创建该对象
	public static synchronized Jvm getInstance2(long time){
		
		if(instance==null){
			
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			instance = new Jvm();
		}
		return instance;
	}
	
	public static Jvm getInstance1(long time) {

		if (instance == null) {

			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			instance = new Jvm();
		}
		return instance;
	}
}
