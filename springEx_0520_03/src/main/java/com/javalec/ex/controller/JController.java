package com.javalec.ex.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class JController {

	
	@RequestMapping(value="join/join")
	public String join() {
		return "join/join";
	}
	
	@RequestMapping(method=RequestMethod.POST, value="join/joinOk")
	public String joinOk(HttpServletRequest request, Model model) {
		String mem_num = request.getParameter("mem_num");
		String mem_name = request.getParameter("mem_name");
		String address = request.getParameter("address");
		String tel = request.getParameter("tel");
		String birth = request.getParameter("birth");
		
		model.addAttribute("mem_num", mem_num);
		model.addAttribute("mem_name", mem_name);
		model.addAttribute("address", address);
		model.addAttribute("tel", tel);
		model.addAttribute("birth", birth);
		
		return "join/joinOk";
	}
	
	@RequestMapping(method=RequestMethod.GET, value="join/joinOk")
	public ModelAndView joinOk(HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		
		String mem_num = request.getParameter("mem_num");
		String mem_name = request.getParameter("mem_name");
		String address = request.getParameter("address");
		String tel = request.getParameter("tel");
		String birth = request.getParameter("birth");
		
		mv.addObject("mem_num", mem_num);
		mv.addObject("mem_name", mem_name);
		mv.addObject("address", address);
		mv.addObject("tel", tel);
		mv.addObject("birth", birth);
		
		mv.setViewName("join/joinOk");
		
		return mv;
	}
	
	
	
	
	
}
