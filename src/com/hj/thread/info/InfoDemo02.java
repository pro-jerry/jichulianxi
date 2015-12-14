package com.hj.thread.info;

/**
 * 优先级代表的是概率并不是绝对的优先级
 * @author Administrator
 *
 */
public class InfoDemo02 {

	public static void main(String[] args) throws InterruptedException {
		
		MyThread it = new MyThread();
		Thread p1 = new Thread(it,"IT");
		
		MyThread it2 = new MyThread();
		Thread p2 = new Thread(it2,"IT2");
		
		p1.setPriority(2);
		p2.setPriority(1);
		
		p1.start();
		p2.start();
		
		Thread.sleep(100);
		it.stop();
		it2.stop();
	}
}
