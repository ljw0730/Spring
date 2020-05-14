package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX.xml");
		
		StuInfo stuInfo = ctx.getBean("stuInfo", StuInfo.class);
		ArrayList<Student> list = stuInfo.getList();
		
		StuScore stuScore3 = ctx.getBean("stuScore3", StuScore.class);
		
		
		for(int i = 0; i <  list.size(); i++) {
			Student ss = (Student)list.get(i);
			
			if(ss.getStu_num() == stuScore3.getStu_num()) {
				System.out.println("학번 : " + ss.getStu_num());
				System.out.println("이름 : " + ss.getName());
				System.out.println("전공 : " + ss.getMajor());
				System.out.println("주소 : " + ss.getAddress());
				System.out.println("전화번호 : " + ss.getPhone());
				System.out.println("국어점수 : " + stuScore3.getKor());
				System.out.println("영어점수 : " + stuScore3.getEng());
				System.out.println("수학점수 : " + stuScore3.getMath());
				System.out.println("합계 : " + stuScore3.getTotal());
				System.out.println("평균 : " + stuScore3.getAvg());
			}
		}
		

	}

}
