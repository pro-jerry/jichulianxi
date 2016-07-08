package com.hj.annotation;

public class Dog {

	@Seven(value="Lumia")
	private String name;
	
	private String property;

	public Dog() {
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProperty() {
		return property;
	}

	@Seven(Property="水陆坦克")
	public void setProperty(String property) {
		this.property = property;
	}
	
	public void say(){
		
		System.out.println("汪汪......");
	}
	
	
	
	
	
}
