package com.javalec.ex;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PCotroller {

	// 주소의 마지막 부분을 변수로 인식한다.
	// student/다음으로 오는 모든 것을 변수로 인식한다.
	@RequestMapping(value="student/{studentId}")
	public String pathViewOk(@PathVariable String studentId, Model model) {
		
		model.addAttribute("studentId", studentId);
		
		return "student/pathViewOk";
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
