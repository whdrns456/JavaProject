package com.kh.practice.dimension;

import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class DimensionPractice {
	 
		
	
	public void practice1(){
		
		// 1. 3행 3열짜리 문자열 배열 선언 및 할당 
		
		String [][] arr = new String [3][3];
		
		
		// 2. 인덱스 0행 0열부터 2행 2열까지 차례대로 "(0,0)" 형식으로 값을 저장 
		
		// arr.length = > 2차원 배열의 길이. 즉, 행의 길이
		// String[] strArr; strArr과 arr[i]의 자료형은 동일함
		// arr[i] 는 문자열 데이터를 담고있는 배열이다. 
		for(int i = 0; i < arr.length; i++) { // i :행의 인덱스 사용
			// arr[i][j] 는 문자열 데이터다!
		
			for(int j = 0; j < arr[i].length; j++) { // j는 열의 인덱스로 사용
				arr[i][j] = " ("+ i +"," + j + ")";
			}
			
		}
		
		// 3. 저장된 값들을 출력 
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) 
			System.out.print(arr[i][j]);
			System.out.println();
		}
}
	
	 	public void practice2(){
	 		int [][] arr = new int [4][4];
	 		
	 		int count = 1;
	 		for(int i = 0; i < arr.length; i++) {
	 			for(int j = 0; j < arr[i].length; j++) {
	 				
	 			arr[i][j] = count++; //
	 		// (4 * i) + (j + 1)
	 			System.out.printf("%3d",arr[i][j]);
	 			System.out.print(" ");
	 		}
	 			
	 			System.out.println();
	 		}
	 		System.out.println("=====================");
	 		// 출력 
	 		for(int i = 0; i < arr.length; i++) {
	 			for(int j = 0; j < arr[i].length; j++) {
	 				System.out.printf("%3d",arr[i][j]);
	 			}
	 			System.out.println();
	 		}
	 		
	 		
	 		
	 	}
	 	
	 	public void practice3(){
	 		
	 		
	 		int [][] arr = new int [4][4];
	 		
	 		int count = 16;
	 		
	 		// 
	 		
	 		for(int i = 0; i < arr.length; i++) {
	 			for(int j = 0; j < arr[i].length; j++) {
	 			arr[i][j] = count-- ;
	 			System.out.printf("%2d", arr[i][j]);	
				
				  if(i != arr.length) { System.out.print(" "); }
				 
	 	}
	 			System.out.println();
	 		}
	 	}
	 	
	 	public void practice4_1() {
	 		int[][] sumArr = new int[4][4];
	 		
	 		for(int i = 0; i < 3; i++) {
	 			for(int j = 0; j < 3; j++) {
	 				sumArr[i][j] = (int)(Math.random() * 10 + 1);
	 			}
	 		}
	 		
	 		for(int i = 0; i < 3; i++) {
	 			for(int j = 0; j < 3; i++) {
	 		sumArr[3][i] += sumArr[j][i];
	 		
	 			}
	 			
	 		}
	 		
	 		/*
	 		 
	 		 * sumArr[0][3] = sumArr[0][0] + sumArr[0][1] + sumArr[0][2]
	 		 * sumArr[1][3] = sumArr[1][0] + sumAr2[1][1] + sumArr[1][2]
	 		 * sumArr[2][3] = sumArr[2][0] + sumArr[2][1] + sumArr[2][2]
	 		 */ 
	 		
	 		for(int i = 0; i < 3; i++) {
	 			for(int j = 0; j < 3; i++) {
	 		sumArr[i][3] += sumArr[i][j];
	 		
	 			}
	 	}
	 		
	 		
	 		
	 		for(int i = 0; i < sumArr.length; i++) {
	 			for(int j = 0; j < sumArr[i].length; j++) {
	 				
	 			}
	 		}
	 		
	 		
	 		
	 	}
	 	
	 	/*
	 	 * 
	 	 * 
	 	 */
	 	
	 	
	 	
	 	
	 	
	 	/*
	 	 * sumArr[3][0] = sumArr[0][0] + sumArr[1][0] + sumArr[2][0]
	 	   sumArr[3][1] = sumArr[0][0] + sumArr[1][0] + sumArr[2][0]
	 	   sumArr[3][1] = sumArr[0][0] + sumArr[1][0] + sumArr[2][0]
	 	 */
	 	
	 	
	 	
	 	
		
		  public void practice4() {}
		  
		/*
		 * // for(int i = 0; i < arr.length; i++) { // arr[i] = (int) (Math.random() *
		 * // 10 + 1);
		 * 
		 * int[][] sumArr = new int[4][4];
		 * 
		 * for(int i = 0; i <sumArr.length; i++) { for(int j = 0; j < sumArr[i].length;
		 * j++) {
		 * 
		 * int lastRow = sumArr.length - 1; int lastCol = sumArr[i].length -1;
		 * 
		 * if(i != lastRow && j != lastCol) { sumArr[i][j] = (int) (Math.random() * 10 =
		 * 1); }
		 * 
		 * }
		 * 
		 * // 마지막 행의 위치에 현재 값을 더하기 if(i < lastRow) { sumArr[lastRow][j] += sumArr[i][j];
		 * }
		 * 
		 * if(j < lastCol) { sumArr[i][lastCol] += sumArr[i][j]; } } } } }
		 */
	 	
	 	
	 	
	 	public void practice5(){
	 		
	 		Scanner sc = new Scanner(System.in);
	 		
	 		System.out.println("행 크기 :");
	 		int rows =sc.nextInt();
	 		
	 		// char ch1 = strArr.charAt(0);
	 		
	 		System.out.println("행 크기 :");
	 		int cols =sc.nextInt();
	 		// char ch2 = strArr1.charAt(0);
	 		
	 		
	 		// int[][] numArr = new int[ch1][ch2];
	 	
	 		while(true) {
	 			
	 			if( rows < 1 || rows > 10 || cols < 1 || cols > 10 ) {
	 				
	 				System.out.print("반드시 1 ~ 10 사이의 정수를 입력해야 합니다");
	 				continue; //다음으로 넘어감
	 		} 
	 			char[][] arr = new char[rows][cols];		
	 	 
	 			// 입력 받은 행 크기, 열 크기로 2차원 배열 선언 및 할당 
	 			
	 			
	 			
	 			for(int i = 0; i < rows; i++) { // (최댓값 - 최속값 + 1) + 최솟값
	 				for(int j = 0; j < cols; j++) { // 65 ~90까지의 랜덤값
	 				arr[i][j] = (char)(Math.random() * (90 - 65 + 1) + 65);
	 				}
	 			}
	 			
	 			for(int i = 0; i < rows; i++) {
	 				for(int j = 0; j < cols; j++) {
	 					System.out.print((char) arr[i][j] + " ");
	 				}
	 				System.out.println();
	 			}
	 			break;
	 		}
	 			
	 		}
	 	
	 	public void practice5_1() {
	 		
	 		Scanner sc = new Scanner(System.in);
	 		
	 		System.out.print("행 크기 :");
	 		int row = sc.nextInt();
	 		System.out.print("열 크기 :");
	 		int col = sc.nextInt();
 	
	 		System.out.println();
	 	
	 		int[][] arr = new int[row][col];
	 		
	 		while(true) {
	 			
	 			 if(row > 10 || row < 1 || col < 1 || col > 10) {
	 			System.out.print("반드시 1 ~ 10사이의 정수를 입력");
	 			continue;
	 		 }
	 		 
	 		 for(int i = 0; i < arr.length; i++) {
	 			 for(int j = 0; j < arr[i].length; j++) {
	 		 arr[i][j] = (int)((Math.random() * (90 - 65 + 1) + 65));
	 			 }
	 		 }
	 		 
	 		 
	 		 for(int i = 0; i < arr.length; i++) {
	 			 for(int j = 0; j < arr[i].length; j++) {
	 				System.out.print((char)arr[i][j] + " " );
	 			}
	 			System.out.println();
	 		 }
	 		break;
	 		 
	 		
	 }	
}
	 	
	 	public void practice5_6() {
	 		Scanner sc = new Scanner(System.in);
	 		
	 	while(true) {
	 		
	 		System.out.print("행 크기 입력 :");
	 		int row = sc.nextInt();
	 		System.out.println("열 크기입력 ");
	 		int col = sc.nextInt();
	 		
	 		int[][] arr = new int[row][col];
	 		
	 		if(row > 1 && row < 10 && col > 1 && col < 10  ) {
	 			continue;
	 		} else {
	 			System.out.println("반드시 1 ~ 10 사이의 정수를 입력해주세요");
	 		}
	 		
	 		
	 		for(int i = 0; i < arr.length; i++) {
	 			 for(int j = 0; j < arr[i].length; j++) {
	 		 arr[i][j] = (int)((Math.random() * (90 - 65 + 1) + 65));
	 			 }
	 		 }
	 		 
	 		for(int i = 0; i < arr.length; i++) {
	 			 for(int j = 0; j < arr[i].length; j++) {
	 				System.out.print((char)arr[i][j] + " " );
	 			}
	 			System.out.println();
	 			
	 		 }
	 		break;
	 		
	 		
	 	}
	 		
	 		
	 	}
	 	
	 	public void practice5_5() {
			Scanner sc = new Scanner(System.in);
			
			while(true) {
				System.out.print("�뻾 �겕湲� : ");
				int row = sc.nextInt();
				
				System.out.print("�뿴 �겕湲� : ");
				int col = sc.nextInt();
				
				if (row < 1 || row > 10 || col < 1 || col > 10) {
					System.out.println("諛섎뱶�떆 1 ~ 10 �궗�씠�쓽 �젙�닔瑜� �엯�젰�빐�빞 �빀�땲�떎.");
					continue;
				}
				// �엯�젰諛쏆� �뻾�겕湲�, �뿴�겕湲곕줈 2李⑥썝 諛곗뿴 �꽑�뼵 諛� �븷�떦
				int[][] chArr = new int[row][col];
				
				for(int i=0; i<row; i++) {
					for (int j=0; j<col; j++) {
						// 65(A) ~ 90(Z) 源뚯��쓽 �옖�뜡媛� 
						//               => Math.random() * (理쒕뙎媛� - 理쒖넖媛� +1) + 理쒖넖媛�
						chArr[i][j] = (int)(Math.random() * (90 - 65 + 1) + 65);
					}
				}
				
				// 異쒕젰
				for(int i=0; i<row; i++) {
					for(int j=0; j<col; j++) {
						System.out.print((char)chArr[i][j] + " ");
					}
					System.out.println();
				}
				
				break;
			}
		}
	 	
	 	 public void practice5_0(){
	 		 
	 		 Scanner sc = new Scanner(System.in);
	 		 
	 	
	 		 
	 		 
	 		
	 		
	 		while(true) {
	 			
	 			System.out.print("행의 크기 :");
		 		int row = sc.nextInt();
		 		System.out.print("행의 크기 :");
		 		int col = sc.nextInt();
		 		 
	 			
	 			
	 			
		 		int[][] arr = new int[row][col];
	 		
	 		if(row < 1 || row > 10 || col < 1 || col >10 ) {
	 			System.out.print("반드시 1 ~ 10 사이 정수를 입력하셔야 합니다");
	 			continue;
	 		}
	 			
	 		for(int i = 0; i < row; i++) {
	 			for(int j = 0; j < col; j++) {
	 		arr[i][j] = (char) (Math.random() * (90 - 65 + 1) + 65);
	 	}		
	 }
	 		for(int i = 0; i < row; i++) {
	 			for(int j = 0; j < col; j++) {
	 				System.out.print((char)arr[i][j] + " " );
	 			}
	 			System.out.println( );
	 		}
	 		break;
	 }
	} 
	 		
	 	char ch = 'a';
	 	
	 	 public void practice7(){
	 		
	 		Scanner sc = new Scanner(System.in);
	 		System.out.print("행의 크기 :");
	 		int row = sc.nextInt();
	 		
	 		
	 		int[][] arr = new int[row][]; // char 형태여도 된다. 
	 		
	 		// 각 행의 1차원 배열에 a부터 ~ 값을 대입?
	 		
	 		
	 		for(int i = 0; i < row; i++) {
	 			System.out.print(i + "행의 열 크기 :");
	 			int col = sc.nextInt();
	 			arr[i] = new int[col];
	 		}
	 			
	 		int count = 'a';
	 		
	 		//
	 		
	 		for(int i = 0; i < arr.length; i++) {
	 			for(int j = 0; j < arr[i].length; j++) {
	 			arr[i][j] = count++;  // 
	 			// System.out.print((char)(arr[i][j]) + " " );
	 			}
	 		//	System.out.println();
	 		}
	 
	 	 for(int i = 0; i < arr.length; i++) {
	 		 for(int j = 0; j < arr[i].length; j++) {
	 			System.out.print((char)(arr[i][j]) + " " );
	 		 }
	 		System.out.println();
	 	 }
	 	 
	 }

	 	public void practice7_0(){
	 		Scanner sc = new Scanner(System.in);
	 		
	 		System.out.print("행의 크기 :");
	 		int row = sc.nextInt();
	 		
	 		int[][] arr = new int[row][];
	 		
	 		for(int i = 0; i < arr.length; i++) {
	 		System.out.print(i + "행의 열 크기 : ");
	 		int col = sc.nextInt();
	 		arr[i] = new int[col];
	 		
	 		
	 		for(int j = 0;  j < arr[i].length; j++) {
 				arr[i][j] = ch++;
 			}
	 	}
	 		
	 		
	 		
	 		for(int i = 0; i < arr.length; i++) {
	 			for(int j = 0; j < arr[i].length; j++ ) {
	 				System.out.print((char)arr[i][j] + " " );
	 			}
	 			System.out.println();
	 		}
	 		
	 		
	 		
	 	}

	 	 
	 	 
	 	 public void practice8(){
	 		 
	 		 String[] student = new String[] {
	 				 "강건강","남나나","도대담","류라라","문미미","박보배",
	 				 "송성실","윤예의","진재주","차천축", "피풍표","홍하하"
	 		 };
	 		 
	 		final  int row = 2;
	 		final  int col = 3;
	 	
	 		String[][] arr1 = new String[row] [col];
	 		String[][] arr2 = new String[row] [col];
	 		
	 		
	 		
	 		
	 		
	 	 }
 
	 	 
	 	 
	 	 
}
	 		
	 		
	 		
	 		 
	 	 
	 		
	 			
	 		
	 		
	 
	 	
	 	
	 	
	 	

  		

	  




	 	
	 	
	 	

	 
	 		
	 	
	 	 


	 		
	 		
	 		
	 
	 	
	 	
	 	

	
	
	

