package com.javalec.ex.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.command.BCommand;
import com.javalec.ex.command.BListCommand;
import com.javalec.ex.dao.IDAO;
import com.javalec.ex.dto.BDTO;

@Controller
public class BController {
	
	@Autowired
	private SqlSession sqlSession;
	
//	@RequestMapping("list")
//	public String list(Model model) {
//		IDAO dao = sqlSesstion.getMapper(IDAO.class);
//		ArrayList<BDTO> dtos = dao.list();
//		model.addAttribute("list", dtos);
//		
//		return "list";
//	}
	
	BCommand bcom;
	
	@RequestMapping("list")
	public String list(Model model) {
		
		bcom = new BListCommand();
		bcom.execute(sqlSession, model);
		
		
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

		model.addAttribute("content_view", dao.contentView(request.getParameter("bId")));
		
		return "content_view";
	}
	
	@RequestMapping("modify_view")
	public String modify_view(HttpServletRequest request, Model model) {
		
		IDAO dao = sqlSession.getMapper(IDAO.class);
		model.addAttribute("modify_view", dao.modifyView(request.getParameter("bId")));
		
		return "modify_view";
	}
	
	@RequestMapping("modify")
	public String modify(BDTO dto, Model model) {
		
		IDAO dao = sqlSession.getMapper(IDAO.class);
		dao.modify(""+dto.getbId(), dto.getbTitle(), dto.getbContent());
		
		return "redirect:list";
	}
	
	@RequestMapping("delete")
	public String delete(HttpServletRequest request, Model model) {
		
		IDAO dao = sqlSession.getMapper(IDAO.class);
		dao.delete(request.getParameter("bId"));
		
		return "redirect:list";
	}
	
	@RequestMapping("reply_view")
	public String reply_view(HttpServletRequest request, Model model) {
		
		IDAO dao = sqlSession.getMapper(IDAO.class);
		model.addAttribute("reply_view", dao.reply_view(request.getParameter("bId")));
		
		return "reply_view";
	}
	
	@RequestMapping("reply")
	public String reply(BDTO bdto, Model model) {
		
		IDAO dao = sqlSession.getMapper(IDAO.class);
		dao.replyshape(""+bdto.getbGroup(), ""+bdto.getbStep());		
		dao.reply(""+bdto.getbId(), bdto.getbName(), bdto.getbTitle(), bdto.getbContent(),
				   ""+bdto.getbGroup(), ""+bdto.getbStep(), ""+bdto.getbIndent());
		
		return "redirect:list";
	}
	
	
	
	
	
	
}
