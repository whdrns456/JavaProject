package view;

import controller.MemberController;
import model.vo.Member;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class MemberMenu {

    Scanner sc = new Scanner(System.in);
    MemberController mc = new MemberController();


    public void mainMenu(){

        System.out.println("========== 기다운 사이트 ==========");

        while (true) {
            System.out.println("1. 회원가입");
            System.out.println("2. 로그인");
            System.out.println("3. 같은 이름 회원 찾기");
            System.out.println("9. 종료");
            System.out.print("메뉴 번호 입력");

            int menu = sc.nextInt();

            switch (menu){
                case 1: joinMembership();break;
                case 2: logIn(); memberMenu(); break;
                case 3: sameName();break;
                case 9: System.out.println("프로그램을 종료합니다");return;
                default: System.out.println("잘못 입력하셨어");break;

            }}}

    public void memberMenu(){
        System.out.println("******* 회원 메뉴 *******");

        while (true) {
            System.out.println("1. 비밀번호 바꾸기 :");
            System.out.println("2. 이름 바꾸기");
            System.out.println("3. 로그아웃");
            int menu = sc.nextInt();

            switch (menu){
                case 1: changePassword();break;
                case 2: changeName();break;
                case 3: System.out.println("로그아웃 되었습니다"); mainMenu();
                default: System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
            }}}

    public void joinMembership(){

        while (true) {
            System.out.print("아이디 : ");
            String id = sc.next();
            System.out.print("비밀번호 : ");
            String pw = sc.next();
            System.out.print("이름 :");
            String name = sc.next();

            // 멤버 고 비밀번호와 이름은   Member객체에 담고

            Member mem = new Member(pw, name);
            boolean result = mc.joinMembership(id, mem);

            if (result) {
                System.out.println("회원가입 성공하셨습니다");return;
            } else {System.out.println("중복된 아이디입니다 다시입력해주세요");}}}

    public void logIn(){
      while (true) {
          System.out.println("아이디 : ");
          String id = sc.next();
          System.out.println("비밀번호 : ");
          String pw = sc.next();

          String name = mc.logIn(id, pw);

          if (name != null) {System.out.println(name + " 환영합니다");memberMenu();
          } else {System.out.println("틀린 아디 또는 비밀번호입니다. 다시 입력해주세요.");}}}


    public void changePassword(){
        while (true) {
            System.out.println("아이디 :");
            String id = sc.next();
            System.out.println("현재 비밀번호 :");
            String pw = sc.next();
            System.out.println("변경할 비밀번호 : ");
            String newPw = sc.next();

            if (mc.changePassword(id, pw, newPw)) {
                System.out.println("비밀번호 변경에 성공했습니다");
                mainMenu();
            } else {
                System.out.println("변경에 실패 했습니다 다시 입력해주세요");
            }}
    }

    public void changeName(){
        while (true) {

            System.out.println("아이디 : ");
            String id = sc.next();
            System.out.println("비밀번호 : ");
            String pw = sc.next();

            String name = mc.logIn(id, pw);

            if(name != null) {
                System.out.println("현재 설정된 이름 : " + name);

                System.out.println("변경할 이름 : ");
                String newName = sc.next();

                mc.changeName(id, newName);
                System.out.println("이름 변경에 성공하였습니다.");
                break;
            }else {
                System.out.println("이름 변경에 실패했습니다. 다시 입력해주세요");
            }}
    }

    public void sameName(){
       /* 검색할 이름을 받고 mc의 sameName()메소드로 넘김.
        반환 값을 가지고 entrySet()을 이용하여 ‘이름-아이디’ 형식으로 출력*/

        System.out.print("검색할 이름 : ");
        String name = sc.next();

        TreeMap result = mc.sameName(name);

        if(result.isEmpty()){
            System.out.println("검색 결과가 없습니다 ");
        } else {

            for(Object entry: result.entrySet()){
                Entry<String,String> e = (Entry)entry;
                System.out.println(e.getValue() + " - " + e.getKey());
            }
        }

     //    Iterator e = mc.sameName(name).entrySet().iterator();

    /*    while (e.hasNext()){
            Entry entry = (Entry) e.next();
            String key = (String) entry.getKey();
            String value = (String) entry.getValue();
            System.out.println(key + " : " + value);

        }*/






    }

}
