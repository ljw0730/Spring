package com.javalec.ex;

public class Student {
	
	private int stu_num;
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int total;
	private double avg;
	
	public Student() {
		
	}
	
	public Student(int stu_num, String name) {
		this.stu_num = stu_num;
		this.name = name;
	}
	
	public void total_avg() {
		this.total = this.kor + this.eng + this.math;
		this.avg = this.total/3.0;
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

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	//////////////////////////////////////////////////////
	
	public void print_student() {
		System.out.println("---------------------------");
		System.out.println("학번 : " + this.stu_num);
		System.out.println("이름 : " + this.name);
		System.out.println("국어점수 : " + this.kor);
		System.out.println("영어점수 : " + this.eng);
		System.out.println("수학점수 : " + this.math);
		System.out.println("합계 : " + this.total);
		System.out.println("평균 : " + this.avg);
		
	}
}
