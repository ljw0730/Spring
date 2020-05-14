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
	
	public Student(int stu_num, String name, int kor, int eng, int math) {
		this.stu_num = stu_num;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		this.total = kor + eng + math;
		this.avg = total/3.0;
	}
	
	///////////////////////////////////////////////////////////////////
	
	public void print_stu() {
		System.out.println("------------------------------");
		System.out.println("학번 : " + stu_num);
		System.out.println("이름 : " + name);
		System.out.println("국어점수 : " + kor);
		System.out.println("영어점수 : " + eng);
		System.out.println("수학점수 : " + math);
		System.out.println("합계 : " + total);
		System.out.println("평균 : " + avg);
	}
	
	
}
