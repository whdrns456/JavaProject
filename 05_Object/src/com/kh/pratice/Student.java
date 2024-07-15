package com.kh.pratice;

public class Student { // 클래스는 생성고 동시에 메모리에 할당 
	private int no; 	 // 학번 
	String name; // 이름
	int age;	 // 나이
	char gender; // 성병

	// 생성자는 반환 신경 안쓴다         공간할당을 위해서 
	
	public Student() {}
	
	public Student(String name) {
		// 이름을 저장할 name 변수에 전달된 값(name)을 대입(초기화)
		// this name이라는 곳에 저장된 공간을 가르킴 
		this.name = name;
		
	}
	
	public void inform(){
		System.out.println("[" + no + "]" 
				 			+ name + "," + age + "," + gender);
	}
	
	
	
	
	public void setName(String n) {
		name = n;
	}	
		
	public void setName(String n, int a) {
		name = n;
		
	}	
		
		
	
	
	
	
}
