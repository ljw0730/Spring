package com.javalec.ex;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LogAOP {

	@Pointcut("within(com.javalec.ex.*)")
	public void pointcutMethod() {
		
	}
	
	// before
	@Before("pointcutMethod()")
	public void beforeAdvice() {
		System.out.println("(before)시작시간 : " + System.currentTimeMillis());
	}
	
	
	// after
	@After("pointcutMethod()")
	public void afterAdvice() {
		System.out.println("(after)종료시간 : " + System.currentTimeMillis());
	}
	
	
	// around
	@Around("pointcutMethod()")
	public Object loggerAOP(ProceedingJoinPoint joinPoint) throws Throwable {
		long startTime = System.currentTimeMillis();
		
		//System.out.println("(around)시작시간 : " + startTime);
		
		try {
			return joinPoint.proceed();
		} finally {
			long endTime = System.currentTimeMillis();
			System.out.println("(around)경과시간 : " + (startTime-endTime));
		}
	}
	
}
