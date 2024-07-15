package com.kh.practice.chap02_abstractNInterface;

// 추상 클래스 
// CellPhone, TouchDisplay 상속
public abstract class SmartPhone implements CellPhone, TouchDisplay {
	
	private String maker; // 변수 제조사 성보
	
	
	public SmartPhone() {} 
	
	// 기본 생성자 : 
	// SmartPhone 6개 메소드
	
	public abstract String printInformation();
	 
	public String getMaker() {
		return maker;
	}


	public void setMaker(String maker) {
		this.maker = maker;
	}
} 
	
	

