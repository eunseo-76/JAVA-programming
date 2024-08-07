package com.kenny.section03.interfaceimplements;

public class Application {
    public static void main(String[] args) {
        /* 인터페이스에 대해 이해할 수 있다. */
//        InterProduct interProduct = new InterProduct() {} // 인터페이스는 생성자도 없고, 인스턴스 생성 불가

        /* 다형성을 이용하여 레퍼런스 타입으로 사용 */
        InterProduct interProduct = new Product();  // 상위 타입을 이용한 것

        /* 오버라이딩한 메소드 호출 */
        interProduct.abstMethod();
        interProduct.nonStaticMethod();
        interProduct.defaultMethod();   // default 지만 오버라이딩 했음
        // 정적 바인딩 되어 있으나 호출하면 동적 바인딩 되어 오버라이딩한 결과가 나온다!

        /* static 메소드 호출 */
        // 오버라이딩 된 게 아니라, 정적 영역에 있는 것
        InterProduct.staticMethod();

        /* 상수 필드 */
        System.out.println(InterProduct.MAX_NUM);
        System.out.println(interProduct.MIN_NUM);
    }
}
