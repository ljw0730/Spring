package com.javalec.ex.bcommand;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.javalec.ex.bdao.BDAO;
import com.javalec.ex.bdto.BDTO;

public class BContentViewCommand implements BCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub

		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		String bId = request.getParameter("bId");
		
		BDAO dao = new BDAO();
		BDTO dto = dao.contentView(bId);
		model.addAttribute("content_view", dto);
		
	}

}
