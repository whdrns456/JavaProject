package com.kh.example.practice2.run;

import com.kh.example.practice2.model.vo.*;

public class Run {
	public static void main(String[] args) {
	
	
		
		Product p = new Product("s23","삼성",100000);
		
		System.out.println();
		
		// p.infomation("S23", 10000000, "아이폰");
		
		Product p1 = new Product();
		
		p1.setPrice(1000);
		p1.setPName("3성");
		p1.setBrand("충주");
		
		
		p1.infomation();
		
	}
}
