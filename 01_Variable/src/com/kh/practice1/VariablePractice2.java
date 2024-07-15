package com.kh.practice1;

import java.util.Scanner;

public class VariablePractice2 {


	
	public static void main(String[] args) {
		
		System.out.print("문자열을 입력하세요 :");
		// 사용자로부터 문자열로 입력을 받는다. => Scanner 
		Scanner sc = new Scanner(System.in); //.next() 띄어쓰기 기준;, 
		// c.next();							 // .nextLine(); Enter 기준  
		
		
		String str = sc.nextLine();
		
		// String 기능 중 문자 하나씩 꺼내오는 메소드 : charAt(위치값)
		
		
		System.out.println("첫 번째 문자 : " + str.charAt(0));
		System.out.println("두 번째 문자 : " + str.charAt(1));
		System.out.println("세 번째 문자 : " + str.charAt(2));
	}	

}
