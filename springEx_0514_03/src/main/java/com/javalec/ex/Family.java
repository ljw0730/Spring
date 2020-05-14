package com.javalec.ex;

public class Family {
	String fatherName;
	String motherName;
	String sisterName;
	String brorherName;
	
	public Family() {
		
	}
	
	public Family(String fatherName, String motherName) {
		this.fatherName = fatherName;
		this.motherName = motherName;
	}

	public String getFatherName() {
		return fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	public String getMotherName() {
		return motherName;
	}

	public void setMotherName(String matherName) {
		this.motherName = matherName;
	}

	public String getSisterName() {
		return sisterName;
	}

	public void setSisterName(String sisterName) {
		this.sisterName = sisterName;
	}

	public String getBrorherName() {
		return brorherName;
	}

	public void setBrorherName(String brorherName) {
		this.brorherName = brorherName;
	}
	
	
}
