package com.javalec.ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.DTO.StudentDTO;


@Controller
public class JController {

	@RequestMapping(value="form")
	public String form() {
		return "form";
	}
	
	
	@RequestMapping(value="formOk")
	public String formOk(@ModelAttribute("dto") StudentDTO studentDTO) {
		return "formOk";
	}
	
	
	
}
