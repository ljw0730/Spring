package com.javalec.ex;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.javalec.ex.DTO.LoginDTO;

public class LoginValidator implements Validator{

	// 검색 할 객체
	@Override
	public boolean supports(Class<?> clazz) {

		return LoginDTO.class.isAssignableFrom(clazz);
	}

	// 검증할 방법을 구현
	@Override
	public void validate(Object obj, Errors errors) {
		LoginDTO loginDTO = (LoginDTO)obj;
		
		if(loginDTO.getId() == null || loginDTO.getId().trim().isEmpty()) {
			errors.rejectValue("id", "아이디 공백에러");
		}
		
//		if(loginDTO.getId().length() >= 3) {
//			errors.rejectValue("idlength", "3자리이하 에러");
//		}
		
		if(loginDTO.getPw() == null || loginDTO.getPw().trim().isEmpty()) {
			errors.rejectValue("pw", "패스워드 공백에러");
		}
		
	}

	
	
	
	
	
}
