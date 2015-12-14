package com.hj.thread.info;

public class InfoDemo01 {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread t1 = new MyThread();
		Thread proxy = new Thread(t1,"TT");
		proxy.setName("XX");
		System.out.println(proxy.getName());
		proxy.start();
		System.out.println(Thread.currentThread().getName());//main
		
		System.out.println("启动后的状态:"+proxy.isAlive());
		
		Thread.sleep(2);
		t1.stop();
		Thread.sleep(200);
		System.out.println("停止后的状态："+proxy.isAlive());
	}
}
