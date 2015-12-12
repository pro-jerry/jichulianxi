package com.hj.thread.status;

/**
 * join:合并线程
 * @author Administrator
 *
 */
public class JoinDemo01 extends Thread{

	public static void main(String[] args) throws InterruptedException {
		
		JoinDemo01 demo = new JoinDemo01();
		Thread t =new Thread(demo);//新生
		t.start();//就绪
		
		
		for(int i=0;i<1000;i++){
			if(i==50){
				t.join();//main阻塞
			}
			System.out.println("main .... "+i);
		}
	}
	
	public void run(){
		
		for(int i=0;i<1000;i++){
			System.out.println("join..."+i);
		}
	}
}
