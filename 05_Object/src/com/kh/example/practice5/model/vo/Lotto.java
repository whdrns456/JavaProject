package com.kh.example.practice5.model.vo;

import java.util.Arrays;

public class Lotto {
	
	// 필드부 
	private int[] lotto = new int[6];
	// 초기화 블록 
	{
			
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)((Math.random() * (45 + 1) )); 
			// 로또 i번째 위치까지
			System.out.print(lotto[i] + " ");
			// 로또 배열의 i번째 위치에 랜덤값 1~45
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println();
	
	
	
	
	
	
	} //초기화 블록에 6개 정수데이터를 담을 배열 할당
	
	
	
	public Lotto(){}
	
	// 메서드부 
	
	// for(int num : lotto) 향상된 for문 
	// 배열의 첫번째 위치부터 마지막위치까지 순서대로 데이터에 접근
	// for(자료형 변수명 : 배열명) --> 자료형은 배열의 자료형과 일치해야 함 
	
	public void information(){
		// Arrays.toString()
		
		System.out.println(Arrays.toString(lotto));
		
		System.out.println("===================");
		
		
		for(int num : lotto) {
			System.out.print(num  + " ");
		}
		
		System.out.println();
	}
}

