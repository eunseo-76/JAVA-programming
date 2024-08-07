package com.kenny.section03.interfaceimplements;


/* 인터페이스는 인터페이스를 상속할 수 있다. 이 때는 extends 라는 키워드를 사용한다.
* 클래스 extends 클래스 -> 단일 상속
* 클래스 implements 인터페이스1, 인터페이스2 -> 다중 상속
* 인터페이스 extends 인터페이스1, 인터페이스2 -> 다중 상속
* */
// interface 키워드 들어감
public interface InterProduct extends java.io.Serializable {
    /* 인터페이스는 상수 필드만 작성가능 하다.
     * 상수 필드만 가질 수 있기 때문에 모든 필드는 묵시적으로 public static final 이다. */
    public static final int MAX_NUM = 100;  // 선언과 동시에 초기화해야 함. 아니면 static 영역에 기본값으로 바로 초기화되기 때문.
    int MIN_NUM = 0;    // public static final은 생략 가능하다. 인터페이스는 상수 필드만 작성할 수 있기 때문

    /* 인터페이스는 생성자를 가질 수 없다. */
//    public InterProduct(){} // 인터페이스에는 생성자 생성 불가

    /* 인터페이스는 구현부가 잇는 non-static 메소드를 가질 수 없다. */
//    public void nonStaticMethod() {}

    /* 추상 메소드만 작성이 가능하다.
     * 묵시적으로 public abstract의 의미를 가진다. */
    public abstract void nonStaticMethod();

    void abstMethod();  // public abstract 생략 가능

    /* static 메소드는 작성 가능하다. (JDK 1.8 추가) */
    public static void staticMethod() {
        System.out.println("InterProduct 인터페이스의 staticMethod 호출");
    }

    /* default 키워드를 사용하면 non-static 메소드도 작성 가능하다. (JDK 1.8 추가)
     * default 메소드는 완성 되어 있으므로 오버라이딩이 강제화되지 않는다.
     * (일반적으로는 {} 만 작성하고 내용을 비워놓는다.)
     *  */
    public default void defaultMethod() {

    }
    // 접근 제어자 default와는 다름! 이 default 키워드는 몸체 작성이 가능하다는 의미
    // 보통 만들어진 자바 API 중 default 키워드가 있는 메소드는 몸통이 작성이 안 되어 있음.
    // 인터페이스 A 안에 추상 메소드 10개가 정의 되어있다고 가정. 이 인터페이스는 어떤 기능을 정의해야한다고 강제함
    // (ex 마우스 클릭 시 이벤트, 더블 클릭시 이벤트 등을 정의해야 한다)
    // 이 인터페이스를 B가 구현해야 함. 구현 시 10가지 메소드가 다 필요하지 않은 경우에도, B는 1~10을 전부 오버라이딩 해야함.
    // 이를 해결하기 위해 default 키워드를 넣음. default 키워드 넣고 중괄호의 내용을 비우면, 해당 메소드는 미완성이 아니게 됨.
}
