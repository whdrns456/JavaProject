public class Main {
    public static void main(String[] args) {


        /*
        *
        * 뱐수의 선언 : 값을 기록하기 위한 변수를 메모리 공간에 확보(할당)하는 것
        *
        * 자료형 : 변수의 크기와 모양을 지정하는 부분
        * 변수 이름 : 변수의 이름을 붙여주는 부분
        *
        *  - 변수 선언 시 주의할 점.
        * 1) 변수의 이름은 소문자로 시작
        * 2) 같은 영역 ({})에서는 동일한 이름으로 변수 선언 불가 -> 중복 불가
        * 3) 해당 영역 안({})에 선언된 변수는 그 영역 안에서만 사용 가능 - > 다른 영역에서는 사용불가
        * */

        // ----논리형----
        // 1. 논리형(논리값 - true - false) 1B
        // 변수 선언과 동시에 값을 대입(초기화)
        // boolean = 1 + 3 > 0; // 어떤 연산의 결과가 true 또는 false인 경우 연산 결과 값을 저장할 수 있다

        boolean bb = false;
        // 2. 정수형
        byte bNum; // 1B, -128 ~ 127

        short sNum = 1000; // 2B

        int iNum = 10000; // 4B 정수형

        long lNum = 100000000000000000L; // 8b
        // (int) 자동 형변환 생략
        // 작은 범위에서 큰 범위


        // 3. 실수형(소숫점 o)

        float fNum = 0.0f; // 4byte
                            // double 구분하기 위해 값 뒤에 f를 붙여줌

        double dnum = 0.0; //8byte 크기 소숫점 15자리까지 표현가능
                           // 실수형 기본 자료형.

        // 4. 문자형 : 한 글자에 값만 저장할 수 있는 자료형.
        // 작은 따옴표('')로 값을 표현. 짝따짝따
        char a = 'a';
        char hong;
        hong = '홍';


        // = > 컴퓨터에서는 각각의 문자들에 대한 고유한 숫자를 가지고 있음(ascii/unicode)

        // 5. 문자열 : 한 글자도 저장할 수 있고, 여러 글자도 저장할 수 있는 자료형. 큰 따옴표("")
        String str; // 참조 자료형
        str = "11";
        String str1= "22";
        // String str2 = str + str1;
       // System.out.println(str2);



        // TODO : 저장된 값을 콘솔창에 출력해보자

        System.out.println(sNum);
        System.out.println(iNum);
        System.out.println(dnum);
        System.out.println(fNum);
        System.out.println(bb);
        System.out.println(a);

        // ---------------------------------------------

        /*
        *  상수 : 변하지 않는 수(값)
        *  [표현법] final 자료형 상수이름;
        *
        * */

        final int MAX_SIZE;
        MAX_SIZE = 1024;
        // MAX_SIZE = 1024 * 10; 변경이 불가능하다
        // 대문자만 사용, 단어 사이는 언더바(_)로 구분
        // 한 번 저장을 하면 변경이 불가능하다


        // 형변환 ------------------------------------------------------



        /*
        *  * 형변환 : 값의 자료형을 바꾸는 것
        *  * 컴퓨터에서의 처리(연산) 규칙 (--> 형변환이 필요한 상황)
        * 1) 대입 연산자 기준 왼쪽과 오른쪽이 같은 자료형이어야 함!
        *   = > 같은 자료형의 변수에 해당하는 값을 대입해야 함!
        *   = > 다른 자료형의 값을 대입하고자 한다면, 형변환이 필요하다
            int num = (int)3.14;
        *  2) 같은 자료형끼리만 연산 가능
        *  값 + 값 // 두 개의 값이 모두 같은 자료형이어야 함!
        *
        * * 형변환의 종류
        * 1) 자동 형변환  = > 자동으로 형변환이 진행됨
        *               = > 같의 범위가 작은 자료형과 큰 자료형의 연산 시
        *               작은 자료형의 값이 큰 자료형으로 자동으로 변환된 후 연산이 수행됨
        *
        * 2) 강제(명시적) 형변환 = > 자동 형변환이 되지 않는 경우 직접 형변환을 해야함
        * - ( 바꿀자료형)값/변수;
        * - int(4byte), double(8byte) : 자동 형변환이 일어날 것!
        * * */

        int i1 = 11;
        double d1 = i1;
        // 자동형변환 11.0
        i1 = (int)d1;

        int i2 = 10;
        double d2 = 5.5;

        double r1 = i2 + d2;
        System.out.println(r1); //10.0 + 5.5 => 15.5
        System.out.println("r1 : " + r1);

        // float(4byte) --> double(8byte) : 자동 형변환
        float f1 = 10.05f;
        float f2 = 0.0f;

        double d3 = f1;

        // long(8byte) -- float(4byte)

        // => 크기는 long 자료형이 크다고 볼 수 있으나,
        // 실수형인 float 자료형에 담을 수 있는 값의 범위가 더 크기 때문에 자동 형변환이 진행됨
        long l1 = 111111111111111l;
        float f3 = l1; // 자동 형변환
        System.out.println(f3);
        // => float 자료형에는 매우 큰 수나 작은 수의 경우 대략적으로 표현될 수 있음!

        double d4 = l1;


        // char (2byte) <-> int(4byte)

        int i3 = 95;
        char c1 = (char) i3;

        System.out.println(c1);

        int i4 = 'S'; // 자동형변환

        System.out.println(i4);
        // 문자들은 다 숫자를 가지고 있다.

        // char cc = '-1'; 음수값은 안된다. 0 ~65535까지


        System.out.println((int)'최'+ " "+ (int)'종'+" " + (int)'군');













    }
}