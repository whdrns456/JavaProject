package view;

import PhoneController.Controller;
import model.vo.PhoneBook;

import java.util.Calendar;
import java.util.Scanner;

public class PhoneMenu {

    private Scanner sc = new  Scanner(System.in);
    Controller c = new Controller();
    PhoneBook[] pArr = new PhoneBook[10];


    public PhoneMenu(){

    }


    public void mainMenu(){

        while (true){

            System.out.println("1. 전화번호 저장");
            System.out.println("2. 전화 번호 정보 조회");
            System.out.println("3. 전화 번호 삭제");
            System.out.println("9.프로그램 끝내기");
            System.out.print("메뉴 번호 :");

            int menu = sc.nextInt();



            switch (menu) {
                case 1:
                    phoneSave();
                    break;

                case 2:
                   phoneRead();
                    break;
                case 3:
                    phoneDelete();
                    break;

                case 9:
                    System.out.println("프로그램 종료");
                    return;

                default:
                    System.out.println("잘못 입력하셨습니다 다시 입력해주세요");
            }
        }
    }


    public void phoneSave(){

        // Book 객체에 담기 ---> 데이터를 사용하여 Book 객체 생성

        System.out.print("이름 입력 :");
        String name = sc.next();

        sc.nextLine();

        System.out.print("전화번호 입력 :");
        String phoneNum = sc.nextLine();

        sc.nextLine();

        System.out.print("e-mail 입력 : ");
        String eMail = sc.next();

        sc.nextLine();

        System.out.print("메모 입력 :");
        String memo = sc.next();

        PhoneBook p = new PhoneBook(name,phoneNum,eMail,memo);


        for(int i = 0; i < pArr.length; i++){
            if(pArr[i] == null){
                pArr[i] = p;
                break;
            } else {

            }
        }
        c.phoneSave(pArr);








    }

    public void phoneRead(){
        // bc에 fileRead()의 반환 값을 가지고 저장된 데이터 출력

        /*Book[] bList = bc.fileRead();
        for (Book b : bList){
            if (b != null){
                System.out.println(b);
            }
        }*/

        PhoneBook[] pArr = c.phoneRead();
        for(PhoneBook p : pArr){
            if(p != null){
                System.out.println(p);
            }
        }
    }

    public void phoneDelete() {
        System.out.print("삭제할 번호 : ");
        int num = sc.nextInt();
        c.phoneDelete(num);
    }







}
