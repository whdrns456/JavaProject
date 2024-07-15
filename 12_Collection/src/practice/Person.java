package practice;

import java.util.Objects;

public class Person {

    private String name;  // 이름
    private int age;  // 나이
    private double height; // 키

    // 모든 필드의 값이 일치하면 동일한 객체로 판단 : equlas, hashCode


    @Override
    public boolean equals(Object o) {
        // 현재 객체와 전달 받은 객체의 각 필드값을 비교하여
        //   Person        Object
        // 모두 일치하면 true, 그렇지 않으면 false
        // Person.equals(Person객체B) 이런식으로 호출되어 사용될 것임

        if(o instanceof Person){
            Person p = (Person) o;
            if (this.name.equals(p.name) && this.age == p.age && this.height == p.height){
                return true;
            }
        }
        return false;
    }
    // 비교대상인 obj 객체가 Person 타입이 아니거나,
    // 3개의 필드 중 하나라도 값이 다른 경우 false 리턴

    @Override
    public int hashCode() {
        String info = name + age + height;

        return info.hashCode();
    }

    public Person(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }


    public Person() {
    }

    @Override
    public String toString() {
        return " 학급원 [" +
                " 이름 : " + name + '\'' +
                ", 나이 :" + age +
                ", 키 : " + height +
                ']';
    }


}
