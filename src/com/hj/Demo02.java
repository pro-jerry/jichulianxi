package com.hj;

/**
 * 测试自定义堆栈
 * @author Administrator
 *
 */
public class Demo02 {

	public static void main(String[] args) {
		
		MyStack<String>  backHistory = new MyStack<String>(3);
		backHistory.push("baidu.com");
		backHistory.push("google.com");
		backHistory.push("sina.com");
		backHistory.push("dac.com");
		
		System.out.println("大小"+backHistory.size());
		//遍历
		String item = null;
		while(null!=(item=backHistory.pop())){
			System.out.println(item);
		}
	}
}
