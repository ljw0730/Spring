package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:appCTX.xml")
public class ConfigCTX {

	@Bean
	public Student student1() {
		ArrayList<String> hobbys = new ArrayList<String>();
		
		hobbys.add("수영");
		hobbys.add("조깅");
		hobbys.add("등산");
		
		Student student1 = new Student("김유신", 33, hobbys);
		student1.setHeight(180);
		student1.setWeight(70);
		
		return student1;
	}
	
}
