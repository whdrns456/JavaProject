package com.kh.pratice.run;

import com.kh.example.practice2.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Product  p1 = new Product(); 
		// p1.setPName("아이폰"); // 힙에 저장
		
		// p1.infomation();
		
		// 매개변수 3개인 생성자를 사용하여 Product 객체를 생성
		
		// 저장된 정보를 출력해보자. ()
		
		Product p2 = new Product("삼성","s23",100);
		
		

		
		p2.infomation();
		
		
		
		
	}

}
