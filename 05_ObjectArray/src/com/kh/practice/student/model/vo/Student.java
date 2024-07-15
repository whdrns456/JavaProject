package com.kh.practice.student.model.vo;

public class Student { // model 부분이다 
					   //  
	
	public String name; 	// 이름
	public String subject;  // 과목
	public int score; 		// 점수 
	
	
	public Student() {}
	
	public Student(String name, String subject, int score) {
		
		this.name = name;
		this.subject = subject;
		this.score = score;
	}
	
	
	public String inform(){
		return "name " + name + " subject " + subject + " score " + score;
	} // Student 클래스의 모든 샘플 데이터의 값으로 초기화 해주는 기본 생성자 

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
	


	
}
