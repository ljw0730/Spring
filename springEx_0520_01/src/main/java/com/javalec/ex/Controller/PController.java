package com.javalec.ex.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PController {

	@RequestMapping(value="/productView")
	public String productView() {
		
		return "";
	}
	
}
