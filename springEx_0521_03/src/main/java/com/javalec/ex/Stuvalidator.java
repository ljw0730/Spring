package com.javalec.ex;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.javalec.ex.DTO.StuDTO;

public class Stuvalidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		
		return StuDTO.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		StuDTO stuDTO = (StuDTO)obj;
		
		if(stuDTO.getStu_num() == null || stuDTO.getStu_num().trim().isEmpty()) {
			errors.rejectValue("stu_num", "학생번호 공백에러");
		}
		
		if(stuDTO.getName() == null || stuDTO.getName().trim().isEmpty()) {
			errors.rejectValue("name", "학생이름 공백에러");
		}
		
		if(stuDTO.getMajor() == null || stuDTO.getMajor().trim().isEmpty()) {
			errors.rejectValue("major", "학과 공백에러");
		}
		
		if(stuDTO.getTel() == null || stuDTO.getTel().trim().isEmpty()) {
			errors.rejectValue("tel", "연락처 공백에러");
		}
		
	}

	
	
}
