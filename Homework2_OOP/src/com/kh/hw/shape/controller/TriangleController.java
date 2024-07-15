package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class TriangleController {
	
	          
	//필드부(변수) 
	
	private Shape  s = new Shape();
	
	
	
	public double calcArea(double height,double width){
		s = new Shape(3, height, width);
		return s.getWidth() * s.getHeight() / 2; 
	}
	
	
	public void paintColor(String color) {
		s.setColor(color);
		
	// setter를 통해 매개변수로 넘어온 값
	//전닥된 값 color을 통해 shape 타입의 객체에 stter 메소를 사용 	
	}
	
	public String print(){
		return "삼각형 :" + s.information();
	}
		 

}
