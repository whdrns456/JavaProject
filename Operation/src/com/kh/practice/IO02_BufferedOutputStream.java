package com.kh.practice;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO02_BufferedOutputStream {

	public static void main(String[] args) {
		
		File f = new File("./resources", "OutputTest.txt");
		
		// 파일 출력 스트림 객체 
		
		 // FileOutputStream fos = null;
		  BufferedOutputStream bos = null;
		
		// 파일 출력 스트림 생성 
		try {
		// fos = new FileOutputStream(f);
		// bos = new BufferedOutputStream(fos);
		
		bos = new BufferedOutputStream(new FileOutputStream(f));
		
		String contents = "2024-07-02 11:08 IO는 재밌어~";
		bos.write(contents.getBytes());
		bos.flush();
		
		// => 출력 스트림의 flush()를 하지 않으면 출력 버퍼에만 데이터가 기록되어 
		// 실제 출력 장치(대상)에는 출력되지 않음!
		
		}catch(FileNotFoundException e) {
			System.out.println("[ERROR]");
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(bos != null)bos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		}
	}


