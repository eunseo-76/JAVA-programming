package com.kenny.section02.enumtype;

import com.kenny.section01.intenum.Foods;

public class Application {
    public static void main(String[] args) {
        /* 열거형(enum)을 이용하여 정수 열거 패턴의 단점을 해결하는 것을 이해할 수 있다. */

        /* 1. 열거 타입은 싱글톤 방식으로 구현되기 때문에 인스턴스의 생성이나 확장이 되지 않는다. */
        // 싱글톤 방식 (singletone): 오직 하나만의 인스턴스를 만듦
        // enum 선언한 작성한 타입들이 하나씩만! 만들어짐. 인스턴스를 추가, 확장하지 않음.

        /* 2. 컴파일 타임의 타입 안정성을 높여준다. */
        boolean isTrue = enumTest(FoodsEnum.MEAL_AN_BUTTER_KIMCHI_STEW, FoodsEnum.DRINK_RADISH_KINCHI_LATTE);
//        boolean isTrue2 = enumTest(0, 3);   // 정수 상수 값과 일치하는 값을 전달해도 타입이 불일치해서 사용할 수 없다

        /* 3. 상수 이름을 문자열로 출력할 수 있다. */
        System.out.println(FoodsEnum.MEAL_AN_BUTTER_KIMCHI_STEW);
        System.out.println(FoodsEnum.MEAL_MINT_SEAWEED_SOUP);
        System.out.println(FoodsEnum.MEAL_BUNGEOPPANG_SUSHI);

        /* 4. 메소드나 필드를 추가할 수 있다. 근본적으로 불변이라 모든 필드는 final 이어야만 한다. */
        /* 5. 클래스이기 때문에 toString() 오버라이딩이 가능하다. */

        /* 6. 열거 타입 내에 선언된 상수들을 순회할 수 있다. */
        for (FoodsEnum food : FoodsEnum.values()) { // values() 메소드로 반환받은 값을 반복문에서 처리하여 순회 가능
            System.out.println("food = " + food);
        }

    }
    private static boolean enumTest(FoodsEnum foodsEnum1, FoodsEnum foodsEnum2) {
        if(foodsEnum1 == foodsEnum2) return true;
        return false;
    }
}
