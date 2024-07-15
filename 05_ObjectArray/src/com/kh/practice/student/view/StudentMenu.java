package com.kh.practice.student.view;

import java.util.Scanner;

import com.kh.practice.student.controller.StudentController;
import com.kh.practice.student.model.vo.Student;

public class StudentMenu {
	
	
	
	
	StudentController ssm = new StudentController();
	
	
	public StudentMenu() {
			
		System.out.println("================학생 정보 출력==============");
		
		Student[] sArr = ssm.printStudent();
		
		for(int i = 0; i < sArr.length; i++) {
			 
			System.out.println(sArr[i].inform());
			
			// 객체 배열은 인덱스를 통해서 호출한다 
		}
		
		
		
		System.out.println("================학생 성적 출력==============");
		
		double[] score = ssm.avgScore();
		
		System.out.println("학생 점수 합계 :" + (int)score[0]);
		System.out.println("학생 점수 평균 :" + score[1] );
		
		
		System.out.println("================학생 결과 출력==============");
		
		for(int i = 0; i < sArr.length; i++) {
			if(sArr[i].getScore()  < ssm.CUL_LINE ) {
				System.out.println( sArr[i].getName() + " 학생은 탈락하셨습니다 ");
			} else {
				System.out.println(sArr[i].getName() + " 학생은 합격했습니다");
			}
		}
		
		
		
		// 학생의 점수가 CUT_LINE 미만이면 재시험 대상, 이상이면 통과 출력

	}
	
	
	
	
	
	
}
