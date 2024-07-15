package com.kh.practice1;


import java.util.Scanner;

public class Operation2 {
	public static void main(String[] args) {
		
		Scanner  sc = new Scanner(System.in);
		
		
		
		
		System.out.println("가로를 입력해주세요:"   );
		double a = sc.nextDouble();
		
		System.out.println("세로를 입력해주세요:"  );
		double b = sc.nextDouble();
		
		System.out.println("면적은 :" + (a * b) );
		System.out.println("둘레은 :" + (a + b) * 2);

	}

}
