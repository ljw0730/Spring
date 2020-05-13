package com.javalec.ex;

public class Taxi implements Car {

	public void run() {
		System.out.println("Texi");
		System.out.println("부릉 ~ 시속 250km/h");
	}

	public void stop() {
		System.out.println("Texi");
		System.out.println("끼이익! 빨리 멈춤");

	}

	public void use() {
		System.out.println("Texi");
		System.out.println("미터기 기능이 있음");

	}

}
