package com.kh.practice1;


// Scanner 클랫 import : 외부 경로의 클래스를 사용할 때 선언한다. 

import java.util.Scanner;

public class VariablePractice1 {
	public static void main(String[] args) {
		
		// Scanner 객체 생성 
		
		Scanner sc = new Scanner(System.in); // Scanner(System.in);
		
	
		
		
		System.out.print("이름을 입력하세요 :"   );
		String name = sc.nextLine();
		System.out.print("나이를 입력하세요 : "   );
		int age = sc.nextInt();
		System.out.print("키를 입력하세요 :"   );
		double height = sc.nextDouble();
		System.out.print("성별을 입력하세요(남/여) :" );
		String gender = sc.next();
		
		
		System.out.print("키 "+ height + "cm인 " + age + 
				"살 " + gender + "자 " 
				+name + " 반갑습니다"	 );      
		}

}
