package com.hj.thread.status;

public class YieldDemo01 extends Thread{

	public static void main(String[] args) throws InterruptedException {
		
		YieldDemo01 demo = new YieldDemo01();
		Thread t =new Thread(demo);//新生
		t.start();//就绪
		
		
		for(int i=0;i<1000;i++){
			if(i%20==0){
				//暂停本线程main
				Thread.yield();
			}
			System.out.println("main .... "+i);
		}
	}
	
	public void run() {

		for (int i = 0; i < 1000; i++) {
			System.out.println("yield..." + i);
		}
	}
}
