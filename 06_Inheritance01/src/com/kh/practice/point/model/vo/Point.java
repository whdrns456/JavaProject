package com.kh.practice.point.model.vo;

public class Point {
	
	// 상속하는 Point 클래스가 Circle과 Rectangle을 상속함 
	
	private int x;
	private int y;
	
	
	
	
	public Point(){}
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
				
		
	}
	
	
	
	
	
	@Override
	public String toString(){
		return x + ", " + x; 
	}
	

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	
	
	
	

}
