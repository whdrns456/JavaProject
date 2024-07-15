package book.view;

import book.controller.BookController;
import model.vo.Book;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Scanner;

public class BookMenu {


    private Scanner sc = new Scanner(System.in);
    BookController bc = new BookController();
    Book[] bArr; // 대입하는거 없으니 그냥 선언만

    // 추상 클래스 인스턴스가 안된다.
    // 추상 클래스 객체 생성.


    public BookMenu(){
        // 파일이 없을 때 만들어주기 위해 BookController(bc)에 makeFile() 호출
        // 필드에 있는 bArr에 bc의 fileRead() 반환 값 대입

        bc.makeFile();
        bArr = bc.fileRead();
    }
    public void mainMenu(){

        while (true){

        System.out.println("1. 도서 추가 저장");
        System.out.println("2. 저장 도서 출력");
        System.out.println("9.프로그램 끝내기");
        System.out.print("메뉴 번호 :");
        int menu = sc.nextInt();
        sc.nextLine();

        switch (menu) {
            case 1:
                fileSave();
                break;

            case 2:
                fileRead();
                break;

            case 9:
                System.out.println("프로그램 종료");
                return;

            default:
                System.out.println("잘못 입력하셨습니다 다시 입력해주세요");
            }
        }
    }

    public void fileSave(){

        // 입력 받은 출판날짜를 split()를 통해 년, 월, 일로 나누고 Calendar에 담음
        // 각 요소와 새로 만든 Calendar를 Book 객체에 담고
        // 비어있는 Book객체 배열(bArr)에 담아 bc에 fileSave()에 매개변수로 전달

        System.out.println("도서 명 : ");
        String title = sc.nextLine();


        System.out.println("저자 명 : ");
        String author = sc.next();

        System.out.println("도서 가격 :");
        int price = sc.nextInt();

        sc.nextLine();
        // 내가한 실수 밑에 printLine이 잇는데 price에서 엔터를 누르게 되면 아무값도 입력이 안되게된다

        System.out.println("출판 날짜(yyyy-mm-dd) :");
        String date = sc.nextLine();

        System.out.println("할인율 :");
        double discount = sc.nextDouble();

        sc.nextLine();


        String[] dItem = date.split("-");

        // Calendar cal = new Calendar();
        Calendar cal = Calendar.getInstance(); // => getInstace를 통해서
        cal.set(Integer.parseInt(dItem[0]),Integer.parseInt(dItem[1]) - 1, Integer.parseInt(dItem[2]));
        // Integer.parseInt()(문자열) : Integer -->
        // = > 문자열의 값을 정수형의 값으로 변환
        // Calendar 클래스도 데이터를 0부터 처리함 0이 1월이다.


        // Book 객체에 담기 ---> 데이터를 사용하여 Book 객체 생성
        Book newb = new Book(title,author,price,cal,discount);

        for(int i = 0; i < bArr.length; i++){
            // 비어있는 배열 -- > 해당 index 위치의 값이 null인지 확인
            if(bArr[i] == null){
                bArr[i] = newb;
                break;
            }
        }
        bc.fileSave(bArr);
    }

    public  void fileRead(){
        // bc에 fileRead()의 반환 값을 가지고 저장된 데이터 출력
        Book[] bList = bc.fileRead();
        for (Book b : bList){
            if (b != null){
                System.out.println(b);
            }
        }
    }
}
