package com.javalec.ex.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.Stuvalidator;
import com.javalec.ex.DTO.StuDTO;

@Controller
public class SController {

	@RequestMapping(value="form")
	public String form() {
		return "form";
	}
	
	@RequestMapping(value="formOk")
	public String formOk(StuDTO stuDTO, BindingResult result) {
		
		String page = "formOk";
		
		Stuvalidator validator = new Stuvalidator();
		validator.validate(stuDTO, result);
		
		if(result.hasErrors()) {
			page = "form";
		}
		
		
		return page;
	}
	
}
