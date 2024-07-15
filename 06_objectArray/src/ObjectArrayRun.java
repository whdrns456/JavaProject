import java.util.Arrays;
import java.util.Scanner;

public class ObjectArrayRun {
    public static void main(String[] args) { // 메인이 필요하다는 거 잘 인지하기


        /*
        *
        *  * 객체 배열 : 객체를 저장하는 배열 :
        *                   배열의 각 요소가 참조변수들로 이루어져 있다
        *               =< 객체를 사용하려면 각 요소마다 객체를 생성이 필요하다 **
        *
        * * 선언 : 클래스[] 참조변수명(배열명) = new 클래스명[배열크기];
          * 배열 크기만큼의 참조변수 배열이 생성됨
          * 배열명[인덱스] = new 클래스명(); // new 생성자 작성 객체가 생성
          *
          *
        * * */
        Scanner sc = new Scanner(System.in);

        System.out.println("입력할 인덱스 크기를 입력하세요");
        int index = sc.nextInt();

        Product[] p = new Product[index];

        for (int i = 0; i < p.length; i++) {
            System.out.print("제품명을 입력하세요 : ");
            String name = sc.next();
            System.out.print("가격 : ");
            int price = sc.nextInt();
            p[i] = new Product(name,price);
            System.out.println(p[i]);

        } // 0 1 2 3까지 출력이된다.

        // 문제가 되는 부분이 있는가?
        /*

         1) 인덱스 범위 ArrayIndexOutOfBoundsException
        *           반복문의 조건식 부분이 i<= 배열 길이보다 작거나 같거나로 되어있어
                    마지막 인덱스보다 큰 값까지 접근하게 됨
                    = > 조건식 부분을 i < 배열길이으로 수정해줘야함
            2)  객체 배열의 각 인덱스 위치에 감긴 값이 null인 상태인데,
               이 상태에서 객체 내의 메소드로 접근하려 함 (NullPointerException)
               = > 메소드 접근 전 각 인덱스 위치에 객체를 생성해줘야한다.


        * */






    }
}
