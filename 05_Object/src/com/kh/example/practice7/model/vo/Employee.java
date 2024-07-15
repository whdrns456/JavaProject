package com.kh.example.practice7.model.vo;

public class Employee {
	
	
	
	private int empNo;
	private String empName;
	private	String dept;
	private String job;
	private int age;
	private char gender;
	private int salary;
	private double bounsPoint;
	private String phone;
	private String address;
	
	public Employee() {
		
	}
	
	public Employee(String empName, int empNo) {
		this.empNo = empNo;
		this.empName = empName;
		System.out.println("이름 : " + empNo);
		System.out.println("사원 번호 :" + empName );
	}
	
	public Employee(String empName, int empNo, String dept,String job,
			int age, char gender,int salary,double bounsPoint,
			String phone,String address	) {

		this.empNo = empNo;
		this.empName = empName;
		this.dept = dept;
		this.job = job;
		this.age = age;
		this.gender = gender;
		this.salary = salary;
		this.bounsPoint = bounsPoint;
		this.phone = phone;
		this.address = address;
		
		System.out.println("이름 :" + empName);
		System.out.println("사원 번호 :" + empNo );
		System.out.println("부서 :" + dept);
		System.out.println("직급 :" + job);
		System.out.println("나이 :" + age);
		System.out.println("성별 :" + gender);
		System.out.println("월급 : " + salary);
		System.out.println("포인트 :" + bounsPoint);
		System.out.println("휴대폰 번호 :" + phone);
		System.out.println("거주지 :" + address);
		
	}
	
	/// getter 
	
	public int getEmpNo() {
		return empNo;
	}
	
	public String getEmpName() {
		return empName;
	}
	
	public String getDept() {
		return dept;
	}
	
	public String getJob() {
		return job;
	}
	
	public int getAge() {
		return age;
	}
	
	public char getGender() {
		return gender;
	}
	
	public int getSalary() {
		return salary;
	}
	public double getBounsPoint() {
		return bounsPoint;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	
	

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void setJob(String job) {
		this.job = job;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void setBounsPoint(double bounsPoint) {
		this.bounsPoint = bounsPoint;
	}
	
	public void setPhpne(String phone) {
		this.phone = phone;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	
}
