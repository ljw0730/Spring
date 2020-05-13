package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {

	public static void main(String[] args) {

		String configuLocation = "classpath:stu_score_processing.xml";
		AbstractApplicationContext context = new GenericXmlApplicationContext(configuLocation);
		
		Stu_score stu_score = context.getBean("stu_score", Stu_score.class);
		
		System.out.println("학번 : " + stu_score.stu_num);
		System.out.println("이름 : " + stu_score.stu_name);
		System.out.println("국어점수 : " + stu_score.kor);
		System.out.println("영어점수 : " + stu_score.eng);
		System.out.println("수학점수 : " + stu_score.math);
		System.out.println("합계 : " + stu_score.total);
		System.out.println("평균 : " + stu_score.avg);
		stu_score.grade();
		
		
		
	}

}
