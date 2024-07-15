package com.kh;

public class VariablePractice0 {

	public static void main(String[] args) {
		
		
		/*
		* 예지 1) 변수를 사용하여 아래 코드를 이해하기 쉽도록 변경해보기
		* - 연도에 해당하는 값을 정수형(int) 타입의 year 이름으로 선언
		* - 현재 연도를 year 변수에 대입
		* 
		* - 나이에 해당하는 값을 정수형 int로 타입의 age 이름의 변수로 선언 및 대입
		*
 		*/
		
		// 변수를 사용하지 않은 경우
		System.out.println("[1] 현재 2024년이고, 올해 31살입니다. ");
		
		
		// 변수 선언 및 대입 
		int year;	 // 정수형 변수 선언 
		year = 2024;// year 변수에 2024라는 값을 대입 
		
		int age = 31; // age라는 이름으로 선언 및 31이라는 값을 대입
		
		
		
		// 변수를 사용하여 화면에 출력 
		
		/*
		 * System.out.println("[2] 현재 나이는 " + age + " 현재 연도는" + year + "입니다");
		 * System.out.printf("[3]현재 나이는 %d이고 현재 연도는 %d입니다", age, year);
		 */
		
		// final 변하지 않는 값을 저장 
		final int LIMIT_WEIGHT = 80;
		System.out.println( "몸무게가 "+ LIMIT_WEIGHT + " 이상인 경우 탑습을 못합니다");
		
		
		System.out.println("---------------------------------------------------------");
		
		/*
		 * 형변환 : 연산을 할 때 자료형의 종류가 다른 경우 형변환이 발생한다 
		 * - 자동형변환 규칙 
		 *  [1] 값의 범위가 작은 범위에서 큰 범위로 갔을 때 자동으로 형변환이 발생한다.
		 *  [2] 정수형과 실수형의 연산 시에는 정수형에서 실수형으로 형변환이 발생된다. 
		 */
		
		int num1 =10;
		double dnum1 = 5.5;
		 

		System.out.println( num1 + dnum1);// num1 변수가 자동형변환이 발생(int - >  double)
		System.out.println(num1 + (int) dnum1 ); // 결과 => 15 double => int 강제형변환
		
		// char < --> int : ASCII (아스키 코드)
		char ch = 'A';
		System.out.println((int)ch); // 65 아스키 코드가 출력된다 
		System.out.println(ch + 3);	 // 68 출력 ch(2B) <= int(4B) 65 => 68
									 // char가 int로 자동형변환 
		System.out.println((char) (ch + 3)); // D가 출력된다.
		
		System.out.println("");
		
		/*
		 * System.out.println(a); System.out.println(p); System.out.println();
		 */
		
	}

}
