package com.javalec.ex;

import java.io.IOException;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;

public class MainClass {

	public static void main(String[] args) {
		
		
		// 외부파일 읽어오기
		ConfigurableApplicationContext ctx = new GenericXmlApplicationContext();
		ConfigurableEnvironment env = ctx.getEnvironment();
		MutablePropertySources propertySource = env.getPropertySources(); // 외부 파일 넣을 곳을 지정함
		
		// 외부파일 주입하기
		try {
			propertySource.addLast(new ResourcePropertySource("classpath:admin.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		GenericXmlApplicationContext ctx2 = (GenericXmlApplicationContext)ctx;
		ctx2.load("classpath:appCTX.xml");
		ctx2.refresh();
		
		AdminConnection adminConnection = ctx2.getBean("adminConnection", AdminConnection.class);
		
		System.out.println("ID : " + adminConnection.getAdminId());
		System.out.println("PW : " + adminConnection.getAdminPw());
		
		ctx.close();
		ctx2.close();
		
		
		
		
	}

}
