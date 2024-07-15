package com.kh.pratice;

import com.kh.Student01;

public class Run {
    public static void main(String[] args) {
            Student01 s1= new Student01("기다운",29,180
                ,"01027397549","인천시");
            // 객체 생성
            // 클래스명 참조변수명 = new 클래스명(); // new 생성자;

        System.out.println(s1);

        // 참조변수는 toSting

        Student01 s2 = new Student01();
        System.out.println();

        Animal animal1 = new Animal();

        // 객체 생성후 값을 대입
        animal1.setName("도치");
        animal1.setKind("고슴도치");
        animal1.setGender('M');
        animal1.setMasterName("주원님");
        animal1.setAge(2);

        System.out.println(animal1);
        Animal animal2 = new Animal("초롱이",5,'M',"민욱님","고양이");


        System.out.println(animal2);
        /*
        *
        *  * 객체 지향 원칙 : 외부에서 값을 직접적으로 접근하지 못하게 하는 것
        *  * 캡슐화 : 외부로부터 "데이터의 직접 접근"을 막고,
        *  *   데이터에 간접적으로 처리하는 메소드를 클래스 내부에 작성하는 것
        *                           ---> 값을 대입/반환
        *  [1] 정보 은닉 : private
        *  [2] getter/setter 메소드 : private으로 제한된 필드(변수)에 간접적으로 접근할 수 있도록
        *                            기능을 제공하는
        *
        *     + getter 메소드 : 해당 필드에 담긴 값을 반환해주는 메소드
        *     + setter 메소드 : 해당 필드에 값을 대입하고자 할때, 저장할 값을 전달받아 대입시켜주는 메소드
        *
        * */




    }


}
