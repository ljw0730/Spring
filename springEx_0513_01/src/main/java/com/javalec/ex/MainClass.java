package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		// 일반적인 방법
//		MyCalculator mycalculator = new MyCalculator();
//
//		mycalculator.setCalculator(new Calculator());
//		mycalculator.setFirstNum(10);
//		mycalculator.setSecondNum(2);
//		
//		mycalculator.add();
//		mycalculator.sub();
//		mycalculator.multi();
//		mycalculator.div();
		
		
		//스프링(Spring) - XML을 이용할 경우
		String configLocation = "classpath:applicationCTX.xml";
		// classpath => src/main/resources
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		MyCalculator mycalculator = ctx.getBean("mycalculator", MyCalculator.class);
		
		mycalculator.add();
		mycalculator.sub();
		mycalculator.multi();
		mycalculator.div();
		
	}
	
}
