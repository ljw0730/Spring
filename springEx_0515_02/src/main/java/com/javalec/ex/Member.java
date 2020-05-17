package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Member implements InitializingBean, DisposableBean{

	private int mem_num;
	private String name;
	private int age;
	private String gender;
	private String phone;
	private String address;
	private String s_record;
	
	public Member() {
		
	}
	
	public Member(int mem_uum, String name, int age, String gender, String phone, String address, String s_record) {
		this.mem_num = mem_uum;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.phone = phone;
		this.address = address;
		this.s_record = s_record;
	}

	public int getMem_num() {
		return mem_num;
	}

	public void setMem_num(int mem_num) {
		this.mem_num = mem_num;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getS_record() {
		return s_record;
	}

	public void setS_record(String s_record) {
		this.s_record = s_record;
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Member - afterPropertiesSet() 실행됨");
	}

	public void destroy() throws Exception {
		System.out.println("Member - destroy 실행됨()");
		
	}
	
	
	
}
