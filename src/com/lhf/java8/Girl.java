package com.lhf.java8;

public class Girl {
	
	private String name;
	
	private Integer age;
	
	private String cupSize;
	
	private Integer height;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCupSize() {
		return cupSize;
	}

	public void setCupSize(String cupSize) {
		this.cupSize = cupSize;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	
	public Girl(String name, Integer age, String cupSize, Integer height) {
		super();
		this.name = name;
		this.age = age;
		this.cupSize = cupSize;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Girl [name=" + name + ", age=" + age + ", cupSize=" + cupSize + ", height=" + height + "]";
	}
	
	

}
