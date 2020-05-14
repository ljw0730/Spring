package com.javalec.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		// xml의 경우
		//AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX.xml");
		
		// java의 경우
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class); 
		Student student1 = ctx.getBean("student1", Student.class);
		System.out.println("학생1 이름 : " + student1.getName()); 
		System.out.println("학생1 나이 : " + student1.getAge());
		System.out.println("학생1 취미 : " + student1.getHobbys());
		System.out.println("학생1 키 : " + student1.getHeight());
		System.out.println("학생1 몸무게 : " + student1.getWeight());
		
	}

}
