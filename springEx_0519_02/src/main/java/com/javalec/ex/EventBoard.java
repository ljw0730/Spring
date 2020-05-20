package com.javalec.ex;

public class EventBoard {

	private int e_num;
	private String e_tatle;
	private String e_start_date;
	private String e_end_date;
	
	public int getE_num() {
		return e_num;
	}
	
	public void setE_num(int e_num) {
		this.e_num = e_num;
	}
	
	public String getE_tatle() {
		return e_tatle;
	}
	
	public void setE_tatle(String e_tatle) {
		this.e_tatle = e_tatle;
	}
	
	public String getE_start_date() {
		return e_start_date;
	}
	
	public void setE_start_date(String e_start_date) {
		this.e_start_date = e_start_date;
	}
	
	public String getE_end_date() {
		return e_end_date;
	}
	
	public void setE_end_date(String e_end_date) {
		this.e_end_date = e_end_date;
	}
	
	////////////////////////////////////////////////
	
	public void eventBoard_print() {
		System.out.println("------------------------------");
		System.out.println("===== 이벤트 게시판 =====");
		System.out.println("번호 : " + getE_num());
		System.out.println("제목 : " + getE_tatle());
		System.out.println("시작일 : " + getE_start_date());
		System.out.println("종료일 : " + getE_end_date());
		System.out.println("------------------------------");
	}
	
	
}
