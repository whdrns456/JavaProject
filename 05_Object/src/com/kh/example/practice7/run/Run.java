package com.kh.example.practice7.run;

import com.kh.example.practice7.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		Employee e = new Employee();
		
		
		
		System.out.println();
		
		
		Employee e1= new Employee("최종군",100, "개발팀", "연구원", 31, '남', 3000, 0.5, "010-0000-0000", "서울");
		
	
		 e1.setAge(31);
		 
		 System.out.println(e1.getAge());
		 
	}
}
