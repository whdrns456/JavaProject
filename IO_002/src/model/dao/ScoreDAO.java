package model.dao;

import java.io.*;

public class ScoreDAO {


    public void saveScore(String name, int kor, int eng, int math, int sum, double avg){

        try {
            DataOutputStream dis = new DataOutputStream(new FileOutputStream("score.txt",true));

            dis.writeUTF(name);
            dis.write(kor);
            dis.write(eng);
            dis.write(math);
            dis.write(sum);
            dis.writeDouble(avg);

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }

    }


    public DataInputStream readScore() throws FileNotFoundException {


        return  new DataInputStream(new FileInputStream("score.txt"));

    }



}
