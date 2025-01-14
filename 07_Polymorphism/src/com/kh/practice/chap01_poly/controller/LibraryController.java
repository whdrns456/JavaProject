package com.kh.practice.chap01_poly.controller;



import com.kh.practice.chap01_poly.model.vo.AniBook;
import com.kh.practice.chap01_poly.model.vo.Book;
import com.kh.practice.chap01_poly.model.vo.CookBook;
import com.kh.practice.chap01_poly.model.vo.Member;

public class LibraryController {

	private Member m = new Member();
	
	private Book[] bList;
	
	
	
	
	
	
	public LibraryController() {
		
			bList = new Book[5];
	        bList[0] = new CookBook("백종원의 집밥", "백종원", "tvN", true);
	        bList[1] = new AniBook("한번 더 해요", "미티", "원모어", 19);
	        bList[2] = new AniBook("루피의 원피스", "루피", "japan", 12);
	        bList[3] = new CookBook("이혜정의 얼마나 맛있게요", "이혜정", "문학", false);
	        bList[4] = new CookBook("최현석 날 따라해봐", "최현석", "소금책", true);
		
		
	}
	// BooK[] 반환타입 - 
	// 
	public Book[] selectAll() {
		return bList;
	} 
	
	
	public Book[] searchBook(String keyword) {
		
		// 검색 결과를 담아줄 새로운 Book 객체 배열 생성 
		// 목록이 최대 5개일 수 있으니 크기 5 할당
		// for문을 이용하여 bList 
		  
		
		Book[] searchList = new Book[5];
		
		int count = 0;
		
		for(int i = 0; i < bList.length; i++) {
			if(bList[i].getTitle().contains(keyword)) {
				searchList[count] = bList[i];
				count++;
			} // 키워드가 포함된 제목인 도서객체의 주소를 할당한다 카운트 위치에 대입을 시켜줌 
			   
		}
		
		
		// 같은 키워드 2개를 찾아으면 나머지 null 값
		// 해당 검색 결과의 도서목록 주소 값 리턴
		
		return searchList;
		
}
	
	
	 public void insertMember(Member m){
		 
		 this.m = m; 
		
		 // setter와 비슷 멤버타입으로 선언된 멤 이라는 필드 setter메소드 역할을 함
		 
		 
		 
	 }

	
	
	public Member myInfo(){
		return m;
		
		// 회원 레퍼런스(mem) 주소값 리턴
		
	}
	
	
	public int  rentBook(int index) {
		
		int result = 0; 
		
		if(bList[index]instanceof AniBook) {
			// 해당 만화책의 제한 나이와 회원의 나이를 비교하여
			AniBook b = (AniBook) (bList[index]);
			if((b.getAccessAge() > m.getAge())){
				result = 1;
			}
			
		} else if(bList[index] instanceof CookBook) {
			
			CookBook b = (CookBook) bList[index];
			if(b.isCoupon()) {
				m.setCouponCount(m.getCouponCount() + 1 );
				result = 2;
			}
			
		}
		return result;
	} 
	
	
}
