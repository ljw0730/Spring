package com.javalec.ex;

public class Rental {

	int member_num;
	String name;
	String book_ren;
	String book_return;
	String tel;
	
	public void getRental() {
		System.out.println("책대여 정보 : " + member_num + "/" + name);
		
	}

	///////////////////////////////////
	
	public int getMember_num() {
		return member_num;
	}

	public void setMember_num(int member_num) {
		this.member_num = member_num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBook_ren() {
		return book_ren;
	}

	public void setBook_ren(String book_ren) {
		this.book_ren = book_ren;
	}

	public String getBook_return() {
		return book_return;
	}

	public void setBook_return(String book_return) {
		this.book_return = book_return;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
	
	
	
	
}
