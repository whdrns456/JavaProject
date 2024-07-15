package com.kh.practice.numRange.view;

import java.util.Scanner;

import com.kh.practice.numRange.controller.NumberController;
import com.kh.practice.numRange.exception.NumRangeException;

public class NumberMenu {

	
	
	
	public void menu() throws NumRangeException {
	
		
		Scanner sc = new Scanner(System.in);
		NumberController nc = new NumberController();
		
		
		System.out.print("정수 1 : ");
		int num1 = sc.nextInt();
		System.out.print("정수 2 : ");
		int num2 = sc.nextInt();
		
		try {
		
		boolean d = nc.checkDouble(num1, num2);
		System.out.println(num1 + "은(는)" + num2 +"의 배수인가?" + d);
		
		
		}catch(NumRangeException e) {
			e.printStackTrace();
		}
		
	}
}
