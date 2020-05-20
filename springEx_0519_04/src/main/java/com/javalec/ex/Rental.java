package com.javalec.ex;

public class Rental {

	private int m_num;
	private String m_name;
	private String r_bookName;
	private String r_return;
	private String m_tel;
	
	public int getM_num() {
		return m_num;
	}
	
	public void setM_num(int m_num) {
		this.m_num = m_num;
	}
	
	public String getM_name() {
		return m_name;
	}
	
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	
	public String getR_bookName() {
		return r_bookName;
	}
	
	public void setR_bookName(String r_bookName) {
		this.r_bookName = r_bookName;
	}
	
	public String getR_return() {
		return r_return;
	}
	
	public void setR_return(String r_return) {
		this.r_return = r_return;
	}
	
	public String getM_tel() {
		return m_tel;
	}
	
	public void setM_tel(String m_tel) {
		this.m_tel = m_tel;
	}
	
	/////////////////////////////////////////////////
	
	public void rental_print() {
		System.out.println("===== 대여 정보 =====");
		System.out.println("회원번호 : " + getM_num());
		System.out.println("회원이름 : " + getM_name());
		System.out.println("대여책 : " + getR_bookName());
		System.out.println("반납 : " + getR_return());
		System.out.println("연락처 : " + getM_tel());
		
	}
	
}
