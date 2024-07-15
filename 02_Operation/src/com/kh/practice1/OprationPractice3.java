package com.kh.practice1;



import java.util.Scanner;

public class OprationPractice3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 입력 :"   );
		Double num1 = sc.nextDouble();
		System.out.print("영어 점수 입력 :"  );
		Double num2 = sc.nextDouble();
		System.out.print("수학 점수 입력 :"  );
		Double num3 = sc.nextDouble();
		
		int total = (int)(num1 + num2 + num3);
	
		System.out.println("총점은 :"+  total );
		System.out.println("평균은 :" + total/3 );
		
	
}
}
