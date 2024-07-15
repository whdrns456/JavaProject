package com.kh.example.practice6.model.vo;

public class Book {
	
	private String title;
	private String publishser;
	private String author;
	private int price;
	private double discountRate;
	
	// 생성자부 (3) 
	public Book(){}
	// 기본 생성자 : 초기화할 데이터 없이 객체 생성 
	
	// 매개변수가 3개인 생성자 : 전달된 데이터를 변수에 초기화하여 객체 생성 
	public Book(String title, String publisher, String author) {
		 this.title = title;
		 this.publishser = publisher;
		 this.author = author;
		 System.out.println("정보 3개를 출력을 합니다 ");
	}
	// 매개변수가 5개인 생성자 : 전달된 데이터를 변수에 초기화하여 객체 생성 
	// 반환 타입을 지정하면 메소드가 된다. 
	public Book(String title, String publishser, String author, int price, double discountRate) {
		 this.title = title;
		 this.publishser = publishser;
		 this.author = author;
		 this.price = price;
		 this.discountRate = discountRate;
		 System.out.println("정보 5개를 출력을 합니다 ");
	}
	
	
	public void inform(){
		
		System.out.println("제목 :" + title);
		System.out.println("출판사 : " + publishser);
		System.out.println("저자 :" + author);
		System.out.println("가격 :" + price);
		System.out.println("할인율 :" + discountRate);
		
		 
	}
	

}
