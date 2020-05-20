package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX.xml");
		
		Student student = ctx.getBean("student", Student.class);
		StudentScore studentScore = ctx.getBean("studentScore", StudentScore.class);
		DoctorRecord doctorRecord = ctx.getBean("doctorRecord", DoctorRecord.class);
		
		student.student_print();
		studentScore.stuScore_print();
		doctorRecord.doctorRecord_print();
		
		ctx.close();		
	}

}
