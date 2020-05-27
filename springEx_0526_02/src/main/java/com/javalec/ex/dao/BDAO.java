package com.javalec.ex.dao;

import java.util.ArrayList;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import com.javalec.ex.dto.BDTO;
import com.javalec.ex.util.Constant;

public class BDAO {

	public JdbcTemplate template;
	
	public BDAO() {
		template = Constant.template;
	}

	public ArrayList<BDTO> list() {
		
		String sql = "select * from mvc_board order by bGroup desc, bStep asc";
		ArrayList<BDTO> list = (ArrayList<BDTO>)template.query(sql, new BeanPropertyRowMapper<BDTO>(BDTO.class)); 
		
		return list;
	}

	public BDTO noticeView(String bId) {
		
		String sql = "select * from mvc_board where bId=" + bId;
		
		BDTO dto = template.queryForObject(sql, new BeanPropertyRowMapper<BDTO>(BDTO.class));
		
		return dto;
	}
	
}
