package Test2;

public class Task2 extends Thread{

    @Override
    public void run() {
        // 1 ~30Rkwl ghftnaks cnffur



        try {

            for(int i = 1; i <= 30; i++){
                if(i % 2 != 0){
                    System.out.println(Thread.currentThread().getName()+" "+ i + " ");
                    Thread.sleep(300);
                }
            }
        } catch (InterruptedException e) {

        }



    }
}
