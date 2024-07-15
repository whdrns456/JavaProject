package com.kh.chap01_beforeVSafter.before.model.vo;

import com.kh.chap01_beforeVSafter.after.model.vo.Product;

public class SamartPhone extends Product {

	
	private String  mobileAgeny;
	
	public SamartPhone() {
		
	}
	
	
	
	@Override 
	public String information() {
		return super.information() + ", mobilAgency " + mobileAgeny;
	}
	

	


	public String getMobileAgeny() {
		return mobileAgeny;
	}

	public void setMobileAgeny(String mobileAgeny) {
		this.mobileAgeny = mobileAgeny;
	}
	
	
	
	
}
