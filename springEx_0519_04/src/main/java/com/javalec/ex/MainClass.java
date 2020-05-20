package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
	
		AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCTX.xml");
		Book book = ctx.getBean("book", Book.class);
		Rental rental = ctx.getBean("rental", Rental.class);
		
		book.book_print();
		rental.rental_print();
		
		ctx.close();
	}

}
