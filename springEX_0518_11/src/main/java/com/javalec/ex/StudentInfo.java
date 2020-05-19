package com.javalec.ex;

public class StudentInfo {

	private int stu_num;
	private String name;
	private String major;
	private String address;
	private String phone;
	
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
	
	//////////////////////////////////////////////
	
	public void studentInfoPrint() {
		System.out.println("학번 : " + getStu_num());
		System.out.println("이름 : " + getName());
		System.out.println("학과 : " + getMajor());
		System.out.println("주소 : " + getAddress());
		System.out.println("연락처 : " + getPhone());
	}
	
	
}
