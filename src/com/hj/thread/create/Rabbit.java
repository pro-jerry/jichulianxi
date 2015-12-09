package com.hj.thread.create;

/**
 * 模拟龟兔赛跑
 * @author Administrator
 *
 */
public class Rabbit extends Thread{

	@Override
	public void run() {
		
		for(int i=0;i<100;i++){
			System.out.println("兔子跑了"+i);
		}
	}
}



