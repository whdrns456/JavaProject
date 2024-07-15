package com.kh.hw.person.model.vo;



// model이 되는 Student 클래스 
// TODO  Person class를 상속 
public class Student extends Person {
	
	private int grade;  // 학년
	private String major; // 전공
	
	
	
	
	
	// 
	public String toString() {
		// 강건강, 20, 178.2, 70.0, 1, 정보시스템공학과
		
	
		
		return super.toString() + grade + major; 
	}
	
	
	
	
	
	
	
	
	
	public Student(String name, int age, double height, double weight, int grade, String mahor) {
		
		super(name, age, height, weight);
		
		this.grade =grade;
		this.major = mahor;
		} // 매개 변수 6개를 받는 생성자 
	
	public Student() {} // 기본 생성자 
	
	// 생성자 부 

	public int getGrade() {
		return grade;
	}


	public void setGrade(int grade) {
		this.grade = grade;
	}


	public String getMajor() {
		return major;
	}


	public void setMajor(String major) {
		this.major = major;
	}

	
	
}
