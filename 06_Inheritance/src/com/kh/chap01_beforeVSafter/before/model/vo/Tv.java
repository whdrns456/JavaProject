package com.kh.chap01_beforeVSafter.before.model.vo;

import com.kh.chap01_beforeVSafter.after.model.vo.Product;

public class Tv  extends Product {
		
	
	private String brand;
	private	String code;
	private String name;
	private int price;
	private int inch;
	
	
	public Tv() {
		
	}
	
	
	public String information() {
		return "";
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


	public int getInch() {
		return inch;
	}


	public void setInch(int inch) {
		this.inch = inch;
	}
	
	
	
	
	
}
