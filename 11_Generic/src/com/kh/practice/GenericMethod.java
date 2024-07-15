package com.kh.practice;



class DataCalss02{
    // 제네릭 메소드
    public <T> void test(Integer num){
        T data; // 메소드 지역변수에 제네릭 적용(사용)
        // 형변환도 가능
        data = (T)num; // 형변환도 가능!
    }
    public <T> T test2(T data){
        // 제네릭을 반환타입, 매개변수 타입에 적용
        T t;
        t = data;
        return t; }}
class  DataClass02_1<T>{
    public <K> void test(T data, K data2){
    }}
public class GenericMethod {
    public static void main(String[] args) {

        DataCalss02 d1 = new DataCalss02();
        d1.test(123456); // 타입을 지정하지 않으면, T(타입매개변수)--->Object

        d1.<Double>test(777); // T ---> Double
        d1.test2("Orange"); // T를 지정하지 않으면 제네릭타입 자동으로 결정 T ---> String
        d1.<Integer>test2(999999999); // T ---> Integer 지정을 한 경우

        DataClass02_1 <String> d2 = new DataClass02_1<>();
        d2.<Integer>test("test1",100);
        d2.<Double>test("test2",3.14);
        d2.<String>test("test3","zzzz");

        //  메소드 자리
        // 첫번째 매개변수타입은 객체 생성 시점에 정해짐
        // 두번째 매개변수 타입은 메소드 호출 시점에 정해짐
    }

}
