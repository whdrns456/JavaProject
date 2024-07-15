package model.vo;

import view.PhoneMenu;

import java.io.*;

public class PhoneDAO {

    private PhoneBook[] pArr = new PhoneBook[10];


    public void phoneSave(PhoneBook[] pArr){
        // 번호를 저장할

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("phonebook.txt"))) {
            for(PhoneBook p : pArr){
                if(p != null){
                    oos.writeObject(p);
                }
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }




    }

    public PhoneBook[] phoneRead(){


        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("phonebook.txt"))) {

            int index = 0;
            while (true) {
                PhoneBook p = (PhoneBook) ois.readObject();
                pArr[index++] = p;

            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }catch (EOFException e){

        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return pArr;
    }


    public




}
