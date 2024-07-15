package com.kh.practice.token.controller;

import java.util.StringTokenizer;

public class TokenController {
	
	public TokenController(){}

	public String afterToken(String str) {
		
		StringTokenizer st = new StringTokenizer(str, " ");
		StringBuilder sb = new StringBuilder();
		// hasMoreTokens() - > 토크나이징할 때 사용하는 
		// StringTokenizer의 메소드 
		
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			sb.append(token);
		} // nextToken() - > StringTokenizer 
		  // 문자열을 토큰 단위로 분해하고 다음 토큰을 반환한다. 
		  
		// toSting : StringBuilder 객체를 String 객체로 변환합니다.
		return sb.toString();
	}
	
	public String firstCap(String input) {
		
		
		String subStr = input.substring(0,1);
		return subStr.toUpperCase() + input.substring(1);
		
	}

	public int findChar(String input,char one) {
		
		int count = 0;
		for(int i = 0; i < input.length(); i++) {
			if(input.charAt(i) == one) {
				count++;
				}
			}
		return count;
		}
}
	
	
	
	

