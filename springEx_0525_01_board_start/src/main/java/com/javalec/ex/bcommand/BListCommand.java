package com.javalec.ex.bcommand;

import java.util.ArrayList;

import org.springframework.ui.Model;

import com.javalec.ex.bdao.BDAO;
import com.javalec.ex.bdto.BDTO;

public class BListCommand implements BCommand {

	@Override
	public void execute(Model model) {

		BDAO dao = new BDAO();
		ArrayList<BDTO> dtos = dao.list();
		model.addAttribute("list", dtos);
		
	}

}
