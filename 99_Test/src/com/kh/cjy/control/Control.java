package com.kh.cjy.control;

import com.kh.cjy.model.Model;

public class Control {
	private Model m = new Model();
	
	public void requiredSetData(int data) {
		m.setData(data);
	}
	
	public String requiredPrintData( ) {
		return m.print();
	}
}
