package com.javalec.ex;

public class MainClass {

	public static void main(String[] args) {

		Calculation2 cal = new Calculation2(); 
		//new() 생성자를 통해서 객체 선언
		cal.setFirstNum(10);
		cal.setSecondNum(5);
		
		Calculation cal2 = new Calculation(10, 5);
		
		cal.add();
		cal.sub();
		cal.multi();
		cal.div();
		
	}

}
