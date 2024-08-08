package com.kenny.section02.userexception;

import com.kenny.section02.userexception.exception.MoneyNegativeException;
import com.kenny.section02.userexception.exception.NegativeException;
import com.kenny.section02.userexception.exception.NotEnoughMoneyException;
import com.kenny.section02.userexception.exception.PriceNegativeException;

public class ExceptionTest {

    /* throws 구문 작성 시 여러 Exception을 나열할 수 있으며, 상위 타입의 Exception만 작성할 수도 있다. */
    public void checkEnoughMoney(int price, int money) /* 예외 처리 */throws PriceNegativeException, MoneyNegativeException, NotEnoughMoneyException {
        // 상속 구조를 따라가므로 throws PriceNegativeException, MoneyNegativeException 다 쓰는 대신 NegativeException 이렇게만 해도 된다
        // throws Exception 이렇게 해도 된다

        // exception 클래스를 상속받는(runtime, ioexception 처럼) 사용자 exception을 만들어 쓸 수 있다.

        if(price < 0) {
            throw new PriceNegativeException("상품 가격은 음수일 수 없습니다."); // 예외 발생 하면 처리 되어야 한다
        }

        if(money < 0) {
            throw new MoneyNegativeException("가지고 있는 돈은 음수일 수 없습니다.");  // 예외 발생 시 처리 필요
        }

        if(money < price) {
            throw new NotEnoughMoneyException("가진 돈보다 상품 가격이 더 비쌉니다.");
        }

        System.out.println("즐거운 쇼핑하세요~");
    }
}
