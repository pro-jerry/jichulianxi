package com.hj.thread.create;

public class Web12306 implements Runnable{

	private int num=50;

	@Override
	public void run() {

		while(true){
			if(num<=0){
				break;
			}
			System.out.println(Thread.currentThread().getName()+"抢到了"+num--);
		}
	}
	
	public static void main(String[] args) {
		
		Web12306 w = new Web12306();
		
		Thread proxy1 = new Thread(w,"XX1");
		Thread proxy2 = new Thread(w,"OO2");
		Thread proxy3 = new Thread(w,"PP3");
		
		proxy1.start();
		proxy2.start();
		proxy3.start();
	}
	
}
