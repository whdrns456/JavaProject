package com.kh.review;

import java.util.Scanner;

public class If {

	// 조건문 : 조건에 따라 흐름을 제어하고자 할 때 사용  
	// - "조건식"을 통해서 참인지 거짓인지 판단하여 그에 해당하는 코드를 실행 
	// 조건식 결과 : true / false  
	// 비교연산자 : 논리 연산자, 대소/동등, 논리연산자(&&, ||, )
	//
	// - if문
	// if(조건식) {
	//  조건식 결과가 참일 경우                               
	//  } else {조건식 결과가 거짓일 때}
	//  else if 조건식(2){제 1 조건이 거짓이고 제2조건식 조건이 참일 때}  
	// 	else 조건식과 조건식2의 결과가 모두 거짓일 때 실행할 코드 
	//
	// 	 switch(조건식 => 비교대상) {case 값 : } break;를 만나면 switch 종료 
	//   default:                         
	//				// 모든 case 값에 해당되지 않을 경우 실행 코드 

	// 
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 대문자인지 확인하는 코드 = > 
		char  ch = sc.next().charAt(0);
		
		String result;
		
		if(ch >= 'A' && ch <= 'Z') {
			System.out.println("대문자");
		}else {
			System.out.println("대문자 아님");
		}
		
		
		
		
		
		
		
		
		

	}

}
