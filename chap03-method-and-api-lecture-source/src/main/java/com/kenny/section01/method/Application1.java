package com.kenny.section01.method;

public class Application1 {
    // 1. public : 접근 제어자
    // 2. void : 반환형. void는 반환할 게 없는 경우
    // 3. 이름 : camel case로 작성
    // 4. 매개변수: ().
    // 5. 범위 : {}.
    /* 함수 와 메소드
     * 함수가 메소드를 포함.
     * (JAVA의) 메소드는 클래스 내부에 정의되는 함수를 의미함.
     * 역할은 함수와 유사함. */
    public static void main(String[] args) {
        /* 메소드의 호출 흐름에 대한 이해 */

        System.out.println("main 메소드 호출됨");
        // 메소드는 클래스 내부의 함수이기 때문에 객체를 생성해야 함

        Application1 app1 = new Application1();
        app1.methodA(); //변수명.메소드명

        System.out.println("main 메소드 종료됨");

    }

    public void methodA() {

        System.out.println("methodA 호출됨");

        // 같은 Application1 하위의 메소드끼리 호출할 때는 메소드의 이름만 필요
        methodB();

        System.out.println("methodA 종료됨");
    }

    public void methodB() {
        System.out.println("methodB 호출됨");
        methodC();
        System.out.println("methodB 종료됨");
    }

    public void methodC() {
        System.out.println("methodC 호출됨");

        System.out.println("methodC 종료됨");
    }
}