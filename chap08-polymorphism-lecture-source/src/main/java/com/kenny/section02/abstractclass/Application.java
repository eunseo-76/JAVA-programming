package com.kenny.section02.abstractclass;

public class Application {
    public static void main(String[] args) {
        /* 추상 클래스와 추상 메소드에 대해 이해하고 활용할 수 있다. */

        /*추상 클래스는 인스턴스 생성 불가 */
//        Product product = new Product();
        // Product는 추상 클래스라 미완성이기 때문에 자기 자신의 인스턴스를 생성할 수 없음

        SmartPhone smartPhone = new SmartPhone();

        System.out.println(smartPhone instanceof SmartPhone);   // true
        System.out.println(smartPhone instanceof Product);  // true
        // true 이므로 다형성 적용 가능

        /* 다형성을 적용해서 추상 클래스를 레퍼런스 타입으로 사용할 수 있다. */
        Product product = new SmartPhone();
        product.abstMethod();   // smartPhone처럼 보이지만(?) Product의 메소드를 수행함 <- 동적 바인딩이 되어 있다

        product.nonStaticMethod();
        product.StaticMethod();
    }
}
