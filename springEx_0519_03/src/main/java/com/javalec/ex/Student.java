package com.javalec.ex;

public class Student {

	private int stu_num;
	private String name;
	private String grade_num;
	private String class_num;
	
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
	
	public String getGrade_num() {
		return grade_num;
	}
	
	public void setGrade_num(String grade_num) {
		this.grade_num = grade_num;
	}
	
	public String getClass_num() {
		return class_num;
	}
	
	public void setClass_num(String class_num) {
		this.class_num = class_num;
	}

	//////////////////////////////////////////////
	
	public void stu_print() {
		System.out.println("===== 학생정보 =====");
		System.out.println("학번 : " + getStu_num());
		System.out.println("이름 : " + getName());
		System.out.println("학년 : " + getGrade_num());
		System.out.println("반 : " + getClass_num());
	}
	
	
	
	
}
