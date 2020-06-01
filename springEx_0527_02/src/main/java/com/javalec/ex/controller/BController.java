package com.javalec.ex.controller;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.dao.IDAO;

@Controller
public class BController {

	@Autowired
	private SqlSession sqlSession;
	
	@RequestMapping("list")
	public String lsit(Model model) {
		
		IDAO dao = sqlSession.getMapper(IDAO.class);
		model.addAttribute("list", dao.list());
		
		
		return "list";
	}
	
	
}
