package com.kh.practice.token.view;

import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {
	
	private Scanner sc = new Scanner(System.in);
	private TokenController tc = new TokenController();
	
	public void mainMenu() {
		
		while(true) {
		
			System.out.println("1.지정 문자열 :");
			System.out.println("2.입력 문자열 :");
			System.out.println("9.프로그램 끝내기 :");
			System.out.print("메뉴 번호 :");
			int menu = sc.nextInt();
			
			switch(menu) {
			
			case 1:  // 지정 문자열 
				tokenMenu();
				break;
				
			case 2: // 입력 문자열 
				inputMenu();
				break;
				
			case 9: // 프로그램 종료 
				System.out.println("프로그램을 종료합니다.");
				return;
				
			default: 
				System.out.println("잘못 입력하셨습니다. 다시 입력하세요");
			}
		}
	}
	
	public void tokenMenu() {
		
		String str =  "J a v a P r o g r a m"; 
		
		
		
		System.out.println("토큰 처리 전 글자 :" + str); // 
		System.out.println("토큰 처리 전 개수"+ str.length()); // 길이로
		String strToken  = tc.afterToken(str);
		// afterToken() 반환 값을 가지고 
		// 토큰 처리 후 글자, 토큰 처리 후 개수 , 모두 대문자로 변환 시키기
		System.out.println("토큰 처리 후 글자 : " + strToken); 
		// 
		System.out.println("토큰 처리 후 글자 : " + strToken.length());
		System.out.println("모두 대문자로 변환 : " + strToken.toUpperCase());
		
		
	}
	
	public void inputMenu() {
		
		System.out.println("문자열을 입력하세요 : ");
		String menu = sc.next();
		String fiststr =  tc.firstCap(menu);
		// 매개변수로 받아온 input의 첫 번째 글자만 대문자로 바꾸고
		
		System.out.println("찾을 문자를 하나 입력하세요 :");
		char chstr =  sc.next().charAt(0);
		int count = tc.findChar(fiststr, chstr);
		System.out.println(chstr + "문자가 들어간 개수 :" + count);
	}
}
		 
		 
			
	
	
		

