import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        /*
        *
        *  * 프로그램의 진행은 순차적으로 진행됨(위에서 아래로, 왼쪽에서 오른쪽으로)
        *  * 이 흐름을 바꾸고자할 때 제어문을 통해 직접 제어 가능
        *
        *  - 선택적으로 실행 시키고자 할 떄 = > [조건문]
        *  - 반복적으로 실행 시키고자 할 때 => [반복문]
           - 그 외의 흐름 제어 => [분기문]
        * */

        /*
         *  * 조건문 : 조건식을 통해 참/거짓에 따라 코드를 실행
         *   [1] if문
         *   [2] switch문
         * */

        Scanner sc = new Scanner(System.in);
/*
        System.out.print("숫자를 입력 : " );
        int num = sc.nextInt();

        // 입력된 값이 양수인지 양수가 아닌지 판별
        if(num > 0){System.out.println("양수입니다");}
        else{System.out.println("양수가 아닙니다");}*/
       /* System.out.println("나이 입력 : ");
        int age = sc.nextInt();

        if (age > 0) {
            if (age <= 13) {
                System.out.println("어린이");
            } else if (age <= 19) {
                System.out.println("청소년");
            } else {
                System.out.println("성인입니다");
            }
        } else {
            System.out.println("잘못 입력하셨습니다");
        }*/
        // =========================================================================
        // =========================================================================
        /*
        *  사용자에게 구매할 과일을 입력 받아, 가격을 출력하기
        *  - 수박 : 15000
        *  - 참외 : 5000
        *  - 복숭아 : 10000
        * */

    /*    System.out.println("구매할 과일을 입력(수박/참외/복숭아)");
        String fruit = sc.nextLine();

        int price = 0;
        switch (fruit){

            case "수박": System.out.println("가격 15000원");break;

            case "참외": System.out.println("가격 5000원");break;

            case "복숭아": System.out.println("가격 10000원");break;

            default: System.out.println("없는 과일입니다");
        }*/


        /*
        *       반복문 : 어떤 코드를 반복적으로 실행
        *       [1] for문
        *       [2] while문
        *
        *       for(초기식; 조건식; 증감식){
        *       // 반복 횟수 설정
        *       // 반복적으로 실행할 코드 작성
        * }
        *
        *  - 초기식 : 반복문이 수행될 때 한 번 실행된다.
        *  - 조건식 : 조건이 참인 동안에 조건식의 결과가 true일 때 코드 실행
        *                                     = > false일 때 반복문을 종료
        *                                      => 보통 초기식에 선언된 변수를 가지고 조건식을 작성
        *
        *  - 증감식 : 반복문을 제어하는 변수의 값을 증가시키거나 감소시키는 부분
        *            => 보통 초기식에 선언된 변수를 가지고 증감연산자(++.--)를 사용
        * */

        // 2. 2 ~ 9 사이의 랜덤값을 뽑아 X단에 출력하기


        int random = (int) (Math.random() * 9 + 1);

       /* for (int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d\n", random,i,random*i);
        }*/


        /*
        *
        *  * 위의 랜덤값을 기준으로 아래와 같이 출력해보자
        * */

        for (int i = 0; i < random; i++) {
            for (int j = 0; j < random; j++) {
             if(i == j) System.out.print(i + 1);
            else System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("====================");


        /*
           [초기식]
        *  while(조건식)
        *   - 반복 실행할 코드
        *   [증감식]
        * */


        // 위의 랜덤 구구단을 while문을 사용하여 출력




     //   int i = 1;
    /*    while (i < 10){
            System.out.println(random + " X " + i +" = "+ random*i);
            i++;
        }*/


        // 무조건 1회 실행한 후 조건식의 결과를 확인하여 반복 수행
        int num2 = 1;
        do {
            System.out.println(num2);
        }while (num2 == 0);

        System.out.println("-------------------------");
        // --------------------------------------------------------------

        /*
        *  - continue : 코드를 실행하다가 이 분기문을 만나면 다음 분기로 넘김
        *  - break : 반복문을 강제로 빠져나감(종료)
        *      *switch문 안의 break;는 switch문 만을 빠져나감!
        * */

        // 1 ~ 10 continue

        for (int i = 1; i <= 10; i++){
            if(i % 2 == 0){
                continue;
                // continue를 만나면 실행을 안하고 다음 반복문을 실행한다
            }
            System.out.print(i + " ");
        }

        System.out.println();

        int i = 1;

        while (true){


            int random2= (int) (Math.random() * 10 + 1);



            if (random2 % 3 == 0){
                System.out.println("3의 배수 " + random2);
                break;
            }

            System.out.print(random2);




        }






    }
}