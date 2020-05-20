package com.javalec.ex;

public class Join {
	
	private int j_num;
	private String j_id;
	private String j_pw;
	private String j_name;
	private String j_date;
	
	public int getJ_num() {
		return j_num;
	}
	
	public void setJ_num(int j_num) {
		this.j_num = j_num;
	}
	
	public String getJ_id() {
		return j_id;
	}
	
	public void setJ_id(String j_id) {
		this.j_id = j_id;
	}
	
	public String getJ_pw() {
		return j_pw;
	}
	
	public void setJ_pw(String j_pw) {
		this.j_pw = j_pw;
	}
	
	public String getJ_name() {
		return j_name;
	}
	
	public void setJ_name(String j_name) {
		this.j_name = j_name;
	}
	
	public String getJ_date() {
		return j_date;
	}
	
	public void setJ_date(String j_date) {
		this.j_date = j_date;
	}
	
	///////////////////////////////////////////////
	
	public void join_print() {
		System.out.println("------------------------------");
		System.out.println("===== 회원 정보 =====");
		System.out.println("회원번호 : " + getJ_name());
		System.out.println("아이디 : " + getJ_id());
		System.out.println("패스워드 : " + getJ_pw());
		System.out.println("이름 : " + getJ_name());
		System.out.println("가입일 : " + getJ_date());
		System.out.println("------------------------------");
	}
	
	
	
}
