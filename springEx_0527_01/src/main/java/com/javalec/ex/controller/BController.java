package com.javalec.ex.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
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
import com.javalec.ex.dao.IDAO;
import com.javalec.ex.command.BModifyCommand;
import com.javalec.ex.command.BModifyViewCommand;
import com.javalec.ex.command.BContentViewCommand;
import com.javalec.ex.command.BDeleteCommand;
import com.javalec.ex.util.Constant;

@Controller
public class BController {

	
	// mybatis template 사용하는 경우
	private SqlSession sqlSession;
	
	
	
	
	
	
	// jdbc template 사용하는 경우
//	BCommand bcom;
//	
//	JdbcTemplate template;
//
//	@Autowired
//	public void setTemplate(JdbcTemplate template) {
//		this.template = template;
//		Constant.template = this.template;
//	}
	
	@RequestMapping("list")
	public String list(Model model) {
		
		// mybatis 에 있는 객체를 가져옴
		IDAO dao = sqlSession.getMapper(IDAO.class);
		model.addAttribute("list", dao.list());
		
		
		
//		bcom = new BListCommand();
//		bcom.execute(model);
		return "list";
	}
	
//	@RequestMapping("write_view")
//	public String write_view(Model model) {
//		return "write_view";	// form화면
//	}
//	
//	@RequestMapping("write") // 작성자, 제목, 내용
//	public String write(HttpServletRequest request, Model model) {
//		model.addAttribute("request", request);
//		bcom = new BWriteCommand();
//		bcom.execute(model);
//		
//		
//		return "redirect:list";
//	}
//	
//	@RequestMapping("content_view") // list -> 제목 클릭 시
//	public String content_view(HttpServletRequest request, Model model) {
//		model.addAttribute("request", request);
//		bcom = new BContentViewCommand();
//		bcom.execute(model);
//		
//		return "content_view";
//	}
//	
//	@RequestMapping("modify_view")
//	public String modify_view(HttpServletRequest request, Model model) {
//		model.addAttribute("request", request);
//		bcom = new BModifyViewCommand();
//		bcom.execute(model);		
//		
//		return "modify_view";
//	}
//	
//	
//	@RequestMapping("modify")
//	public String modify(HttpServletRequest request, Model model) {
//		model.addAttribute("request", request);
//		bcom = new BModifyCommand();
//		bcom.execute(model);		
//		
//		return "redirect:list";
//	}
//	
//	@RequestMapping("delete")
//	public String delete(HttpServletRequest request, Model model) {
//		model.addAttribute("request", request);
//		bcom = new BDeleteCommand();
//		bcom.execute(model);
//		
//		return "redirect:list";
//	}
//	
//	
//	
//	
//	@RequestMapping("reply_view")
//	public String reply_view(HttpServletRequest request, Model model) {
//		model.addAttribute("request", request);
//		bcom = new BReplyViewCommand();
//		bcom.execute(model);		
//		
//		return "reply_view";
//	}
//	
//	
//	@RequestMapping("reply")
//	public String reply(HttpServletRequest request, Model model) {
//		model.addAttribute("request", request);
//		bcom = new BReplyCommand();
//		bcom.execute(model);		
//		
//		return "redirect:list";
//	}
//	
	
	
	
	
	
	
	
	
	
	
	
}
