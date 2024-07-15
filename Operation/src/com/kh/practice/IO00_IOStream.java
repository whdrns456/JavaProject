package com.kh.practice;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class IO00_IOStream {

	public static void main(String[] args) {
		
		// 키보드 입력 ----> 콘솔창 출력
		
		InputStream is = System.in;
		OutputStream os = System.out;
		
		byte[] buf = new byte[1024];     // 입출력 버퍼 
		int len = 0;					 // 입력 데이터 길이를 저장할 변수 : 
		
		try {
		// EOF(끝)를 만날때까지 키보드의 입력을 받겠다 !
		while ((len = is.read(buf)) != -1) {
			os.write(buf, 0, len);
			os.flush();
		}
	}catch (IOException e ) {
		e.printStackTrace();
	} finally { // 자원 해제 => 프로그램에서 사용한 외부 장치 해제 
		try {
		if(is != null) is.close();
		if(os != null) os.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
		}
		
	}

}