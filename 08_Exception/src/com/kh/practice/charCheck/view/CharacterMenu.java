package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu extends CharCheckException {
	
	CharacterController cc = new CharacterController();
	
	public void menu() {
	
	Scanner sc = new Scanner(System.in);
	
	

	//  cc.countAlpha(s) 단일 생성 시 안됨 
	// 예외를 던지고 있다. 
	try {
		
		System.out.print("문자열 :");
		String s = sc.nextLine();
		
		int count = cc.countAlpha(s);
		
		System.out.println(s + "에 포함된 영문자 개수 : "  + count);
	}catch(CharCheckException e) {
		
		e.printStackTrace();
	}
	
	 

	
	
	
	}

	
}