package model.vo;

import java.io.Serializable;

public class PhoneBook implements Serializable {

    private String name;
    private String PhoneNume;
    private String eMail;
    private String memo;


    public  PhoneBook(){}

    public PhoneBook(String name, String phoneNume, String eMail, String memo) {
        this.name = name;
        PhoneNume = phoneNume;
        this.eMail = eMail;
        this.memo = memo;
    }

    @Override
    public String toString() {
        return "전화번호부[" +
                "이름 : " + name + '\'' +
                ", 전화번호 : " + PhoneNume + '\'' +
                ", e - mail : " + eMail + '\'' +
                ", 메모 :" + memo + '\'' +
                ']';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNume() {
        return PhoneNume;
    }

    public void setPhoneNume(String phoneNume) {
        PhoneNume = phoneNume;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }
}
