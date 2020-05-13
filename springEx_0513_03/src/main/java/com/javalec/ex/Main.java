package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		String configuLocation = "classpath:Temperature_Calculator_CTX.xml";
		AbstractApplicationContext context = new GenericXmlApplicationContext(configuLocation);
		
		Temperature temperature = context.getBean("temperature", Temperature.class);
		
		System.out.println("국가 : " + temperature.nav);
		System.out.println("현재기온(℃) : " + temperature.temp + "℃");
		temperature.cel_to_fah();
		
		
		
	}
}
