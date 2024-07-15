package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController  {

	
		Circle c = new Circle();
		
		
		public String calcArea(int x, int y, int radius) {
		// 면적 : PI * 반지름 * 반지름 
			
			// Math.PI * 반지름 * 반지금 
			
			double PI = 3.14;
			c.setX(x);
			c.setY(y);
			c.setRadius(radius);
			
			
			return "면적 : " + c.toString()  + PI * (radius *2);
			
		}
		
		
		public String calcCircum(int x, int y, int radius){
			
			c.setX(x);
			c.setY(y);
			c.setRadius(radius);
			
			double PI = 3.14;
			
			
			return "둘레 :" + c.toString() +( PI * radius * 2);
		}

		
	
	
}
