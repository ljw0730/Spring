package com.javalec.ex.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.command.BCommand;
import com.javalec.ex.command.BNoticeCommand;
import com.javalec.ex.command.BNoticeVeiwCommand;
import com.javalec.ex.util.Constant;

@Controller
public class BController {

	BCommand bcom;
	
	JdbcTemplate template;

	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
		Constant.template = this.template;
	}
	
	@RequestMapping("notice")
	public String notice(Model model) {
		bcom = new BNoticeCommand();
		bcom.execute(model);
		
		
		return "notice";
	}
	
	@RequestMapping("notice_view")
	public String notice_view (HttpServletRequest request, Model model){
		model.addAttribute("request", request);
		bcom = new BNoticeVeiwCommand();
		bcom.execute(model);		
		
		return "notice_view";
	}
	
	
}
