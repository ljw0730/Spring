package com.javalec.ex.command;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

import com.javalec.ex.dao.IDAO;

public class BListCommand implements BCommand {

	@Override
	public void execute(SqlSession sqlSession, Model model) {
		
		IDAO dao = sqlSession.getMapper(IDAO.class);
		model.addAttribute("list", dao.list());

	}

}
