package com.kh.hw.shape.controller;

import com.kh.hw.shape.model.vo.Shape;

public class SquareController {

	// 생성자부 : 생략! (기본 생성자는 있을 것이다.)
	  private  Shape s = new Shape();
	   
	// 메소드부 :    
	  public double calcPerimeter(double height, double width) {
		  s = new Shape(4, height, width); //매개 변수 순서대로 
		  return (s.getWidth() * 2) + (s.getHeight() * 2);
	  } 
		   
	  public double	calcArea(double height, double width) {
		  s = new Shape(4, height, width); // 초기값을 가지고 공간을 할당 
		  return s.getHeight() * s.getWidth();
	  }
		  
	  public void paintColor(String color) {
		  
		  s.setColor(color);
		  
		  
		  
	  }

	  
	  public String print(){
		  return "사각형 " + s.information();
	  }

	  
	  
	  
	  
}
