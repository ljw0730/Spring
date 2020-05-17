package com.javalec.ex;

import java.io.IOException;

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
			propertySources.addLast(new ResourcePropertySource("classpath:server.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}

		GenericXmlApplicationContext ctx2 = (GenericXmlApplicationContext) ctx;
		ctx2.load("appCTX.xml");
		ctx2.refresh();
		
		ServerConn serverConn = ctx2.getBean("serverConn", ServerConn.class);
		
		System.out.println("auth : " + serverConn.getAuth());
		System.out.println("driverClassName : " + serverConn.getDirverClassName());
		System.out.println("url : " + serverConn.getUrl());
		System.out.println("username : " + serverConn.getUsername());
		System.out.println("password : " + serverConn.getPassword());
		System.out.println("name : " + serverConn.getName());
		System.out.println("type : " + serverConn.getType());
		System.out.println("maxActive : " + serverConn.getMaxActive());
		System.out.println("maxWait : " + serverConn.getMaxWait());
		
		ctx.close();
		ctx2.close();
		
	}

}
