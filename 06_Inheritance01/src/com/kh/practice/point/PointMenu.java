package com.kh.practice.point;

import java.util.Scanner;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

public class PointMenu {

	private Scanner sc = new Scanner(System.in);
	private CircleController  cc = new CircleController();
	private RectangleController rc = new RectangleController();
	
	// 기본 생성자는 자동으로 생성될 것! 
	
	
	public void mainMenu(){
		

		
	
		while(true) {
			
			
			System.out.println("1. 원 : ");
			System.out.println("2. 사각형 :");
			System.out.println("9. 끝내기 :");
			System.out.print("메뉴 번호 :");
			int menu = sc.nextInt();
		
		switch(menu) {
		
		case 1: 
				circleMenu(); // 원메뉴 호출 
			break;
			
			
		case 2: 
				rectangleMenu(); // 사각형 메뉴 호출
			break;
		
		case 9: 
			 System.out.println("시스템을 끝내겠습니다");
		return;
		
		
		default: System.out.println("잘못 입력하셨습니다 다시 입력해주세요 ");
		
			 
		
		}
		
		}
		
		
	}
	
	public void circleMenu(){
		
		while(true) {
		
		System.out.println("=======원 메뉴========");
		System.out.println("1.원 둘레 :");
		System.out.println("2.원 넓이 :");
		System.out.println("9. 메인으로 :");
		int menu = sc.nextInt();
		System.out.print("메뉴번호 : " + menu);
		
		
		switch(menu) {
		
		case 1: 
			calcCircum();
		break;
		
		
		case 2: 
			calcCircleArea();
		break;
		
		
		case 9: 
			System.out.println("메인으로 돌아갑니다");
		return;
		
		
		default : 
			System.out.println("잘못 입력하셨습니다 다시 입력해주세요 ");
		return;	
		
}
		
		
		
		
		}
		
	}
	
	public void rectangleMenu(){
		
		
		while(true) {
		System.out.print("=======사각형========");
		System.out.print("1.사각형 둘레 ");
		System.out.print("2.사각형 넓이 :");
		
		System.out.print("9.메인으로:" );
		System.out.print("메뉴번호 :");
		int menu = sc.nextInt();
		
		switch(menu) {
		
		case 1: 
			calcPerimeter();
			break;
		case 2: 
			calcRectArea();
			break;
		case 9:
			System.out.println("메인으로 돌아갑니다");
		return; // 현재 메소드에서는 굳이 사용을 안해도 됨. 
		
		default : 
			System.out.println("잘못 입력하셨습니다 ");
		return;
		
		}	
	}		
}
	
	public void calcCircum(){
		
		System.out.print("x 좌표 :");
		int xmenu = sc.nextInt();
		
		System.out.print("y 좌표 :");
		int ymenu = sc.nextInt();
		
		System.out.print("반지름 :");
		int pimenu = sc.nextInt();
		
		System.out.println(cc.calcCircum(xmenu, ymenu, pimenu));
		// 
		
	}
	
	public void calcCircleArea() {
		
		System.out.print("x 좌표 :");
		int xmenu = sc.nextInt();
		System.out.print("y 좌표 :");
		int ymenu = sc.nextInt();
		System.out.print("반지름 :");
		int pimenu = sc.nextInt();
		
		System.out.println(cc.calcArea(xmenu, ymenu, pimenu));
		
	}
	
	public void calcPerimeter() {
		
		System.out.print("x 좌표 :");
		int xmenu = sc.nextInt();
		System.out.print("y 좌표 :");
		int ymenu = sc.nextInt();
		System.out.print("높이 :");
		int h = sc.nextInt();
		System.out.print("너비 :");
		int w = sc.nextInt();
		
		
		System.out.println(rc.calcPerimeter(xmenu, ymenu, h, w));
		
		
		
	}
	
	public void calcRectArea() {
		
		System.out.print("x 좌표 :");
		int xmenu = sc.nextInt();
		System.out.print("y 좌표 :");
		int ymenu = sc.nextInt();
		System.out.print("높이 :");
		int h = sc.nextInt();
		System.out.print("너비 :");
		int w = sc.nextInt();
		
		System.out.println(rc.calcArea(xmenu, ymenu, h, w));
		
		
	}
	
	 
	
	
	
	
}
