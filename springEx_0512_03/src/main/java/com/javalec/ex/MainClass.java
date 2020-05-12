package com.javalec.ex;

public class MainClass {

	public static void main(String[] args) {

		MyCalculator mycal = new MyCalculator();
		mycal.setCal(new Calculator());
		
		mycal.setFirstNum(10);
		mycal.setSecondNum(5);
		
		mycal.add();
		mycal.sub();
		mycal.multi();
		mycal.div();
	}

}
