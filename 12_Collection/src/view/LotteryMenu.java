package view;

import controller.LotteryController;
import model.vo.Lottery;
import practice.Person;

import java.util.*;

public class LotteryMenu {

    Scanner sc = new Scanner(System.in);
    LotteryController lc = new LotteryController();
    // LotteryController, Scanner 객체 생성

    public void mainMenu() {

        System.out.println("*******기다운 메뉴*********");

        while (true) {
        System.out.println("1. 추첨 대상 추가");
        System.out.println("2. 추첨 대상 삭제");
        System.out.println("3. 당첨 대상 확인");
        System.out.println("4. 정렬된 당첨 대상 확인");
        System.out.println("5. 당첨 대상 검색 ");
        System.out.println(" 9. 종료 ");
        System.out.print("메뉴 번호 선택: ");

    int menu = sc.nextInt();
    sc.nextLine();

    switch (menu) {
        case 1: insertObject(); break;
        case 2: deleteObject(); break;
        case 3: winObject(); break;
        case 4: sortedWinObject();break;
        case 5: searchWinner();break;
        case 9: System.out.println("시스템을 종료합니다");return;
        default: System.out.println("잘못입력하셧어");break;
    }}}
    public void insertObject() {

        // 1. 추첨 대상 추가용 view 메소드
        System.out.print("추가할 추첨 대상 수 : ");
        int count = sc.nextInt();

        for (int i = 0; i < count; i++) {
            System.out.print("이름 :");
            String name = sc.next();
            System.out.print("핸드폰 번호(-빼고)");
            String phone = sc.next();

            // Iterator<Person> it = hSet2.iterator();

            // 매개변수 생성자를 이용해 Lottery 객체에 추첨자 정보 저장
            Lottery l = new Lottery(name, phone);

            if (!lc.insertObject(l)) { // boolean 값
                System.out.println("중복된 대상입니다"); // 추첨자 정보 저장 실패
                i--;}}
        System.out.println( count + "입력이 완료되었습니다");
    }
    public void deleteObject() {

        // 2. 추첨 대상 삭제용 view 메소드
        System.out.print("삭제할 대상의 이름과 핸드폰 번호를 입력하세요");
        String name = sc.next();
        System.out.print("핸드폰 번호('-') :");
        String phone = sc.next();

        Lottery l = new Lottery(name,phone);
        // 매개변수 2개인 생성자 사용 :
        // boolean resuit = lc.deleteObject(l)
        if (lc.deleteObject(l)) {
            System.out.println("삭제가 완료되었습니다");
        } else {
            System.out.println("존재하지 않는 대상입니다");
        }}

    public void winObject(){

        // lc에서 받아온 Set객체를 println()메소드를 통해 출력
        // 컨트롤러로부터 받아온 Set 객체를 println 메소드를 통해 출력
        HashSet<Lottery> lSet = lc.winObject();
        // System.out.println(lc.winObject());
        System.out.println(lSet); // 결과....?
    }
    public void sortedWinObject(){
        // 4. 정렬된 당첨 대상 확인
        // lc에서 받아온 Set객체를 Iterator를 통해 출력

        // lc.sortedWinObject(); // 반환타입 treeSet
        TreeSet<Lottery> lSet = lc.sortedWinObject();
        // Iterator<Lottery> l =  lc.sortedWinObject().iterator();

        // 1) 객체 생성
        Iterator<Lottery> l = lSet.iterator();

        // 2) 데이터 유/무 확인
        while (l.hasNext()){
            // 데이터 조회
            Lottery sd = l.next();
            System.out.println(sd);
        }
    }


    public void searchWinner() {

        // 당첨 대상 검색용 메소드
        System.out.println("이름 :");
        String name = sc.next();

        System.out.print("핸드폰 번호 (-빼고) :");
        String phone = sc.next();

        Lottery l = new Lottery(name,phone);
        boolean result = lc.searchWinner(l);

        if (result){
            System.out.println("축하합니다. 당첨 목록에 존재합니다");
        }else {
            System.out.println("안타깝지만 당첨 목록에 존재하지 않습니다. ");
        }
    }
}
