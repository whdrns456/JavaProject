package com.kh.practice.student.controller;

import java.util.Scanner;

import javax.net.ssl.SSLContext;
import javax.security.auth.Subject;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	
	
	 private Student[] sArr = new Student[5];
	 
	 public final int CUL_LINE = 60;
	
	 
	 
	public StudentController() {
		
		// 5개의 객체배열을 위의 샘플 데이터 값으로 초기화 해주는 기본 생성자
		
		sArr = new Student[5];
		
		sArr[0] = new Student("최종군","자바",100); 
		sArr[1] = new Student("기다운","자바",50);
		sArr[2] = new Student("기다운","sql",80);
		sArr[3] = new Student("최종군","sql",50);
		sArr[4] = new Student("김인창","자바",80);
		
		
	}

	public Student[] printStudent() {
		return sArr;
		
		// 객체 배열에 있는 데이터 반환 
	}
	
	
	
	public int sumScore() {
		
		// 객체 배열의 점수를 합한 값 리턴 
				
		int sum = 0;
		
		for(int i = 0; i < sArr.length; i++) {
			sum += sArr[i].getScore();
			
			// 객체 배열의 점수를 합한 값 리턴 
		}
		
		
		
		
		return sum;
	}
	
	
	public double[] avgScore(){
		
		// double 배열을 만들어 sumScore의 리턴 값을 0번째 인덱스에 저장하고 
		// 합의 평균을 1번째 인덱스에 저장 후 배열 리턴 
		
		double[] avg = new double[2];
		
		int sumScore = sumScore();
		
		avg[0] = sumScore;
		avg[1] = sumScore() / sArr.length;
		
		return avg;
	}
	
	 
}
