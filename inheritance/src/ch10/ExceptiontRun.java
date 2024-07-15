package ch10;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptiontRun {
    /*
    *
    *  * 예외 : 프로그램 실행 줒ㅇ 비정상적으로 종료 상황이 발생하는 것
    *
    *   - [1] : 시스템 : 컴퓨터의 오작동으로 발생하는 오류 => 코드로 해결할 수 없다!
    *
    *   - [2] : 컴파일 : 개발자의 실수 - > 소스코드 문법상의 오류 => 컴파일 시 오류 발생되므로 발견이 쉬움
    *
    *   - [3] : 런타임 오류 : 코드상 문제는 없으나 실행 중 발생되는 오류
    *
    *   = > RuntimeException
    *      - classCastException : 참조하지 않는 타입으로 변환하려 할 때 발생하는 예외
    *      - ArithmeticException : 산술 예외(ex. 나누기 연산 시 0으로 접근 )
    *
    *  : 참조하지 않은 타입으로 변환
    * */

    // 예외 처리 : 예외들이 발생되었을 때 해결하는 방법 -> 정상적으로 프로그램이 실행될 수 있도록 하는 것

    // [1] 직접 처리 : try ~ catch
    // [2] 위임(떠넘기기) : throws 사용

    static Scanner sc = new Scanner(System.in);
    // Scanner 객체를 필드부에 생성 :

    public static void main(String[] args) {

      //  method01();
       /* try {
            method2();
        }catch (IOException e){
            System.out.println("입출력 오류 " + e.getMessage());
        }
        System.out.println("===메인 끝====");*/

        System.out.println("입력 : ");
        int num = sc.nextInt();

      /*  if(num > 0){
            System.out.println(num);
        }else {
           throw new ArithmeticException("0보다 큰 수를 입력하세요");

        }*/



    }
    public static void  method01(){
    // Unchecked Exception : 에외처리가 필수는 아니나, 데이터에 따라 예외가 발생할 수 있다
    //
        System.out.println("배열 크기 : ");
        // 사용할 객체도 static
        // 실행하자마자 사용을 해야하니까

        try {
            int  size = sc.nextInt();
            int[] arr = new int[size];
            System.out.println("100번째 인덱스 값 : " + arr[100]);
         }catch (ArithmeticException | NegativeArraySizeException | InputMismatchException e){
            //e.printStackTrace();
            //e.getMessage();
            System.out.println("잘못된 접근");
        }



    }


    public static void method2() throws IOException, ArithmeticException{
        // CheckedException : 반드시 예외처리를 해야되는 예외들
        //                  --> stream 외부 매체와의 입출력 작업 시 예외처리가 필수!

        // System.in : InputStream --> BufferedReader 변환 시  InputStreamReader 도움을 받음!
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            String data = reader.readLine();
            System.out.println("입력된 값" + data);
    }
}
