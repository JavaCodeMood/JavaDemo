package com.lhf.java8;

public class User implements Comparable<User> {
	
	private String name;
	
	private Integer age;
	
	private String phone;

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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	

	public User(String name, Integer age, String phone) {
		super();
		this.name = name;
		this.age = age;
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", phone=" + phone + "]";
	}

	//重写Comparable接口的compareTo方法
	@Override
	public int compareTo(User user) {
		
		return this.age - user.getAge();
	}
	
	

}
