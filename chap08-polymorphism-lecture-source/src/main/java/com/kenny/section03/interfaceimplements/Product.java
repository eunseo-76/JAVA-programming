package com.kenny.section03.interfaceimplements;

// implements 뒤에 인터페이스가 여러 개 들어갈 수 있다
// extends Object implements 이런 식으로 exteds를 넣을 수도 있다
// Object 를 Product가 상속하면서, InterProduct, serializable 이라는 인터페이스를 구현한다
public class Product implements InterProduct, java.io.Serializable {
    @Override
    public void nonStaticMethod() {
        System.out.println("InterProduct의 nonStaticMethod 오버라이딩한 메소드 호출");
    }

    @Override
    public void abstMethod() {
        System.out.println("InterProduct의 abstMethod 오버라이딩한 메소드 호출");
    }

    /* static 메소드는 오버라이딩 할 수 없다. */

    /* default 메소드는 오버라이딩이 강제화되지 않는다. 선택적으로 오버라이딩 한다.
     * default 키워드는 인터페이스 내에서 사용하는 키워드이고 오버라이딩 시에는 제거한다. */
    @Override
    public /* default */ void defaultMethod(){
        System.out.println("InterProduct의 defaultMethod 오버라이딩한 메소드 호출");
    }
}
