package com.kh.practice.point.model.vo;

public class Circle extends Point {
	// 상속을 받으므로써 x,y 변수를 멤버로 가지게 된다.
	// 따라서 circle 클래스는 총 3개의 변수를 가지게 된다 
	
	private int radius;
	
	
	
	public Circle() {}
	
	public Circle(int x, int y, int radius) {
		
		
		
		super(x,y);
		
		// Point(부모클래스)의 매개변수가 2개인 생성자: 
		// setX(x);
		// setY(y);
		
		int False;
		this.radius = radius;
	}	
		
		// 생성자부 
		
	public String toString(){
		
		
		return super.toString() + "," + radius;  
	 // Point한테 상속을 받는다. 
		
		
		
		// getter
		
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	
	
}
