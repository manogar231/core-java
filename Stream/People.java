package com.Stream;

public class People {

	private String name;
	private int  age;
	private Gender gender;
	
	public People(String name,int age , Gender gender) {
		
		this.name=name;
		this.age=age;
		this.gender=gender;
		
	}
	
	public String getname() {
		return name;
	}
	public int  getage() {
		return age;
	}
	public Gender getgender() {
		return gender;
	}

	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}
