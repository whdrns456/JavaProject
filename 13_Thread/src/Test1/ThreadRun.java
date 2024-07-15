package Test1;

public class ThreadRun {


    /*
    *
    * 스레드 : 프로세스(실행 중인 프로그램)내에서 가지고 있는 최소 작업 단위
    * */


    // main 메소드 실행 시 메인스레드가 실행됨!
    public static void main(String[] args) {

        System.out.println("==============="+Thread.currentThread().getName() + "=====================" );

        Task1 t = new Task1();

        // t.run();

        // Task2 객체 생성
        Task2 t2 = new Task2();
        Thread tt = new Thread(t2);

        t.start();
        tt.start();
        // tt.run();




    }
}
