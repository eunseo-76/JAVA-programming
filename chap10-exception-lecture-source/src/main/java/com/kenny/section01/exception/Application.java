package com.kenny.section01.exception;

public class Application {
    public static void main(String[] args) /**/throws Exception /**/{
        ExceptionTest exceptionTest = new ExceptionTest();

        /* 예외 처리가 강제화 된 메소드를 호출하는 경우 반드시 예외 처리가 필요하다.
        * 여기서는 throws로 다시 책임을 위암하는 처리를 한다.
        * 단, mai 메소드까지 예외를 throws 하면 프로그램은 비정상 종료한 된다.*/
        exceptionTest.checkEnoughMoney(10000, 50000);
        exceptionTest.checkEnoughMoney(50000, 10000);
        System.out.println("프로그램을 종료합니다.");
        // 예외를 만나면 나를 호출했던 코드로 돌아감. 거기서 예외 처리를 해야. =
    }
}
