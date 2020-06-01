package com.javalec.ex.controller;

import java.util.ArrayList;

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
		ArrayList<BDTO> list = dao.list();
		model.addAttribute("list", list);
		
		return "list";
	}
}
