package com.javalec.ex;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.javalex.ex.DTO.LoginDTO;

public class LoginValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		
		return LoginDTO.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object org, Errors errors) {
		LoginDTO loginDTO = (LoginDTO)org;
		
		if(loginDTO.getId() == null || loginDTO.getId().trim().isEmpty()) {
			errors.rejectValue("id", "아이디 공백에러");
		}
		
		if(loginDTO.getPw() == null || loginDTO.getPw().trim().isEmpty()) {
			errors.rejectValue("pw", "패스워드 공백에러");
		}
		
		if(loginDTO.getName() == null || loginDTO.getName().trim().isEmpty()) {
			errors.rejectValue("name", "이름 공백에러");
		}
		
	}

	
	
	
}
