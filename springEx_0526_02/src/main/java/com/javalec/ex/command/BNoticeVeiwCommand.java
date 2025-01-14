package com.javalec.ex.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.javalec.ex.dao.BDAO;
import com.javalec.ex.dto.BDTO;

public class BNoticeVeiwCommand implements BCommand {

	@Override
	public void execute(Model model) {
		Map<String, Object> map = model.asMap();
		
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		
		String bId = request.getParameter("bId");
		
		BDAO dao = new BDAO();
		BDTO dto = dao.noticeView(bId);
		
		model.addAttribute("notice_view", dto);
		
		
		
	}

}
