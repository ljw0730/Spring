package com.javalec.ex;

import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {

		String config="";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("서버를 선택해 주세요.");
		System.out.println("1)test 2)server");
		int num = scan.nextInt();
		scan.nextLine();
		
		switch (num) {
			case 1:
				config="test";
				break;

			case 2:
				config="server";
				break;
		}
		
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		ctx.getEnvironment().setActiveProfiles(config);
		
		// 클래스 등록
		ctx.register(AppConfig1.class, AppConfig2.class);

		ctx.refresh();
		
		ServerInfo serverInfo= ctx.getBean("serverInfo", ServerInfo.class);
	
		System.out.println("서버에 접속하였습니다.");
		System.out.println("서버 IP : " + serverInfo.getIpNum());
		System.out.println("서버 Port : " + serverInfo.getPortNum());
		
		ctx.close();
		
		
	}

}
