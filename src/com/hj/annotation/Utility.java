package com.hj.annotation;

@Description(value="这是一个有用的工具类")
public class Utility {

	@Author(name="hj",group="com.java")
	public String work(){
		
		return "work over";
	}
}
