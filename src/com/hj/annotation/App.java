package com.hj.annotation;

import com.hj.annotation.FruitColor.Color;

public class App {

	@FruitName(value="sun")
	private String name;
	
	@FruitColor(fruitColor=Color.RED)
	private String color;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
	public static void main(String[] args) {
		
		App p = new App();
		
		System.out.println(p.getName());
	}
}
