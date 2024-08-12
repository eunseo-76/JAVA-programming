package com.kenny.section01.intenum;

import java.sql.SQLOutput;

public class Application {
    public static void main(String[] args) {
        /* 정수 열거 패턴과 이의 단점을 이해할 수 있다. */

        /* 1. 타입 안전성 보장 방법이 없어 디버깅이 어려움 */
        int food = Foods.MEAL_AN_BUTTER_KIMCHI_STEW;    // 인터페이스명.값
        food = Foods.DRINK_RADISH_KINCHI_LATTE; // food에 열무김치가 담김
        // MEAL. 도 0, 1, 2이고 DRINK. 도 0, 1, 2인 상황
        // 둘 다 0으로 나오기 때문에 앙버터 김치찜인지 확인하기 어려움

        /* 2가지가 모두 상수 0이라는 값을 가지고 있어 구분이 불가능하다. */
        if (food == Foods.MEAL_AN_BUTTER_KIMCHI_STEW) {
            System.out.println("식사 카테고리 - 앙버터 김치찜");
        }

        /* 2. 정수형 상수는 문자열로 출력하기 어렵다. */
        System.out.println(Foods.MEAL_AN_BUTTER_KIMCHI_STEW);
        System.out.println(Foods.MEAL_MINT_SEAWEED_SOUP);
        System.out.println(Foods.MEAL_BUNGEOPPANG_SUSHI);

        /* 3. 정수 열거 그룹에 속한 모든 상수를 순회하는 방법도 쉽지 않다.*/
        // 열거형 6개 선언하고 반복문으로 이 상수들을 출력하기 어렵다.

        /* 4. 정수 열거 패턴으로 상수가 선언된 경우 변경이 발생하면 재컴파일이 필요하다. */
    }
}
