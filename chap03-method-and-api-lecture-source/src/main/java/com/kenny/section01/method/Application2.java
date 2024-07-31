package com.kenny.section01.method;

public class Application2 {
    public static void main(String[] args) {
        /* 메소드의 호출 흐름에 대한 이해 */

        System.out.println("main 메소드 호출됨");
        // 메소드는 클래스 내부의 함수이기 때문에 객체를 생성해야 함
        /* 작성한 메소드를 호출한다. */
        Application2 app1 = new Application2();
        app1.methodA();
        app1.methodB();
        app1.methodC();

        System.out.println("main 메소드 종료됨");

    }

    public void methodA() {

        System.out.println("methodA 호출됨");

        System.out.println("methodA 종료됨");
    }

    public void methodB() {
        System.out.println("methodB 호출됨");
        System.out.println("methodB 종료됨");
    }

    public void methodC() {
        System.out.println("methodC 호출됨");

        System.out.println("methodC 종료됨");
    }
}