package com.kh.practice.chap01_poly.model.vo;



public class CookBook  extends Book {

	
 	private boolean coupon;
	
 	
 	
 	
 	public CookBook() {
	 // super() 생략이 되어있다. 
 	 // 기본생성자 안에서도 super()는 생략되어있다 	
	}


	

 	// 부모클래스인 Book에서 상속을 받은 변수 title, author, publisher 
	public CookBook(String title, String author, String publisher, boolean coupon) {
		// 아뇨 
		super(title, author, publisher);
		this.coupon =  coupon;
	
	}


	public String toString() {
		return "CookBook [" + super.toString() + "coupon " + coupon + "]"; 
	}
	

	// getter setter 
	public boolean isCoupon() {
		return coupon;
	}

	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}
 	
 	
 	
 	
 	
 	
}
