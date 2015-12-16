package com.hj.thread.schedual;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class TimeDemo01 {

	public static void main(String[] args) {
		
		Timer timer = new Timer();
		timer.schedule(new TimerTask(){

			public void run(){
				System.out.println("so easy ... .. ");
			}
		}, new Date(System.currentTimeMillis()+5000), 2000);
	}
}
