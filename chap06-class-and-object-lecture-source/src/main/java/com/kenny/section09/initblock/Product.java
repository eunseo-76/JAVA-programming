package com.kenny.section09.initblock;

public class Product {
    /* 1. JVM이 지정한 기본값 초기화 */
//    private String name;
//    private int price;
//    private static String brand;

    /* 2. 명시적 초기화 */
    // new Product()를 몇 번을 해도 전부 이렇게 하겠다는 의미
    private String name = "갤럭시";
    private int price = 1000000;
    private static String brand = "삼성";

    /* 3. 초기화 블럭
    * 인스턴스 초기화 블럭 */
    {
        name = "사이언";
        price = 800000;

        brand = "애플";
        System.out.println("인스턴스 초기화 블럭 동작");
    }

    /* static 초기화 블럭 */
    static {
        brand = "엘지";

//        name = "아이폰";   // static 초기화 블럭 안에 인스턴스 변수 쓰면 컴파일 에러
//        price = 1500000;
        System.out.println("static 초기화 블럭 동작");
    }
    // 명시적 초기화가 일어나더라도 이후 초기화 블럭이 동작하여 덮어씀(초기화 블럭 동작 순서 때문)

    public Product(){
        System.out.println("기본 생성자 동작");
    }

    public Product(String name, int price, String brand) {
        this.name = name;
        this.price = price;
        Product.brand = brand;
        System.out.println("매개변수 생성자 동작");
    }

    public String getInformation() {
        return this.name + " " + this.price + " " + Product.brand;

    }

    // 동작 순서
    // static 초기화 블럭 동작
    // 인스턴스 초기화 블럭 동작
    // 기본 생성자 동작
}
