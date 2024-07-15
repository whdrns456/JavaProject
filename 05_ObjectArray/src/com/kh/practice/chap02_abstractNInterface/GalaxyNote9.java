package com.kh.practice.chap02_abstractNInterface;

public class GalaxyNote9 extends SmartPhone implements NotePen {

	
	
	public GalaxyNote9() {
		
		
		// 기본 생성자 : 부모에게 상속 받은 maker 필드를 "삼성"으로 초기화 
		setMaker("삼성");
	}
	
	
	 public String makeCall() {
		 return "번호를 누르고 통화버튼을 누름";
	 }
	
	 
	public String takeCall(){
		 return "수신 버튼을 누름";
	 }
	
	
	public String picture() {
		return "1200만 듀얼 카메라";
	}
	
	public String  charge() {
		return"고속 충전, 고속 무선 충전";
	}
	
	
	public String touch() {
		return"정선식, 와콤펜 지원";
	}
	
	
	public boolean bluetoothPen(){
		return PEN_BUTTON;
	}
	
	public String printInformation() {
		return"갤럭시 노트9은" + getMaker() + "에서 만들어졌고 제원은 다음과 같다"
	+ makeCall() + "\n" + takeCall() + "\n" 
				+ picture() + "\n" + charge() + "\n" + touch() + "\n"
	 + "블루투스 펜 탑재 여부 :" + bluetoothPen() + "\n";
	
	}

	
	
}
