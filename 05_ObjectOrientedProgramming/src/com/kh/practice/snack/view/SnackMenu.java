package com.kh.practice.snack.view;


import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	// 필드부 변수
	private Scanner sc = new Scanner(System.in);
	
	private SnackController scr = new SnackController();
	
	
	// 생성자부 : 생략 정의하지 않았으나, 자동으로 기본 생성자가 생성될 것이다 
	
	// 메서드부
	public void menu() {
		System.out.println("스낵류를 입력하세요.");
		System.out.print("종류 :");
		String kind = sc.next();
		
		System.out.println("이름 :");
		String name = sc.next();
		
		System.out.println("맛 :");
		String flavor = sc.next();
		
		System.out.println("개수 : ");
		int numOf = sc.nextInt();
		
		System.out.println("가격 :");
		int price = sc.nextInt();
		
		String result = scr.saveData(kind, name, flavor, numOf, price);
		System.out.println(result);
		
		// SnackController를 사용하여 데이터 저장(saveData() : String)
		System.out.println("저장한 정보를 확인하시겠습니까? (y/n) :");
		char yn =sc.next().charAt(0);
		
		//입력된 값이 y인 경우 저장된 정보를 출력 
		if(yn == 'y' || yn == 'n') {
			// SnackController를 사용하여 저장된 데이터 출력  (confirmData() : String)
		}
		// 그렇지 않은 경우 종료 
		
		
		
		
	}	
}
