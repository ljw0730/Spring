package com.javalec.ex;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.DTO.LoginDTO;

@Controller
public class IController {

	@RequestMapping(value="input")
	public String input() {
		return "input";
	}
	
	@RequestMapping(value="inputOk")
	public String inputOk(LoginDTO loginDTO, BindingResult result) {
		
		String page = "inputOk";
		
		LoginValidator validator = new LoginValidator();
		validator.validate(loginDTO, result);
		
		if(result.hasErrors()) {
			page = "input";
		}
		
		
		
		
		return page;
	}
	
}
