package view;

import controller.ScoreController;

import javax.imageio.IIOException;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.util.Scanner;

public class ScoreMenu {

    private Scanner sc = new Scanner(System.in);
    ScoreController scr = new ScoreController();


    public void mainMenu() {

        while (true) {

            System.out.println("1. 성적 저장");
            System.out.println("2. 성적 출력");
            System.out.println("9. 끝내기 ");
            System.out.print("메뉴 번호");
            int menu = sc.nextInt();

            switch (menu) {

                case 1:
                    saveScore();
                    break;
                case 2:
                    readScore();
                    break;
                case 9:
                    System.out.println("시스템을 종료합니다 ");
                    return;
                default:
                    System.out.println("잘못 입력하셨습니다 ");

                    // ScoreController(scr)의 saveScore() 매개변수로 모두 넘겨 주고
                    // 그 학생 점수의 합계와 평균도 함께 매개변수로 넣어줌
                    //그만 입력하시려면 N 또는 n 입력, 계속 하시려면 아무 키나 입력하세요 :
                    // N이나 n을 입력하지 않으면 이름 및 점수를 받는 것을 반복함
                    // N이나 n을 입력하면 사용자에게 받는 반복문을 나감






            }



        }


    }

    public void saveScore() {

        int num = 0;

        while (true) {
            System.out.print("이름 :");
            String name = sc.next();
            System.out.print("국어 점수 :");
            int kr = sc.nextInt();
            System.out.println("영어 점수 :");
            int eng = sc.nextInt();
            System.out.println("수학 점수 :");
            int math = sc.nextInt();

            int sum = kr + eng + math;
            double avg = sum / 3;

            scr.saveScore(name, kr, eng, math, sum, avg);

            num++;

            System.out.println("그만 입력하시려면 N 또는 n 입력, 계속 하시려면 아무 키나 입력하세요 : ");
            char chmenu = sc.next().charAt(0);

            if(chmenu == 'N' || chmenu == 'n' ){
                break;
            }



        }

        // ScoreController(scr)의 saveScore() 매개변수로 모두 넘겨 주고
        // 그 학생 점수의 합계와 평균도 함께 매개변수로 넣어줌
        // 그만 입력하시려면 N 또는 n 입력, 계속 하시려면 아무 키나 입력하세요 :
        // N이나 n을 입력하지 않으면 이름 및 점수를 받는 것을 반복함
        // N이나 n을 입력하면 사용자에게 받는 반복문을 나감


    }

    public void readScore() {

        int count = 0;
        int sumAll = 0;
        double avgAll = 0.0; // 몇 명의 학생인지 반복문이 몇 번 실행 됐는지.

        try (DataInputStream dis = scr.readScore()) {
            System.out.println("읽은 횟수 전체 합계 전체 평균");


            while (true) {
                System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
                try {
                    String name = dis.readUTF();
                    int kor = dis.readInt();
                    int eng = dis.readInt();
                    int math = dis.readInt();
                    int sum = dis.readInt();
                    double avg = dis.readDouble();

                    System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\n", name, kor, eng, math, sum, avg);

                    count++;
                    sumAll += sum;
                    avgAll = avg / count;

                } catch (EOFException e) {
                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();

        } if (count > 0) {
            System.out.printf("읽은 횟수: %d\n전체 합계: %d\n전체 평균: %.2f\n", count, sumAll, avgAll / count);

        }
    }
    }






