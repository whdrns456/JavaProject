package com.kh.practice;



// 인터페이스 구현(상속) 시 implements
public class AndroidPhone implements Phone {

	@Override
	public void call(String number) {
	System.out.println("AndroidPhone.......");
	System.out.println("call....." + number);
	}
	
	// abstract 제외
	
	
	
	
}
