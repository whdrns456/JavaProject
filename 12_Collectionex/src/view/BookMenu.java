package view;

import controller.BookController;
import model.vo.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {

    private Scanner sc = new Scanner(System.in);
    private BookController bc = new BookController();

         // - 화면(view) : 사용자에게 데이터를 표시하거나 (출력) 입력을 받는 역할,
    public void mainMenu() {
        // 사용자가 직접 메인 메뉴를 선택할 수 있음.
        // 종료 전까지 반복 실행. 각 메뉴 선택 시 해당 메소드 이동.(이동)

        /*  // System.out.println("== Welcome KH Library ==");
         // ******* 메인 메뉴 *******
        1. 새 도서 추가 // insertBook () 실행
        2. 도서 전체 조회 // selectList ()
        3. 도서 검색 조회 // searchBook ()
        4. 도서 삭제 // deleteBook ()
        5. 도서 명 오름차순 정렬 // ascBook()
        9. 종료 // “프로그램을 종료합니다.” 출력 후 main()으로 리턴
        메뉴 번호 선택 : >> 입력 받음
        // 메뉴 화면 반복 실행 처리
        // 잘 못 입력 하였을 경우 "잘못 입력하였습니다. 다시 입력해주세요" 출력 후 반복*/

        System.out.println("== Welcome KH Library ==");

        while (true) {

            System.out.println("******메인 메뉴*********");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 도서 전체 조회");
            System.out.println("3. 도서 검색 조회");
            System.out.println("4. 도서 삭제");
            System.out.println("5. 도서 명 오름차순 정렬");
            System.out.println("9. 종료");
            System.out.print("메뉴 번호 선택 --> :");
            int menu = sc.nextInt();

            sc.nextLine(); // nextLine 메소드 외에는 버퍼에 엔터키(\n)
                           // 값이 남아 있어 제거하기 위해 사용

            switch (menu) {
                case 1: insertBook();break;
                case 2: selectList();break;
                case 3: searchBook();break;
                case 4: deleteBook();break;
                case 5: ascBook();break;
                case 9: System.out.println("프로그램을 종료합니다");return;
                // 메소드 종료 -- > 현재 메소드를 호출한 위치로 돌아감 !
                default: System.out.println("잘못입력하셨습니다 ");
                break;
            }}}
/*
        public void insertBook() {
            1. 도서명 입력받기 (String title)
            2. 저자명 입력받기 (String author)
            3. 장르 입력받기 (int category) --> 숫자로 입력받기 (1.인문 / 2.자연과학 / 3.의료 / 4.기타)
            4. 가격 입력받기 (int price)

*/

    public void insertBook() { // 새도서 추가용 메소드

        System.out.print("1. 도서명 입력받기 ");
        String title = sc.nextLine();

        System.out.print("2. 저자명 입력받기");
        String author = sc.nextLine();

        System.out.print("(장르 1.인문/2.과학/3.외국어/ 4.기타)");
        int category = sc.nextInt();
        sc.nextLine();

        String[] categoryList = {"인문", "과학", "외국어", "기타"};
        // -->
        System.out.print("4. 가격 입력받기");
        int price = sc.nextInt();
        sc.nextLine();
        // bc(BookController)의 insertBook으로 위의 Book 객체 전달

        // 문제 1 ) :  bc(BookController)의 insertBook으로 위의 Book 객체 전달
        // 방법 1. bc.insertBook(new Book(title, author, categoryList[category - 1], price));
        // 방법 2. Book b2 = new Book(title, author, categories[category-1],price);
        //        bc.insertBook(b2);

        bc.insertBook(new Book(title, author, categoryList[category - 1], price));

        // * 문자열 split() 사용한다면...
        // String categories = "인문,자연과학,의료,기타"
    }


    // 2. 도서 전체용 view 메소드 :
    public void selectList() {
        ArrayList<Book> bookList = bc.selectList();
        // 조건식을 이용하여,
        //                  비어있을 경우 "존재하는  도서가 없습니다" 문구 출력

        // bookList.isEmpty() --> 비어있는 경우 '참'
        if (!bookList.isEmpty()) {

            // bookList가 "비어있지 않은 경우" --> 반복문을 통해 bookList 안의 Book 객체들 출력

            for (int i = 0; i < bookList.size(); i++) {
                System.out.println(bookList.get(i) + " "); //객체는 호출될 때 toString 생략 :
            } // 리스트가 비어있지 않은 경우 = size() : 리스트의 저장된 데이터 길이
        } else {
            System.out.println("존재하는 도서가 없습니다");}}

    public void searchBook() {

        System.out.println("검색 키워드 : ");
        String keyword = sc.nextLine();

        // bc(BookController)의 searchBook() 메소드로 위의 keyword 값 전달 후
        // 결과 값을 임의의 리스트(ArrayList<Book> searchList)에 대입
        ArrayList<Book> searchList = bc.searchBook(keyword);

        if(searchList.isEmpty()){
             System.out.println("검색 결과가 없습니다.");
         } else {
             // searchList가 "비어있지 않은 경우" --> 반복문으로 searchList 안의 Book 객체들 출력
             for (int i = 0; i < searchList.size(); i++ ){
                 System.out.println(searchList.get(i));}}}

    public void deleteBook() {

        // 도서 삭제 기준 : 도서명, 저자명에 해당되는 도서 삭제
        System.out.println("삭제할 도서명 : ");
        String title = sc.nextLine();

        System.out.println("삭제할 저자명 : ");
        String author = sc.nextLine();


        Book remove = bc.deleteBook(title,author);
        // 반환타입과 동일하다 반환타입 : Book 타입


        // bc(BookConroller)의 deleteBook() 메소드로 위의 title, autor 값 전달 후
        //                          --> 결과 값을 임의의 Book(Book remove)에 대입
        if(remove != null){ // 값이 없다 -- null로 표기
            System.out.println("삭제가 완료되었습니다 ");
        }else {
            System.out.println("삭제할 도서를 찾지 못했습니다 ");
        }}

    public void ascBook() {

        /*bc(BookController)의 ascBook() 메소드 값에 따라
        성공 시 “정렬에 성공하였습니다.”, 실패 시 “정렬에 실패하였습니다.” 출력*/

        // 도서명 오름차순 정렬용 메소드 :
        int result = bc.ascBook();

        if (result == 1){
            System.out.println("정렬에 성공했습니다");
        }else {
            System.out.println("정렬에 실패했습니다");}}
}


