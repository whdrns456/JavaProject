package com.kh.pratice;

public class ObjectRun {

	public static void main(String[] args) {
		// 학생을 대상으로 프로그래밍을 해본다면 
		// 객체는 "학생" 객체로 선정
		// 정보 -> 이름 학번 나이 성별  
		// 기능 -> 정보 조회 
		
		
		// 변수를 사용하여 학생의 정보를 관리한다면 
		
		int no1 = 100;
		String name1 = "김인창";
		int age1 = 30;
		char gender1 = '남';
		
		int no2 = 101;
		String name2 = "기다운";
		int age2 = 36;
		char gender2 = '여';
		
		int no3 = 102;
		String name3 = "엄희윤";
		int age3 = 30;
		char gender3 = '여';
		// => 너무 많은 변수가 사용되었다
		// [배열]
		
		
		int[] noArr = new int[3]; 			// 학번 정보를 담을 배열 
		String[] nameArr = new String[] {"카리나","윈터","송하영"};	
												// 이름 정보를 담을 배열
		int[] ageArr = {20, 21, 22};			// 나이 정보를 담을 배열 
		char[] genderArr = new char[3];			// 성별 정보를 담을 배열 
		
		
		noArr[0] = 100;
		nameArr[0] = "임수진";
		ageArr[0] = 20;
		genderArr[0] = '여';
		
		// 클래스를 사용해보자(서로 다른 종류의 데이터를 한 공간에 저장 )
		
		// 생성 : 
		Student s1 = new Student("");
		
		// Student 클래수  변수 호출 
		// s1.no = 100; // 클래스에 선언된 변수는 참조 변수라고도 한다.
		s1.name = "임수진";
		s1.age = 20;
		s1.gender = '여';
		
		Student s3 = new Student(); // 기본 생성자 
		 // s2.no = 101;				// 자바가 실행될 때
		 // s2.name = "카리나";
		
		s3.setName("윈터");
		
		// 
		
		
		

	}

}
