package com.kenny.section01.exception;

public class Application2 {
    public static void main(String[] args) {
        ExceptionTest exceptionTest = new ExceptionTest();
        try {
            /* try : 예외 발생 가능성이 있는 코드를 호출 */
            exceptionTest.checkEnoughMoney(10000, 50000);
            exceptionTest.checkEnoughMoney(50000, 10000);
            // exceptoion 발생 시 다음 코드 실행 안 하고 바로 catch 블럭으로 감!

            System.out.println("===== 상품 구입 가능 =====");
        } catch (Exception e) { // 현재 발생한 exception에 대한 객체
            /* catch : try 블럭 안에서 예외 발생 시 catch 블럭의 코드가 실행한다. */
            System.out.println("===== 상품 구입 불가 =====");
            e.printStackTrace();    // 이 메소드 항상 출력
        }
        /* 예외가 발생하더라도 catch 블럭 실행 후 프로그램의 수행 흐름으로 돌아와 정상 종료 된다. */
        System.out.println("프로그램을 종료합니다.");

    }
}
