package com.kh.practice;

import java.io.IOException;
import java.security.PublicKey;
import java.util.Scanner;

public class ValueLengthException extends Exception {

	private String msg;

	public ValueLengthException(){
		
	}
	
	public ValueLengthException(String msg){
		super(msg);
	}
	
	
	public static void  ValueLengthException01() throws ValueLengthException {
		
	
		
		Scanner sc = new Scanner(System.in);	
		System.out.println("-------2------");
		System.out.print("4글자 이상 입력해주세요");
		String value = sc.next();
		
		
		if(value.length() <= 3) {
			System.out.print("excption(3)");
			throw new ValueLengthException("입력된 길이가 3 이하입니다. 4글자 이상 입력해주세요");
		} // 문제를 호출한 위치에서 해결하고자 할 때 1 throws
		System.out.println(value);
		
	}
	
	public static void main(String[] args) throws ValueLengthException {
		System.out.println("-------1------");
		try {
			
			ValueLengthException01();	
		}catch (ValueLengthException e) {
			e.printStackTrace();
			
		}
		System.out.println("-------6------");
		
		
		
		 
}
}
