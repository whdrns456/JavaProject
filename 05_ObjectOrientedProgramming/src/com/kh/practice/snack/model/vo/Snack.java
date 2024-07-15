package com.kh.practice.snack.model.vo;

public class Snack {

	private String kind;   
	private String name; 
	private String flavor;
	private int numOf;
	private int price;
	
	// 생성자부 (2)
	public Snack() {}

	public Snack(String kind,String name,
			String flavor,int numOf,int price) {
		
		this.kind = kind;
		this.name = name;
		this.flavor = flavor;
		this.numOf = numOf;
		this.price = price;
		
	}
	
	// 메소드부
	public String information() {
	// 빵(케이크 - 블루베리) 1개 1500원
	// {종류}({이름} -{맛}) {개수}개 {가격}원" gudtlrdmfh
		
		 return kind + "( " + name + " - " + flavor + ")" + numOf + " 개 " + price + "원";
		// String.format("%s(%s - %s) %d개 %d원)", kind,name,flavor,numOf,price);
	}
	public String getKind() {
		
		return kind;
	}
	public String getName() {
		
		return name;
	}
	public String getFlavor() {
		
		return flavor;
	}
	public int getNumOf() {
		
		return numOf;
	}
	public int getPrice() {
		
		return price;
	}
	
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public void setNumOf(int numOf) {
		this.numOf = numOf;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
	
	}

