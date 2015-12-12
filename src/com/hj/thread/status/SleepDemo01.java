package com.hj.thread.status;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 倒计时
 * 1.倒数10个数
 * 2.倒计时
 * @author Administrator
 *
 */
public class SleepDemo01 {

	public static void main(String[] args) throws InterruptedException {
		
		Date endTime = new Date(System.currentTimeMillis()+10*1000);
		long end = endTime.getTime();
		while(true){
			//输出
			System.out.println(new SimpleDateFormat("mm:ss").format(endTime));
			//构建下一秒时间
			endTime=new Date(endTime.getTime()-1000);
			Thread.sleep(1000);
			if(end-10000>endTime.getTime()){
				break;
			}
		}
	}
	
	public static void test1() throws InterruptedException{
		
		int num =10;
		while(true){
			System.out.println(num--);
			Thread.sleep(1000);//暂停
			if(num<=0){
				break;
			}
		}
	}
}
