package com.javalec.ex;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppCTX.class);
		Subway subway = ctx.getBean("subway", Subway.class);
		
		System.out.println("line : " + subway.getLine());
		System.out.println("statn_nm : " + subway.getStatn_nm());
		System.out.println("adres : " + subway.getAdres());
		System.out.println("rdnmadr : " + subway.getRdnmadr());
		System.out.println("telno : " + subway.getTelno());
		
		ctx.close();
		
		
		
	}
	
}
