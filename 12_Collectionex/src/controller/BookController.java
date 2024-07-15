package controller;

import model.vo.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// 제어(controller)용 클래스 --> 사용자의 요청에 따라 작업을 제어한(수행)한 후 결과를 전달하는 역할
public class BookController {


    private List<Book> list = new ArrayList<>();
    // 방법 2 ) :  List list = new ArrayList<>(); Object 객체로 사용이 된다.


    public BookController(){
       // 초기값 4개를 추가 :
        list.add(new Book("자바의 정석", "남궁 성","기타",20000));
        list.add(new Book("쉽게 배우는 알고리즘", "문병로","기타", 15000));
        list.add(new Book("대화의 기술", "강보람", "인문", 17500));
        list.add(new Book("암 정복기", "박신우", "의료", 21000));
        }

    public void insertBook(Book bk){
        list.add(bk);
        // Book을 참조하는 (bk)를 리스트에 추가
        // 전달 받은 bk를 List에 추가

    }
    public ArrayList<Book> selectList(){
        return (ArrayList<Book>) list;
        // (ArrayList)list;
        // 참조변수가 가지고 있는 것은 주소값 -- > 현재 컨트롤러에서 사용중인 리스트의 참조변수 반환
        // 해당 List의 주소 값 반환
    }
    public ArrayList<Book> searchBook(String keyword){
        // 검색 결과 리스트를 담아줄 리스트(ArrayList searchList) 선언 및 생성
        // 반복문을 통해 list의 책 중 책 명에 전달 받은 keyword가 포함되어있는 경우
        // searchList에 해당 책 추가하고 searchList 반환

        ArrayList<Book> searchList = new ArrayList<>();
        // 검색 결과 리스트를 담아줄 선언 및 생성 :

            for (int i = 0; i < list.size(); i++) {
                Book b = list.get(i);
                if (b.getTitle().contains(keyword)){
                    // 책 제목에 키워드가 포함되었는 경우
                    // searchList에 해당 객체 추가
                    searchList.add(b);
                }}
            // 새로운 ArrayList에 추가하기 위해서 사용한다 list를 순회하면서 책 제목에 키워드가 포함된 책을 찾아
            // 'searchBook'에 추가하기 위해서이다
        return searchList;
    } // c : 생성 r : 조회 u : 수정 d : 삭제

    public Book deleteBook(String title, String author){

        // 삭제된 도서를 담을 Book객체 (Book removeBook) 선언 및 null로 초기화
        Book removeBook = null;

        for (int i = 0; i < list.size(); i++) {
            Book b = list.get(i); // list에서 책을 가져와 b에 할당
            if(b.getTitle().equals(title) && b.getAuthor().equals(author)){
                // 책 제목과 저자명이 동일한 객체인 경우
                removeBook = list.remove(i); // 반환 타입 Book
            break;
            }}
        return removeBook;}

        public int ascBook(){

            int result = 1;

            // ArrayList에 담긴 객체인 Book 클래스에 compareTo 메소드 재정의하여 정렬
            // list.sort(Book :: compareTo);
            Collections.sort(list);

            // return 1;

            // Book 클래스의 compareTo 메서드를 참조한다.
            // compareTo 메서드는 Book 객체들 간의 자연스러운 순서를 정의하는 메서드이다
            // list.sort(Book :: compareTo)는 list 요소들을
            // Book 클래스의 compareTo 메서드를 사용해 정렬하겠다는 의미
            return result;
    }
}








