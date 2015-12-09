package com.hj.thread.create;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 使用Callable创建线程
 * @author Administrator
 *
 */
public class Call {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		//创建对象
		ExecutorService ser = Executors.newFixedThreadPool(2);
		
		Race tortoise = new Race("wugu",1000);
		Race rabit = new Race("兔子",100);
		//获取值
		Future<Integer> result1 = ser.submit(tortoise);
		Future<Integer> result2 = ser.submit(rabit);
		
		Thread.sleep(2000);
		
		tortoise.setFlag(false);
		rabit.setFlag(false);
		
		
		int num1 =  result1.get();
		int num2 =  result2.get();
		System.out.println(num1);
		System.out.println(num2);
		//停止服务
		ser.shutdownNow();
	}
}

class Race implements Callable<Integer>{

	private String name; //名称
	private long time;	//延时时间
	private boolean flag=true;
	private int step=0;//步
	
	public Race() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Race(String name,long time) {
		super();
		this.name = name;
		this.time = time;
	}

	@Override
	public Integer call() throws Exception {

		while(flag){
			
			Thread.sleep(time);
			step++;
		}
		return step;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getTime() {
		return time;
	}

	public void setTime(long time) {
		this.time = time;
	}

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public int getStep() {
		return step;
	}

	public void setStep(int step) {
		this.step = step;
	}
	
	
}


