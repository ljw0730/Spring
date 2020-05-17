package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student implements InitializingBean, DisposableBean{

	private String name;
	private int age;
	
	public Student() {
		
	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	/////////////////////////////////////////////////
	
	
	public void initMethod() {
		System.out.println("initMethod()");
	}
	
	public void destoryMethod() {
		System.out.println("destoryMethod()");
	}

	

	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet()");
		
	}
	
	public void destroy() throws Exception {
		System.out.println("destroy()");
		
	}
	
}
