package com.javalec.ex;

public class Student {
	private int stu_num;
	private String name;
	private String major;
	private String address;
	private String phone;
	
	public Student() {
		
	}
	
	public Student(int stu_num, String name, String major, String address, String phone) {
		this.stu_num = stu_num;
		this.name = name;
		this.major = major;
		this.address = address;
		this.phone = phone;
	}

	public int getStu_num() {
		return stu_num;
	}

	public void setStu_num(int stu_num) {
		this.stu_num = stu_num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
}
