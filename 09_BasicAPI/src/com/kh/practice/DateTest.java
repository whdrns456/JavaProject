package com.kh.practice;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Date : 날짜, 시간 관련 클래스 
		
		Date date = new Date();
		
		System.out.println((date.getMonth() + 1) 
				// .getMonth() 월 정보를 반환
					+"/" + date.getDate());
		
		// LocalDateTime 
		
		// LocalDateTime (java.time.LocalDateTime).now()
		// 객체생성
		// - 년, 월, 일 입력하여 생성 : LocalDateTime.of(LocalDate.of(int year, int month, int dayOfMonth ))
		
		// 날짜 정보 조회 
		// - 월(month) : 변수명.getMonth() // 영어로 월 정보 반환
		//               변수명.getMonthValue() // 숫자로 월 정보를 반환
		// 일(day) : 변수명.getDayOfMonth // 월 기준 일 정보 반환
		//				변수명.getDayOfYear() // 연 기준 일 정보를 반환 
		
		
		LocalDateTime date2 = LocalDateTime.now();
		System.out.println(date2.getMonth());
		System.out.println(date2.getMonthValue() + "/" + date2.getDayOfMonth());
		
		System.out.println("================================================");
		
		System.out.println("1994년 3월 7일");	
		
		LocalDateTime birth = LocalDateTime.of(LocalDate.of(2005, 9, 23),
				LocalTime.of(16,0));
		
		System.out.println(birth);
		
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
		System.out.println(sdf.format(date));
		System.out.println("================================================");
		
		
		// 1) LocalDateTime - > Date 변경 후 포맷 적용 
		Date dateOfBirth = java.sql.Timestamp.valueOf(birth);
		System.out.println(sdf.format(dateOfBirth));
		
		// 2) DateTimeFormatter 이용 
		birth.format(DateTimeFormatter.ofPattern("YYYY-MM_DD hh:mm:ss"));
		System.out.println(birth.format(DateTimeFormatter.ofPattern("YYYY-MM-dd hh:mm:ss")));
		
		
		// 올해 며칠 남았는 지? (getDayOfYear() 이용)
		LocalDateTime date7 = LocalDateTime.now();
		
		System.out.println("올해는 " + date7.getDayOfYear());
		
		//  (getHour())
		
		System.out.println(18 - date7.getHour());
		
		
		
		
	}
}
