package com.kenny.section07.statickeyword;

public class StaticMethodTest {
    private int count;
    public void nonStaticMethod() { this.count++; }
    public static void staticMethod() {
//        this.count++;
        /* static 메소드는 인스턴스를 생성하지 않고 사용하는 메소드이기 때문에 this라는 키워드를 사용할 수 없다. */
    }
    // static 키워드가 있음 -> 프로그램이 시작될 때 정적 메모리 영역에 만들어짐.
    // this는 인스턴스가 생성되었을 때 그 인스턴스의 주소값을 의미함.
    // this 라고 할 만한 것이 없다
}

// Math 클래스는 모든 메소드에 static이 붙어 있음
// ex. public static final double PI = 3.141592... 를 매번 객체 생성 할 필요 없이
// static에 넣어놓고 필요할 때마다 공유해서 사용함
