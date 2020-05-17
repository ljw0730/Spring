package com.javalec.ex;

import java.util.ArrayList;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
		ctx.load("classpath:appCTX.xml");
		
		ctx.refresh(); //initializingBean()

		Member_all member_all = ctx.getBean("member_all", Member_all.class);
		ArrayList<Member> list = member_all.getList();
		
		Medical_record medical_record3 = ctx.getBean("medical_record3", Medical_record.class);
		
		for(int i = 0; i < list.size(); i++) {
			Member mm = (Member)list.get(i);
			
			if(mm.getMem_num() == medical_record3.getMem_num()) {
				System.out.println("======================================");
				System.out.println("환자번호 : " + mm.getMem_num());
				System.out.println("이름 : " + mm.getName());
				System.out.println("나이 : " + mm.getAge());
				System.out.println("성별 : " + mm.getGender());
				System.out.println("연락처 : " + mm.getPhone());
				System.out.println("주소 : " + mm.getAddress());
				System.out.println("수술경험 : " + mm.getS_record());
				System.out.println("------------- 치료 기록 -------------");
				System.out.println("치료 일자 : " + medical_record3.getClinic_date());
				System.out.println("담당 의사 : " + medical_record3.getDoctor());
				System.out.println("담당 간호사 : " + medical_record3.getNurse());
				System.out.println("치료 내용 : " + medical_record3.getTreatment());
				System.out.println("다음 예약방문일 : " + medical_record3.getNext_clinic_date());
				System.out.println("======================================");
				
			}
		}
		
		ctx.close(); //disposableBean()
		
	}
	
}
