package com.javalec.ex.bcommand;

import java.sql.Timestamp;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.javalec.ex.dao.BDAO;
import com.javalec.ex.dto.BDTO;

public class BReplyCommand implements BCommand {

	@Override
	public void execute(Model model) {
		
		Map<String, Object> map = model.asMap();
		HttpServletRequest request = (HttpServletRequest)map.get("request");
		
		String bId = request.getParameter("bId");
		String bName = request.getParameter("bName");
		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");
		String bDate = request.getParameter("bDate");
		String bHit = request.getParameter("bDate");
		String bGroup = request.getParameter("bDate");
		String bStep = request.getParameter("bDate");
		String bIndent = request.getParameter("bDate");
		
		BDAO dao = new BDAO();
		dao.reply(bId, bName, bTitle, bContent, bDate, bHit, bGroup, bStep, bIndent);
		
		
		
		
		
		
	}

}
