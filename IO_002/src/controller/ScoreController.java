package controller;

import model.dao.ScoreDAO;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ScoreController {


    ScoreDAO sd = new ScoreDAO();

    public void saveScore(String name, int kor, int eng, int math, int sum, double avg){

        sd.saveScore(name,kor,eng,math,sum,avg);


    }

    public DataInputStream readScore() throws FileNotFoundException {

        try {
            DataInputStream dis = new DataInputStream(new FileInputStream("score.txt"));
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }

        return sd.readScore();
    }




}
