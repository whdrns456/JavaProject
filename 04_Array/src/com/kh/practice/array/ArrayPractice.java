package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {

	public void practice1_0() {

		int[] arr = new int[10];

		int count = 1;

		for (int i = 0; i < arr.length; i++) {
			arr[i] += count++;
			System.out.print(arr[i]);
			if (i != arr.length) {
				System.out.print(" ");
			}
		}

	}

	public void practice1() {

		Scanner sc = new Scanner(System.in);

		while (true) {

			System.out.print("정수 입력를 입력해주세요 : ");
			int num = sc.nextInt();

			if (num <= 0) {
				System.out.printf("잘 못 입력 되었습니다\n다시 입력해주세요.\n");
			} else {

				int[] arr = new int[num];

				for (int i = 0; i < arr.length; i++) {
					arr[i] = i + 1;
				}
				for (int i = 0; i < arr.length; i++) {
					System.out.print(arr[i]);
					if (i != arr.length) {
						System.out.print(" ");
					}
				}
				break;
			}
		}
	}
	// num[i - 1] = i; arr 배열의 i - 1 초기값이 0인 경우
	// 초기값이 0인 경우 num[0] += i + 1

	/*
	 * 3. 반복문을 사용하여 각 인덱스의 값을 출력
	 * 
	 */

	/*
	 * for (int i = 0; i < 10; i++) { System.out.print(arr[i]); if (i != 9) {
	 * System.out.print(" ");
	 */
	public void practice2_1() {

		int[] arr = new int[10];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
			System.out.print(arr[i]);
			if (i != arr.length) {
				System.out.print("");
			}
		}

	}

	public void practice2() {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요  : ");
		int num = sc.nextInt();

		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr.length - i;
			System.out.print(arr[i]);
			if (i != arr.length) {
				System.out.print(" ");
			}
		}
	}

	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수 :");
		int num = sc.nextInt();

		int[] arr = new int[num];

		// 입력 받은 정수값의 길이만큼 배열을 생성
		// * 자료형[] 변수명 =new 자료형[배열길이]

		/*
		 * for(int i = 1; i <= num.length; i++) { System.out.print(i); if(i !=
		 * num.length) { num[i] = i + 1; System.out.print(" "); } }
		 */
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if (i != arr.length) {
				System.out.print(" ");
			}
		}
	}

	public void practice3_1() {

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		int[] arr = new int[num];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i + 1;
			System.out.print(arr[i] + " ");
		}

	}

	public void practice4() {

		String[] str = new String[] { "사과", "귤", "포도", "복숭아", "참외" };

		// System.out.print(num[i]);

		for (int i = 0; i < str.length; i++) {
			if (str[i].equals("귤")) {
				System.out.print(str[i]);
			}
		}
	}

	public void practice5() {

		Scanner sc = new Scanner(System.in);

		System.out.print("문자열 : ");
		String str = sc.next();

		System.out.print("문자열 : ");
		String strch = sc.next();
		char ch = strch.charAt(0);

		// 입력 받은 문자열을 배열에 문자 하나하나 저장 => 문자형 배열

		// 문자열의 길이 : 문자열_변수/ 값.length()
		// 배열 길이 : 배열_변수/ 값.length()

		char[] arrch = new char[str.length()];

		for (int i = 0; i < arrch.length; i++) {
			arrch[i] = str.charAt(i);
		}

		System.out.printf("%s에 %c가 존재하는 위치(인덱스) :", str, ch);

		int count = 0;

		for (int i = 0; i < arrch.length; i++) {
			if (arrch[i] == ch) {
				count++;
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.print(ch + "의 갯수 : " + count);
	}

	public void practice5_0() {

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 :");
		String str = sc.next();

		System.out.print("문자  ");
		String strCh = sc.next();
		char ch = strCh.charAt(0);

		char[] arr = new char[str.length()];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}

		System.out.printf("%s에 %c가 존재하는 위치(인덱스) ", str, ch);

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == ch) {
				count++;
				System.out.print(i + " ");
			}

		}
		System.out.println();
		System.out.print(ch + "갯수 :" + count);
	}

	
	public void practice6_0(){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		String[] week = new String[] {
				"월","화","수","목","금","토","일"
		};
		if(num > 6 || num <= 0) {
			
			System.out.print("잘 못 입력되었습니다");
					
		}
		
		for(int i = 0; i < week.length; i++) {
			if(i == num) {
				System.out.print(week[i] + "요일");
			}
		}
	} 
	
		
		
	 public void practice7_0(){
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.print("정수 : ");
		 int num = sc.nextInt(); 
		 int[] arr = new int[num];
		 
		 int sum = 0;
	
		 for(int i = 0; i <arr.length;  i++) {
		
		 System.out.print("배열 "+ i + "번째 인덱스에 넣을 값 :");
		 
		 int num1 = sc.nextInt();	
		 		
		 	arr[i] = num1;
		 		sum += num1; 
		  } 
		 
		 for(int i = 0; i < arr.length; i++) {
			 System.out.print(arr[i] + " ");
		 }
		System.out.println();
		System.out.println("총합 : " + sum);
 }
		 
	
		
		
	
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);

		System.out.print("0 ~ 6 사이 숫자 입력 : ");
		int str = sc.nextInt();

		String[] day = new String[] {

				"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일" 
				};

		if (str <= 0 || str > 6) {
			System.out.print("잘못 입력하셨습니다");
		} // else { }
			// day[str] + " 요일 "
			// 0부터 6범위 범위의 숫자인 경우만 요일을 출력
			// if(day >= 0 && str < day.length) )

		for (int i = 0; i < day.length; i++) {
			if (i == str) {
				System.out.print(day[i]);
			}
		}
	}

	public void practice7() {
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 :");
		int num = sc.nextInt();

		int[] arr = new int[num];
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱덱스에 넣을 값 :");
			num = sc.nextInt();

			arr[i] += num; // arr[i] = sc.nextInt();
			sum += num; // 강사님은 토탈 정하고 반복문 1하나 더 씀
						// sum += arr[i];
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		System.out.println("총합 :" + sum);
	}

	public void practice8() {

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("정수 :");
			int num = sc.nextInt();

			// 3 이상인 홀수 자연수
			if (num >= 3 && num % 2 != 0) {
				// 입력받은 정수 길이만큼의 정수형 배열 선언 및 할당
				int[] arr = new int[num];

				int value = 1; // 배열에 저장할 값

				for (int i = 0; i < num; i++) {

					if (i < num / 2) { // 중간 위치 계산 : num / 2
						arr[i] = value++; // 중간 까지는 증가
					} else {
						arr[i] = value--; // 증간 위치부터는 감소
					}
					// 배열의 데이터 출력

				}
				for (int i = 0; i < arr.length; i++) {
					if (i < arr.length - 1 ) {
						System.out.print(arr[i] + ", ");
					} else {
						System.out.println(arr[i]);
					}
				}
				break;
			} else {
				System.out.println("다시 입력하세요");

			}
		}

	}
	
	public void practice8_0() {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		while(true) {
		
		int val = 1; // while문에서 출력하기 
			
		System.out.print("정수 :" );
		int num = sc.nextInt();
		System.out.println("다시 입력하세요");
		
		int[] arr = new int[num];
 	
		
		if(num >= 3 && num % 2 != 0) {
			for(int i = 0; i < arr.length; i++) {
				if(i < num / 2) {
				arr[i] =val++;	
				}else {
				arr[i] = val--;
				}
			}
			// 인덱스 입력 
		}
		
	 // 인덱스 출력 
		for(int i = 0; i < arr.length; i++) {
			if(i < arr.length - 1) {
				System.out.print(arr[i] + ",");
			}else {
				System.out.print(arr[i]);
				
			}
			
		}
		
		break; // 브레이크는 와일문 안에서 
		
		
	}	
}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);

		System.out.print("치킨 이름을 입력하세요 :");
		String str = sc.next();

		String[] ck = new String[] { "양념", "후라이드", "파닭" };

		boolean isExist = false;
		for (int i = 0; i < ck.length; i++) {
			if (ck[i].equals(str)) {
				isExist = true;
				break;
			}
		}
		if (isExist) {
			System.out.print("배달 가능합니다");
		} else {
			System.out.print("없는 메뉴 입니다");
		}

	}
	
	public void practice9_0() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("치킨 이름을 입력하세요 :" );
		String oder = sc.next();
		
		String[] ck = new String[] {
			"양념", "후라이드","반반","파닭","뿌링클"
		};
		// ck[i].equals(str)
		boolean ok = false;
		for(int i = 0; i < ck.length; i++) {
			if(ck[i].equals(oder)) {
			ok = true;
			break;
			} 
		}
		
		if(ok) {
				System.out.print("배달 가능합니다");
			} else {
				System.out.print("없는 메뉴 입니다");
			}
		}
	
	
	public void practice10_0() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록 번호(- 포함)");
		String ssn = sc.next();
		
		
		char[] ssnCh = new char[ssn.length()];
	// 반복문을 사용하여 문자열 처음 위치부터 마지막 위치까지 문자를 배열에 저장 	
		for(int i = 0; i < ssnCh.length; i++) {
			 ssnCh[i] = ssn.charAt(i);
			 // 원본 배열의 값의 변경 없이 복사 
		} 
	}
	
	// 깊은 복사 

	
	public void practice10() {

		
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록 번호(- 포함)");
		String ssn = sc.next();

		// 문자열의 문자 하나하나를 문자형 배열로 생성 후 값을 저장
		// - 문자형 배열 선언 및 할당(문자열 길이만큼)

		char[] origin = new char[ssn.length()];
		// 문자열 길이 만큼 선언 및 할당

		// - 반복문을 사용하여 문자열 처음 위치부터 마지막 위치까지 문자를 배열에 저장

		for (int i = 0; i < origin.length; i++) {
			origin[i] = ssn.charAt(i);
			// 원본 배열 값의 변경 없이 복사
		} // 깊은 복사
		char[] copy = new char[origin.length];
		for (int i = 0; i < copy.length; i++) {
			if (i <= 7) {
				copy[i] = origin[i];
			} else {
				copy[i] = '*';
			}
			// Arrays.sort(배열명) 배열을 오름차순으로 정렬
			//
		} // Arrays.tostring(배열명) : 배열의 데이터를 출력([값,값])
		for (int i = 0; i < copy.length; i++) {
			System.out.print(copy[i]);
		}
	}

	public void practice13() {
		// 난수를 발생 중복된 값이 없게
		// 정수형 배열 길이가 10인 값을 할당

		Scanner sc = new Scanner(System.in);
		System.out.print("");

		int[] arr = new int[10]; // 메모리에 10칸짜리

		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 + 1); // 0.0부터

			for (int j = 0; j < i; j++) { // i번째 위치의 값과 j번째 위치의 값을 비교
				// 같으면 다시 랜덤값을 저장 --> 현재 위치의 값을 다시 저장할 공간
				if (arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}

		// i - 1 위치까지 중복값이 있는 지 확인
		// (현재 위치의 직전 위치)까지
		for (int i = 0; i < i; i++) {
			System.out.print(arr[i] + " ");
		}

	}
	
	public void practice13_0(){
		
		int[] arr = new int[10];
		
		
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 10 +1);
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					i--;
					break;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		
		
		
	}

	

}
