package com.kenny.section09.initblock;

public class Application {
    public static void main(String[] args) {
        /* 초기화 블럭의 동작 순서를 이해하고 이를 활용하여 인스턴스를 생성할 수 있다. */
        Product product = new Product();
        System.out.println(product.getInformation());

        Product product2 = new Product("대륙폰", 300000, "샤오미");
        System.out.println(product2.getInformation());
        // 인스턴스 초기화 블럭은 모든 객체 생성 시 무조건 동작함
        // 하지만 매개변수 생성자로 인해 값이 덮어짐
        // 난 그냥 매개변수로 받아서 초기화 하고 싶어~ 할 때 매개변수 생성자 사용 가능
    }
}
