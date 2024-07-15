package ch16;

import java.util.Date;

public class MyThread2 implements Runnable {

    // 스레드 정의 방법 2. Runnable 인터페이스 구현
    // 클래스 간에는 단일 상속만 가능하므로, 다른 클래스의 상속을 받아야할 경우
    // 이 방법으로 스레드를 구성할 수 있다

    @Override
    public void run() {

        String name =  Thread.currentThread().getName();

        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(name + " : " + new Date().getTime());
                Thread.sleep(1000); //  InterruptedException
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(name + "---------"  );

    }
}
