package com.hj.thread.status;

import com.hj.thread.create.Web12306;

/**
 * Sleep模拟网络延时
 * @author Administrator
 *
 */
public class SleepDemo02 {

	public static void main(String[] args) {
		
		Web12306 w = new Web12306();

		Thread proxy1 = new Thread(w, "XX1");
		Thread proxy2 = new Thread(w, "OO2");
		Thread proxy3 = new Thread(w, "PP3");

		proxy1.start();
		proxy2.start();
		proxy3.start();
	}
}
