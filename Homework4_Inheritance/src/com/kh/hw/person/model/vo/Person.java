package com.kh.hw.person.model.vo;

public class Person {
	
	// 필드 부
	private String name;
	private int age;
	private double height;
	private double weight;
	
	
	// 생성자 부
	public Person() {}
	
	public Person(String name, int age, double height, double weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	// 메소드부
	
	public String toString() {
		
		return  name +"," + age + "," 
		+ height + "," + weight + ","; 
	}
	
	
	
	//

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	
	
	
	

}
