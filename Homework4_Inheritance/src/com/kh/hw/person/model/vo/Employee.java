package com.kh.hw.person.model.vo;



// Employee 모델 
// TODO : person 클래스를 상속
public class Employee extends Person {

	private int salary; // 급여 
	private String dept; // 부서  
	
	
	public Employee() {}

	
	
	
	
	public Employee(String name, int age, double height, double weight, int salaty, String dept) {
		
		super(name, age, height, weight);
		this.salary = salaty;
		this.dept = dept;
	}


	public Employee(int salary, String dept) {
		
		this.salary = salary;
		this.dept = dept;
	}






	public String toString() {
		
		
		
		
		
		return super.toString() + salary + dept;
				
}

	
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
	
}