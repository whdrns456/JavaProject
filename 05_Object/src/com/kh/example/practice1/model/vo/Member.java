package com.kh.example.practice1.model.vo;




// 생성자 -- 인스턴스 생성/ 초기화가 필요한 경우 초기화 작업
// 접근제한자 생성자명

public class Member {
	
	// 변수 선언
	// 접근제한자 [예약어] 자료형 변수명 [= 값];
	
	private String memberld;
	private String memberPwd;
	private String memberName;
	private int age;
	private char gender;
	private String phone;
	private String email;
	
	public Member(){
		// 기본 생성자	
		}
	
	public void changeName(String name) {
		// memberName 변수의 값을 전달된 name 값으로 변경
		memberName = name;
	}
	
	public void  printName() {
		// memberName 변수의 값을 출력 
		System.out.println(memberName);
		
	}

	
	
	
	
	
}
