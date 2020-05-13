package com.javalec.ex;

public class Score_process {

	public void print_grade(double avg) {
		System.out.print("성적 : ");
		if(avg >= 90) {
			System.out.println("A");
		}
		else if(avg < 90 && avg >= 80) {
			System.out.println("B");
		}
		else if(avg < 80 && avg >= 70) {
			System.out.println("C");
		}
		else if(avg < 70 && avg >= 60) {
			System.out.println("D");
		}
	}
	
	
}
