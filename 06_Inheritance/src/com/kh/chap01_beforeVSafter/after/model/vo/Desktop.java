package com.kh.chap01_beforeVSafter.after.model.vo;


public class Desktop extends Product {

		
	private boolean allInOne;
		
		
	 public	Desktop() {}

	 public	Desktop(String brand,String code, String name, int price, boolean allInOne ) {
		 
		 // 부모클래스의 매개변수가 4개인 생성자 호출 
		 super(brand, code, name, price);
		 
		 this.allInOne = allInOne;
	 }
	 
	 public String information(){
		  
		 
		 
		 return super.information() + " allInOne " + allInOne;
	 }
	 



	public boolean isAllInOne() {
		return allInOne; // getter boolean 타입은 is로 시작한다. 
	}


	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	
	
}
