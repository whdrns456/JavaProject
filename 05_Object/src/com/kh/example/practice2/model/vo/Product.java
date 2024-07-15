package com.kh.example.practice2.model.vo;

public class Product {
	
	private String pName;
	private int price;
	private String brand;

	public Product() {
		
	}
	
	
	public Product(String ss,String s1,int nn ) {
		 String pName = ss;
		 String brand = s1;
		 int price = nn;
		 
		// 생성자는 반환 타입 신경 안쓴다 
	}
	
	// pName getter/setter 
	
	// getter method : 해당 변수의 값을 조회하는 기능을 제공하는 메소드
	// get 변수명 변수의 값을 제공하는 기능을 수행하는 메소드
	public String getPName() {  		
		return pName;    // 
	}
	
	// setter 메소드 : 해당 변수에 값을 저장하는 기능을 수행하는 메소드 
	// 
	
	public void setPName(String pName) {
		this.pName = pName;
	}
	
	// price 변수의 getter/ setter 
	
	public int getPrice(){
		return price;
	}
	
	
	public void setPrice(int price){
		this.price = price;
	}
	
	
	// brand 변수의 getter/ setter
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand){
		this.brand = brand;
	}
	
	 
	
	
	public void infomation( ) {
		 
		System.out.println(pName );
		System.out.println(brand );
		System.out.println(price );
	}






}
	


