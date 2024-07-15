package list;

import java.util.*;

class MyQueue{

      ArrayList<String> queue = new ArrayList<>();
    // 큐(Queue) : FIFO
    // 처음 저장된 데이터가 가장 먼저 꺼내올 수 있는 구조
    // 데이터 제거 : 처음 위치부터 제거
    // ----------------------------------------------------
    // MyQueue
    // - queue : ArrayList<String> = new ArrayList<>();
    // enQueue(data : String) : void
    // enQueue(: ) : String
    //-------------------------------------------------


    public void enQueue(String data){
        queue.add(data);

    }

    public String deQueue(){

        if(queue.isEmpty()){
          return "빔";
        }

        return queue.remove(0);
    }


}


class MyStack {

     ArrayList<String>  arrStack = new ArrayList<>();

    // 스택(Stack) : LIFo 제일 마지막에 저장된 데이터가 제일 처음으로 꺼내올 수 잇는 구조
    // - 데이터 추가 : 순서대로 추가 (끝에 추가)
    // - 데이터 제거 : 마지막 위치부터 제거

    // MySrack class 추가
    // --------------------
    // arrStack : ArrayList<String> = new ArrayList<>();
    // + push(data : String) : void // 데이터 추가
    // + pop() String
    public void push(String data) {

        arrStack.add(data);
    }

    public String pop() {

        if (arrStack.isEmpty()) {
            return "리스트가 비었습니다";
        }
        // remove(index) : 해당 index 위치의 데이터를 제거하면서 해당 데이터 반환
        return  arrStack.remove(arrStack.size() -1);
    }   // 배열 마지막 번호 알기 - 1
}

public class ListPractice {
    public static void main(String[] args) {

        // 중복 저장이 가능하고 순서가 있는 컬렉션 ArrayList & LinkedList

        // ArrayList
        // - 배열 구조
        // - 데이터 조회가 빠르다
        // 데이터 추가/삭제가 복잡하여 오래 걸림
        // 다형성 적용 시 List<E> 참조 변수명 new ArrayList<>() [E] 타입 생략 가능!

        // LinkedList
        // - 리스트 구조 :
        // - 데이터 추가/ 삭제가 빠르다
        // - 데이터 조회가 느림

        // LinkedList<E> 참조변수명 = new LinkedList<>();
        // List<E> 참조변수명 = new LinkedList<>();
        // list 관련메소즈
        // - size() List에 저장된 size()
        // - 데이터 추가 add
        // - remove 데이터 삭제 : remove(인덱스)
        // - 데이터조회 get (인덱스):
        // arrayList();

        // linkedListTest();
        MyStack stack = new MyStack();

        stack.push("레몬");
        stack.push("아보카도");
        stack.push("파인애플");

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        // 거꾸로 호출이 된다.
        System.out.println("----------------------------------");

        MyQueue q = new MyQueue();

        q.enQueue("레몬");
        q.enQueue("아보카도");
        q.enQueue("오렌지");
        q.enQueue("아보카도");
        q.enQueue("수박");

        System.out.println(q.deQueue());


        System.out.println("-------------------");




    }

    public static void stackTest(){

        // 스택(Stack) : LIFo 제일 마지막에 저장된 데이터가 제일 처음으로 꺼내올 수 잇는 구조
        // - 데이터 추가 : 순서대로 추가 (끝에 추가)
        // - 데이터 제거 : 마지막 위치부터 제거

        // MySrack class 추가
        // --------------------
        // arrStack : ArrayList<String> = new ArrayList<>();
        // + push(data : String) : void // 데이터 추가
        // + pop() String


       // Stack<String> arrStack = new Stack<>();



    }

    public static void arrayList(){
        ArrayList<String> list = new ArrayList<>();

        list.add("기다운");
        list.add("돈까스");
        list.add("많이 졸고");
        list.add("있습니다");
        list.add("몸이 안 좋은가 봅니다");
        list.add("조용하니까 너무 심심합니다");
        list.add("활기찬 다운씨가 그립습니다");


        list.set(2,"혼내주세요");


        list.add(1,"생선까스"); // 원하는 위치에

        int index = 0;

        list.add(index, "아아아");


        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println(list.isEmpty());

        swapList(list, 1,2);

        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("===========================================");

        printItem(list);


    }

    public static <E>void swapList(List<E>list ,int n1, int n2){

        // 리스트에서 n1 위치의 값과 n2 위치의 값을 변경
        E temp = list.get(n1);

        // 2) n2 위치의 데이터를 n1 위치에 저장(변경)
        list.set(n1, list.get(n2));

        // 3) 따로 보관해두었던 n1 위치의 데이터를 n2 위치에 저장(변경)

        list.set(n2, temp);

        // Collections.swap(list, 0,1);
    }

    public static <E> void printItem(List <E>list){
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }


    public static void linkedListTest(){
        LinkedList<Integer> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("정수 값을 입력하세요 : ");
        int length = sc.nextInt();

        for (int i = 0; i < length; i++){
            list.add((int) ((Math.random()) * length + 1));

        }
        printItem(list);

        // 사용자에게 정수 값을 입력 받아
        // 그 길이만큼 랜덤 값을 저장
        // 저장된 출력




    }

}
