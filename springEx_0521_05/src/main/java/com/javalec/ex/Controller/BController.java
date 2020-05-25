package com.javalec.ex.Controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javalec.ex.BoardValidator;
import com.javalec.ex.DTO.BoardDTO;

@Controller
public class BController {

	@RequestMapping("board")
	public String board() {
		return "board";
	}
	
	@RequestMapping("boardOk")
	public String boardOk(@Valid BoardDTO boardDTO, BindingResult result) {
		String page = "boardOk";
		
//		BoardValidator validator = new BoardValidator();
//		validator.validate(boardDTO, result);
		if(result.hasErrors()) {
			page = "board";
		}
		
		return page;
	}
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setValidator(new BoardValidator());
	}
}
