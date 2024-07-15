package run;

import controller.MemberController;
import view.MemberMenu;

public class Run {
    public static void main(String[] args) {

        // 객체 생성 후 mainMenu() 호출
        new MemberMenu().mainMenu();

    }
}
