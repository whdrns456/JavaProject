package controller;

import model.dao.FileDAO;

public class FileController {


    FileDAO fd  = new FileDAO();

    public  boolean checkName(String file){

        //boolean result = fd.checkName(file);
        // DAO에 매개변수를 전달하고, DAO로부터
        // 전달받은 값을 다시 반환
        // fileDAO 객체 fd
        return fd.checkName(file);

    }

    public void fileSave(String file, StringBuilder sb){

        // 전달받은 매개변수를 변경하고 DAO에 전달

        // 매개변수로 넘어온 sb를 String으로 바꿔 fd의
        // fileSave()메소드 매개변수로 file과 String을 넘김
        String content = sb.toString();
        // toString 안함 - >
        fd.fileSave(file, sb.toString());
    }


    public StringBuilder fileOpen(String file){



        return fd.fileOpen(file);
    }



   public void fileEdit(String file, StringBuilder sb){

        // sb -> 문자열 형태로 전달 :
        fd.fileEdit(file,sb.toString());



   }

}
