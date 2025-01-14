package com.kh.hw.person.view;

import java.net.http.HttpClient;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

import com.kh.hw.person.controller.PersonController;
import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonMenu {
		
		Scanner sc = new Scanner(System.in);
		PersonController pc = new PersonController();
	
	
	public void mainMenu() {
		
		int[] count = pc.personCount();
		int scount = count[0];
		int ecount = count[1];
		
	
		
		
		
		while(true) {
			
			System.out.println("학생은 최대 3명까지 저장할 수 있습니다 ");
			System.out.println("현재 저장된 학생은 " +  scount );
							// 메소드를 삽입 시 참조값이 뜬다... 
			System.out.println("사원은 최대 10명까지 저장할 수 있습니다");
			System.out.println("현재 저장된 사원은 " + ecount); // pc.personCount() 이용
			
			System.out.println("1. 학생 메뉴");
			System.out.println("2. 사원 메뉴");
			System.out.println("9 끝내기 ");
			System.out.print(" 메뉴 번호 :");
			int menu = sc.nextInt();	
			
			switch(menu) {
			
			
			case 1: 
				studentMenu();
			break;
			
			case 2: 
				employeeMenu();
			break;
			
			
			case 9: 
				System.out.println("종료합니다 ");
			break;
			
			default: 
				System.out.println("잘못 입력하셨습니다 다시 입력해주세요 ");
		}
	}
}
	
	public void studentMenu() {
		
		int[] count = pc.personCount();
		int scount = count[0];
		int ecount = count[1];
		
		
		int[] sd = pc.personCount();
		
		
	while(true) {
		
		System.out.println("1. 학생 추가");
		System.out.println("2. 학생 보기");
		System.out.println("9 메인으로 : ");
		System.out.print(" 메뉴 번호 : ");
		int menu = sc.nextInt();
		
		switch(menu) {
		
		
		
		case 1: 
			
			if( menu == 1 && scount == 3) {
				System.out.println("활성화 되지 않습니다  " + menu);
				return;
			} else {
				insertStudent();
			}
			
		break;	
		
		case 2: 
			printStudent();
		  break;
		
		case 9: 
			System.out.println("메인으로 돌아갑니다 :");
		return;
		  
		 default : 
			 System.out.println("잘못 입력하셨습니다 다시 입력해주세요 ");
		
		
		}
		
		
		
		
		
	}
		
		
	}
	
	public void employeeMenu() {
		
		int[] e = pc.personCount();
		
		int[] count = pc.personCount();
		int scount = count[0];
		int ecount = count[1];
		
		
		
	while(true) {
		
		
		System.out.println("1. 사원 추가");
		System.out.println("2. 사원 보기");
		System.out.println("9 메인으로 : ");
		System.out.print(" 메뉴 번호 : ");
		int menu = sc.nextInt();
		
		
		switch(menu) {
		
		
		
		
		case 1: 
			insertEmployee();
		break;	
		
		
		case 2: 
			printEmployee();
		break;	
		
		
		case 9: 
			System.out.println("메인으로 돌아갑니다 ");
			return;
			
			default : 
				System.out.println("잘못 입력하셨습니다 다시 입력해주세요");
		
		
		}
	
		
		
		
	}	
	}
	
	
	 public void insertStudent() {
		 
		 System.out.print("학생 이름 :");
		 String name = sc.next();
		 
		 System.out.print("학생 나이 :");
		 int age = sc.nextInt();
		 
		 System.out.print("학생 키 :");
		 double height = sc.nextDouble();
		 
		 System.out.print("학생 몸무게 :");
		 double weight = sc.nextDouble();
		 
		 System.out.print("학생 학년 :");
		 int grade = sc.nextInt();
		 
		 System.out.print("학생 전공 :");
		 String major = sc.next();
		 
		 Student student = new Student(name, age, height, weight, grade, major);
		 
		 
		 
	 }
	
	 public void printStudent(){
		 
		 Student[] s = pc.printStudent();
		 
		 
		 for(int i = 0; i < s.length; i++) {
			 System.out.println(s[i]);
			 
			 
		 }
	 }

	 public void insertEmployee() {
		 
		 
		 
		 System.out.println("사원 이름 :");
		 String name = sc.next();
		 
		 System.out.println("사원 나이 :");
		 int age = sc.nextInt();
		 
		 System.out.println("사원 키 :");
		 double height = sc.nextDouble();
		 
		 System.out.println("사원 몸무게 :");
		 double weight = sc.nextDouble();
		 
		 System.out.println("사원 급여 :");
		 int grade = sc.nextInt();
		 
		 System.out.println("사원 부서 :");
		 String major = sc.next();
		 
		 pc.insertEmployee(name, age, height, weight, grade, major);
		 
		 
		 
	 }
	 
	 
	 public void printEmployee() {
		 
		 Employee[] e = pc.printEmployee();
		 
		 for(Employee employee : e) {
		System.out.println(toString());
			 
		 }
	 }
		 
		 
		 
	 }
	 

	

