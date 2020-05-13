package com.javalec.ex;

public class Temperature {
	Temp_Calculator temp_calculator;
	
	String nav; // 국가명
	double temp; // 온도
	
	
	public void setTemp_calculator(Temp_Calculator temp_calculator) {
		this.temp_calculator = temp_calculator;
	}

	public void setNav(String nav) {
		this.nav = nav;
	}
	
	public void setTemp(double temp) {
		this.temp = temp;
	}
	
	/////////////////////////////////////////////
	
	public void cel_to_fah() {
		temp_calculator.cel_to_fah(temp);
	}
	
	
}
