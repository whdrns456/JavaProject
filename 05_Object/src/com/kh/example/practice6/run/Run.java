package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		
	//	Book b = new Book("욕망","금천구","길동홍",150,30.5);
		
		//b.inform();
		
		System.out.println();
		
		Book b1 = new Book("사피엔스", "동원","유발 하라리");
		b1.inform();
		
		System.out.println();
		
		Book b2 = new Book("그레이의 50가지 그림자","은밀한 출판사","최종군",1000000,30.5);
		b2.inform();
		

	}

}
