package com.javalec.ex;

import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		String config = "";
		
		System.out.println("환경을 선택해 주세요.");
		System.out.println("1)windows 2)tablet 3)mobile");
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.nextLine();
		
		switch (num) {
			case 1:
				config = "windows";
				break;
			case 2:
				config = "tablet";
				break;	
			case 3:
				config = "mobile";
				break;
		}
		
		scan.close();
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config);
		ctx.load("appCTX1.xml", "appCTX2.xml", "appCTX3.xml");
		ctx.refresh();
		
		Configuration configuration = ctx.getBean("configuration", Configuration.class);
		
		System.out.println("접속 완료");
		System.out.println("브라우저 : " + configuration.getBrowser());
		System.out.println("접속 IP : " + configuration.getIpNum());
		System.out.println(configuration.getConnection() + " 접속");
		System.out.println("----------------------------------------");
		
		
		
	}

}
