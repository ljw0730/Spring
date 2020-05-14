package com.javalec.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCtx.class);
		
		Student student1 = ctx.getBean("student1", Student.class);
		student1.print_student();
	
		Student student2 = ctx.getBean("student2", Student.class);
		student2.print_student();
	}
	
}
