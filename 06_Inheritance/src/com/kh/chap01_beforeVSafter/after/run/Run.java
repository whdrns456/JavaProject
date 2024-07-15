package com.kh.chap01_beforeVSafter.after.run;

import com.kh.chap01_beforeVSafter.after.model.vo.Desktop;
import com.kh.chap01_beforeVSafter.after.model.vo.SmartPhone;
import com.kh.chap01_beforeVSafter.after.model.vo.Tv;

public class Run {

	public static void main(String[] args) {
		
		
		
		Desktop d = new Desktop();
		System.out.println(d.information());
		
		Desktop d2 = new Desktop("삼성", "ss01", "삼성데스크탑", 200, true);
		
		System.out.println(d2.information());
		
		
		SmartPhone sp = new SmartPhone("애플", "s23", "김태희의 아이스크림", 15, "글쎄");
		System.out.println(sp.information());
		
		
		
		Tv t = new Tv("테레비죤", "브라운관", "그냥그저그런테레비죤", 500, 14);
		

	}

}
