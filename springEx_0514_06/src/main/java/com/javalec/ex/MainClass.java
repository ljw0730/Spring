package com.javalec.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		// 원래 java 파일(CTX 파일)을 가져오려면
		// AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigCTX.class);
		
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX.xml");
		Student student1 = ctx.getBean("student1", Student.class);
		student1.get_stuPrint();
		
		Student student2 = ctx.getBean("student2", Student.class);
		student2.get_stuPrint();
		
		ctx.close();
		
	}

}
