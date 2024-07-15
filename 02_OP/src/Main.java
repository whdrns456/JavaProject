public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int n = 10;
        int[] ang = {};

        /*
        *  논리 부정 연산자(단항 연산자 : 하나의 값을 가지고 연산 수행)
        *  - 연산자 : !
        *  - 논리값을(true,false)을 반대로 바꿔주는 연산자
        *
        * */

        boolean b1 = true;
        System.out.println(!b1); // !true = > false

        boolean b2 = !b1;

        System.out.println(b2);

        boolean b3 = !(10 % 2 == 0);

        System.out.println("B3 : " + b3); // b3 => false. 연산 결과의 값을 부정하여 대입
        // ---------------------------------------------------------------

        // 증감 연산자++
        // [1] ++ : 변수에 담긴 값을 1씩 증가시키는 연산자
        // [2] -- : 변수에 담긴 값을 1씩 감소시키는 연산자
        // 다른 연산이 있을 경우...
        // * 전위 연산 : (증감연산자)변수 => 선 증감 후 처리(다른 연산 수행)
        // * 후위 연산 : 변수(증감연산자) => 선 처리 후 증감

        int i1 = 10;

        System.out.println("1)" + i1);   // 10
        System.out.println("2)" + ++i1); // 11
        System.out.println("3)" + i1++); // 11
        System.out.println("4)" + i1);   // 12


        System.out.println("----------------------------------------");
        int i2 = ++i1;
        System.out.println(i1);
        System.out.println(i2);

        int i3 = i1++;
        System.out.println(i1 + " i1   i3 " + i3); // 14 i3 = 13

        int i4 = i1++ * 5;
        System.out.println("7) i1 = " + i1 + ", i4 = " + i4);

        /*
        *  * 산술 연산자 (이항 연산자 : 두 개의 값을 가지고 연산 수행)
        *
        * */

        int n1 = 10;
        int n2 = 5;
        System.out.println("n1 + n2 =" + (n1 + n2));
        // 괄호를 해줘야 된다 같은 순위 연산자 일경우 결합 방향부터 실행이 된다
        System.out.println("n1 - n2 = " + (n1 - n2));
        System.out.printf("%d - %d = %d 복습자료", n1,n2,(n1-n2));
        // 괄호를 해줘야한다

        System.out.println();
        System.out.println("n1 * n2 = " + n1 * n2);
        System.out.println("n1 / n2 = " + n1 / n2);
        System.out.println("n1 % n2 = " + n1 % n2);



        System.out.println();
        // 1) n1의 값이 짝수인지? 홀수인지?

        if(n1 % 2 == 0){System.out.println("n1 짝수입니다 ");}
        else {System.out.println("n1 홀수입니다");}
        if(n2 % 3 == 0){System.out.println("n2 배수이다");}
        else {System.out.println("n2 배수아닙니다 ");}

        // * 비교연산자 / 관계연산자(이항연산자)
        /* // - 두 값을 비교하는 연산자
              - 비교연산자는 조건을 만족하면 true, 만족하지 않으면 false를 반환
              * 대소 비교 연산자 : ><,>=,<=
              = 동등 비교 연산 : ==, !=
        * */

        int a = 7;
        int b = 4;

        System.out.println("a == b : " + (a == b));
        System.out.println("a == b : " + (a != b));

        boolean result  = a > b;
        System.out.println("result : " + result);

        System.out.println((a * 2) > (b / 3));
        // 산술 연산이 비교 연산보다 먼저 수행됨

        System.out.println("---------------------------------------------------------");

        System.out.println("a 값이 짝수인가 ? " + (a % 2 == 0));
        System.out.println("a 값이 짝수인가 ? " + !(a % 2 == 0));
        // 괄호를 묶어줘야된다.
        System.out.println("a 값이 짝수인가 ? " + (a % 2 != 0));

        System.out.println("========================================");

        /*
        *   * 논리 연산자(이항연산자)
        *  : 두 개의 논리값을 연산해주는 연산자
        *  : 연산 수행 결과값도 논리값
        * - 연산 and, or  = && ||
        *  : 왼쪽, 오른쪽 값이 모두 true일 때 결과가 true
        *  : 논리값 || 논리값 둘 중 하나라고 true일 때 결과가 true
        *
        * */

        int num = 55;
        // num 변수에 저장된 값이 1이상이고 100 이하인 경우

        boolean r2 = num <= 100 && num >= 1;
        System.out.println(r2);
        // && ~이고, 그리고, ~하면서

        char yn = 'y';
        //yn 변수에 저장된 값이 'y'이거나 'Y'인 경우

        boolean r3 = (yn == 'y')|| (yn == 'Y');
        // || : ~이거나, 또는
        System.out.println("-------------------------------------");
        System.out.println(r3);

        boolean r4 = (num > 55) && (++num > 0);
        System.out.println("r4  " + r4 + " num : " + num);
        // && 연산의 경우 왼쪽 결과가 false인 경우 오른쪽의 연산이 수행되지 않는다.

        boolean r5 = (num > 0) || (num++ > 1);
        System.out.println("r5  " + num);
        // || 연산의 경우 왼쪽 결과가 true인 경우 오른쪽의 연산이 수행되지 않는다 .

        // =================================================================


        /*
        *  복합 대입 연산자 : 산술 연산자와 대입 연산자가 결합되어 있는 연산자
        *  연산 처리 속도가 좀 더 빨라 사용이 권장됨.
        *
        *  - 연산자 :   +=,  -=,  *=, /=, %=
        *  a = a + 3;       = > a += 3;
        *
        * */

        int num2 = 45;
        // num2를 2배 증가
        num *= 2;

        // num2를 5 증가
        num2 += 5;

        // num2를 2배 감소
        num /= 2;

        String str = "Hi";
        str += ", Java";

        // 삼항 연산자 (3개의 값을 가지고 연산 수행)
        // - 연산자 : 조건식 ? 조건식의 결과가 참일 때 사용할 값 : 조건식의 결과가 거짓일 때 사용할 값

        // 랜덤값 (1 ~ 100);

        int random = (int)((Math.random() * 100 - 1 + 1) + 1);


        // 랜덤 값이 짝수인지 홀수인지
        String result1 = random % 2 == 0 ? "짝수다" : "홀수다";
        System.out.println(random + " : " + result1);

        String result3 = random >= 'A'  && random <= 'Z' ? "대문자" : "대문자 아님";
        System.out.println((char)random + " : " + result3);










































    }
}