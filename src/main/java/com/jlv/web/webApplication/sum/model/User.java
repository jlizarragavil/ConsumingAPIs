package com.jlv.web.webApplication.sum.model;

import org.springframework.stereotype.Component;

@Component
public class User{
	private String name, id;
	private int age;
	public User() {
		
	}
	public User(String name, String id, int age) {
		this.name = name;
		this.id=id;
		this.age=age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}