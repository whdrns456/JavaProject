package com.kh.practice;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IO02_CopyOfBuffered {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// bufferedInputStream과 BufferdOutputStream을 이용하여 

		File src = new File("./resources/src.txt");
		File dst = new File("./resources/dst.txt");
	
		// BufferdOutputStream bo = null;
		
		// 입출력 스트림 객체 선언 
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		byte[] buf = new byte[1024];
		int len = -1; // 읽은 데이터 길이
		int total = 0; // 총 입출력 길이 저장을 위한 변수 
		
		//bos = new BufferedOutputStream(new FileOutputStream(f));
		
		// 입출력 데이터 관련 변수 선언 
		
		try {
			// 파일 입출력 스트림 생성 
			
			bis = new BufferedInputStream(new FileInputStream(src));
			
			bos = new BufferedOutputStream(new FileOutputStream(dst));
			
			// 파일 입력 및 출력 (파일 복사)
			while( (len = bis.read(buf)) != -1) {
				bos.write(buf,0,len); 
				// write(byte[] b, int off, int len)
				// 출력 스트림에 매개 값으로 주어진 바이트 배열 b[off]부터 len개까지의
				// 바이트를 보냄
				bos.flush(); // 버퍼에 잔류하는 모든 바이트 출력 
				
				total += len;
			}
		
		
		} catch(FileNotFoundException e) {
			System.out.println("알 수 없는 타입");
			e.printStackTrace();
			
		}catch(IOException e) {
			System.out.println("입출력 작업 실패");
			e.printStackTrace();
		} finally {
			try {
				if(bis != null) bis.close();
				if(bos != null) bos.close();
			}catch (IOException e) {
				// TODO: handle exception
				System.out.println("[ERROR] 스트림 객체 반납실패!");
				e.printStackTrace();
			}
		}
		
		
		// 복사된 총 파일 길이 출력 
		System.out.println("복사 완료 : 총길이 = " + total);
	
	}

}
