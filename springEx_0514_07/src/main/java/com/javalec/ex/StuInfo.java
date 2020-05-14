package com.javalec.ex;

import java.util.ArrayList;

public class StuInfo {

	private ArrayList<Student> list = new ArrayList<Student>();
	
	public StuInfo() {
		
	}
	
	public StuInfo(ArrayList<Student> list) {
		this.list = list;
	}

	public ArrayList<Student> getList() {
		return list;
	}

	public void setList(ArrayList<Student> list) {
		this.list = list;
	}
	
	
	
}
