package com.kh.cjy.model;

public class Model {
	private int data;

	public Model() {
	}
	
	public int getData( ) {
		return this.data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public String print()
	{
		String str = "" + data;
		return str;
	}
}
