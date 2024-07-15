package ch13;

import java.io.*;

public class StreamUtils {


    /*
    *  보조 스트림 : 기반 스트림을 보조해주는
    *   단일로는 사용이 불가능하다
    *   기반 스트림의 성능을 향상 시켜주는 스트림
    *   기반 스트림에서 제공되는 메소드 외에 추가적인 메소드 제공
    *   (데이터 전송 속도를 향상)
    *
    *  // 출력 : 프로그램 -- > 외부매체로(파일)
    * */

    public void objectSave(String filename, Object[] objects){
        // FileoutputStream : 파일에 연결 1 바이트
        // ObjectOutputStream : 객체 단위로 출력할 수있도록 도와주는 보조스트림
        // ObjectWriter는 없다

        // resource문 : 자원관리가 자동으로 되는 예외처리 구문
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))){

            for (Object e : objects){
                oos.writeObject(e);
            } // 객체 데이터를 출력하는 메소드 :
        }catch(IOException e){
            System.out.println("객체 데이터를 파일에 저장 중 문제 발생 !! :: " + e.getMessage());
        }

        // 입력 : 외부 매체(파일): --> 프로그램
        //
    }
    public void objectRead(String filename){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))){
            while (true) {
                System.out.println(ois.readObject());
                // = > 파일 데이터를 모두 읽은 경우 예외 발생 EOFException
            }

        }catch (EOFException e){
            System.out.println("파일 읽기 완료 ");
        }catch (IOException | ClassNotFoundException e){
            System.out.println("객체 데이터를 파일에 읽어 오는 중 문제 발생 ! ::" + e.getMessage());

        }

    }

}
