package com.javalec.ex;

public class Calculation2 {

	private int firstNum;
	private int secondNum;
	
	// spring은 외부에서 주입을 할때는 꼭 set이 있어야한다.
	public int getFirstNum() {
		return firstNum;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public int getSecondNum() {
		return secondNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}
	
	public void add() {
		int result = (firstNum + secondNum) * 2;
		System.out.println("(firstNum + secondNum) * 2 = " + result);
	}
	
	public void sub() {
		int result = (firstNum - secondNum) * 2;
		System.out.println("(firstNum - secondNum) * 2 = " + result);
	}
	
	public void multi() {
		int result = (firstNum * secondNum) * 2;
		System.out.println("(firstNum * secondNum) * 2 = " + result);
	}
	
	public void div() {
		int result = (firstNum / secondNum) * 2;
		System.out.println("(firstNum / secondNum) * 2 = " + result);
	}
	
	
}
