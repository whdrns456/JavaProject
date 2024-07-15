package com.kh.practice.chap01_poly.view;

import java.util.Scanner;

import com.kh.practice.chap01_poly.controller.LibraryController;
import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.Member;


public class LibraryMenu {
	
	
	private LibraryController lc = new LibraryController();
	
	private	Scanner sc = new Scanner(System.in);

	private AniBook[] bList;
	
	
	
	
	
	
	public LibraryMenu(){} // 기본 생성자 
	
	
	public void mainMenu() {
	
			// 메인 메뉴 출력 메소드. 	
			
			System.out.print("이름 :");
			String name = sc.next();
			
			System.out.println("나이 :");
			int age = sc.nextInt();
			
			System.out.println("성별 :");
			char gender = sc.next().charAt(0);
			
			Member m = new Member(name, age, gender);
			lc.insertMember(m); // 매개변수 3개 전달된다 
			// 이름과 나이, 성별이 정의된 곳은 Member 클래스 
			// 매개변수 3개를 받는 생성자가 위치해 있다.
			
		while(true) {
			
			System.out.println("==========메뉴========");
			System.out.println("1.마이페이지");
			System.out.println("3 도서 검색 ");
			System.out.println("4.도서 대여하기");
			System.out.println("9. 프로그램 종료하기");
			System.out.print(  "메뉴 번호 :");
			int menu = sc.nextInt();
			
			
			switch(menu) {
			// 동등 비교에는 switch가 좋다
			
			
			case 1: 
				// Member 객체 mInfo 
				Member mInfo = lc.myInfo();
				// lc.myInfo()를 출력문에 넣었을 땐?
				// 멤버 타입으로 선언된 mem이라는 필드의 getter 메소드 역할 
				System.out.println(mInfo);
				
				// 재정의가 되었구나. 
				
				break;
				
				 
				
			
			case 2:  selectAll();
				break;	// 같은 클래스 내 그냥 호출 
			
			case 3: searchBook();
				break;	
				
			case 4: rentBook();
				break;
				
			case 9: System.out.println("프로그램을 종료합니다 ");
				return;
			}
		}
	}
	
	
	
	public void selectAll() {
		// 도서 전체 목록 출력 메소드 		
		
		// LibraryController의 selectAll()메소드 호출하여
		// 결과 값 Book[] 자료형 bList에 담기
		// for문 이용하여 bList의 모든 도서 목록 출력
		// 단, i를 이용하여 인덱스도 같이 출력 → 대여할 때 도서번호를 알기 위해
		// ex ) 0번도서 : 백종원의 집밥 / 백종원 / tvN / true
		
		
		Book[] bList = lc.selectAll();
		
		for(int i =0; i < bList.length; i++) {
		System.out.println(i +"번 도서 :" + bList[i]);
		}
		// toString을 안해도 변경이 된다 toString이 생략이 된다. 
		// toString 호출할때 참조 변수만 
		
		
	}
	
	
	public void  searchBook(){
		
		// "검색 관련된 키워드 "
		System.out.println("검색할 제목 키워드 :");
		String keyword = sc.next();
		
		Book[] searchList = lc.searchBook(keyword); // 키워드 전달
		
		for(Book b : searchList) {
			if(b != null) {				// i번째라는 위츠를 변수 b로 접근 
				System.out.println(b); // toString이 생략됨
			}
		}
		
		
		
		
		
		
	}
	
	public void rentBook() {
		
		//대여할 도서 인덱스를 입력 받아
		//LibraryController의 rentBook 메소드
		//→ 결과 값을 result로 받아 result가
		//0일 경우, 1일 경우, 2일 경우 각각에
		//해당하는 출력문 출력
		
		// 도서대여를 위해 도서번호를 알아야 하기 때문에 selecAll()메소드 호출 
		selectAll();
		
		System.out.print("대여할 도서 번호 선택 : ");
		int index = sc.nextInt();
		int result = lc.rentBook(index);
		 
		 
		 
		 if(result == 0 ) {
			 System.out.println("성공적으로 대여되었습니다.");
		 } else if(result == 2) {
			 // 2일 경우 - > 성공적으로 대여 
			 // 마이
			 System.out.println("성공적으로 대여되었습니다. 요리학원 쿠폰이 발급되었습니다 마이페이지에서 확인하세요");
		 } else {
			 System.out.println("나이 제한으로 대여 불가능합니다");
		 }
		
		
		
	}
	
}
