package com.javalec.ex;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class LogAOP {

	
	//대행 클래스 1번째 메소드 (처음과 마지막에 실행되는 메소드)
	public Object loggerAOP(ProceedingJoinPoint joinPoint) throws Throwable{
		
		System.out.println("joinPoint 실행");
		// 현재 시간을 불러와서 출력
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
		
		
		try {
			// 현재 진행해야 할 프로그램이 있으면 실행 시켜라.
			return joinPoint.proceed();
		}
		finally {
			long endTime = System.currentTimeMillis();
			System.out.println(endTime);
			System.out.println("------------------------------------");
		}
	}
	
	// 특정 메소드가 실행되면 그전에 실행되는 메소드
	public void beforeAdvice(Joinpoint joinpoint) {
		System.out.println("처음 실행되는 log");
		// 현재 시간을 불러와서 출력
		long startTime = System.currentTimeMillis();
		System.out.println(startTime);
	}
	
	// 특정 메소드가 종료되면 그후에 실행되는 메소드
	public void afterAdvice() {
		System.out.println("마지막에 실행되는 log");
		long endTime = System.currentTimeMillis();
		System.out.println(endTime);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
