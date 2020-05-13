package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX.xml");
		
		StudentInfo studentInfo = ctx.getBean("studentInfo", StudentInfo.class);
		
		// 생성자를 통한 데이터 주입 후 출력
		studentInfo.getStudentInfo();
		
		// setter
		Student student2 = ctx.getBean("student2", Student.class);
		studentInfo.setStudent(student2);
		studentInfo.getStudentInfo();
		
		// close를 하지 않으면 bean을 계속 잡고 있기 때문에 좋지 않다.
		ctx.close();
	}

}
