package com.javalec.ex;

public class Stu_score {

	Score_process score_process;
	
	String stu_num;
	String stu_name;
	int kor;
	int eng;
	int math;
	int total;
	double avg;
	
		
	public void setScore_process(Score_process score_process) {
		this.score_process = score_process;
	}

	public void setStu_num(String stu_num) {
		this.stu_num = stu_num;
	}

	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	/////////////////////////////////////////////////
	
	public void grade() {
		score_process.print_grade(avg);
	}
}
