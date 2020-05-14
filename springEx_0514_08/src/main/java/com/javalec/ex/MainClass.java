package com.javalec.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigCTX.class);
		Student student1 = ctx.getBean("student1", Student.class);
		Student student2 = ctx.getBean("student2", Student.class);
		
		System.out.println("student1 이름 : " + student1.getName());
		System.out.println("student1 나이 : " + student1.getAge());
		System.out.println("student1 취미 : " + student1.getHobbys());
		System.out.println("student1 키 : " + student1.getHeight());
		System.out.println("student1 몸무게 : " + student1.getWeight());
		
		System.out.println("------------------------------------------");
		System.out.println("student2 이름 : " + student2.getName());
		System.out.println("student2 나이 : " + student2.getAge());
		System.out.println("student2 취미 : " + student2.getHobbys());
		System.out.println("student2 키 : " + student2.getHeight());
		System.out.println("student2 몸무게 : " + student2.getWeight());
		
		
		
	}

}
