package com.kh.chap01_beforeVSafter.after.model.vo;

public class SmartPhone extends Product {

private String  mobileAgeny;
	
	
	public SmartPhone() {}

	public SmartPhone(String brand,String code, String name, int price, String mobileAgency) {
		super(brand, code, name, price);
		 
		 this.mobileAgeny = mobileAgency;
	}
	
		
	
	
	public String information() {
		return super.information() + " mobileAgeny = " + mobileAgeny;
	}
	

	
public String getMobileAgeny() {
		return mobileAgeny;
	}

	public void setMobileAgeny(String mobileAgeny) {
		this.mobileAgeny = mobileAgeny;
	}
	
	
	
	
}
