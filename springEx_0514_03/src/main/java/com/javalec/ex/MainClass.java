package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		String config1 = "classpath:appCTX.xml";
		String config2 = "classpath:appCTX2.xml";
		
		// 2개 이상의 xml을 담을 수 있다.
		// config1, config2 에 있는 모든 정보를 ctx에 담는다. 
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(config1, config2);
		
		Student student1 = ctx.getBean("student1", Student.class);
		System.out.println("이름 : " + student1.getName());
		System.out.println("취미 : " + student1.getHobbys());
		
		StudentInfo studentInfo = ctx.getBean("studentInfo", StudentInfo.class);
		Student student2 = studentInfo.getStudent();
		System.out.println("Info 이름 : " + student2.getName());
		System.out.println("Info 취미 : " + student2.getHobbys());

		if(student1.equals(student2)) {
			System.out.println("student1 과 student2는 같은 객체 입니다.");
		}
		else {
			System.out.println("student1 과 student2는 다른 객체 입니다.");
		}
	
		Student student3 = ctx.getBean("student3", Student.class);
		if(student1.equals(student3)) {
			System.out.println("student1 과 student3는 같은 객체 입니다.");
		}
		else {
			System.out.println("student1 과 student3는 다른 객체 입니다.");
		}
		System.out.println("student3의 이름 : " + student3.getName());
		
		Family family = ctx.getBean("family", Family.class);
		System.out.println("아버지 이름 : " + family.getFatherName());
		System.out.println("어머니 이름 : " + family.getMotherName());
		System.out.println("누나/여동생 이름 : " + family.getSisterName());
		System.out.println("형/남동생 이름 : " + family.getBrorherName());
		
		ctx.close();
		
	}

}
