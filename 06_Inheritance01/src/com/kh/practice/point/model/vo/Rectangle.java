package com.kh.practice.point.model.vo;

public class Rectangle extends Point  {
	// Point 클래스 상속 : 
	
	private int width;
	private int height;
	
	// 기본값 : 0 
	
	public	Rectangle() {}
	
	
	public Rectangle(int x, int y, int width, int height) {
		
		super(x,y); 			// 수퍼가 위에 
		this.width = width;
		this.height = height;
	}

	public String toString(){
		return super.toString() + "," + width + ", " + height;
	}
	
	// 사각형 : 정보 반환  Point 클래스 상속 
	
	
	
	// getter/setter 
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
	
	
	
	
	
	
}
