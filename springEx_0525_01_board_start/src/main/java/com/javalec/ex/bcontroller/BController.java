package com.javalec.ex.bcontroller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.bcommand.BCommand;
import com.javalec.ex.bcommand.BContentViewCommand;
import com.javalec.ex.bcommand.BListCommand;
import com.javalec.ex.util.Constant;

@Controller
public class BController {

	
	BCommand bcom = null;
	
	
	// JDBC 연결
	public JdbcTemplate template;
	
	
	@Autowired // servlet-context의 값을 자동으로 변수에 주입
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
		Constant.template = this.template;
	}

	
	// 링크 연결
	
	@RequestMapping("list")
	public String list(Model model) {
		bcom = new BListCommand();
		bcom.execute(model);
		
		return "list";
	}
	
	@RequestMapping("content_view")
	public String content_view(HttpServletRequest request, Model model) {
		
		model.addAttribute("request", request);
		
		bcom = new BContentViewCommand();
		bcom.execute(model);
		
		return "content_view";
	}
	
}
