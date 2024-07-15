package com.kh.practice2;


import java.util.Scanner; // 다른 경로에 있는 걸 사용할 때 

public class CastingPractice1 {
public static void main(String[] args) {

		
		System.out.print("문자:");
		Scanner sc = new Scanner(System.in);
		
		String str = sc.next(); 
		char ch = str.charAt(0);
		
		System.out.println( ch + " unicode :" +  (int)ch);

	}

}
