package ch11;

public class Math {
    public static void main(String[] args) {
        System.out.println("===java.lang.Math ===");

        // 절대값을 구해주는 메소드 :
        int n = 100;
        System.out.println(" 절대값 : "+ java.lang.Math.abs(-10));
        System.out.println(n + "절대값 : " + java.lang.Math.abs(n));

        // ceil : 소수점을 올림처리 해주는 메소드

        double d = 1.9;

        System.out.println(d + "의 값을 올림 처림 : " + java.lang.Math.ceil(d));
        System.out.println(d + "의 값을 반올림 해주는 : " + java.lang.Math.round(d));
        System.out.println(d + "의 값을 내림 : " + java.lang.Math.floor(d));
        // 내림(버림) 처리 해주는 메소드

        // 가장 가까운 정수 값을 알아낸 후 실수형으로 반환해주는 메소드
        // rint : 가장 가까운 정수 값을 알아낸 후 실수형으로 반환해주는 메소드(반올림)
        System.out.println("3.7 의 값에 가까운 정수(->실수형) : " + java.lang.Math.rint(3.5));

        // 제곱근 (루트)
        System.out.println("제곱근 : " + java.lang.Math.sqrt(5));
        System.out.println(2.23606797749979*2.23606797749979);

        // pow : 제곱값을 구해주는 메소드

        System.out.println(java.lang.Math.pow(2,10));
        System.out.println("---------------------------------------------------");

        // 2의 1 ~ 2의 10까지


        for (int i = 1; i < 11; i++) {
            System.out.println(java.lang.Math.pow(2,i));
        }


        /*  java.lang.Math mm = new java.lang.Math();*/

        /*
        *       Math : 대부분 모든 필드들이 상수, 메소드는 static으로 정의되어 있음
        *       생성자는 private으로 되어있다
        *
        *
        *     ---> 싱글톤 패턴 : 한번만 메모리 영역에 올려놓고 재사용하는 개념
        *
        *
        */


    }
}
