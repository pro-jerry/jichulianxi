package com.hj.refecltion;

import com.hj.refecltion.bean.User;

public class Demo06 {

	public static void main(String[] args) {
		
		User u  = new User();
		
		long startTime  = System.currentTimeMillis();
		for(int i=0;i<1000000000L;i++){
			u.getUname();
		}
		long endTime = System.currentTimeMillis();
		System.out.println("普通方法调用执行10亿次，耗时:"+(endTime-startTime)+"ms");
		
	}
}
