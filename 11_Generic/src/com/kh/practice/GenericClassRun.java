package com.kh.practice;


// 정수형 데이터를 다루는 클래스 : DataClass
class DataClss<T>{

    private T data; // 필드의 타입(자료형)

    public  T getData(){
        return data;
    } // 메소드 반환타입 T
    public void setData(T data){
        this.data = data;
    }// 메소드의 매개변수 타입 T
}
public class GenericClassRun {
    public static void main(String[] args) {

        // 제네릭 적용 안 했을 때 상황
        //정수형, 실수형 모두 관리하고자 할 떄 ==> 실수로 인해

        DataClss<Double> d1 = new DataClss<>();

        d1.setData(10.0);
        System.out.println(d1.getData());

        DataClss<Integer> d2 = new DataClss<>();
        d2.setData(1000);
        System.out.println(d2.getData());

        DataClss<String> d3 = new DataClss<>();
        d3.setData("Apple");
        System.out.println(d3.getData());
















    }


}
