package com.kh.practice.chap02;

public class Practice {

	public void method1() {

	}

	public void method2() {

		int sum = 0;

		for (int i = 1; i <= 10; i++) {

			sum += i; // 복합대입 연산자
		}
		System.out.println(sum);
		System.out.println("1부터 10까지 합");
	}

	public void method3() {
		/*
		 * - meth : java.lang.Math random() : 랜덤값을 반환해주는 메소드 Math.random(); 값의 범위 : 0.0
		 * ~ 0.999999999xx(0.0 <= n < 1.0) => 1~10 사의 랜덤값 : (int) (Math.random() * 10 +
		 * 1)
		 */

		int random = (int) (Math.random() * 10 + 1);
		System.out.println("랜덤값은 " + random + "입니다");
		int sum = 0;

		for (int i = 1; i <= random; i++) {
			sum += i;
		}
		System.out.println("총합은 " + sum);

	}

	public void method4() {
		// 분기문 ; break (반복문 종료 시키는 분기문 )
		// 1 ~100 사이의 랜덤값을 추출하여
		// 해당 랜덤 값이 짝수일 때 반복문 종료 (종료 전 "종료" 출력)
		// 홀수일 때는 해당 값을 출력하고 다시 랜덤값을 추출.
		int sum = 0;
		int random = (int) (Math.random() * 100 + 1);

	

			while (true) {
				if (random % 2 == 0) {
				System.out.println("종료 :" + random);
				break;
			}
			System.out.println(  "랜덤 값은 " + random);
		}
	}

	
	public void method5() {
		// 1부터 10까지 정수 중에 짝수만 출력 
		
		int sum = 0;
		
		for (int i = 1; i <= 10; i++) {
			
			if (i % 2 == 1) {
				continue;
			}
			System.out.println(i);	
		}
		
		
		
	}
	public void method6() {
		
		
		
	}
	
	
	

}
