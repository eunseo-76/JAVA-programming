package com.kenny.section01.exception;

public class ExceptionTest {

    // 상품을 살 충분한 돈이 있는지 확인하는 메소드
    public void checkEnoughMoney(int price, int money) /*throw's'*/ throws Exception /**/ {
        System.out.println("가지고 계신 돈은 " + money + "원입니다.");

        if (money >= price) {
            System.out.println("상품을 구입하기 위한 금액이 충분합니다.");
        } else {
            /* 강제로 예외를 발생시킨다. 예외를 발생시키면 예외 처리가 필요하다.
            * 첫 번째 예외 처리 방법은 메소드 시그니처에 throws 구문을 작성하는 것이다.
            * => 예외에 대한 책임을 해당 메소드를 호출하는 곳으로 위임하여 예외처리 강제화 */

            throw new Exception();  // exception 객체 생성해서 예외 발생시키기
            // Unhandled exception : 예외 처리를 하지 않은 경우 발생

        }

        System.out.println("즐거운 쇼핑하세요~");
    }
}
