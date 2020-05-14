package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppCtx {

	// xml 을 이용한다면
	// 1. appCTX.xml 을 만듬.
	// 2. <bean id="Student" class="com.javalec.ex.Student">
	// 3.     <constructor-arg value="홍길동" />
	// 4.     <property name="" value="" />
	
	// java 를 이용하면
	// annotation 꼭 달것.
	@Bean
	public Student student1() {
		
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("웹툰");
		hobbys.add("게임");
		hobbys.add("독서");
		
		Student student1 = new Student("홍길동", 30, hobbys);
		student1.setHeight(175);
		student1.setWeight(65);
		
		return student1;
	}
	
	@Bean
	public Student student2() {
		ArrayList<String> hobbys = new ArrayList<String>();
		hobbys.add("수영");
		hobbys.add("야구");
		hobbys.add("축구");
		
		Student student2 = new Student("김유신", 33, hobbys);
		student2.setHeight(184);
		student2.setWeight(70);
		
		return student2;
	}
	
	
	
}
