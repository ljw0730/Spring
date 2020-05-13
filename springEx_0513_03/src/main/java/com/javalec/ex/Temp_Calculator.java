package com.javalec.ex;

public class Temp_Calculator {
	
	// 화씨(F) -> 섭씨(C)
	public void fah_to_cel(double F) {
		double C = (F-32)/1.8;
		System.out.println("화씨(℉) -> 섭씨(℃) : " + C + "℃");
	}
	
	//섭씨(C) -> 화씨(F)
	public void cel_to_fah(double C) {
		double F = C*1.8+32;
		System.out.println("섭씨(℃) -> 화씨(℉) : " + F + "℉");
	}
	
}
