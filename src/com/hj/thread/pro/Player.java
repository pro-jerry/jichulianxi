package com.hj.thread.pro;

/**
 * 生产者
 * @author Administrator
 *
 */
public class Player implements Runnable{

	private Movie m;

	public Player(Movie m) {
		super();
		this.m = m;
	}

	@Override
	public void run() {

		for(int i=0;i<20;i++){
			if(i%2==0){
				m.play("左青龙");
			}else{
				m.play("右白虎");
			}
		}
	}

}
