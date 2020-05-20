package com.javalec.ex;

public class NoticeBoard {

	private int n_num;
	private String n_title;
	private String n_content;
	private String n_date;
	private String n_writer;
	
	public int getN_num() {
		return n_num;
	}
	
	public void setN_num(int n_num) {
		this.n_num = n_num;
	}
	
	public String getN_title() {
		return n_title;
	}
	
	public void setN_title(String n_title) {
		this.n_title = n_title;
	}
	
	public String getN_content() {
		return n_content;
	}
	
	public void setN_content(String n_content) {
		this.n_content = n_content;
	}
	
	public String getN_date() {
		return n_date;
	}
	
	public void setN_date(String n_date) {
		this.n_date = n_date;
	}
	
	public String getN_writer() {
		return n_writer;
	}
	
	public void setN_writer(String n_writer) {
		this.n_writer = n_writer;
	}
	
	////////////////////////////////////////////////
	
	public void noticeBoard_print() {
		System.out.println("------------------------------");
		System.out.println("===== 공지사항 게시판 =====");
		System.out.println("번호 : " + getN_num());
		System.out.println("제목 : " + getN_title());
		System.out.println("내용 : " + getN_content());
		System.out.println("날짜 : " + getN_date());
		System.out.println("작성자 : " + getN_writer());
		System.out.println("------------------------------");
	}
	
	
}
