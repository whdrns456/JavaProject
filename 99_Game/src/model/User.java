package model;

public class User {

    private String nickName;
    private int score;



    public User(String nickName){
        this.nickName = nickName;


    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }



}
