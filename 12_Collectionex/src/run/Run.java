package run;

import view.BookMenu;


class MyUtils{

    public static void add(int num1, int num2){

        int result = num1 + num2;
        System.out.println(result);
    }

    public static void minus(int num1, int num2){
        System.out.println((num1 - num2));

    }

}

// 실행용 클래스 : Run --> main 메소드 작성

public class Run {
    public static void main(String[] args) {

        // BookMenu 객체 생성 후 mainMenu() 실행;
        BookMenu bm = new BookMenu();
        bm.mainMenu();
        // 패키지 경로가 다르기 때문에 import 해줘야 된다.

    }
}
