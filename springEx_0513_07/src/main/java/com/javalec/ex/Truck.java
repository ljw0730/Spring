package com.javalec.ex;

public class Truck implements Car {

	public void run() {
		System.out.println("Truck");
		System.out.println("부릉 ~ 시속 200km/h");
	}

	public void stop() {
		System.out.println("Truck");
		System.out.println("끼이익! 늦게 멈춤");

	}

	public void use() {
		System.out.println("Truck");
		System.out.println("덮개 기능이 있음");

	}

}
