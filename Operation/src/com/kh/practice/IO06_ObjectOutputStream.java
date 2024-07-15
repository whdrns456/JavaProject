package com.kh.practice;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

class Student implements Serializable{
	
	String name;
	int age;
	double height;
	

    // 직렬화 적용 : Serializable 인터페이스 구현(상속)
	public Student(String name, int age, double height) {
		
		
		this.name = name;
		this.age = age;
		this.height = height;
	}



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
	
	
	public String toString() {
		return "Student[name]" + name + ",  age" + age + ", height" + height; 
	}
	
}


public class IO06_ObjectOutputStream {
	
	public static void main(String[] args) {
	
	File f = new File("./resources", "ObjectTest.txt");
	
	ObjectOutputStream oos = null;
		
	
	try {
	// 스트림 객체 	
	oos = new ObjectOutputStream(
			new BufferedOutputStream(
					new FileOutputStream(f)
					)
			);
	// 출력 대상 객체 (데이터) 	
	Student s1 = new Student("양준혁",25,174);
	Student s2 = new Student("이주원",23,170);
	Student s3 = new Student("최종군",31,180.1);
	
	// 출력 ! 
	oos.writeObject(s1);
	oos.flush();
	
	oos.writeObject(s2);
	oos.writeObject(s3);
	oos.flush();
	
	
	}catch(FileNotFoundException e) {
		e.printStackTrace();
	}catch(IOException e) {
		e.printStackTrace();
		
	}finally {
		try {
		if(oos != null)oos.close();
	}catch(IOException e) {
		e.printStackTrace();
	}
	}
		
	}

}
