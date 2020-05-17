package com.javalec.ex;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Medical_record implements InitializingBean, DisposableBean{

	private int mem_num;
	private String clinic_date;
	private String doctor;
	private String nurse;
	private String treatment;
	private String next_clinic_date;
	
	public Medical_record() {
		
	}
	
	public Medical_record(int mem_num, String clinic_date, String doctor, 
			String nurse, String treatment, String next_clinic_date) {
		this.mem_num = mem_num;
		this.clinic_date = clinic_date;
		this.doctor = doctor;
		this.nurse = nurse;
		this.treatment = treatment;
		this.next_clinic_date = next_clinic_date;
	}

	public int getMem_num() {
		return mem_num;
	}

	public void setMem_num(int mem_num) {
		this.mem_num = mem_num;
	}

	public String getClinic_date() {
		return clinic_date;
	}

	public void setClinic_date(String clinic_date) {
		this.clinic_date = clinic_date;
	}

	public String getDoctor() {
		return doctor;
	}

	public void setDoctor(String doctor) {
		this.doctor = doctor;
	}

	public String getNurse() {
		return nurse;
	}

	public void setNurse(String nurse) {
		this.nurse = nurse;
	}

	public String getTreatment() {
		return treatment;
	}

	public void setTreatment(String treatment) {
		this.treatment = treatment;
	}

	public String getNext_clinic_date() {
		return next_clinic_date;
	}

	public void setNext_clinic_date(String next_clinic_date) {
		this.next_clinic_date = next_clinic_date;
	}

	

	public void afterPropertiesSet() throws Exception {
		System.out.println("Medical_record - afterPropertiesSet() 실행됨");
		
	}
	
	public void destroy() throws Exception {
		System.out.println("Medical_record - destroy 실행됨()");
		
	}
	
	
	
}
