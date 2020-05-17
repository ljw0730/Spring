package com.javalec.ex;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class MainCalss {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
		// 모든 property 소스를 가져옴
		ConfigurableEnvironment env = ctx.getEnvironment();
		
		// 하나의 property 소스를 넣기 위함
		MutablePropertySources propertySporce = env.getPropertySources();
		
		try {
			propertySporce.addLast(new ResourcePropertySource("classpath:admin.properties"));
			
			System.out.println(env.getProperty("admin.id"));
			System.out.println(env.getProperty("admin.pw"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		GenericXmlApplicationContext ctx2 = (GenericXmlApplicationContext) ctx;
		ctx2.load("appCTX.xml");
		ctx2.refresh(); // AdminConnection -> init() 실행 -> id, pw 값 할당
		
		AdminConnection adminConnection = ctx2.getBean("adminConnection", AdminConnection.class);
		System.out.println("ID : " + adminConnection.getAdminId());
		System.out.println("PW : " + adminConnection.getAdminPw());
		
		ctx.close();
		ctx2.close();
		
	}

}
