package Test2;

import javax.imageio.IIOException;

public class Task1 extends Thread{


    @Override
    public void run() {
        // 1 ~ 30까지 짝수만 출력
        // 0.1 재우기
        try {
            // 0.1초 재우기 1000 -> 1초

            for(int i = 1; i <= 30; i++){
                if(i % 2 == 0){
                    System.out.println(Thread.currentThread().getName()+" "+  i+ " ");
                    Thread.sleep(100);
                }
            }
        } catch (InterruptedException e) {

        }
    }
}
