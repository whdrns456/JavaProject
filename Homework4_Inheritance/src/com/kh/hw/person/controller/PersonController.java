package com.kh.hw.person.controller;

import com.kh.hw.person.model.vo.Employee;
import com.kh.hw.person.model.vo.Student;

public class PersonController {

	Student[] s = new Student[3];
	Employee[] e = new Employee[10];
	
	
	public int[] personCount() {
		
		int[] count = new int[2];
		
		// 
		
		count[0] = 0;
		count[1] = 0;
		
		for (Student student : s) {
            if (student != null) 
            	count[0]++;
        }
		
        for (Employee employee : e) {
            if (employee != null) 
            	count[1]++;
        }
		
		
		
		return  count;
	}
	
	
	 public void insertStudent(String name, int age, double height, double weight,
			 int grade, String major) {
		
		 for(int i = 0; i < s.length; i++) {
		 if(s[i] == null) {
			 s[i] = new Student(name, age, height, weight, grade, major);
			 break;
		 }
	}
		 // 매개변수로 받아 저장된 객체의 수를 정수배열에 담아 반환하는 메소드. 
		 // 
		 
		 
		
		 
		 
		 
		 
		 
		
		 
		 
	 }
	 
	 
	 public Student[] printStudent() {
		 return s;
	 }
	 
	 public void insertEmployee(String name, int age, double height, double weight, int salary, String dept){
		 
		 for (int i = 0; i < e.length; i++) {
	            if (e[i] == null) {
	                e[i] = new Employee (name, age, height, weight, salary, dept);
	                break;
	            }
	           }
	 }
	 
	 
	 public Employee[] printEmployee() {
		 return e;
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	
	
}
