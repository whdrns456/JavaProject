package model.dao;

import model.vo.Book;

import javax.imageio.IIOException;
import java.io.*;
import java.io.FilterInputStream;

public class BookDAO {

    private Book[] bArr = new Book[10];


    public void fileSave(Book[] bArr){



        // 1. 스트림 객체 생성
        // 2. 입력 받을 때(read), 출력할때(write)에 필요한 메소드를 사용하여 입출력 작성
        // 3. 스트림 사용 완료(close) = > try ~ wiht ~ resource문을 사용 시 생략 가능
        try (ObjectOutputStream oos = new ObjectOutputStream(
                                new FileOutputStream("book.txt")
                // 향상된 for문 => for(배열아이템타입 (자료형) 변수명 : 배열명)
        )){
            for (Book b : bArr) {
                if (b != null) {
                    oos.writeObject(b);
                } else {
                    break;
                }
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
                }





    }

    public Book[] fileRead() {



        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("book.txt")
        )) {
            int index = 0;
            while (true) {
                Book b = (Book) ois.readObject();
                    bArr[index++] = b;

            }
        } catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (EOFException e){

        } catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        return bArr;
    }
}
