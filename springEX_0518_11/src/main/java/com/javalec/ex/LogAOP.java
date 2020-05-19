package com.javalec.ex;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;

public class LogAOP {

	//대행 클래스 1번째 메소드 (처음과 마지막에 실행되는 메소드)
	public Object loggerAOP(ProceedingJoinPoint joinPoint) throws Throwable{
		System.out.println("joinPoint 실행");
		//현재 시간을 불러와서 출력
		long startTime = System.currentTimeMillis();
		SimpleDateFormat dayTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String str = dayTime.format(new Date(startTime));
		System.out.println(str);
		
		try {
			return joinPoint.proceed();
		} finally {
			long endTime = System.currentTimeMillis();
			SimpleDateFormat dayTime2 = new SimpleDateFormat("yyyy-MM-Ddd hh:mm:ss");
			String str2 = dayTime2.format(new Date(endTime));
			System.out.println(str2);
			System.out.println("------------------------------");
		}
	
	
	
	
	
	
	}
	
	
	
}
