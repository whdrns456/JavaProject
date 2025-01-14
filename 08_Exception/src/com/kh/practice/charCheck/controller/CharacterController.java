package com.kh.practice.charCheck.controller;

import javax.swing.text.ChangedCharSetException;

import com.kh.practice.charCheck.exception.CharCheckException;


public class CharacterController extends Exception {

	
	CharCheckException cc = new CharCheckException();
	
	
	public CharacterController() {
		
	}
   
	//  throws			// 메소드 헤드 부분 
	public int countAlpha(String s) throws CharCheckException{
		
		// 매개변수로 들어온 값에 영문자가 몇 개 들어있는지 반환
		
		int count = 0;
		
		for(int i = 0; i < s.length();  i++) {
			
			if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' 
			|| s.charAt(i) >= 'a' && s.charAt(i) <= 'z' ) {
				
				count++;	
				System.out.println(s +"에 포함된 영문자 개수 :" + count );
				
			}
			if(s.charAt(i) == ' ') {
				throw new CharCheckException("체크한 문자가 공백입니다 ");
			}
		
			// throw new CharChecException()
		}
		
		
		
		
		// 공백일 때 예외 발생 
			return count;
	}
}
