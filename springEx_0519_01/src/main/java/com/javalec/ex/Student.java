package com.javalec.ex;

public class Student {

	private int stu_num;
	private String stu_name;
	private String major;
	private String tel;
	private String address;
	private String email;
	
	public void student_print() {
		System.out.println("------------------------------");
		System.out.println("===== 학생 정보 =====");
		System.out.println("학번 : " + getStu_num());
		System.out.println("이름 : " + getStu_name());
		System.out.println("학과 : " + getMajor());
		System.out.println("연락처 : " + getTel());
		System.out.println("주소 : " + getAddress());
		System.out.println("이메일 : " + getEmail());
		System.out.println("------------------------------");
	}
	
	
	public int getStu_num() {
		return stu_num;
	}
	
	public void setStu_num(int stu_num) {
		this.stu_num = stu_num;
	}
	
	public String getStu_name() {
		return stu_name;
	}
	
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
}
