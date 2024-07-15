package com.kh.chap01_beforeVSafter.after.model.vo;

public class Product {

	// 필드부 
	// 
	
	private String brand;
	private	String code;
	private String name;
	private int price;
	
	
	// 생성자 부 기본 생성자, 매개변수 다 받는 생성자 모든 필드를 가지는 생성자 
	public Product() {}
	
	// 모든 필드를 가지는 생성자 
	public Product(String brand, String code, String name,int price) {
		this.brand = brand;
		this.code = code;
		this.name = name;
		this.price = price;
		
	}
	
	
	public String information() {
		return "brand = " + brand + " code = " + code + " name = " + name + " price = " + price;   
	}
	
	
	
	
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	
	
	
}
