package com.kh.practice;

import java.security.PublicKey;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class ExceptionRun {

	public static void main(String[] args) {
	
		
		
		
		/* 1. ArithmeticException, InputMismatchException 
		 *  사용자로부터 2개의 정수를 입력 받고,
		 *  첫번째 입력된 값이 두번째 입력된 값의 배수인지 확인하여 
		 *  배수인 경우에은 "x은 x의 배수입니다." 출력 
		 *  배수가 아닌 경우에는 "x은 x의 배수가 아닙니다." 출력
		 *  (프로그램이 정상적으로 종료될 수 있도록 시작지점에 "--------start------")
		 *               				마지막 지점에 "--------end------"
		 */
		
	
		// exceptionTest1();
		exceptionTest2();
		
		
		
	
		
	}		
	
	public static void exceptionTest1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------start----------");
		try 
		{
			System.out.print("정수 1 : " );
			int num1 = sc.nextInt(); 
			System.out.print("정수 2 : " );
			int num2 = sc.nextInt();
			
			if(num1 % num2 == 0  ) { //  ArithmeticException java.lang 경로에 있어서 import 생략
				System.out.println(num1 + "은" + num2 + "의 배수입니다" );
			}else {
				System.out.println("배수가 아닙니다");
			}
		}   // InputMismatchException util 경로에 있어 import 필요
		    catch (ArithmeticException | InputMismatchException e) {
				e.printStackTrace();
			}
		
		System.out.println("-------end------");
	}
	
	
	
	
	public static void exceptionTest2() {
		
		/* NegativeArraySizeException,  ArrayIndexOutOfBoundsException
		 * -5 ~ 5 사이의 난수를 발생시켜 해당 난수 크기로 배열을 생성한 후에 
		 * 1부터 배열 크기만큼 1씩 증가시키면서 값을 저장한 후 출력 
		 * (프로그램이 정상적으로 종료되는 것을 확인하기 위해 처음과 끝에 "start", "end" 출력)
		 * 
		 *  Math.random(); 0.0 <= 1.0  * (끝값 - 시작값 + 1) + 시작값
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------start----------");
		
		int random  = (int)Math.random() * 11 - 5;
		
		try { // try : 예외발생을 관찰하는 영역 
		// int num = sc.nextInt();
		// 배열에 값 저장 1 ~ .. 
		int[] arr = new int[random];
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}
		
		} catch(NegativeArraySizeException | ArrayIndexOutOfBoundsException e) {
		 e.printStackTrace();
	 } // catch : 작성한 예외 발생 시 잡아서 중괄호 {}안에서 처리하겠다
	
	System.out.println("-------end------");
}
}	
	/* 
	 *  사용자에게 입력받은 값의 길이가 3 이하인 경우 
	 *  - Exception 클래스 상속 : 
	 *  - 생성자 (기본/매개변수 1개 -> msg:String)
	 *  - 클래스명: ValueLengthException
	 *  main 메소드에서 예외처리 
	 */
	
		
		
		
		
		
	
	
	
	
			

