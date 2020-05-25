package com.javalec.ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.DTO.MemberDTO;

@Controller
public class JController {

	@RequestMapping(value="join02_info_input")
	public String join_input() {
		return "join02_info_input";
	}
	
	
	@RequestMapping(value="join03_success")
	public String join_success(@ModelAttribute("dto") MemberDTO memberDTO) {
		return "join03_success";
	}
	
	
	@RequestMapping(value="join02_info_input2_1")
	public String join_input2() {
		return "join02_info_input2_1";
	}
	
	
	@RequestMapping(value="join02_info_input2_2")
	public String join_input_result(MemberDTO memberDTO) {
		return "join02_info_input2_2";
	}
	
}
