package com.kh.practice;


interface Inter1<T> {
    void method1(T data);
} // 추상 메소드

interface Inter2<F> {
    void method2(F data);
} // public abstract 생략

class DataClass04<E> implements Inter1<E>, Inter2<E>{
    @Override
    public void method1(E data) {
    // 접근제한자 설정해야된다.
        System.out.println(data);
    }

    @Override
    public void method2(E data) {
        System.out.println(data);
    }
}
// 9월 23일
//
public class GenericImplRun {
    public static void main(String[] args) {

        DataClass04<String> d4 = new DataClass04<>();

        d4.method1("좋아하는 색은 ");
        d4.method2("xxx다");

        DataClass04<Integer> d5 = new DataClass04<>();
        d5.method1(10000);
        d5.method2(12121);
    }
}
