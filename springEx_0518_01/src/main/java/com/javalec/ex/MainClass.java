package com.javalec.ex;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class MainClass {

	public static void main(String[] args) {

		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
		ConfigurableEnvironment env = ctx.getEnvironment();
		MutablePropertySources propertySources = env.getPropertySources();
		
		try {
			propertySources.addLast(new ResourcePropertySource("classpath:admin.properties"));
			
			System.out.println(env.getProperty("admin.id"));
			System.out.println(env.getProperty("admin.pw"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		GenericXmlApplicationContext ctx2 = (GenericXmlApplicationContext) ctx;
		ctx2.load("appCTX.xml");
		ctx2.refresh(); // admin.id, admin.pw 에 env에서 값을 주입

		AdminConnection adminConnection = ctx2.getBean("adminConnection", AdminConnection.class);
		
		System.out.println("amdinId : " + adminConnection.getAdminId());
		System.out.println("amdinPw : " + adminConnection.getAdminPw());
		
		ctx.close();
		ctx2.close();
		
		
		
		
	}

}
