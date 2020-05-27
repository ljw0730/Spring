package com.javalec.ex.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.command.BCommand;
import com.javalec.ex.command.BListCommand;
import com.javalec.ex.command.BReplyCommand;
import com.javalec.ex.command.BReplyViewCommand;
import com.javalec.ex.command.BWriteCommand;
import com.javalec.ex.command.BModifyCommand;
import com.javalec.ex.command.BModifyViewCommand;
import com.javalec.ex.command.BContentViewCommand;
import com.javalec.ex.command.BDeleteCommand;
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
	
	@RequestMapping("list")
	public String list(Model model) {
		bcom = new BListCommand();
		bcom.execute(model);
		return "list";
	}
	
	@RequestMapping("write_view")
	public String write_view(Model model) {
		return "write_view";	// form화면
	}
	
	@RequestMapping("write") // 작성자, 제목, 내용
	public String write(HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		bcom = new BWriteCommand();
		bcom.execute(model);
		
		
		return "redirect:list";
	}
	
	@RequestMapping("content_view") // list -> 제목 클릭 시
	public String content_view(HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		bcom = new BContentViewCommand();
		bcom.execute(model);
		
		return "content_view";
	}
	
	@RequestMapping("modify_view")
	public String modify_view(HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		bcom = new BModifyViewCommand();
		bcom.execute(model);		
		
		return "modify_view";
	}
	
	
	@RequestMapping("modify")
	public String modify(HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		bcom = new BModifyCommand();
		bcom.execute(model);		
		
		return "redirect:list";
	}
	
	@RequestMapping("delete")
	public String delete(HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		bcom = new BDeleteCommand();
		bcom.execute(model);
		
		return "redirect:list";
	}
	
	
	
	
	@RequestMapping("reply_view")
	public String reply_view(HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		bcom = new BReplyViewCommand();
		bcom.execute(model);		
		
		return "reply_view";
	}
	
	
	@RequestMapping("reply")
	public String reply(HttpServletRequest request, Model model) {
		model.addAttribute("request", request);
		bcom = new BReplyCommand();
		bcom.execute(model);		
		
		return "redirect:list";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
