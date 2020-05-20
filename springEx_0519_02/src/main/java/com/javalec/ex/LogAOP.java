package com.javalec.ex;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAOP {

	//around 선언시 실행
	public Object loggerAOP(ProceedingJoinPoint joinPoint) throws Throwable {
		
		long startTime = System.currentTimeMillis();
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String start_str = dayTime.format(new Date(startTime));
		
		System.out.println("(around)메소드 시작시간 : " + start_str);
		
		try {
			return joinPoint.proceed();
		} finally {
			long endTime = System.currentTimeMillis();
			SimpleDateFormat dayTime2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
			String end_str = dayTime2.format(new Date(endTime));
			System.out.println("(around)메소드 종료시간 : " + end_str);
			System.out.println("================================");
		}
	}

	
	// before 선언시 실행
	public void beforeAdviece() {
		long startTime = System.currentTimeMillis();
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String start_str = dayTime.format(new Date(startTime));
		
		System.out.println("================================");
		System.out.println("(before)메소드 시작시간 : " + start_str);
	}
	
	//after 선언시 실행
	public void afterAdviece() {
		long endTime = System.currentTimeMillis();
		SimpleDateFormat dayTime2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String end_str = dayTime2.format(new Date(endTime));
		
		System.out.println("(after)메소드 종료시간 : " + end_str);
		System.out.println("================================");
	}
	
	
}
