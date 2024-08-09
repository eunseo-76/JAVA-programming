package com.kenny.section01.list.dto;

public class BookDTO implements Comparable<BookDTO> {
    private int number;
    private String title;
    private String author;
    private int price;

    public BookDTO(int number, String title, String author, int price) {
        this.number = number;
        this.title = title;
        this.author = author;
        this.price = price;
    }

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

    @Override
    public String toString() {
        return super.toString();
    }

    /* 제목 내림차순 정렬 기준을 내부 기준으로 설정 */
    // 자기 자신이 가지고 있는 title 기준으로
    // 이전에는 o1.getTitle().compareTo(o2.getTitle() 이었음
    @Override
    public int compareTo(BookDTO o) {
        return o.getTitle().compareTo(getTitle());
    }
}


