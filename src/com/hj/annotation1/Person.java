package com.hj.annotation1;

@Test1(description="this is my person")
public class Person {

	@Test1(description="this is my id")
	private String id;
	
	@Test1(description="this is my name")
	private String name;
	
	
	public String getId() {
		return id;
	}
	
	@Test1(description="this is my setId")
	public void setId(String id) {
		this.id = id;
	}
	
	@Test1(description="this is my getName")
	public String getName() {
		return name;
	}
	
	@Test1(description="this is my setName")
	public void setName(String name) {
		this.name = name;
	}
	
	
}
