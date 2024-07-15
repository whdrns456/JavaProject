package Controller;

import model.User;

import java.util.Scanner;

public class PlayController {


    Scanner sc = new Scanner(System.in);
    User user = new User("최종군");

    int score = 0;


    public void game01(){

        // 1 ~ 50 사이의 랜덤값을 추출해서 저장하고 사용자로부터 정수를 입력받은 뒤
        // 랜덤값보다 크면 "Down" 출력, 작으면 "Up" 출력
        // 같은값이면 "Catch" 출력 후 User 에 점수 10점 추가 (단, 5번 기회안에 성공해야 점수 획득)

        int random = (int) ((Math.random() * 50 + 1) + 1);
        int count = 0;

            while(count++ < 5) {
                System.out.print("숫자를 입력하세요 :");
                int num = sc.nextInt();

                if (random == num) {
                    System.out.println("성공하셨습니다");
                    break;

                } else if (random > num) {
                    System.out.println("업");

                } else if (random < num) {
                    System.out.println("기다운");

                }
            }



        if (count <= 5){
            user.setScore(10);
            System.out.println("점수 획득 성공하셨습니다 :" + " " + user.getScore());
        }else{
            System.out.println("점수 획득 실패");
        }




    }


   public void getUserInfo(){

       System.out.println("현재 점수: " + user.getScore());


   }





}
