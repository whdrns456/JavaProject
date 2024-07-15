package com.kh.practice;

public class StringBuilder {

	

	public StringBuilder(String str) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스레드 safe 보장되지 않음 (단일 스레드 사용)
		
		// StringBuilder 객체 생성 시 String 타입의 변수 필요 
		String str = "Winter";
		StringBuilder sb = new StringBuilder(str);
		
		

	}

}
