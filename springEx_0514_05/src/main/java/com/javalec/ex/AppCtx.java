package com.javalec.ex;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppCtx {

	@Bean
	public Student student1() {
		
		Student student1 = new Student(1001, "홍길동");
		student1.setKor(100);
		student1.setEng(95);
		student1.setMath(93);
		
		student1.total_avg();
		
		return student1;
	}
	
	@Bean
	public Student student2() {
		
		Student student2 = new Student(1002, "김유신");
		student2.setKor(78);
		student2.setEng(84);
		student2.setMath(99);
		
		student2.total_avg();
		
		return student2;
		
	}
	
	
	
	
}
