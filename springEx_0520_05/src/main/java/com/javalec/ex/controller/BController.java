package com.javalec.ex.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.javalec.ex.Board;

@Controller
public class BController {

	@RequestMapping(value="board/form1")
	public String form1() {
		return "board/form1";
	}
	
	@RequestMapping(value="board/formOk1")
	public String formOk1(HttpServletRequest request, Model model) {
		
		int b_num = Integer.parseInt(request.getParameter("b_num"));
		String b_title = request.getParameter("b_title");
		String b_content = request.getParameter("b_content");
		String b_date = request.getParameter("b_date");
		int b_group = Integer.parseInt(request.getParameter("b_group"));
		int b_step = Integer.parseInt(request.getParameter("b_step"));
		int b_indent = Integer.parseInt(request.getParameter("b_indent"));
		
		model.addAttribute("b_num", b_num);
		model.addAttribute("b_title", b_title);
		model.addAttribute("b_content", b_content);
		model.addAttribute("b_date", b_date);
		model.addAttribute("b_group", b_group);
		model.addAttribute("b_step", b_step);
		model.addAttribute("b_indent", b_indent);
		
		
		return "board/formOk1";
	}
	
	/////////////////////////////////////////////////
	
	@RequestMapping(value="board/form2")
	public String form2() {
		return "board/form2";
	}
	
	@RequestMapping(value="board/formOk2")
	public String formOk2(@RequestParam("b_num")int b_num,
			@RequestParam("b_title")String b_title,
			@RequestParam("b_content")String b_content,
			@RequestParam("b_date")String b_date,
			@RequestParam("b_group")int b_group,
			@RequestParam("b_step")int b_step,
			@RequestParam("b_indent")int b_indent,
			Model model) {
		
		model.addAttribute("b_num", b_num);
		model.addAttribute("b_title", b_title);
		model.addAttribute("b_content", b_num);
		model.addAttribute("b_date", b_date);
		model.addAttribute("b_group", b_group);
		model.addAttribute("b_step", b_step);
		model.addAttribute("b_indent", b_indent);
		
		return "board/formOk2";
	}
	
	/////////////////////////////////////////////////
	
	@RequestMapping(value="board/form3")
	public String form3() {
		return "board/form3";
	}
	
	@RequestMapping(value="board/formOk3")
	public String formOk3(Board board) {
		
		return "board/formOk3";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
