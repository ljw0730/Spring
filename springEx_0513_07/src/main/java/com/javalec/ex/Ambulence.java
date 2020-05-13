package com.javalec.ex;

public class Ambulence implements Car {

	public void run() {
		System.out.println("Ambulence");
		System.out.println("부릉 ~ 시속 300km/h");
	}

	public void stop() {
		System.out.println("Ambulence");
		System.out.println("끼이익! 빨리 멈춤");

	}

	public void use() {
		System.out.println("Ambulence");
		System.out.println("사이렌 기능이 있음");
	}

}
