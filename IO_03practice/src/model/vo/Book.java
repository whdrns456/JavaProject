package model.vo;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Book implements Serializable {
                    // 직렬화를 위한 명시하기 위한 용도 (Serializable 구현)
                    // 객체 내의 데이터를 바이트 단위로 쪼개기 위한 명시적인 선언

    private String title;  // 도서명
    private String author; // 저자
    private int price;
    private Calendar date;
    private double discount;


    public  Book(){

    }

    public Book(String title, String author, int price, Calendar date, double discount) {

        this.title = title;
        this.author = author;
        this.price = price;
        this.date = date;
        this.discount = discount;
    }


    @Override
    public String toString() {
        // 출판날짜 형식 지정(yyyy년 mm월 dd일)
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
        String formatDate = sdf.format(date.getTime());


        return "Book[" +
                "책 제목 :'" + title + '\'' +
                ", 저자 : '" + author + '\'' +
                ", 가격 :" + price +
                ", 날짜 :" +  formatDate +
                ", 할인율 :" + discount +
                ']';
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Calendar getDate() {
        return date;
    }

    public void setDate(Calendar date) {
        this.date = date;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
