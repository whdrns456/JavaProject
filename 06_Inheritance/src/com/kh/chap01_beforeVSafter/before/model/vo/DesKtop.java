package com.kh.chap01_beforeVSafter.before.model.vo;

import com.kh.chap01_beforeVSafter.after.model.vo.Product;
// defore 경로의 Desktop : 
public class DesKtop extends Product {

		
		private boolean allInOne;
		
		
	 public	DesKtop() {
		 
	 }

	 
	 
	 public String information(){
		 return "allInOne" + allInOne;
	 }
	 



	public boolean isAllInOne() {
		return allInOne; // getter boolean 타입은 is로 시작한다. 
	}


	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	 
	 
		
		
		
}
