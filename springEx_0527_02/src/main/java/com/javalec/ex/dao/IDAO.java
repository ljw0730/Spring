package com.javalec.ex.dao;

import java.util.ArrayList;

import com.javalec.ex.dto.BDTO;

public interface IDAO {
	
	public ArrayList<BDTO> list();
	public void write(String bName, String bTitle, String bContent);
	public BDTO contentView(String bId);
	public void upHit(String bId);
	public BDTO modifyView(String bId);
	public void modify(String bId,  String bTitle, String bContent);
	public BDTO reply_view(String bId);
	public void reply(String bId, String bName, String bTitle, String bContent, 
						String bGroup, String bStep, String bIndent);
	public void replyshape(String bGroup, String bStep);
	public void delete(String bId);
	
	
}
