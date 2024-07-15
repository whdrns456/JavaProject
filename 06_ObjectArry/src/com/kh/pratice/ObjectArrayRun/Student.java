package com.kh.pratice.ObjectArrayRun;

public class Student {
	
	String name;
	int age;
	char gender;
	
	public Student(String name, int age, char gender) {
		this.name  = name;
		this.age = age;
		this.gender = gender;
	}
	
	
	public void info() {
		System.out.println(" 이름 :" + name + " 나이는 " + age + " 성별은 " + gender);
	}
	
}
