package practice1;

public class Variable01 {
	// 
	public static void main(String[] args) {
	
		// Q. 문자열 타입 (String)의 이름(name)을 저장할 변수를 작성 
		
		String name; 
		name = "최종군";
		
		System.out.println(name);
		
		// Q. 실수형 타입에 (double)의 키(height)를 저장할 변수 
		
		double height = 120.1;
		
		System.out.println(height);
		
		char a = 'b'; // 캐릭터 char 2 byte 문자 
		
		// String 참조형  문자열 
		// boolean 논리형 연산자 
		// 오버플로우 : 허용된 범위 이상의 비트를 침범하게 되는 걸 오버플로우라 한다. 
		
		// 저장단위 bit > byte (bit 8개가 모여서 1 byte)
		
		// 변수 명명 규칙 
		// 예약어를 사용하면 안된다 : true, final, String
		// 숫자로 시작하면 안된다 1age 등 
		// 특수문자는 _, $만 허용한다. 
		// 대소문자가 구분된다, 길이 제한이 없다  
		// 소문자로 시작을하고 단어가 두 개 이상 사용이 두번째 이상 단어는 대문자로 시작을 한다. 
		// ageOfVampire, userName 등 : 카멜케이스 
		
		
		// 값 대입 
		// int age;
		// age = 10;
		
		// 리터럴 값 자체를 의미함 
		// int a = 10;
		
		// 변수의 초기화 
		
		// 선언 후 초기화 
		// int age;
		// age = 100;
		
		// 선언과 동시에 초기화 
		// int age = 100;
		
		//String str = "기차" + "폭폭"; // 문자열을 합쳐 줌 
		//String str = "기차" + 123 + 45 + "출발"; //12345 출력 
		String str =123 + 45 + " 기차"  + "출발"; // 168이 출력을 한다. 
		System.out.println(str);
		
		
		// 상수(final) 변하지 않는 값. 
		// 상수는 대문자로 표기를 한다 
		// 문자 사이는 _ 로 구분을 한다 예 : final int MAX_SIZE = 100;
		
		final int AGE = 10; // final 자료형 변수명; 
		//	AGE = 11; 에러 발생 
		
		
		
		
		
		
		
		
		
		
		
	}

}
