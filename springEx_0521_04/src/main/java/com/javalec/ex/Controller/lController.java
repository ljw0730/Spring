package com.javalec.ex.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.LoginValidator;
import com.javalex.ex.DTO.LoginDTO;

@Controller
public class lController {

	@RequestMapping(value="login")
	public String login() {
		return "login";
	}
	
	@RequestMapping(value="loginOk")
	public String loginOk(LoginDTO loginDTO, BindingResult result) {
		
		String page = "loginOk";
		
		LoginValidator validator = new LoginValidator();
		validator.validate(loginDTO, result);
		
		if(result.hasErrors()) {
			page = "login";
		}
		
		
		return page;
	}
	
}
