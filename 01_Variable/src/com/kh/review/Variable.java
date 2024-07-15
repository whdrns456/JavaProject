package com.kh.review;

public class Variable {

	public static void main(String[] args) {
		
		printVariable();
		
		
			
	}

	
	
		public static void printVariable() {
		
		//   변수의 목적?  
		// - 데이터를 저장하기 위한 공간	
		// - 가독성이 증가(변수 이름에 의미 있게 지어줌으로써) 
		// - 재사용성이 증가한다 (한 번 값을 저장하여 필요할 때마다 변수 이름을 사용할 수있다)
		// - 유지보수가 쉬워진다 (한 번 저장해놓은 위치에 값을 변경함)
		
		
		// ex) 월급 = 시급 X 근무시간 X 근무일수 
		// 아이유 : 0000원 형식으로 출력  
		System.out.println("아이유 : " + (9860 * 6 * 14) + "원");
		System.out.println("홍길동 : " + (9860 * 8 * 14) + "원");
		System.out.println("차은우 : " + (9860 * 6 * 14) + "원");
		System.out.println("카리나 :" +  (9860 * 6 * 14) + "원");
		
		// 변수 사용 시 
		int pay = 9860;
		int time = 6;
		int day = 14;
		System.out.println("=====================================");
		
		System.out.println("아이유 : " + (pay *  time * day) + "원");
		System.out.println("홍길동 : " + (pay *  8  * day) + "원");
		System.out.println("차은우 : " + (pay * time * day) + "원");
		System.out.println("카리나 : " +  (pay * time * day) + "원");
		
		
	}
	
}
