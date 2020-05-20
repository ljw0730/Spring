package com.javalec.ex;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAOP {
	
	// around 선언시 실행
	public Object loggerAOP(ProceedingJoinPoint joinPoint) throws Throwable {
		
		// 시작전 실행
		System.out.println("(around)메소드 시작시간 : " + System.currentTimeMillis());
		
		try {
			return joinPoint.proceed(); //실행 메소드 호출
		} finally {
			System.out.println("(around)메소드 종료시간 : " + System.currentTimeMillis());
			System.out.println("================================");
		}
		
	}
	
	// before 선언시 실행
	public void beforeAdviece() {
		System.out.println("(before)메소드 시작시간 : " + System.currentTimeMillis());
		System.out.println("================================");
	}

}
