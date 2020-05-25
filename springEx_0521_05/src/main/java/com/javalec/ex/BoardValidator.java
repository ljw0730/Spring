package com.javalec.ex;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.javalec.ex.DTO.BoardDTO;

public class BoardValidator implements Validator {


	@Override
	public boolean supports(Class<?> clazz) {

		return BoardDTO.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {

		BoardDTO boardDTO = (BoardDTO) target;
		
		if(boardDTO.getB_num() == null || boardDTO.getB_num().trim().isEmpty()) {
			System.out.println("게시판번호 빈공백에러");
			errors.rejectValue("b_num", "게시판번호 빈공백에러");
		}
		
		if(boardDTO.getB_title() == null || boardDTO.getB_title().trim().isEmpty()) {
			System.out.println("제목 빈공백에러");
			errors.rejectValue("b_title", "제목 빈공백에러");
		}
		
		if(boardDTO.getB_content() == null || boardDTO.getB_content().trim().isEmpty()) {
			System.out.println("내용 빈공백에러");
			errors.rejectValue("b_content", "내용 빈공백에러");
		}
		
		if(boardDTO.getB_date() == null || boardDTO.getB_date().trim().isEmpty()) {
			System.out.println("작성일 빈공백에러");
			errors.rejectValue("b_date", "작성일 빈공백에러");
		}
		
	}

}
