package com.javalec.ex;

public class BMICalculator {

	private double lowWeight; // 저체중
	private double normal; // 보통
	private double overWeight; // 과체중
	private double obesity; // 고도비만

	public void setLowWeight(double lowWeight) {
		this.lowWeight = lowWeight;
	}

	public void setNormal(double normal) {
		this.normal = normal;
	}

	public void setOverWeight(double overWeight) {
		this.overWeight = overWeight;
	}

	public void setObesity(double obesity) {
		this.obesity = obesity;
	}

	////////////////////////////////////////////////////////////
	
	public void bmicalculation(double weight, double height) {
		
		double h = height * 0.01;
		double result = weight/(h*h); // BMI 지수
		System.out.println("당신의 BMI 지수 : " + result);
		
		if(result > obesity) {
			System.out.println("고도비만 입니다.");
		}
		else if(result > overWeight && result <= obesity) {
			System.out.println("과체중 입니다.");
		}
		else if(result > normal && result <= overWeight) {
			System.out.println("보통 입니다.");
		}
		else {
			System.out.println("저체중 입니다.");
		}
		
		
	}
	
}
