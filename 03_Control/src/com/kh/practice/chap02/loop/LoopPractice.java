package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class LoopPractice {

	public void practice1() {

		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int num = sc.nextInt();

		if (0 > num) {
			System.out.print("1이상의 숫자를 입력하세요 :");
		} else {
			for (int i = 1; i <= num; i++) {
				System.out.print(i);
				if (i != num) {
					System.out.print(" ");
				}
			}
		}

	}

	public void practice2() {
		// 무한루프 버전
		Scanner sc = new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세여 :");

		while (true) {

			int num = sc.nextInt();
			if (num <= 0) {
				System.out.print("1이상의 숫자를 입력하세여");
			} else {
				for (int i = 1; i <= num; i++) {
					System.out.print(i);
					if (i != num) {
						System.out.print(" ");
					}
				}
				break;
			}
		}
	}

	public void practice5() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 하나 입력하세요");
		int num = sc.nextInt();

		// int random = (int) (Math.random() * 100 + 1);
		int total = 0;
		for (int i = 1; i <= num; i++) {
			total += i; //
			System.out.print(i);

			if (i != num) {
				System.out.print(" + ");
			}
		}
		System.out.print(" = " + total);

	}

	public void practice6() {

		Scanner sc = new Scanner(System.in);

		System.out.print("첫 번째 숫자 :");
		int fNum = sc.nextInt();
		System.out.print("두 번째 숫자 :");
		int sNum = sc.nextInt();

		if (fNum < 1 || sNum < 1) {
			System.out.print("1 이상의 숫자를 입력해주세요 :");
		} else {
			
			int min = (fNum < sNum) ? fNum : sNum;
			int max = (fNum < sNum) ? sNum : fNum;
			
		
			
			
			
			for (int i = min; i <= max; i++) {
				System.out.print(i);
				if (i != max) {
					System.out.print(" ");
				} 
			} 
		}
		 
}

	

	public void practice8() {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int mul = sc.nextInt();

		System.out.println("=====" + mul + "단=====");
		for (int j = 1; j <= 9; j++) {
			System.out.println(mul + " * " + j + " = " + mul * j);
		}

	}

	public void practice9() {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 : ");
		int mul = sc.nextInt();

		if (mul > 9) {
			System.out.println("9 이하만 눌러주세요");
		} else {
			for (int i = 2; i < 10; i++) {
				System.out.println("====" + i + "단 =====");
				for (int j = 2; j < 10; j++) {
					System.out.println(j + " * " + i + " = " + j * i);
				}
			}
		}
	}

	public void practice12() {

		Scanner sc = new Scanner(System.in);
		
		
		while(true) {                                       // while문 ()조건식이 true이므로 특정한 분기문이 없으면 무한루프에 들어간다. 
															// 1. 사용자가 연산자 기호를 입력 
			System.out.print("연산자(+, -, *, /, %) :");		//
			String str = sc.next();
			
			if(str.equals("exit")) {						// while 문은 참이므로 무한 반복하지만 if문 안에 exit를 입력하면 참이므로 break를 실행하여 
			System.out.println("시스템을 종료 합니다 :");			// 무한 반복에서 벗어난다. 
			break;
		 }	
			
			System.out.println("정수 1:");                   // 2. 정수형1를 입력 
			int num1 = sc.nextInt();					
			System.out.println("정수 2:");					// 3. 정수형2를 입력
			int num2 = sc.nextInt();
			
			switch(str) {									// switch에서 사용자가 1.에서 입력한 연산자에 따라서 case를 실행.
			
			case "+" :	
				System.out.printf("%d %s %d = %d\n", num1,str, num2, num1 + num2 );
			break;
			
			case "-" :
				System.out.printf("%d %s %d = %d\n ", num1,str, num2, num1 - num2);
			break;
			
			case "*" :
				System.out.printf("%d %s %d = %d\n", num1,str, num2, num1 * num2 );
			break;
			
			case "/" :
				if(num2 == 0) {
					System.out.println("0으로는 나눌 수 없습니다 다시 입력해주세요");
				} else {
				System.out.printf("%d %s %d =%d\n ", num1, str, num2,  num1 / num2 );
				}
			break;
			
			case "%" :
				if(num2 == 0) {
					System.out.println("0으로는 나머지 값을 구할 수 없습니다 다시 입력해주세요");
				} else {
				System.out.printf("%d %s %d =%d\n ", num1, str, num2, num1 % num2 );
				}
			
			default:                                                // case 안에 입력 된 연산자가 없으면 default를 실행한다 
				System.out.printf("없는 연산자입니다. 다시 입력해주세요");
			
			}
		}
	}

	public void practice13() {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수 : ");
		int num = sc.nextInt();

		if (num <= 0) {
			System.out.print("양수가 아닙니다");
		}

		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				System.out.print("수");
			} else {
				System.out.print("박");
			}
		}

	}

	public void practice14() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("정수 : ");
			int num = sc.nextInt();

			if (num <= 0) {
				System.out.print("정수가 아닙니다");
				continue;
			}

			for (int j = 1; j <= num; j++) {
				if (j % 2 == 0) {
					System.out.print("수");
				} else {
					System.out.print("박");
				}
			}
			break;
		}
	}
}
