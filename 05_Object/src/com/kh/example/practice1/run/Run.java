package com.kh.example.practice1.run;

import com.kh.example.practice1.model.vo.Member;

public class Run {
	public static void main(String[] args) {
		// 기본 생성자를 통해 Member 타입의 객체를 생성
		Member mb = new Member();
		
		//charName을 이용해 값을 변셩
		// mb.memberName = "이름 "
		mb.changeName("엄희윤");
		// 접근 제어 : System.out.println(mb.memberName);
		
		mb.printName();
 }
}
