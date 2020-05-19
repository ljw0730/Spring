package com.javalec.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("appCTX.xml");
		ctx.refresh();
		
		Subway subway = ctx.getBean("subway", Subway.class);
		
		System.out.println("line : " + subway.getLine());
		System.out.println("statn_nm : " + subway.getStatn_nm());
		System.out.println("adres : " + subway.getAdres());
		System.out.println("rdnmadr : " + subway.getRdnmadr());
		System.out.println("telno : " + subway.getTelno());
		
		ctx.close();
	}

}
