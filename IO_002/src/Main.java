import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("국어 : ");
        double n1 = sc.nextDouble();
        System.out.print("영어 : ");
        double n2 = sc.nextDouble();
        System.out.print("수학 : ");
        double n3 = sc.nextDouble();

        int sum = (int)(n1 + n2 + n3);
        int avg = (int)(sum/3);


        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + avg);



    }
}