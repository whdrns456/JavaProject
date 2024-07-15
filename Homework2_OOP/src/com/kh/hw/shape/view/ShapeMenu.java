package com.kh.hw.shape.view;

import java.util.Scanner;

import com.kh.hw.shape.controller.SquareController;
import com.kh.hw.shape.controller.TriangleController;

public class ShapeMenu {

	
	// 변수 3개, 생성자 : 0
	private Scanner sc = new Scanner(System.in);
	 
	private SquareController scr = new SquareController();
	
	private TriangleController tc = new TriangleController();
	// 메소드부
	
	public void inputMenu(){
		
	
		while (true) {
		System.out.println("=====도형 프로그램==========");
		System.out.println("3. 삼각형 :");
		System.out.println("4. 사각형 :");
		System.out.println("9. 프로그램 종료 :");
		int num =sc.nextInt();
		System.out.println("메뉴 번호 : " + num);
		
		switch(num) { // 비교대상이될 메뉴
		
		
		case 3 : this.triangleMenu(); 
			break;
				
		case 4 : this.squareMenu(); 
			break;
			
		case 9: 
			System.out.println("프로그램 종료");
			return;
			
			default:
				System.out.println("잘못된 번호입니다 다시 입력해주세요");
			
		}
	}
		
}
		
	
	
	public void triangleMenu(){
	
	while(true) {	
	
		
		
		System.out.println("===== 삼각형 ======" );
		System.out.println("1. 삼각형 면적  : " );
		System.out.println("2. 삼각형 색칠  : " );
		System.out.println("3. 삼각형 정보 : " );
		System.out.println("9. 메인으로 : " );
		System.out.print("메뉴 번호 : "  );
		int trnum = sc.nextInt();
		
		switch(trnum) {
		
		case 1:	this.inputSize(3, trnum);
		// 1. 삼각형 면적 메뉴 선택시 
		break;
		
			
		case 2:this.inputSize(3, 2);
			break;
			
			
		case 3: printInformation(3);
			break;
			
		case 9: System.out.println("메인으로 돌아갑니다 ");
			return; // 함수를 끝내겠다
			
			// 출력 후 inputMeanu
		
			default : System.out.println("잘못된 번호입니다 ");
			
		
		}
	}
}
	
	public void squareMenu() {
		
	
		while(true) {
		
		System.out.println("===== 사각형 ======" );
		System.out.println("1.사각형 둘레  : " );
		System.out.println("2.사각형 면적  : " );
		System.out.println("3.사각형 색칠  : " );
		System.out.println("4.사각형 정보 : " );
		System.out.println("9. 메인으로 : " );
		int sqNum = sc.nextInt();
		System.out.println("메뉴 번호 : " + sqNum );
		
		
		
		
		switch(sqNum) {
		
		case 1: this.inputSize(4, sqNum); // 4 : 사각형 타입, 1: 사각형 메뉴 중 1번 메뉴
			break;
		case 2: this.inputSize(4, sqNum);	
			break;
		case 3: this.inputSize(4, 3);
			break;
		case 4: 
			printInformation(4); // 사각형 타입
			break;
		case 9: 
			System.out.println("메인으로 돌아갑니다");
			return; // 메인메뉴 돌아가는 메소드를 종료하고 호출된 위치로 돌아간다.
			
		default:
			System.out.println("잘못된 번호입니다 다시 입력해주세요");		
				
	  }
	}
}	
		
			
			
		
		
	
	
	public void inputSize(int type,int menuNum){
		
		
		
		if(type == 3 && menuNum == 1 ) {
		
		System.out.println("높이 :");
		double henum = sc.nextDouble();
		System.out.println("너비 :");
		double winum = sc.nextDouble();
		// double area = tr.calcArea
		System.out.println("삼각형 면적 :" + tc.calcArea(henum, winum));
		} else if(type == 3 && menuNum == 2) {
			System.out.println("색깔을 입력하세요 :");
			String cstr = sc.next();
			tc.paintColor(cstr); //
			System.out.println("색이 수정되었습니다 :"+ cstr);
		} else if(type == 4 && menuNum == 1 ) {
			
			System.out.println("높이 :");
			double henum = sc.nextDouble();
			System.out.println("너비 :");
			double winum = sc.nextDouble();
			System.out.println("사각형 둘레 " + scr.calcPerimeter(henum, winum));
			
			
		} else if(type == 4 && menuNum == 2 ) {
		
			System.out.println("높이 :");
			double henum = sc.nextDouble();
			System.out.println("너비 :");
			double winum = sc.nextDouble();
			// double perimeter = scr.calcPerimeter(henum, winum);
			System.out.println("사각형 " + scr.calcArea(henum, henum));
			
		} else if(type == 4 && menuNum == 3) {
			System.out.println("색깔을 입력하세요 ");
			
			System.out.print("색이 수정되었습니다 ");
			String cstr = sc.next();
			scr.paintColor(cstr);
		}			
	}
					
	public void printInformation(int type){
		
		
		if(type == 3) {
			System.out.println(tc.print());
		}else if(type == 4) {
			System.out.println(scr.print());
		}
	}	
}
