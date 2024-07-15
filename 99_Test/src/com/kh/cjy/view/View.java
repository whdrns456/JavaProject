package com.kh.cjy.view;

import java.util.Scanner;

import com.kh.cjy.control.Control;

public class View {
	private Control c = new Control();
	
	public View() {
		Scanner sc = new Scanner(System.in);
		System.out.print("데이터 입력 : ");
		int data = sc.nextInt();
		c.requiredSetData(data); // 저장만 함 
		
		System.out.println(c.requiredPrintData());
	}
}
