package com.kh;

public class Student01 {

    /*
    *
    *    * public(+) > protected(#) > default(~) > private(-)
    *    *
    *
    *
    * */


    private String name;
    private int age;
    private double height;
    private  String phone;
    private String address;


    public Student01(){}


    public Student01(String name, int age, double height, String phone, String address) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.phone = phone;
        this.address = address;
    }

    public String toString() {
        return "KH 학생 정보 " +
                " 이름  :" + name + '\'' +
                ", 연세 :" + age +
                ", KEY :" + height +
                ", 휴대폰 :'" + phone + '\'' +
                ", 주소 : " + address + '\'';
    }


}
