package com.kh.prectice.run;

import java.util.Scanner;

import com.kh.prectice.model.vo.AniBook;
import com.kh.prectice.model.vo.CookBook;

public class Run {

	public static void main(String[] args) {
		
		
		// Anibook;
		CookBook[] cb = new CookBook[5]; 
		
		cb[0] = new CookBook("집밥 ", "백종원", "tvn", true);
		cb[1] = new CookBook("성시경", "성시경", "tvn", true);		
		cb[2] = new CookBook("성시경", "성시경", "tvn", true);
		cb[3] = new CookBook("성시경", "성시경", "tvn", true);
		cb[4] = new CookBook("기다운", "성시경", "tvn", true);
		
		
		
		AniBook[] ab = new AniBook[5];
		
		// (String title,String author,String publisher,int accessAge
		ab[0] = new AniBook("그레이의 50가지 그림자", "넷플릭스", "모름", 19); 
		ab[1] = new AniBook("사피엔스", "유발 하라리", "동아 ",15);
		ab[2] = new AniBook("삼국지","유비","모름",7);
		ab[3] = new AniBook("주술회전", "게게", "마나토끼",15);
		ab[4] = new AniBook("외모지상주의", "박태준", "네이버웹툰",15);
		
		
		
		
		
		
		// 사용자에게 책 제목을 입력 받아 책 정보를 조회해보자. 
		Scanner sc =  new Scanner(System.in);
				
		System.out.print("조회하고자 하는 책 제목 입력 :");
		String title = sc.next();
		
		boolean found = false; 
		
		for(int i = 0; i < ab.length; i++) {
			if(ab[i].getTitle().equals(title)) {
				System.out.println(ab[i].toString());
				found = true;
				break;
			}
		}
		
		
		if(!found) { // 입력된 책을 찾지 못했을 경우 
			// 요리책 목록에서 찾아보기 
			for(int i = 0; i < cb.length; i++ ) {
				if (cb[i].getTitle().equals(title)) {
					System.out.println(cb[i].toString());
					found = true;
					break;
				}
			}
			
		}
		
		
		
		
	}

}
