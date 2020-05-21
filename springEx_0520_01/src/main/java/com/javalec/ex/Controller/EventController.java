package com.javalec.ex.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EventController {

	@RequestMapping(value="/main")
	public String main() {
		return "main";
	}
	
	
	@RequestMapping(value="/contentView")
	public String contentView() {
		
		return "contentView";
	}
	
	@RequestMapping(value="/event/view")
	public String view(Model model) {
		
		model.addAttribute("id", "naver_admin");
		model.addAttribute("pw", 1234);
		
		return "event/view";
	}
	
	@RequestMapping(value="studentView")
	public String studentView(Model model) {
		
		model.addAttribute("stu_num", "s1001");
		model.addAttribute("name", "홍길동");
		model.addAttribute("major", "컴공");
		model.addAttribute("address", "서울시");
		model.addAttribute("tel", "010-1111-1111");
		
		return "studentView";
	}

	@RequestMapping(value="event/modelView")
	public ModelAndView modelView() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("id", "naver_admin");
		mv.addObject("pw", 1234);
		mv.setViewName("event/modelView");
		
		return mv;
	}
	
}
