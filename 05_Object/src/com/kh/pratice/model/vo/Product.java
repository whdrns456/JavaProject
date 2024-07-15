package com.kh.pratice.model.vo;

public class Product {
	// 필드부(변수부) - 데이터를 담을 공간 
	
	private String name; // 제품명
	private int price; 	// 가격 
	private String brand; // 브랜드명
	
	
	
	// 메소드 부 
	
	

									
									
	
	
	
	public Product(String name,int price,String brand) {  
		
			this.name = name;
			this.price = price;
			this.brand = brand;
	} 
	
	
	public void information(){
		// 필드(변수)들의 정보를 출력 
		System.out.println("제품명 :" + name + ", 가격:" + price + ", 브랜드:" +brand);
	
	}
	
	// 모든 필드 변수를 매개변수로 갖는 생성자 (매개 변수 3개인 생성자 : )
	
	public Product() {} // 기본 생성자 : 매개변수가 없다. 대문자 소문자 오류난다.
	
	
	
	
	
	
	
	// getter/ setter : private 으로 선언된 변수에 접근할 수 있도록 하는 메소드 
	
	
	
	// getter name 변수에 있는 저장된 값을 반환 
	public String getName() {
		return name;
	}
	// setter name을 매개변수로 통해서 저장 
	public void setName(String name) {
		this.name = name;
	} // 할당된 공간에 접근 this 전달된 값을 name 변수에 저장  
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}


	
	
	
		







}


