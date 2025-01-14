package com.kh.practice;

import java.util.StringTokenizer;
public class StringTokenizerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// StringTokenizerTest : 문자열 내에 특정 구분자로 나눠주는 클래스(토큰화)
		
		String data = "name:홍,phone:01027250780,address:강남,email:whdrns456@naver.com";
		
		String[] dArr = new String[4];
		
		System.out.printf("이름은 %s이고, 연락처는 %s, 주소는 %s입니다 이메일은 %s",
				dArr[0],dArr[1],dArr[2], dArr[3]);
		
		int index = 0;
		
		StringTokenizer st = new StringTokenizer(data, ",");
		while(st.hasMoreTokens()) {
			
			
			String keyValue = st.nextToken();
			
			int count = 0;
			StringTokenizer str2 = new StringTokenizer(keyValue,":");
			while(str2.hasMoreTokens()) {
			if(count % 2 != 0){
				dArr[index++] = str2.nextToken();
			}else {
				str2.nextToken();
				count++;
			}
			}
		}
		
	}
	
	
	
	
	public static void test1() {
		
		
		String msg = "안녕하세요|나는 임수진입니다|반갑습니다";
		
	
		String[] arr = new String[3];
		int index = 0;
		StringTokenizer st = new StringTokenizer(msg, "|");
	//  토근화 가능 여부 체크 : 변수명.hasMoreTokens 
		
		System.out.println(st.toString());
		
		while(st.hasMoreTokens()) {
			// 기준 문자열로 분리하여 데이터를 가져오고자 할 때 : 변수명.nextToken():String
		
			arr[index] = st.nextToken();
			System.out.println(arr[index]);
			
			index++;
		} 
	}
}
