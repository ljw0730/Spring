package com.javalec.ex;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LController {

	@RequestMapping(value="form")
	public String form() {
		return "form";
	}
	
	//별칭주기
	@RequestMapping(value="formOk")
	public String formOk(@ModelAttribute("stu") Student student) {
							//@ModelAttribute 별칭주기
		return "formOk";
	}
	
	///////////////////////////////////////////////////////////
	
	@RequestMapping(value="form2")
	public String form2() {
		return "form2";
	}
	
	@RequestMapping(value="checkOk")
	public String checkOk(HttpServletRequest request, Model model) {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
			
		if(id.equals("naver_admin")) {
			model.addAttribute("id", id);
			model.addAttribute("pw", pw);
			return "redirect:loginOk";
		}
		else {
			return "redirect:loginfail";
		}
	}
	
	@RequestMapping(value="loginOk")
	public String loginOk() {
		return "loginOk";
	}
	
	@RequestMapping(value="loginfail")
	public String loginfail() {
		return "loginfail";
	}
	
}
