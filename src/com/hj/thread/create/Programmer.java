package com.hj.thread.create;

/**
 * 使用Runnable
 * @author Administrator
 *
 */
public class Programmer implements Runnable{

	@Override
	public void run() {

		for(int i=0;i<100;i++){
			System.out.println("111-->"+i);
		}
	}

	
}
