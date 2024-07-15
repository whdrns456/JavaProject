package model.vo;

import java.util.Collections;

public class Book implements Comparable<Book>  {
    // implements
    // 데이터(Model)용 클래스 --- > 데이터를 담기 위한 그릇 역할

    private String title;
    private String author;
    private String category;
    private int price;

    public Book(){}

    public Book(String title, String author, String category, int price) {
        this.title = title;
        this.author = author;
        this.category = category;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // --------------------------------------------------
    @Override
    public String toString() {
        return "Book{" +
                "책 제목 : " + title + '\'' +
                ", 저자 : " + author + '\'' +
                ", 장르 : " + category + '\'' +
                ", 가격 :" + price +
                '}';
        // String.format("\t(%s%s%s%d)")
    }
    public int hashCode(){
        return this.hashCode();
   }
   public boolean equals(Object o){

        return (this == o);
    }
        // o는 Object 타입이므로 Book 객체로 캐스팅된다
        // Book 객체의 'title'을 가져와 현재 객체의 get.title과 비교를 한다
        // title은 현재 객체의 책 제목이고 ((Book)o).getTitle()은 비교할 객체의 책 제목이다
        // compareTo 메소드는 두 문자열을 사전 순으로 비교한다.
        // 현재 객체의 title이 비교할 객체의 title보다 앞에 있으면 음수를 반환합니다.
        // 같으면 0을 반환한다.
        // 뒤에 있으면 양수를 반환한다.

        // 메소드의 매개변수가 Book 타입이므로 다른 개발자들이 이해하기쉽다


    @Override
    public int compareTo(Book o) {
        // => Comparable 인터페이스 메소드 :
        // 정렬 기준을 가지고 있는 메소드 :
        return this.title.compareTo(o.title);
        // 내림차순으로 주고싶은 경우 : -this.title.compareTo(o.title);

        // -  0  : 동일한 문자열
        // - 음수 : A.compareTo(B) --> B A 순서로 정렬
        // - 양수 : A.compareTo(B) --> A B 순서로 정렬


        // String의 경우 compareRo 메소드가 재정의 되어 있다

        // public int compareTo(Book o) {
        //        return title.compareTo(o.getTitle());
        //    } 조금 더 개선된 코드 좀 더 타입 안정성과


    }
}
