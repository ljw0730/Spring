package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:appCTX.xml");
		ctx.refresh();
		
		Student student1 = ctx.getBean("student", Student.class);
		Student student2 = ctx.getBean("student", Student.class);

		System.out.println("student1 학생 이름 : " + student1.getName());
		System.out.println("student1 학생 나이 : " + student1.getAge());
		System.out.println("---------------------------------------------");
		
		student2.setName("김유신");
		student2.setAge(30);

		//student1 과 student2는 같은 것을 갖고 있기 때문에
		//student2 를 수정하면 student1도 수정된다.
	
		System.out.println("student1 학생 이름 : " + student1.getName());
		System.out.println("student1 학생 나이 : " + student1.getAge());
		
		if(student1.equals(student2)) {
			System.out.println("2개의 객체는 같습니다.");
		}
		else {
			System.out.println("2개의 객체는 다릅니다.");
		}
		
		ctx.close();
	}

}
