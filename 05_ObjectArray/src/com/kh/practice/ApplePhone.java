package com.kh.practice;

public class ApplePhone implements Phone{

	@Override // 
	public void call(String number) {
	// 오버라이딩 범위 public이라면 public만 고정	
	System.out.println("ApplePhone........");
	System.out.println("call " + number );
		
	}
	
	
	
	
}
