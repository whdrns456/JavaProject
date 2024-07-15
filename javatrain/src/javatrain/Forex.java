package javatrain;

import java.util.Iterator;

public class Forex {

	public static void main(String[] args) {


		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4 - i; j++) {
				System.out.print(" ");
			}for (int j = 1; j < i * 2; j++) {
				System.out.print("*"); 
				} 
					System.out.println();
		}
		
			for (int i = 0; i < 3; i++) {
					for (int j = 0; j < i + 1 ; j++) {
					System.out.print(" ");
		  }	 for (int j = 0; j < 5 - i*2; j++) {
			  System.out.print("*");
		}
				System.out.println();
		}
		 
			int num = 2;
			System.out.println((num % 2 == 0) ? "짝수" : "홀수");
	}

}
