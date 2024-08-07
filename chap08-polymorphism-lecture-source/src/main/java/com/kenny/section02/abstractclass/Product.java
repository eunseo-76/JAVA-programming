package com.kenny.section02.abstractclass;

/* 추상 클래스 선언 */
// 클래스 앞에 abstract를 붙인다
public abstract class Product {

    /* 추상 클래스는 필드를 가질 수 있다. */
    private int nonStaticField; // 인스턴스 변수 가질 수 있음
    private static int staticField; // 클래스 변수 가질 수 있음

    /* 추상 클래스는 생성자를 가질 수 있다.
     * 단, 직접적으로 인스턴스를 생성할 수는 없다. */
    // 생성자를 작성한다고 문법적으로 에러가 발생하지는 않음. 하지만 new Product 이렇게 호출할 수 없다(컴파일 에러)
    public Product() {
    }

    /* 추상 클래스는 일반적인 메소드를 가질 수 있다. */
    public void nonStaticMethod() { // non-static 메소드 가질 수 있음
        System.out.println("Product 클래스의 nonStaticMethod");
    }

    public static void StaticMethod() { // static 메소드 가질 수 있음
        System.out.println("Product 클래스의 StaticMethod");
    }

    /* 추상 메소드 (미완성 메소드) 작성
    * 추상 메소드가 선언된 경우 반드시 클래스에 abstract 키워드를 붙여 추상 클래스로 만들어야 한다.
    * 추상 메소드가 0개인 경우 선택적으로 클래스에 abstract 키워드를 붙여 추상 클래스를 만들 수 있다. */
    // abstract 붙여줘야 함
    public abstract void abstMethod();

    // 추상 클래스는 추상 메소드를 0개 이상 포함한다.
    // 즉, 추상 메소드가 없어도 추상 클래스 일 수 있음.

    // 추상 메소드가 한 개라도 있으면 추상 클래스여야함(abstract 필요)
    // 추상 메소드가 0개이더라도 추상 클래스일 수 있음

    // 왜 추상 메소드 없이 추상 클래스만 만들까?
    // Product는 인스턴스 화 하고 싶지 않을 때.
    // 즉, Product는 상위 타입으로만 사용하고 싶은 경우 추상 메소드 없이 추상 클래스 선언을 한다.
    // Product <- computer, smartphone, keyboard
    // 실제 프로그램 내에서는 new Computer, new Smartphone ... 이렇게 하위 타입의 인스턴스만 쓰고 new Product 상위 타입의 인스턴스를 사용하지 않을 때
}
