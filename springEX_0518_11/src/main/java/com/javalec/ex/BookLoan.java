package com.javalec.ex;

public class BookLoan {
	
	private int stu_num;
	private String book_num;
	private String book_title;
	private String categoriztion;
	private String loan_date;
	private String return_date;
	private String overdue_date;
	
	public int getStu_num() {
		return stu_num;
	}
	
	public void setStu_num(int stu_num) {
		this.stu_num = stu_num;
	}
	
	public String getBook_num() {
		return book_num;
	}
	
	public void setBook_num(String book_num) {
		this.book_num = book_num;
	}
	
	public String getBook_title() {
		return book_title;
	}
	
	public void setBook_title(String book_title) {
		this.book_title = book_title;
	}
	
	public String getCategoriztion() {
		return categoriztion;
	}
	
	public void setCategoriztion(String categoriztion) {
		this.categoriztion = categoriztion;
	}
	
	public String getLoan_date() {
		return loan_date;
	}
	
	public void setLoan_date(String loan_date) {
		this.loan_date = loan_date;
	}
	
	public String getReturn_date() {
		return return_date;
	}
	
	public void setReturn_date(String return_date) {
		this.return_date = return_date;
	}
	
	public String getOverdue_date() {
		return overdue_date;
	}
	
	public void setOverdue_date(String overdue_date) {
		this.overdue_date = overdue_date;
	}
	
	//////////////////////////////////////////////////////
	
	public void bookLoanPrint() {
		System.out.println("학번 : " + getStu_num());
		System.out.println("도서번호 : " + getBook_num());
		System.out.println("도서제목 : " + getBook_title());
		System.out.println("분류 : " + getCategoriztion());
		System.out.println("대출일자 : " + getLoan_date());
		System.out.println("반납일자 : " + getReturn_date());
		System.out.println("연체일 : " + getOverdue_date());
	}
	
	
}
