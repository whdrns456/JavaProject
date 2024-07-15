package book.controller;

import model.dao.BookDAO;
import model.vo.Book;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class BookController {


    BookDAO bd = new BookDAO();


    public void makeFile(){

        // “book.txt”를 매개변수로 받는 File 객체를 생성하여 book.txt가 없다면 파일 생성

        File f = new File("book.txt");
        String path = "./resources/book.txt";

        try { // 해당 파일이 존재하는 지 체크 :
            if (!f.exists()) {
                f.createNewFile(); // 없다면, 파일을 생성
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    public void fileSave(Book[] bArr){

        // 매개변수로 받은 bArr을 BookDAO(bd)의 파일 세이브의 매개변수로 보냄
        bd.fileSave(bArr);

    }
    public Book[]  fileRead(){

        // bd에 fileRead()의 반환 값을 그대로 반환.
        return bd.fileRead();
  }





}
