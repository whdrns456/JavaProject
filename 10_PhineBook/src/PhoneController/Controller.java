package PhoneController;

import model.vo.PhoneBook;
import model.vo.PhoneDAO;

import java.io.File;
import java.io.IOException;

public class Controller extends PhoneBook{

    PhoneDAO pd = new PhoneDAO();

    private int pCount;

    PhoneBook[] pArr;


    public void makeFile(){

        File f = new File("Phonebook.txt");
        String path = "./resources/Phonebook.txt";

        try { // 해당 파일이 존재하는 지 체크 :
            if (!f.exists()) {
                f.createNewFile();
                pCount++;                    // 없다면, 파일을 생성
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }


    public void phoneSave(PhoneBook[] pArr){

        pd.phoneSave(pArr);
        pCount++;
    }

    public PhoneBook[] phoneRead(){
        return pd.phoneRead();
    }


    public PhoneBook phoneDelete(int index) {

        if(index >= 0 && index < pCount){
            PhoneBook temp = pArr[index];
           for (int i = 0; i < pCount; i++){
               pArr[i] = pArr[i + 1];
            }
            pArr[--pCount] = null;
        }

        //return temp;
        return null;


    }



}
