package com.kh.example.practice4.model.vo;

public class Student {
	
	private int grade;
	private static int classroom;
	private String name;
	private double height;
	private char gender;
	
	
	
	public Student(){
	
	}
	
	public void information(int gr, String cr, String nm, double hi, char gd){
		
		int grade = gr;
		String classroom = cr;
		String name = nm;
		double height = hi;
		char gender = gd;
		
		
		System.out.println("평범한 외모를 가진 "+ name + " 학생은 " + cr + "사람이며"+
		" 성적은 " + gr + "점이며 키는" +height +"m 입니다 " + "오해하지마세요 " + gd +"자니까");
		
		
	}
	
	

}
