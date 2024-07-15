package com.kh.example.practice3.model.vo;

public class Circle {

	 private static final double PI= 3.14; // 원주율
	 private static int radius = 1; // 반지름 
	 
	 // 생성자 부 
	 public Circle(){}
	 
	 
	 
	 public void incremenRadius(){
		 	radius++;
	 }
	 
	 public void getAraOfCircle(){
		 // 넓이 계산 후 출력 
		 System.out.println("원 넓이 : " +  PI * radius * radius);
	 }
	 // 
	 public void getSizeOfCircle(){
		 System.out.println("원위 둘레 : " + (PI * 2) * radius );
	 }
	 
	 
	 
	 
	
}
