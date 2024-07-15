package 초09;

public class InterfaceRun {

    /*
    *  * 인터페이스 : 상수필드 + 추상메소드
    *  * - 추상메소드를 가지고 있기 때문에 객체를 직접 생성할 수 없다
    *  * - 참조 변수의 타입으로는 가능하다.
    *
    * *  - 추상메소드 : 미완성된 메소드
    *           몸통({})이 없는 것 (구현되지 않음!)
    *           무조건 오버라이딩 후 메소드 호출이 가능
    *
    *   [public abstract] 반환타입 메소드명(매개변수); 세미콜론
    *   묵시적으로 가능하다
    *
    *         추상 클래스 = [추상메소드] + 일반 필드 + 일반 메소드
    *         - 미완성된 상태
    *         - 객체 생성 불가능
    *         - 참조변수의 타입으로는 가능하다.
    *         - 추상메소드는 가질 수도 있고, 가지지 않을 수도 있다
    *
    *        = > 추상메소드가 있는 경우 반드시 추상 클래스로 명시해야 함
    *
    *        접근제한자 abstract class 클래스명 { }
    *
    *       => 자식 클래스에서 강제로 오버라이딩하여 동일한 형식의 메소드를 정의하고 할 때
    *           자식 클래스마다 구현 내용은 다르지만 동일한 형식을 적용(메소드를 통해서/ 표준화된 틀 제공)
    *
    *
    *       = > 추상메소드가 없는 경우도 추상클래스로 만들 수 있다
    *           = > 어떤 경우? 해당 클래스가 미완성된
    *               객체 생성 불가능하게 하고자 할 때
    *
    *  * 상속(구현)관계
    *  - 클래스에서 클래스를 상속 받을 때 : 자식 클래스 extends 부모클래스 (단일 상속 가능) : 화살표 실선
    *  - 클래스에서 인터페이스를 구현 implements 인터페이스, 인터페이스 (다중 상속 가능) : 화살표 점선
    *  - 인터페이스에서 인터페이스를 상속받을 때 : 인터페이스 extends 인터페이스, 인터페이스 (인터페이스는 다중 상속 가능)
    *    같은 타입일 때는 실선이다
    *  -
    *
    *
    */


    public static void main(String[] args) {

        Plant monstera = new Monstera("카스테라");
        Plant lavender = new Lavender(" 소고기 ");

        System.out.println(monstera);
        System.out.println(lavender);

        monstera.sprinkleWater();
        monstera.baskSun();

        lavender.sprinkleWater();
        lavender.baskSun();


        System.out.println("-----1회-----");

        System.out.println(monstera);
        System.out.println(lavender);

        lavender.sprinkleWater();
        lavender.baskSun();

        System.out.println("-----2회-----");
        System.out.println(lavender);

    }


}
