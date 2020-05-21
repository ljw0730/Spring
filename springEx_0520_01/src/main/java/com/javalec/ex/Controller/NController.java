package com.javalec.ex.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
// 여기에 @RequestMapping를하면 함수의 @RequestMapping 앞에 붙는다.
@RequestMapping(value="/notice")
public class NController {

	@RequestMapping(value="/noticeView")
	public String noticeView() {
		return "notice/noticeView";
	}
	
	
}
