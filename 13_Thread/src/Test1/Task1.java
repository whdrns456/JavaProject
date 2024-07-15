package Test1;


// Thread 정의 방법 1)
public class Task1 extends Thread {

// 2) 스레드에서 실행 시킬 작업을 run 메소드 재정의
    @Override
    public void run() {
        String hello = "Hello, Worlld";
        String name = Thread.currentThread().getName();
        // 현재 실행하고 있는 스레드 정보를 반환

        System.out.println(name + " : " + hello);

    }




}
