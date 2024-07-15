package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Rectangle;

public class RectangleController {

	Rectangle r = new Rectangle();
	double PI = 3.14;
	
	public String calcArea(int x, int y, int height, int width){
	
		
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		return "사각형 면적 : 너비 * 높이 :  "+ r.toString()  + "/" + r.getHeight() * r.getWidth() ;
		
		
	}
	
	
	
	public String calcPerimeter(int x, int y, int height, int width){
	
		
		r.setX(x);
		r.setY(y);
		r.setHeight(height);
		r.setWidth(width);
		
		// 둘레 : 2* (너비 + 높이)
		return "둘레 : " + r.toString() + "/ " + (2 * r.getWidth() * r.getHeight());   
		
		
		
	}
	
	
	
	
}
