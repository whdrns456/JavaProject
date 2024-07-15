package com.kh.hw.employee.controller;

import com.kh.hw.employee.model.vo.Employee;

public class EmployeeController {
	
	Employee e = new Employee();
	
	
	public void add(int empNo, String name, char gender,String  phone ) {
		// 받은 매개변수만큼 매개변수가ㅓ 있는 생성자를 통해 값을 저장 
		// => 매개 변수 생성자로 객체 생성후 e 변수에 할당 
		
		e = new Employee(empNo, name, gender, phone); // 데이터를 저장하는 메소드 
	}
	
	public void add(int empNo, String name, char gender,String  phone, String dept, 
			int salary, double bonus) {
		
		e = new Employee(empNo, name, gender, phone, dept, salary, bonus);
		
		// 매개변수 있는 생성자를 이용하여 데이터를 저장하는 메소드 
	}
	
	
	 // 각 데이터의 전달된 값을 저장 -> setter 메소드를 사용 
	 public void modify(String phone){
		// 수정 변경하다 
		e.setPhone(phone); 
		// setter를 이용하여 정보수정 
	 }
	
	 public void  modify(int salary) {
		 e.setSalary(salary);
		
		 // 덮어쓰기 
		  
	 }
	 
	 
	 public  void modify( double bonus) {
		 e.setBonus(bonus);
		 
	 }

	 
	 public Employee remove() {
		 // 객체 e 주소값 
		 // 
		 
		 e = null; 
		 return e; // Employee 객체 e를 반환하는 메소드 
		 // 객체를 삭제하는 메소드 
	 }
	 
	 
	 public String inform() {
		 if(e == null) {
			 return null;
		 } else {
		 // printEmployee(); 메소드를 사원 정보 반환 
		 return e.printEmployee();
		}
	}
}
