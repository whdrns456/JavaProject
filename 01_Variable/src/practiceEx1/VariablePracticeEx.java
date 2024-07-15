package practiceEx1;



import java.util.Scanner;


public class VariablePracticeEx {

	public static void main(String[] args) {
		
		
		
		
		  Scanner sc = new Scanner(System.in);
		  
		  
		  String name = sc.nextLine(); double height = sc.nextDouble(); int age =
		  sc.nextInt();
		  
		  
		  System.out.printf("이름은 %s이고 키는 %.1f cm이고 나이는 %d입니다 \n", name, height, age);
		 
		
		
		
		int a = 10;
		int d = 3;
		double result = (double)(a + d);
		
		System.out.println(result);
	}

}
