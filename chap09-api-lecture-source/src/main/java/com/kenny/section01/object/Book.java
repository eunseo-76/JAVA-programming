package com.kenny.section01.object;

import java.util.Objects;

public class Book {
    private int number;
    private String title;
    private String author;
    private int price;

    // 모든 필드 받아서 초기화 하는 생성자
    public Book(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // 각각의 필드에 접근할 수 있는 getter, setter
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
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

    // 레퍼런스 출력 시 주소값을 확인하는 게 아니라, 무슨 값이 있는지 확인하기 위해 override
    @Override
    public String toString() {
        return "Book{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    //
    @Override
    public boolean equals(Object o) {
        //* 주소 값이 같은 경우 동일 객체이므로 필드 값 비교 없이 바로 true 반환 */
        if (this == o) return true;
        /* 전달 객체가 null이거나 다른 타입이면 동등 객체일 수 없으므로 바로 false 반환 */
        if (o == null || getClass() != o.getClass()) return false;
        /* book 타입이면서 동일 객체가 아니므로 동등 객체인지 비교 */
        Book book = (Book) o;   // 상위 타입인 Object에서 book으로 다운캐스팅
        /* 모든 필드 값이 동일할 경우 true 반환 */
        return number == book.number && price == book.price && Objects.equals(title, book.title) && Objects.equals(author, book.author);
        // 문자열은 레퍼런스 변수이므로, 주소값을 가지고 있음.
        // 저자, 제목은 주소값을 가지고 있기 때문에 '=='로 비교가 불가하다.
        // 이런 경우 Object's'가 제공하는 equals로 비교한다.
        // Object <- String (모든 클래스는 Object를 부모로 한다)
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, title, author, price);
    }

    // Objects: static 메소드를 정의해 놓은 클래스(기능 메소드를 가지고 있는 클래스)
    // Object : 인스턴스를 찍어낼 때 부모 역할을 하는 클래스
}
