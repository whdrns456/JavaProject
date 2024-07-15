package com.kh.practice1;

public class OperationPractice4 {

	public static void main(String[] args) {
		
		int iNum1 = 10;
		int iNum2 = 4;	
		
		float fNum = 3.0f;
		double dNum = 2.5;
		
		char ch = 'A';
		
		System.out.println(iNum1  / iNum2); //10을 4로 나눴을 때 2를 출력한다
		System.out.println((int)dNum); // double 자료형(2.5)을 인트형으로 형변환 시킬 시 소수점은 사라진다 2 출력   
		
		System.out.println( iNum2 * dNum); //10.0    4*2.5 자동형변환이된다  
		System.out.println((double)iNum1); // 10.0 인트형을 double로 변환 시 10.0 소수점이 출력 된다 
		
		System.out.println( (double) (iNum1/ iNum2)); // 인트형을 전체형변환 
		System.out.println(dNum); // 2.5 출력 
		
		System.out.println((int)fNum ); //3
		System.out.println(iNum1 / (int)fNum); // 3을 출력하기 위해서는 int형 자료 10 / float 자료형은 int로 강제형변환 
		
	
		System.out.println(iNum1 / fNum); //3.3333333333333 자동형변환이 된다.
		System.out.println(iNum1 / (double)fNum);//3.3333333333333 
		
		System.out.println(ch); // A 
		System.out.println((int)ch); // 65
		System.out.println(ch + iNum1); // 75 int가 자동형변환 시킨다 
		System.out.println((char) (ch + iNum1)); // 아스키 코드를 출력 K발생  
		
	
		int num1 = 3;
		int num2 = 4;
		int diff;
		if(num1 > num2) { 
			diff = num1 - num2;  
		} else { 
			diff = num2 - num1; 
		}
		
		System.out.println(diff);
		
		
	
		int num = 2;
		String result = (num% 2 ==0) ? "짝수" : " 홀수 ";
		System.out.println(result);
	
	
	}
}
