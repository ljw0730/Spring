package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX.xml");

		NoticeBoard noticeBoard = ctx.getBean("noticeBoard", NoticeBoard.class);
		EventBoard eventBoard = ctx.getBean("eventBoard", EventBoard.class);
		Join join = ctx.getBean("join", Join.class);
		
		noticeBoard.noticeBoard_print();
		eventBoard.eventBoard_print();
		join.join_print();
		
		ctx.close();
		
	}

}
