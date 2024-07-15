package com.kh.practice.chap02_abstractNInterface;

public class PhoneController {

	private String[] result = new String[2];
	
	
	
	

	
	
	
	
	
	
	public String[] method() {
	
		
		// 2개의 Phone 객체를 저장할 수 있는 객체배열 생성
		// 각각의 인덱스에 다형성을 적용하여 GalaxyNote9, V40 객체 저장
		
		Phone[] pList = new Phone[2];
		
		pList[0] = new GalaxyNote9();
		pList[1] = new V40();
		

		
		// for문을 이용하여 Phone 객체배열에 각 인덱스의 printInformation()의
		// 반환 값을 String배열에 담아 반환
		
		int index = 0; // 현재 위치를 추적하는 데 사용된다. 
		for(int i = 0; i < pList.length; i++) {
			
			
			if (pList[i] instanceof  GalaxyNote9) {
			result[index++] =((GalaxyNote9)pList[i]).printInformation();
				
			}else if(pList[i] instanceof V40) {
			result[index++] =((V40)pList[i]).printInformation();
			}
				
			}
		return result;
	}
	
	
}
