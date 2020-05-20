package com.javalec.ex;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BController {
	
	@RequestMapping(value="board/list")
	public String list() {
		return "board/list";
	}
	
	@RequestMapping(value="board/update")
	public String update() {
		return "board/update";
	}
	
	@RequestMapping(value="board/insert")
	public String insert() {
		return "board/insert";
	}
	
	@RequestMapping(value="board/delete")
	public String delete() {
		return "board/delete";
	}
}
