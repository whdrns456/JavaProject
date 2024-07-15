package ch16;

import java.util.Date;

public class MyThread1 extends Thread{


    @Override
    public void run() {
        super.run();
        //
      String name =  Thread.currentThread().getName();
      // 현재 실행 중인 스레드 정보 :

        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(name + " : " + new Date().getTime());
                Thread.sleep(3000); //  InterruptedException
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


        System.out.println(name + ": -----------END-------------");
    }



}
