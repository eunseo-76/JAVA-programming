package com.kenny.section02.userexception;

import com.kenny.section02.userexception.exception.MoneyNegativeException;
import com.kenny.section02.userexception.exception.NotEnoughMoneyException;
import com.kenny.section02.userexception.exception.PriceNegativeException;

public class Application {
    /* 사용자 정의 예외 클래스를 사용할 수 있다. */
    public static void main(String[] args) {
        ExceptionTest exceptionTest = new ExceptionTest();
        try {
            /* 상품 가격보다 가진 돈이 적은 경우*/
//            exceptionTest.checkEnoughMoney(-50000, 30000);

            /* 상품 가격이 음수인 경우 */

//            exceptionTest.checkEnoughMoney(-50000, 30000);

            /* 가진 돈이 음수인 경우 */
            exceptionTest.checkEnoughMoney(50000, -30000);

            /* 정상적으로 구매 가능한 돈을 가진 경우 */
            // static은 소문자로(?)
            exceptionTest.checkEnoughMoney(50000, 30000);

        /* 예외 상황별로 catch 블럭을 따로 작성해서 처리할 수도 있고,
        * 상위 타입의 Exception을 이용해서 통합적으로 처리할 수도 있다.
        * 단, 상위 타입의 Exception이 먼저 기술되면 아래로 코드가 도달할 수 없으므로 컴파일 에러가 발생한다.
        * 서술 순서는 하위 타입 -> 상위 타입 순서로 기재한다. */
            // 멀티 블럭 안 쓰고 최상위 타입인 Exception만 해도 잘 처리 됨
            // 어떤 exception이 발생하면 어떻게 처리하고 싶다 <- 일 경우에는 멀티 블럭으로 catch를 작성해야 한다
        } catch (PriceNegativeException e){
            System.out.println(e.getMessage());
        } catch (MoneyNegativeException e){
            System.out.println(e.getMessage());
        } catch (NotEnoughMoneyException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("프로그램을 종료합니다.");
        } finally {
            /* 예외 발생 여부와 상관없이 실행할 내용 */
            System.out.println("finally 블럭의 내용이 동작함");
        }
        // Exception이 가장 위에 작성되면, 멀티 블럭으로 작성했더라도 모두 Exception에 걸리게 된다.
        // Exception은 가장 아래에 작성해야 한다(pricenegative, moneynegative, notenoughmoney 가 아닌 예외가 밑에서 다 걸린다)
    }
}