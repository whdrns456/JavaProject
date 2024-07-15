package com.kh.practice;

import java.io.File;

public class IO00_File {

	public static void main(String[] args) {
		// FIle : 파일 정보를 다루는 클래스
		// = > 파일을 입출력 대상으로 사용할 수 있음!
		
		File file = new File("C:/test.txt");
		System.out.println("> " + file);
		System.out.println("> " + file.toString());
		System.out.println("> " + file.length());
		System.out.println("exists : " + file.exists());
		System.out.println("canRead : " + file.canRead());
		System.out.println("canWrite " + file.canWrite());
		
		File file2 = new File("./resources/FileTest.txt");
		System.out.println("> " + file2);
		System.out.println("> " + file2.toString());
		System.out.println("> " + file2.length());
		System.out.println("exists : " + file2.exists());
		System.out.println("canRead : " + file2.canRead());
		System.out.println("canWrite " + file2.canWrite());
		System.out.println("isDirectory :" + file2.isDirectory());

		
	}

}
