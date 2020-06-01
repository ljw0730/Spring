package com.javalec.ex.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.dao.IDAO;
import com.javalec.ex.dto.BDTO;

@Controller
public class BController {

	@Autowired
	SqlSession sqlSession;
	
	@RequestMapping("list")
	public String list(Model model) {
		IDAO dao = sqlSession.getMapper(IDAO.class);
		ArrayList<BDTO> dtos = dao.list();
		model.addAttribute("list", dtos);
		
		return "list";
	}
	
	@RequestMapping("write_view")
	public String write_view() {
		return "write_view";
	}
	
	@RequestMapping("write")
	public String write(BDTO bdto, Model model) {
		
		IDAO dao = sqlSession.getMapper(IDAO.class);
		dao.write(bdto.getbName(), bdto.getbTitle(), bdto.getbContent());
		
		return "redirect:list";
	}
	
	@RequestMapping("content_view")
	public String content_view(HttpServletRequest request, Model model) {
		
		IDAO dao = sqlSession.getMapper(IDAO.class);
		
		dao.upHit(request.getParameter("bId"));
		BDTO dto = dao.contentView(request.getParameter("bId"));
		model.addAttribute("content_view", dto);
		
		return "content_view";
	}
	
	@RequestMapping("modify_view")
	public String modify_view(HttpServletRequest request, Model model) {
		
		IDAO dao = sqlSession.getMapper(IDAO.class);
		BDTO dto = dao.modifyView(request.getParameter("bId"));
		model.addAttribute("modify_view", dto);
		
		return "modify_view";
	}
	
	@RequestMapping("modify")
	public String modify(BDTO dto, Model model) {
		
		IDAO dao = sqlSession.getMapper(IDAO.class);
		dao.modify(""+dto.getbId(), dto.getbTitle(), dto.getbContent());
		
		return "redirect:list";
	}
	
	@RequestMapping("reply_view")
	public String reply_view(HttpServletRequest request, Model model) {
		IDAO dao = sqlSession.getMapper(IDAO.class);
		BDTO dto = dao.reply_view(request.getParameter("bId"));
		model.addAttribute("reply_view", dto);
		
		return "reply_view";
	}
	
	@RequestMapping("reply")
	public String reply(BDTO dto, Model model) {
		IDAO dao = sqlSession.getMapper(IDAO.class);
		dao.replyshape(""+dto.getbGroup(), ""+dto.getbStep());
		dao.reply(""+dto.getbId(), dto.getbName(), dto.getbTitle(), dto.getbContent(), 
				""+dto.getbGroup(), ""+dto.getbStep(), ""+dto.getbIndent());
		
		return "redirect:list";
	}
	
	
	
}
