package com.javalec.ex;

public class Book {

	private int b_num;
	private String b_name;
	private String b_classification;
	private String b_writer;
	
	public int getB_num() {
		return b_num;
	}
	
	public void setB_num(int b_num) {
		this.b_num = b_num;
	}
	
	public String getB_name() {
		return b_name;
	}
	
	public void setB_name(String b_name) {
		this.b_name = b_name;
	}
	
	public String getB_classification() {
		return b_classification;
	}
	
	public void setB_classification(String b_classification) {
		this.b_classification = b_classification;
	}
	
	public String getB_writer() {
		return b_writer;
	}

	public void setB_writer(String b_writer) {
		this.b_writer = b_writer;
	}

	
	public void book_print() {
		System.out.println("===== 책정보 =====");
		System.out.println("책번호 : " + getB_num());
		System.out.println("책이름 : " + getB_name());
		System.out.println("분류 : " + getB_classification());
		System.out.println("저자 : " + getB_writer());
	}
	
	
}
