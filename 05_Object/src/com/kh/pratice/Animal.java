package com.kh.pratice;

public class Animal {

    // 이름, 나이, 성별, 주인 이름, 종
    private String name;
    private int age;
    private char gender;
    private String masterName;
    private String kind;

    public Animal(){}

    public Animal(String name, int age, char gender, String masterName, String kind) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.masterName = masterName;
        this.kind = kind;
    }


    @Override
    public String toString() {
        return "  동물  " +
                " 이름 : " + name + '\'' +
                ", 나이 : " + age +
                ", 성별 : " + gender +
                ", 주인이름 : " + masterName + '\'' +
                ", 종류 : " + kind + '\'' +
                '}';
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getMasterName() {
        return masterName;
    }

    public void setMasterName(String masterName) {
        this.masterName = masterName;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }
}
