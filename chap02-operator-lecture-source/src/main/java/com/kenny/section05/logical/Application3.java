package com.kenny.section05.logical;

public class Application3 {
    public static void main(String[] args) {
        /* and, or 연산의 특징 */

        /* 1. A && B : A의 결과가 false 이면 B를 실행하지 않음
        * => false가 나올 확률이 높은 조건을 앞에 배치하면 연산 횟수를 줄일 수 있음
        *  */
        int num1 = 10;
        int result1 = (false && ++num1 > 0) ? num1 : num1;
        // 명시적으로 false 라고 했으므로 소괄호 안의 결과는 무조건 false
        // 이 때 ++nul1의 단항 연산자 ++ 는 기능하지 않음
        System.out.println("&& 실행 확인 : " + result1);

        /* 2. A || B : A의 결과가 true 이면 B를 실행하지 않음
        * => true가 나올 확률이 높은 조건을 앞에 배치하면 연산 횟수를 줄일 수 있음
        *  */
        int num2 = 10;
        int result2 = (true || ++num2 > 0) ? num2 : num2;
        System.out.println("|| 실행 확인 : " + num2);


    }
}
