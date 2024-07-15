package com.kh.review;

public class For {

	//	for(초기식; 조건식; 증감식)
	//		// 반복 수행할 코드 
	// - 실행 순서 : 초기식 - > 조건식 -> 조건식의 결과가 true이면 - > 반복 수행할 코드 실행
	//   증감식 - > 조건식 -> true면 -> 반복수행 코드 ->증감식 
	//  초기식 조건식 증감식은 생략 가능하다 단. ;;필수로 입력해야 된다  
	// 증감식 생략 : for(초기식; 조건식;){}
	// 조건식 생략 : for(초기식;; 증감식)
	// 초기식 생략 : for(;조건식; 증감식)
	
	
	// [초기식] 
	// wihile(조건식){
	//	 반복	 수행할 코드 			} 
	//  증감식;
	// do ~ while : 조건에 상관없이 1회 수행 후 조건에 따라 반복 
	// do { 수행할 코드 } while(조건식); 
	// do while은 끝이 세미콜론이다 
	//
	
	/* 분기문 : continue : 뒤에 실행 코드를 무시하고 증감식 또는 조건식으로 이동  
	 * 		  break; : 반복 실행 중 종료하고자 할 때 사용
	 */		  
	
	
	
	public static void main(String[] args) {
		
				
		// 1 ~ 100 단 3의 배수이거나 5의 배수일 경우에는 합산에서 제외
		int num= 1;
		int sum = 0;
		
		for(int i = 1; i <= 100; i++) {
			
			if(i % 3 != 0 && i % 5 != 0) {
				sum += i;		
				
		}			
			
			
		}
			System.out.println(sum);
		}
		
		
		
	}


