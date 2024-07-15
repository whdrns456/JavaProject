package view;

import Controller.PlayController;

import java.util.Scanner;

public class DisplatMenu {


   private Scanner sc = new Scanner(System.in);
   private PlayController pc = new PlayController();



    public void mainMenu(){

        while (true) {


            System.out.println("===게임===");
            System.out.println("1. up & 기다운");
            System.out.println("2.점수 조회");
            System.out.println("9. 종료");
            System.out.println("===========");
            System.out.print("메뉴 번호 :");
            int menu = sc.nextInt();


            switch (menu){



                case 1:
                    pc.game01();
                    break;

                case 2:
                    pc.getUserInfo();
                    break;

                case 9:
                    System.out.println("종료합니다");
                    return;

                    default:

                        System.out.println("잘못 입력하셨습니다");



            }



        }

    }












}
