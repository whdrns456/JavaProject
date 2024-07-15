package com.kh.practice.chap01;

import java.util.Scanner;



public class ControlPractice {
	public void practice1(){
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		
		System.out.print("메뉴 번호를 입력하세요 :");
		int num = sc.nextInt(); //내가 하는 반복적인 실수 
		
		if(num == 1) {
			System.out.println("입력 메뉴입니다");
		} else if (num == 2) {
			System.out.println("수정 메뉴입니다");
		}else if (num == 3) {
			System.out.println("조회 메뉴입니다");
		}else if (num == 4) {
			System.out.println("삭제 메뉴입니다");
		}else if (num == 7) {
			System.out.println("종료 메뉴입니다");
		}
	}
	 public void practice2(){
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("숫자를 한 개 입력하세요 :");
		 int num = sc.nextInt(); 
		
		 	if(num > 0){ 
			if(num % 2 == 0) {
				System.out.println("짝수다");
			} 
			else  {
			 System.out.println("홀수다");
			} 
		 	} else  {
			 System.out.println("양수만 입력해주세요");
		 } 
	 }
	 public void practice3(){
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("국어 점수 :");
		 int kr = sc.nextInt();
		 System.out.print("수학 점수 :");
		 int meth = sc.nextInt();
		 System.out.print("영어 점수 :");
		 int eng = sc.nextInt();
		 
		 double avg = (kr + meth + eng) / 3;
		 int total = kr + eng + meth; 
		 
		 if(avg < 40) {
			 System.out.println("불합격 입니다");
		 } else if(kr > 40 && meth > 40 && eng > 40) {
			 System.out.println("국어 :" + kr);
			 System.out.println("수학 :" + meth);
			 System.out.println("영어 :" + eng);
			} else {
				 System.out.println("불합격 입니다");
			}
		 	  if(avg >= 60) {
		 		 System.out.println("합계 :" + total);
		 		 System.out.println("평균 :"  + avg); 
		 		 System.out.println("축하합니다 합격입니다");
			}
		}
	
	 public void practice4(){
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("1~12 사의 정수 입력 :" );
		 int num = sc.nextInt();
		
		 switch(num) {
	 
		 case 12:
		 case 1 : 
		 case 2 :
			 System.out.println(num +"월 겨울입니다");
		 break;
		 
		 case 3:
		 case 4: 
		 case 5:
			 System.out.println(num +"월은 봄입니다");
		 break;	 
		
		 case 6:
		 case 7: 
		 case 8:
			 System.out.println(num +"월은  여름 입니다");
		 break;
		 
		 case 9:
		 case 10: 
		 case 11:
			 System.out.println(num +"월은  가을 입니다");
		 break;
		 
		 default: // default : 콜론 :
			  System.out.println(num +"월은 잘못 입력된 달입니다 ");
		 }
		 
	 }
	 public void practice5(){
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("아이디 : ");
		 String id = sc.next();
		 
		 System.out.print("비밀번호 : ");
		 String pw = sc.next();
		 
		 if(id.equals("myId")) {
			 if(pw.equals("myPassword")) {
				 System.out.println("로그인 성공");
		} 
			 else if(!id.equals("myId")) {
				 System.out.println("아이디가 틀렸습니다");
		} else {
			 System.out.println("비밀번호가 틀렸습니다");
		}
	 }
 }
	 public void practice6(){
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("권한을 확인하고자 하는 회원 등급 :");
		 String oder = sc.next();
		 
		 switch(oder) {
		 	
		 		case "관리자" :  
		 			 System.out.println("회원 관리, 게시글 작성, 댓글 작성, 게시글 조회 ");
		 		break;
		 		
		 		case "회원" :
		 			System.out.println("댓글 작성, 게시글 조회 ");
		 		break;
			 		
		 		case "비회원" :
		 			System.out.println("게시글 조회 ");
		 	}
		 }
	 
	 public void practice7(){
		 Scanner sc = new Scanner(System.in);
		 
		 
		 System.out.print("키(m)를 입력해 주세요 : " );
		 double h = sc.nextDouble();
		 System.out.print("몸무게(kg)를 입력해 주세요 :");
		 double w = sc.nextDouble();
		 
		 double bmi = w / ( h * h);
		 System.out.println("BMI 지수 :" + bmi);
		 
		 
		 
		 
		 if(bmi > 18.5) {
			 System.out.println("저체중");
		 }else if(bmi >= 18.5 && bmi < 23) {
			 System.out.println("정상체중");
		 }else if(bmi >= 23 && bmi < 25) {
			 System.out.println("과체중");
		 }else if(bmi >= 25 && bmi < 30) {
			 System.out.println("비만"); 
		 } else {
			 System.out.println("고도 비만"); 
			 }
		 }
	 
	public void practice8(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 :");
		int num1 = sc.nextInt();
		System.out.print("피연산자2 :");
		int num2 = sc.nextInt();
		System.out.print("연산자를 입력(+,_,/,%)");
		String str = sc.next();
		
		System.out.print(num1 + str + num2 + "= ");
		
		
		if(str.equals("+")) {
			System.out.println(num1 + num2);
		}else if(str.equals("-")) {
			System.out.println(num1 - num2);
		}else if(str.equals("/")) {
			System.out.println(num1 / num2);
		}else if(str.equals("%")) {
			System.out.println(num1 % num2);
		}else if(str.equals("*")) {
			System.out.println((num1 * num2));
		}
	}
	
	
	public void practice9(){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 :");
		int mid = sc.nextInt();
		System.out.print("기말 고사 점수");
		int last = sc.nextInt();
		System.out.print("과제 점수 :");
		int repolt = sc.nextInt();
		System.out.print("출석 점수 :");
		int at = sc.nextInt();
		
		double total = mid + last + repolt + at; 
		double  avg  =  (mid * 0.2) + (last * 0.3)+ (repolt * 0.3) + at;
		double atp	 =  20 * 0.7; 
		
		System.out.println("===============결과==================");
		
		if(at < atp ) {
			System.out.println("[Fail 출석 횟수 부족 (" + at + "/20)]");
		}else if(avg < 70) {
			System.out.println("중간 고사 점수[20] :"  + mid * 0.2 );
			System.out.println("기말 고사 점수[30] :"  + last * 0.3 );
			System.out.println(" 과제 점수 [20] : "  + repolt * 0.3 );
			System.out.println(" 출석 점수 [20] : "  +  at * 0.2 );
			System.out.println(" 총점 :" + avg);
			System.out.println("[Fail]");
		}   
			else if(avg >= 70) {
			System.out.println("중간 고사 점수[20] :"  + mid * 0.2 );
			System.out.println("기말 고사 점수[30] :"  + last * 0.3 );
			System.out.println(" 과제 점수 [20] : "  + repolt * 0.3 );
			System.out.println(" 출석 점수 [20] : "  + (double) at );
			System.out.println(" 총점 :" + avg);
			System.out.println("[pass]");
			}
		
	}
}

	
		
		
		
	
	 	
	

