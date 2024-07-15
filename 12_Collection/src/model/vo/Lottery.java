package model.vo;

import java.util.Objects;

public class Lottery {

    private String name;
    private String phone;


    public Lottery() {

    }

    public Lottery(String name, String phone) {

        this.name = name;
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {

        if (o instanceof Lottery) {
            Lottery lottery = (Lottery) o;
            if (this.name.equals(lottery.name)
                    && this.phone.equals(lottery.phone)) {
                return true;
            }

        }
        return false;
    }
    @Override
    public int hashCode() {
        String hash = name + phone;
        return hash.hashCode();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Lottery{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }

}



