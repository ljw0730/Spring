package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX.xml");
		
		StudentInfo studentInfo = ctx.getBean("studentInfo", StudentInfo.class);
		StudentScore studentScore = ctx.getBean("studentScore", StudentScore.class);
		BookLoan bookLoan = ctx.getBean("bookLoan", BookLoan.class);
		
		studentInfo.studentInfoPrint();
		studentScore.studentScorePirnt();
		bookLoan.bookLoanPrint();
		
		ctx.close();
		
		
	}
	
	
	
	
}
